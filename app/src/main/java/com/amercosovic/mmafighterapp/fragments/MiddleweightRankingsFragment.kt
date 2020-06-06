package com.amercosovic.mmafighterapp.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager

import com.amercosovic.mmafighterapp.R
import com.amercosovic.mmafighterapp.RankingsAdapter3
import com.amercosovic.mmafighterapp.retrofit.ApiInterface
import kotlinx.android.synthetic.main.fragment_middleweight_rankings.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception

/**
 * A simple [Fragment] subclass.
 */
class MiddleweightRankingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_middleweight_rankings, container, false)
        val context = activity as AppCompatActivity
        // Inflate the layout for this fragment
        return v
    }

    override fun onResume() {
        Log.d("amer", "Fragment onResume")
        super.onResume()
        lifecycleScope.launch(Dispatchers.IO) {
            fetchMiddlewightRankings()
        }
    }

    suspend fun fetchMiddlewightRankings() {

        val api = ApiInterface.create()
        try {
            val result = api.getRankings("xu62qahagwqm7ndw8rb8vwgr")
            val ranking = result.rankings.filter {it.name == "middleweight"}

//                val gson = Gson()
//                val data = gson.fromJson(result,Array<Rankings>::class.java)

            withContext(Dispatchers.Main) {
                if (result != null) {
                    middleweightRecyclerView.apply {
                        layoutManager = LinearLayoutManager(this@MiddleweightRankingsFragment.context)
                        adapter = RankingsAdapter3(ranking)
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
