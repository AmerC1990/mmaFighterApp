package com.amercosovic.mmafighterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amercosovic.mmafighterapp.model.Info
import kotlinx.android.synthetic.main.adesanya_row.view.*

class AdesanyaAdapter(private val adesanya: List<Info>) : RecyclerView.Adapter<AdesanyaAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adesanya_row,parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount() = adesanya.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val adesanyaData = adesanya[position]

        holder.adesanyaNickname.text =  "Israel"  + " ''" + adesanyaData.nickname + "'' " + "Adesanya"
        holder.adesanyabirthDate.text = "Born on: " + adesanyaData.birthDate.subSequence(5,7).toString() +
                "-" + adesanyaData.birthDate.subSequence(8,10).toString() + "-" + adesanyaData.birthDate
            .substringBefore("-")
        holder.adesanyaNationality.text = "Born in: " + adesanyaData.birthCity + ", " +
                adesanyaData.birthCountry
        holder.adesanyaFightingOutOf.text = "Fighting out of: " + adesanyaData.fightingOutOfCity +
                ", " + adesanyaData.fightingOutOfCountry
        holder.adesanyaPhysical.text = "Height: " +  adesanyaData.height + "cm" +  "   " + "Weight: " +
                adesanyaData.weight + "kg" +  "   " + "Reach: " + adesanyaData.reach + "cm"


    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val adesanyaNickname: TextView = itemView.izzy_nickname
        val adesanyabirthDate: TextView = itemView.izzy_birthdate
        val adesanyaNationality: TextView = itemView.izzy_cityandcountry
        val adesanyaPhysical: TextView = itemView.izzy_hwr
        val adesanyaFightingOutOf: TextView = itemView.izzy_fightingoutof


    }

}
