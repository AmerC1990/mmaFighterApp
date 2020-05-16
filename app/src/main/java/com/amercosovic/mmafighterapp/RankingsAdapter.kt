package com.amercosovic.mmafighterapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amercosovic.mmafighterapp.model.Ranking
import kotlinx.android.synthetic.main.rankings_row.view.*

class RankingsAdapter(private val ranking: List<Ranking>) : RecyclerView.Adapter<RankingsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rankings_row,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = ranking.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rankingData = ranking[position]



        holder.fighterName.text = rankingData.name
//        holder.fighterRanking.text = rankingData.
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val fighterName: TextView = itemView.fighterName
        val fighterRanking: TextView = itemView.fighterRanking

    }

}