package com.example.smartgarden.fragments.myPlant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.smartgarden.R
import com.example.smartgarden.data.general.GeneralViewModel
import com.example.smartgarden.data.plant.Plant
import com.example.smartgarden.data.plant.PlantViewModel
import com.example.smartgarden.fragments.choosePlant.ChoosePlantAdapter
import kotlinx.android.synthetic.main.fragment_choose_plant.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_my_plant.view.*

class MyPlantFragment : Fragment() {

    private lateinit var plantViewModel: PlantViewModel
    private lateinit var generalViewModel: GeneralViewModel

    private var plantId: Int = 0
    private lateinit var myPlant: Plant

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_my_plant, container, false)

        val plantCaption: TextView = view.findViewById(R.id.plantCaption);
        val plantName: TextView = view.findViewById(R.id.plantName);
        val plantImage: ImageView = view.findViewById(R.id.plantImage);

        plantViewModel = ViewModelProvider(this).get(PlantViewModel::class.java)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)

        generalViewModel.readGeneral.observe(viewLifecycleOwner, Observer { general->
           plantId = general.plantID
        })

        plantViewModel.readAllData.observe(viewLifecycleOwner, Observer {plants->
            myPlant = plants[plantId]
            plantCaption.text = myPlant.caption
            plantName.text = myPlant.name.uppercase()
            plantImage.setImageResource(R.drawable.x0_biljka + plantId)
        })

        view.myPlantButton.setOnClickListener {
            findNavController().navigate(R.id.action_myPlantFragment_to_bluetoothFragment)
        }

        // Inflate the layout for this fragment
        return view
    }

}