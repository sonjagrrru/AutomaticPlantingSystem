package com.example.smartgarden.fragments.bluetooth

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.smartgarden.R
import com.example.smartgarden.data.general.GeneralViewModel
import com.example.smartgarden.fragments.plantInfo.PlantInfo
import kotlinx.android.synthetic.main.fragment_bluetooth.*
import kotlinx.android.synthetic.main.fragment_bluetooth.view.*
import java.util.*


class BluetoothFragment : Fragment() {

   private var bluetoothAdapter: BluetoothAdapter?= null
   lateinit var pairedDevices: Set<BluetoothDevice>
   val REQUEST_ENABLE_BLUETOOTH = 1

    lateinit var EXTRA_ADDRESS: String

    val PERMISSION_ALL = 1
    val PERMISSIONS = arrayOf(
        Manifest.permission.BLUETOOTH_CONNECT
    )

    private lateinit var generalViewModel: GeneralViewModel

    @Suppress("DEPRECATION")
    @SuppressLint("MissingPermission")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        if (!hasPermissions(requireContext(), *PERMISSIONS)) {
            ActivityCompat.requestPermissions(requireActivity(), PERMISSIONS, PERMISSION_ALL)
        }

        while(!hasPermissions(requireContext(), *PERMISSIONS)){

        }

        val view = inflater.inflate(R.layout.fragment_bluetooth, container, false)

        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
        if (bluetoothAdapter==null){
            Toast.makeText(view.context,"Uređaj ne podržava bluetooth!",Toast.LENGTH_SHORT)
            return null
        }

        if(bluetoothAdapter?.isEnabled==false){
            val enableBluetooth = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            startActivityForResult(enableBluetooth,REQUEST_ENABLE_BLUETOOTH)
        }

        view.selectDeviceRefresh.setOnClickListener { pairedDeviceList() }

        return view
    }

    fun hasPermissions(context: Context, vararg permissions: String): Boolean = permissions.all {
        ActivityCompat.checkSelfPermission(context, it) == PackageManager.PERMISSION_GRANTED
    }

    @SuppressLint("MissingPermission")
    private fun pairedDeviceList(){
        pairedDevices=bluetoothAdapter!!.bondedDevices
        val list: ArrayList<BluetoothDevice> = ArrayList()
        if (!pairedDevices.isEmpty()){
            for (device: BluetoothDevice in pairedDevices){
                list.add(device)
                Log.i("device", ""+device)
            }
        }
        else{
            Toast.makeText(activity, "Nije pronađen ni jedan uređaj!", Toast.LENGTH_SHORT)
        }

        val adapter = ArrayAdapter(requireView().context, android.R.layout.simple_list_item_1, list)
        selectDevice.adapter = adapter
        selectDevice.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val device: BluetoothDevice = list[position]
            val address: String = device.address


            if(device.name.equals("HC-05")){
                /*EXTRA_ADDRESS = device.address
            val intent = Intent(requireContext(), PlantInfo::class.java)
            intent.putExtra(EXTRA_ADDRESS,address)*/

                Thread{generalViewModel.updateAddress(address)}.start()
                //generalViewModel.updateAddress(address)
                //Toast.makeText(requireView().context,"adresa je "+address,Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_bluetoothFragment_to_plantInfo)
                //startActivity(intent)
            }
            else{
                Toast.makeText(activity, "Povežite se na ispravan uređaj! " + device.name, Toast.LENGTH_SHORT).show()
            }

        }
    }

    @Suppress("DEPRECATION")
    @SuppressLint("MissingPermission")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_ENABLE_BLUETOOTH) {
            if (resultCode == Activity.RESULT_OK) {
                if (bluetoothAdapter!!.isEnabled) {
                    Toast.makeText(activity, "Bluetooth omogućen!", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    Toast.makeText(activity, "Bluetooth onemogućen!", Toast.LENGTH_SHORT)
                        .show()
                }

            } else if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(
                    activity,
                    "Bluetooth konektovanje otkazano!",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }


}