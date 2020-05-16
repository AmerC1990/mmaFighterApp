package com.amercosovic.mmafighterapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.amercosovic.mmafighterapp.R
import com.amercosovic.mmafighterapp.RankingsAdapter
import com.amercosovic.mmafighterapp.retrofit.ApiInterface
import kotlinx.android.synthetic.main.fragment_rankings.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RankingsFragment : Fragment() {

    override fun onResume() {
        super.onResume()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.sportradar.us")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(ApiInterface::class.java)

        suspend fun getRankings() {
            val results = api.getRankings("rfv7h9ntruudcnm59vhg4x5h")
            Log.d("amer", "$results")
            withContext(Dispatchers.Main) {
//            Toast.makeText(this@MainActivity, "API CALL IS SUCCESSFUL", Toast.LENGTH_LONG).show()

                recyclerView.apply {
                    layoutManager = LinearLayoutManager(this@RankingsFragment.context)
                    adapter = RankingsAdapter(listOf(results))
                }
            }
        }

        CoroutineScope(IO).launch {
            getRankings()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rankings, container, false)
    }


}