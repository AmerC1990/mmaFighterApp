package com.amercosovic.mmafighterapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import com.amercosovic.mmafighterapp.model.Competitor
import com.amercosovic.mmafighterapp.model.CompetitorRanking
import com.amercosovic.mmafighterapp.model.Ranking
import com.amercosovic.mmafighterapp.model.Season
import com.google.gson.Gson
import kotlinx.android.synthetic.main.events_row.view.*
import kotlinx.android.synthetic.main.heavyweight_rankings_row.view.*
import org.json.JSONArray
import org.json.JSONObject


class RankingsAdapter9(private val events: List<Season>) : RecyclerView.Adapter<RankingsAdapter9.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.events_row,parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount() = events.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val eventData = events[position]

        holder.events.text = eventData.name + " - " + "Date: " + eventData.startDate.substringAfter("-") + "-" +
                eventData.startDate.substringBefore("-")


    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val events: TextView = itemView.events_textview


    }

}

