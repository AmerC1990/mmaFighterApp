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
import kotlinx.android.synthetic.main.lightheavyweight_rankings_row.view.*
import kotlinx.android.synthetic.main.lightweight_rankings_row.view.*
import kotlinx.android.synthetic.main.middleweight_rankings_row.view.*
import kotlinx.android.synthetic.main.welterweight_rankings_row.view.*
import org.json.JSONArray
import org.json.JSONObject


class RankingsAdapter5(private val ranking: List<Ranking>) : RecyclerView.Adapter<RankingsAdapter5.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.lightweight_rankings_row ,parent, false)
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
        holder.lightweightRanking0.text = rankingData.competitorRankings[0].rank.toString() + " - "+
                rankingData.competitorRankings[0].competitor.name


        if (rankingData.competitorRankings[0].rank == 0) {
            holder.lightweightRanking0.text = "C" + " - "+
                    rankingData.competitorRankings[0].competitor.name.substringAfter(',') + " " +
                    rankingData.competitorRankings[0].competitor.name.substringBefore(",")
        } else if (rankingData.competitorRankings[0].rank == 1) {
            holder.lightweightRanking0.text = "#" + rankingData.competitorRankings[0].rank.toString() + " - "+
                    rankingData.competitorRankings[0].competitor.name.substringAfter(',') + " " +
                    rankingData.competitorRankings[0].competitor.name.substringBefore(",")
        }

        holder.lightweightRanking1.text = "#" + rankingData.competitorRankings[1].rank.toString() + " - "+
                rankingData.competitorRankings[1].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[1].competitor.name.substringBefore(",")


        holder.lightweightRanking2.text = "#" + rankingData.competitorRankings[2].rank.toString() + " - "+
                rankingData.competitorRankings[2].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[2].competitor.name.substringBefore(",")

        holder.lightweightRanking3.text = "#" + rankingData.competitorRankings[3].rank.toString() + " - "+
                rankingData.competitorRankings[3].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[3].competitor.name.substringBefore(",")

        holder.lightweightRanking4.text = "#" + rankingData.competitorRankings[4].rank.toString() + " - "+
                rankingData.competitorRankings[4].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[4].competitor.name.substringBefore(",")

        holder.lightweightRanking5.text = "#" + rankingData.competitorRankings[5].rank.toString() + " - "+
                rankingData.competitorRankings[5].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[5].competitor.name.substringBefore(",")

        holder.lightweightRanking6.text = "#" + rankingData.competitorRankings[6].rank.toString() + " - "+
                rankingData.competitorRankings[6].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[6].competitor.name.substringBefore(",")

        holder.lightweightRanking7.text = "#" + rankingData.competitorRankings[7].rank.toString() + " - "+
                rankingData.competitorRankings[7].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[7].competitor.name.substringBefore(",")

        holder.lightweightRanking8.text = "#" + rankingData.competitorRankings[8].rank.toString() + " - "+
                rankingData.competitorRankings[8].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[8].competitor.name.substringBefore(",")

        holder.lightweightRanking9.text = "#" + rankingData.competitorRankings[9].rank.toString() + " - "+
                rankingData.competitorRankings[9].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[9].competitor.name.substringBefore(",")

        holder.lightweightRanking10.text = "#" + rankingData.competitorRankings[10].rank.toString() + " - "+
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

        val lightweightRanking0: TextView = itemView.lightweight_ranking_0
        val lightweightRanking1: TextView = itemView.lightweight_ranking_1
        val lightweightRanking2: TextView = itemView.lightweight_ranking_2
        val lightweightRanking3: TextView = itemView.lightweight_ranking_3
        val lightweightRanking4: TextView = itemView.lightweight_ranking_4
        val lightweightRanking5: TextView = itemView.lightweight_ranking_5
        val lightweightRanking6: TextView = itemView.lightweight_ranking_6
        val lightweightRanking7: TextView = itemView.lightweight_ranking_7
        val lightweightRanking8: TextView = itemView.lightweight_ranking_8
        val lightweightRanking9: TextView = itemView.lightweight_ranking_9
        val lightweightRanking10: TextView = itemView.lightweight_ranking_10
//        val heavyweightRanking11: TextView = itemView.heavyweight_ranking_11
//        val heavyweightRanking12: TextView = itemView.heavyweight_ranking_12
//        val heavyweightRanking13: TextView = itemView.heavyweight_ranking_13
//        val heavyweightRanking14: TextView = itemView.heavyweight_ranking_14
//        val heavyweightRanking15: TextView = itemView.heavyweight_ranking_15

    }

}

