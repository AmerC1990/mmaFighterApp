package com.amercosovic.mmafighterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.amercosovic.mmafighterapp.fragments.AdesanyaFragment
import com.amercosovic.mmafighterapp.fragments.WhittakerFragment
import com.amercosovic.mmafighterapp.model.Ranking
import kotlinx.android.synthetic.main.middleweight_rankings_row.view.*
import java.security.AccessController.getContext


class RankingsAdapter3(private val ranking: List<Ranking>): RecyclerView.Adapter<RankingsAdapter3.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RankingsAdapter3.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.middleweight_rankings_row,parent, false)
        return ViewHolder(view)



    }
    override fun getItemCount() = ranking.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rankingData = ranking[position]



//       onClick(holder.middleweightRanking0)







        holder.middleweightRanking0.text = rankingData.competitorRankings[0].rank.toString() + " - "+
                rankingData.competitorRankings[0].competitor.name
        if (rankingData.competitorRankings[0].rank == 0) {
            holder.middleweightRanking0.text = "C" + " - "+
                    rankingData.competitorRankings[0].competitor.name.substringAfter(',') + " " +
                    rankingData.competitorRankings[0].competitor.name.substringBefore(",")
        } else if (rankingData.competitorRankings[0].rank == 1) {
            holder.middleweightRanking0.text = "#" + rankingData.competitorRankings[0].rank.toString() + " - "+
                    rankingData.competitorRankings[0].competitor.name.substringAfter(',') + " " +
                    rankingData.competitorRankings[0].competitor.name.substringBefore(",")
        }

        holder.middleweightRanking0.setOnClickListener {
            val activity: AppCompatActivity = holder.middleweightRanking0.getContext() as AppCompatActivity
            val myFragment: Fragment = AdesanyaFragment()
            if (holder.middleweightRanking0.text.contains("Israel") ) {
                activity.getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_middleweight_rankings_layout, myFragment)
                    .addToBackStack(null)
                    .commit()
            }
        }

        holder.middleweightRanking1.text = "#" + rankingData.competitorRankings[1].rank.toString() + " - "+
                rankingData.competitorRankings[1].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[1].competitor.name.substringBefore(",")

        holder.middleweightRanking1.setOnClickListener {
            val activity: AppCompatActivity = holder.middleweightRanking1.getContext() as AppCompatActivity
            val myFragment: Fragment = WhittakerFragment()
            if (holder.middleweightRanking1.text.contains("Whittaker") ) {
                activity.getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_middleweight_rankings_layout, myFragment)
                    .addToBackStack(null)
                    .commit()
            }
        }


        holder.middleweightRanking2.text = "#" + rankingData.competitorRankings[2].rank.toString() + " - "+
                rankingData.competitorRankings[2].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[2].competitor.name.substringBefore(",")

        holder.middleweightRanking3.text = "#" + rankingData.competitorRankings[3].rank.toString() + " - "+
                rankingData.competitorRankings[3].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[3].competitor.name.substringBefore(",")

        holder.middleweightRanking4.text = "#" + rankingData.competitorRankings[4].rank.toString() + " - "+
                rankingData.competitorRankings[4].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[4].competitor.name.substringBefore(",")

        holder.middleweightRanking5.text = "#" + rankingData.competitorRankings[5].rank.toString() + " - "+
                rankingData.competitorRankings[5].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[5].competitor.name.substringBefore(",")

        holder.middleweightRanking6.text = "#" + rankingData.competitorRankings[6].rank.toString() + " - "+
                rankingData.competitorRankings[6].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[6].competitor.name.substringBefore(",")

        holder.middleweightRanking7.text = "#" + rankingData.competitorRankings[7].rank.toString() + " - "+
                rankingData.competitorRankings[7].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[7].competitor.name.substringBefore(",")

        holder.middleweightRanking8.text = "#" + rankingData.competitorRankings[8].rank.toString() + " - "+
                rankingData.competitorRankings[8].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[8].competitor.name.substringBefore(",")

        holder.middleweightRanking9.text = "#" + rankingData.competitorRankings[9].rank.toString() + " - "+
                rankingData.competitorRankings[9].competitor.name.substringAfter(',') + " " +
                rankingData.competitorRankings[9].competitor.name.substringBefore(",")

        holder.middleweightRanking10.text = "#" + rankingData.competitorRankings[10].rank.toString() + " - "+
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

        val middleweightRanking0: TextView = itemView.middleweight_ranking_0
        val middleweightRanking1: TextView = itemView.middleweight_ranking_1
        val middleweightRanking2: TextView = itemView.middleweight_ranking_2
        val middleweightRanking3: TextView = itemView.middleweight_ranking_3
        val middleweightRanking4: TextView = itemView.middleweight_ranking_4
        val middleweightRanking5: TextView = itemView.middleweight_ranking_5
        val middleweightRanking6: TextView = itemView.middleweight_ranking_6
        val middleweightRanking7: TextView = itemView.middleweight_ranking_7
        val middleweightRanking8: TextView = itemView.middleweight_ranking_8
        val middleweightRanking9: TextView = itemView.middleweight_ranking_9
        val middleweightRanking10: TextView = itemView.middleweight_ranking_10
//        val heavyweightRanking11: TextView = itemView.heavyweight_ranking_11
//        val heavyweightRanking12: TextView = itemView.heavyweight_ranking_12
//        val heavyweightRanking13: TextView = itemView.heavyweight_ranking_13
//        val heavyweightRanking14: TextView = itemView.heavyweight_ranking_14
//        val heavyweightRanking15: TextView = itemView.heavyweight_ranking_15

    }
//    fun onClick(view: View) {
//        val activity: AppCompatActivity = view.getContext() as AppCompatActivity
//        val myFragment: Fragment = AdesanyaFragment()
//        activity.getSupportFragmentManager().beginTransaction()
//        .replace(R.id.frame_layout, myFragment)
//        .addToBackStack(null).commit()
//    }


    }










