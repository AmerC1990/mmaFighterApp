package com.amercosovic.mmafighterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amercosovic.mmafighterapp.model.Info
import com.amercosovic.mmafighterapp.model.Info2
import kotlinx.android.synthetic.main.adesanya_row.view.*
import kotlinx.android.synthetic.main.whittaker_row.view.*

class WhittakerAdapter(private val whittaker: List<Info2>) : RecyclerView.Adapter<WhittakerAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.whittaker_row,parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount() = whittaker.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val whittakerData = whittaker[position]

        holder.whittakerNickname.text =  "Robert"  + " ''" + whittakerData.nickname + "'' " + "Whittaker"
        holder.whittakerBirthDate.text = "Born on: 12/20/1990"
        holder.whittakerNationality.text = "Born in: " + whittakerData.birthCity + ", " +
                "Auckland, New Zealand"
        holder.whittakerFightingOutOf.text = "Fighting out of: " + whittakerData.fightingOutOfCity +
                ", " + "AUSTRALIA"
        holder.whittakerPhysical.text = "Height: " +  whittakerData.height.toInt() + "cm" +  "   " + "Weight: 84kg" +
                 "   " + "Reach: " + whittakerData.reach.toInt() + "cm"


    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val whittakerNickname: TextView = itemView.whittaker_nickname
        val whittakerBirthDate: TextView = itemView.whittaker_birthdate
        val whittakerNationality: TextView = itemView.whittaker_cityandcountry
        val whittakerPhysical: TextView = itemView.whittaker_hwr
        val whittakerFightingOutOf: TextView = itemView.whittaker_fightingoutof


    }

}
