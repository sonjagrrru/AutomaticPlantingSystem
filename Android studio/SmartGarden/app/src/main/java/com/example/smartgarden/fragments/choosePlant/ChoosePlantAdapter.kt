package com.example.smartgarden.fragments.choosePlant

import android.icu.lang.UCharacter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.smartgarden.R
import com.example.smartgarden.data.general.General
import com.example.smartgarden.data.plant.Plant
import com.example.smartgarden.interfaces.ItemClick
import kotlinx.android.synthetic.main.card_layout.view.*
import kotlinx.android.synthetic.main.fragment_choose_plant.view.*

class ChoosePlantAdapter(val itemClick: ItemClick): RecyclerView.Adapter<ChoosePlantAdapter.MyViewHolder>() {

    private var plantList = emptyList<Plant>()
    private lateinit var generalData: General
    private var idPlant = 0

    class MyViewHolder(itemView: View, itemClick: ItemClick) :RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context,"Uspešno ste izabrali biljku!",Toast.LENGTH_SHORT).show()
                itemClick.redirectFragments(absoluteAdapterPosition);
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return ChoosePlantAdapter.MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false),
            itemClick
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = plantList[position]
        holder.itemView.item_image.setImageResource(R.drawable.x0_biljka + position)
        holder.itemView.item_name.text = UCharacter.toUpperCase(currentItem.name)
        holder.itemView.item_caption.text = currentItem.miniCaption


    }

    override fun getItemCount(): Int {
        return plantList.size
    }

    fun setData(plants:List<Plant>){
        plantList = plants
        notifyDataSetChanged()
    }

    fun setGeneralData(general:General){
        generalData = general
        notifyDataSetChanged()
    }
}