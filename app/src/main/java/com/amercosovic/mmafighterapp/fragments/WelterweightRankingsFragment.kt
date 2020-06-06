package com.amercosovic.mmafighterapp.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager

import com.amercosovic.mmafighterapp.R
import com.amercosovic.mmafighterapp.RankingsAdapter4
import com.amercosovic.mmafighterapp.retrofit.ApiInterface
import kotlinx.android.synthetic.main.fragment_welterweight_rankings.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception

/**
 * A simple [Fragment] subclass.
 */
class WelterweightRankingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welterweight_rankings, container, false)
    }

    override fun onResume() {
        Log.d("amer", "Fragment onResume")
        super.onResume()
        lifecycleScope.launch(Dispatchers.IO) {
            fetchWelterweightRankings()
        }
    }

    suspend fun fetchWelterweightRankings() {

        val api = ApiInterface.create()
        try {
            val result = api.getRankings("xu62qahagwqm7ndw8rb8vwgr")
            val ranking = result.rankings.filter {it.name == "welterweight"}

//                val gson = Gson()
//                val data = gson.fromJson(result,Array<Rankings>::class.java)

            withContext(Dispatchers.Main) {
                if (result != null) {
                    welterweightRecyclerView.apply {
                        layoutManager = LinearLayoutManager(this@WelterweightRankingsFragment.context)
                        adapter = RankingsAdapter4(ranking)
                    }
                }
            }
        } catch (e: Exception) {
            Log.e("Error", "Error occurred ${e.message}")

            //Toasting from Main thread because UI can't be modified IN ANY WAY from an IO/Background thread
            withContext(Dispatchers.Main) {
                Toast.makeText(context, "Error occured ${e.localizedMessage}", Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }

}
