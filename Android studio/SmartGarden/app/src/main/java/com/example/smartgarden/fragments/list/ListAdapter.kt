package com.example.smartgarden.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smartgarden.R
import com.example.smartgarden.data.User
import kotlinx.android.synthetic.main.user_row.view.*

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.idList.text = currentItem.id.toString()
        holder.itemView.firstnameList.text = currentItem.firstname.toString()
        holder.itemView.lastnameList.text = currentItem.lastname.toString()
        holder.itemView.ageList.text = currentItem.age.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(users:List<User>){
        userList = users
        notifyDataSetChanged() // jako bitno!!!
    }
}