package com.example.smartgarden.fragments.plantInfo

import android.Manifest
import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.content.Context
import android.content.pm.PackageManager
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.smartgarden.R
import com.example.smartgarden.data.general.GeneralViewModel
import com.example.smartgarden.data.plant.Plant
import com.example.smartgarden.data.plant.PlantViewModel
import com.example.smartgarden.fragments.plantInfo.PlantInfo.Companion.address
import com.example.smartgarden.fragments.plantInfo.PlantInfo.Companion.bluetoothAdapter
import com.example.smartgarden.fragments.plantInfo.PlantInfo.Companion.bluetoothSocket
import com.example.smartgarden.fragments.plantInfo.PlantInfo.Companion.isConnected
import com.example.smartgarden.fragments.plantInfo.PlantInfo.Companion.myUUID
import com.example.smartgarden.fragments.plantInfo.PlantInfo.Companion.progress
import kotlinx.android.synthetic.main.fragment_plant_info.*
import kotlinx.android.synthetic.main.fragment_plant_info.view.*
import java.io.IOException
import java.io.InputStream
import java.util.*

class PlantInfo : Fragment() {

    companion object {
        var myUUID: UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB")
        var bluetoothSocket: BluetoothSocket?=null
        lateinit var progress: ProgressDialog
        lateinit var bluetoothAdapter: BluetoothAdapter
        var isConnected: Boolean = false
        lateinit var address:String
    }

    val PERMISSION_ALL = 1
    val PERMISSIONS = arrayOf(
        Manifest.permission.BLUETOOTH_CONNECT,
        Manifest.permission.BLUETOOTH_SCAN
    )


    private lateinit var generalViewModel: GeneralViewModel
    private lateinit var plantViewModel: PlantViewModel

    private var plantId: Int = 0
    private lateinit var myPlant: Plant


    @Suppress("DEPRECATION")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_plant_info, container, false)

        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        plantViewModel = ViewModelProvider(this).get(PlantViewModel::class.java)

        //address = "nije"
        generalViewModel.readGeneral.observe(viewLifecycleOwner, Observer { general->
            address = general.userMail
            plantId = general.plantID
            Toast.makeText(activity, address, Toast.LENGTH_SHORT).show()
            context?.let { ConnectToDevice(it).execute() }
        })

        plantViewModel.readAllData.observe(viewLifecycleOwner, Observer {plants->
            myPlant = plants[plantId]
        })

        if (!hasPermissions(requireContext(), *PERMISSIONS)) {
            ActivityCompat.requestPermissions(requireActivity(), PERMISSIONS, PERMISSION_ALL)
        }

        while(!hasPermissions(requireContext(), *PERMISSIONS)){

        }

        /*Thread{
            sendCommand("0")
            receieveData()
        }.start()*/


        view.vlazAuto.setOnClickListener {
            sendCommand("1")
            sendCommand((myPlant.optimalSoilMoisture%10).toString())
            sendCommand((myPlant.optimalSoilMoisture/10).toString())
            view.vlazCap.text = "Vlaznost zemljišta je optimalna!"
            Toast.makeText(activity, "auto zalivanje " + myPlant.optimalSoilMoisture, Toast.LENGTH_SHORT).show()
        }
        view.vlazSad.setOnClickListener {
            sendCommand("2")
            view.vlazCap.text = "Vlaznost zemljišta je optimalna!"
            Toast.makeText(activity, "zalij", Toast.LENGTH_SHORT).show()
        }
        view.svetAuto.setOnClickListener {
            sendCommand("3")
            sendCommand((myPlant.optimalBrightness%10).toString())
            sendCommand((myPlant.optimalBrightness/10).toString())
            view.svetCap.text = "Osvetljenje je optimalno za vašu biljku!"
            Toast.makeText(activity, "auto svetlost", Toast.LENGTH_SHORT).show()
        }
        view.svetSad.setOnClickListener {
            sendCommand("4")
            view.svetCap.text = "Osvetljenje je optimalno za vašu biljku!"
            Toast.makeText(activity, "osvetli", Toast.LENGTH_SHORT).show()
        }

        return view
    }

/*private fun receieveData() {
    if (bluetoothSocket != null) {
        try{
            for (i in 0..5) {
                var letter = bluetoothSocket!!.inputStream.read().toString()
                Toast.makeText(requireContext(), letter,Toast.LENGTH_SHORT).show()
            }
        } catch(e: IOException) {
            e.printStackTrace()
        }
    }
}*/


private fun sendCommand(input: String) {
    if (bluetoothSocket != null) {
        try{
            bluetoothSocket!!.outputStream.write(input.toByteArray())
        } catch(e: IOException) {
            e.printStackTrace()
        }
    }
}
    fun hasPermissions(context: Context, vararg permissions: String): Boolean = permissions.all {
        ActivityCompat.checkSelfPermission(context, it) == PackageManager.PERMISSION_GRANTED
    }

private fun disconnect() {
    if (bluetoothSocket != null) {
        try {
            bluetoothSocket!!.close()
            bluetoothSocket = null
            isConnected = false
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}


@Suppress("DEPRECATION")
@SuppressLint("MissingPermission")
private class ConnectToDevice(c: Context): AsyncTask<Void, Void, String>(){

    private var connectSuccess: Boolean = true
    private var context: Context

    init {
        context = c
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        if (!connectSuccess) {
            Log.i("data", "couldn't connect")
        } else {
            isConnected = true
        }
        progress.dismiss()
    }

    override fun doInBackground(vararg p0: Void?): String {
        try {
            if (bluetoothSocket == null || !isConnected) {
                bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
                val device: BluetoothDevice = bluetoothAdapter.getRemoteDevice(address)
                bluetoothSocket = device.createInsecureRfcommSocketToServiceRecord(myUUID)
                BluetoothAdapter.getDefaultAdapter().cancelDiscovery()
                bluetoothSocket!!.connect()
            }
        } catch (e: IOException) {
            connectSuccess = false
            e.printStackTrace()
        }
        return ""
    }

    override fun onPreExecute() {
        super.onPreExecute()
        progress = ProgressDialog.show(context, "Konektovanje u toku...", "Molimo vas sačekajte")
    }

}
}
