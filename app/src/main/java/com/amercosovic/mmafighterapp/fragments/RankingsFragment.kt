package com.amercosovic.mmafighterapp.fragments

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.amercosovic.mmafighterapp.MainActivity
import com.amercosovic.mmafighterapp.R
import com.amercosovic.mmafighterapp.RankingsAdapter
import com.amercosovic.mmafighterapp.retrofit.ApiInterface
import kotlinx.android.synthetic.main.fragment_heavyweight_rankings.*
import kotlinx.android.synthetic.main.fragment_home_page.*
import kotlinx.android.synthetic.main.fragment_rankings.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception

class RankingsFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("amer", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("amer", "Fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_rankings, container, false)
        Log.d("amer", "Fragment onCreateView")
        // Inflate the layout for this fragment
        val context = activity as AppCompatActivity
        val heavyweightButton: Button = v.findViewById(R.id.heavyweight_button)
        heavyweightButton.setOnClickListener {
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout, HeavyweightRankingsFragment())
                .addToBackStack(null)
                .commit()
        }
        val lightheavyweightButton: Button = v.findViewById(R.id.light_heavyweight_button)
        lightheavyweightButton.setOnClickListener {
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout, LightHeavyweightRankingsFragment())
                .addToBackStack(null)
                .commit()
        }
        val middleweightButton: Button = v.findViewById(R.id.middleweight_button)
        middleweightButton.setOnClickListener {
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout,MiddleweightRankingsFragment())
                .addToBackStack(null)
                .commit()
        }
        val welterweightButton: Button = v.findViewById(R.id.welterweight_button)
        welterweightButton.setOnClickListener {
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout,WelterweightRankingsFragment())
                .addToBackStack(null)
                .commit()
        }
        val lightweightButton: Button = v.findViewById(R.id.lightweight_button)
        lightweightButton.setOnClickListener {
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout,LightweightRankingsFragment())
                .addToBackStack(null)
                .commit()
        }
        val featherweightButton: Button = v.findViewById(R.id.featherweight_button)
        featherweightButton.setOnClickListener {
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout,FeatherweightRankingsFragment())
                .addToBackStack(null)
                .commit()
        }
        val bantamweightButton: Button = v.findViewById(R.id.bantamweight_button)
        bantamweightButton.setOnClickListener {
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout,BantamweightRankingsFragment())
                .addToBackStack(null)
                .commit()
        }
        val flyweightButton: Button = v.findViewById(R.id.flyweight_button)
        flyweightButton.setOnClickListener {
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout,FlyweightRankingsFragment())
                .addToBackStack(null)
                .commit()
        }
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("amer", "Fragment onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("amer", "Fragment onStart")
        super.onStart()

    }

    override fun onResume() {
        Log.d("amer", "Fragment onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("amer", "Fragment onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("amer", "Fragment onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("amer", "Fragment onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("amer", "Fragment onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("amer", "Fragment onDetach")
        super.onDetach()
    }

}





