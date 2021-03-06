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
import com.google.gson.Gson
import kotlinx.android.synthetic.main.heavyweight_rankings_row.view.*
import org.json.JSONArray
import org.json.JSONObject


class RankingsAdapter(private val ranking: List<Ranking>) : RecyclerView.Adapter<RankingsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heavyweight_rankings_row,parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount() = ranking.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rankingData = ranking[position]

//        val gson = Gson()
//        val data = gson.fromJson(,Array<rank>)
//        val json = JSONObject(rankingData.competitorRankings.toString())
//        val heavyweights: JSONArray = json.getJSONArray("heavyweight")
//        val weather: JSONArray = json.getJSONArray("weather")




//        holder.fighterRanking.text = rankingData.competitorRankings[0].competitor.name
//        holder.fighterRanking.text = rankingData.competitorRankings[0].rank.toString()
        holder.heavyweightRanking0.text = rankingData.competitorRankings[0].rank.toString() + " - "+
                rankingData.competitorRankings[0].competitor.name


        if (rankingData.competitorRankings[0].rank == 0) {
            holder.heavyweightRanking0.text = "C" + " - "+
                    rankingData.competitorRankings[0].competitor.name.substringAfter(',') + " " +
                    rankingData.competitorRankings[0].competitor.name.substringBefore(",")
        } else if (rankingData.competitorRankings[0].rank == 1) {
            holder.heavyweightRanking0.text = "#" + rankingData.competitorRankings[0].rank.toString() + " - "+
                    rankingData.competitorRankings[0].competitor.name.substringAfter(',') + " " +
                    rankingData.competitorRankings[0].competitor.name.substringBefore(",")
        }

        holder.heavyweightRanking1.text = "#" + rankingData.competitorRankings[1].rank.toString() + " - "+
                rankingData.competitorRankings[1].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[1].competitor.name.substringBefore(",")


        holder.heavyweightRanking2.text = "#" + rankingData.competitorRankings[2].rank.toString() + " - "+
                rankingData.competitorRankings[2].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[2].competitor.name.substringBefore(",")

        holder.heavyweightRanking3.text = "#" + rankingData.competitorRankings[3].rank.toString() + " - "+
                rankingData.competitorRankings[3].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[3].competitor.name.substringBefore(",")

        holder.heavyweightRanking4.text = "#" + rankingData.competitorRankings[4].rank.toString() + " - "+
                rankingData.competitorRankings[4].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[4].competitor.name.substringBefore(",")

        holder.heavyweightRanking5.text = "#" + rankingData.competitorRankings[5].rank.toString() + " - "+
                rankingData.competitorRankings[5].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[5].competitor.name.substringBefore(",")

        holder.heavyweightRanking6.text = "#" + rankingData.competitorRankings[6].rank.toString() + " - "+
                rankingData.competitorRankings[6].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[6].competitor.name.substringBefore(",")

        holder.heavyweightRanking7.text = "#" + rankingData.competitorRankings[7].rank.toString() + " - "+
                rankingData.competitorRankings[7].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[7].competitor.name.substringBefore(",")

        holder.heavyweightRanking8.text = "#" + rankingData.competitorRankings[8].rank.toString() + " - "+
                rankingData.competitorRankings[8].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[8].competitor.name.substringBefore(",")

        holder.heavyweightRanking9.text = "#" + rankingData.competitorRankings[9].rank.toString() + " - "+
                rankingData.competitorRankings[9].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[9].competitor.name.substringBefore(",")

        holder.heavyweightRanking10.text = "#" + rankingData.competitorRankings[10].rank.toString() + " - "+
                rankingData.competitorRankings[10].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[10].competitor.name.substringBefore(",")

//        holder.heavyweightRanking11.text = "#" + rankingData.competitorRankings[11].rank.toString() + " - "+
//                rankingData.competitorRankings[11].competitor.name
//
//        holder.heavyweightRanking12.text = "#" + rankingData.competitorRankings[12].rank.toString() + " - "+
//                rankingData.competitorRankings[12].competitor.name
//
//        holder.heavyweightRanking13.text = "#" + rankingData.competitorRankings[13].rank.toString() + " - "+
//                rankingData.competitorRankings[13].competitor.name
//
//        holder.heavyweightRanking14.text = "#" + rankingData.competitorRankings[14].rank.toString() + " - "+
//                rankingData.competitorRankings[14].competitor.name
//
//        holder.heavyweightRanking15.text = "#" + rankingData.competitorRankings[15].rank.toString() + " - "+
//                rankingData.competitorRankings[15].competitor.name
//
//


    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val heavyweightRanking0: TextView = itemView.heavyweight_ranking_0
        val heavyweightRanking1: TextView = itemView.heavyweight_ranking_1
        val heavyweightRanking2: TextView = itemView.heavyweight_ranking_2
        val heavyweightRanking3: TextView = itemView.heavyweight_ranking_3
        val heavyweightRanking4: TextView = itemView.heavyweight_ranking_4
        val heavyweightRanking5: TextView = itemView.heavyweight_ranking_5
        val heavyweightRanking6: TextView = itemView.heavyweight_ranking_6
        val heavyweightRanking7: TextView = itemView.heavyweight_ranking_7
        val heavyweightRanking8: TextView = itemView.heavyweight_ranking_8
        val heavyweightRanking9: TextView = itemView.heavyweight_ranking_9
        val heavyweightRanking10: TextView = itemView.heavyweight_ranking_10
//        val heavyweightRanking11: TextView = itemView.heavyweight_ranking_11
//        val heavyweightRanking12: TextView = itemView.heavyweight_ranking_12
//        val heavyweightRanking13: TextView = itemView.heavyweight_ranking_13
//        val heavyweightRanking14: TextView = itemView.heavyweight_ranking_14
//        val heavyweightRanking15: TextView = itemView.heavyweight_ranking_15

    }

}

