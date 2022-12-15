package com.example.smartgarden.fragments.choosePlant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.smartgarden.R
import com.example.smartgarden.data.general.GeneralViewModel
import com.example.smartgarden.data.plant.PlantViewModel
import com.example.smartgarden.interfaces.ItemClick
import kotlinx.android.synthetic.main.fragment_choose_plant.view.*

class ChoosePlantFragment : Fragment(), ItemClick {

    private lateinit var plantViewModel: PlantViewModel
    private lateinit var generalViewModel: GeneralViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_choose_plant, container, false)

        plantViewModel = ViewModelProvider(this).get(PlantViewModel::class.java)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)

        val recyclerView =  view.recyclerView
        val adapter = ChoosePlantAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        plantViewModel.readAllData.observe(viewLifecycleOwner, Observer {plants->
            adapter.setData(plants)
            //Toast.makeText(requireContext(),"Dodati podaci!" + plants.size, Toast.LENGTH_LONG).show()
        })

        generalViewModel.readGeneral.observe(viewLifecycleOwner, Observer { general->
            adapter.setGeneralData(general)
        })

        // Inflate the layout for this fragment
        return view
    }

    override fun redirectFragments(idPlant: Int) {
        Thread{generalViewModel.updatePlant(idPlant)}.start()

        findNavController().navigate(R.id.action_choosePlantFragment_to_homeFragment)
    }

}