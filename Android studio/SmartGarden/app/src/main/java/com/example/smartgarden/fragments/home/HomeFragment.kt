package com.example.smartgarden.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smartgarden.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.myPlant.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_myPlantFragment)
        }

        view.choosePlant.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_choosePlantFragment)
        }

        return view
    }
}