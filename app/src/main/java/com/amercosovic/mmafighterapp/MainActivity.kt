package com.amercosovic.mmafighterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.amercosovic.mmafighterapp.fragments.EventsFragment
import com.amercosovic.mmafighterapp.fragments.HeavyweightRankingsFragment
import com.amercosovic.mmafighterapp.fragments.HomePageFragment
import com.amercosovic.mmafighterapp.fragments.RankingsFragment
import com.amercosovic.mmafighterapp.retrofit.ApiInterface
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home_page.*
import kotlinx.android.synthetic.main.fragment_rankings.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("amer", "Activity onCreate")



        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout, HomePageFragment())
            commit()
        }



        //Initially display the first fragment in main activity
//        replaceFragment(HomePageFragment())

    }
}
//    fun AppCompatActivity.replaceFragment(fragment: Fragment) {
//        val fragmentManager = supportFragmentManager
//        val transaction = fragmentManager.beginTransaction()
//        transaction.replace(R.id.main_activity_layout, fragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//    }

//    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.d("amer","Activity onStart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//
//
//
//        Log.d("amer","Activity onResume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d("amer","Activity onPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.d("amer","Activity onStop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d("amer","Activity onDestroy")
//    }
//
//
