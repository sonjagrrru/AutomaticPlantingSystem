package com.example.smartgarden.fragments.add

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.smartgarden.R
import com.example.smartgarden.data.User
import com.example.smartgarden.data.UserViewModel
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.fragment_add.view.*

class AddFragment : Fragment() {

    private lateinit var userViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_add, container, false)

        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        view.addButton.setOnClickListener{
            insertDataToDatabase()
        }

        return view
    }

    private fun insertDataToDatabase() {
        val firstname = firstnameForm.text.toString()
        var lastname = lastnameForm.text.toString()
        var age = ageForm.text

        if(inputEmptyCheck(firstname,lastname,age)){
            var user = User(0, firstname, lastname, Integer.parseInt(age.toString()))
            userViewModel.addUser(user)
            Toast.makeText(requireContext(),"Successfully added!", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        }else{
            Toast.makeText(requireContext(),"Please fill out all fields!", Toast.LENGTH_LONG).show()
        }
    }

    private fun inputEmptyCheck(firstname: String, lastname:String, age: Editable):Boolean{
        return !(TextUtils.isEmpty(firstname)&&TextUtils.isEmpty(lastname)&&age.isEmpty())
    }
}