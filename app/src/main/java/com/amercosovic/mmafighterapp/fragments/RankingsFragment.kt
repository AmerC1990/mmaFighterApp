package com.amercosovic.mmafighterapp.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.amercosovic.mmafighterapp.MainActivity
import com.amercosovic.mmafighterapp.R
import com.amercosovic.mmafighterapp.RankingsAdapter
import com.amercosovic.mmafighterapp.retrofit.ApiInterface
import kotlinx.android.synthetic.main.fragment_rankings.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RankingsFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("amer","Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("amer","Fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("amer","Fragment onCreateView")
        // Inflate the layout for this fragment
        //        val retrofit = Retrofit.Builder()
//            .baseUrl("https://jsonplaceholder.typicode.com")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//        val api = retrofit.create(ApiInterface::class.java)
//
//        suspend fun getRankings() {
//            val results = api.getRankings("rfv7h9ntruudcnm59vhg4x5h")
//            Log.d("amer", "$results")
//            withContext(Dispatchers.Main) {
////            Toast.makeText(this@MainActivity, "API CALL IS SUCCESSFUL", Toast.LENGTH_LONG).show()
//                recyclerView.apply {
//                    layoutManager = LinearLayoutManager(this@RankingsFragment.context)
//                    adapter = RankingsAdapter(listOf(results))
//                }
//            }
//        }
//
//        CoroutineScope(IO).launch {
//            getRankings()
//        }
        return inflater.inflate(R.layout.fragment_rankings, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("amer","Fragment onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("amer","Fragment onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("amer","Fragment onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("amer","Fragment onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("amer","Fragment onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("amer","Fragment onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("amer","Fragment onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("amer","Fragment onDetach")
        super.onDetach()
    }







}