package com.amercosovic.mmafighterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.amercosovic.mmafighterapp.fragments.RankingsFragment
import com.amercosovic.mmafighterapp.retrofit.ApiInterface
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("amer","Activity onCreate")

        rankings_button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment, RankingsFragment())
                .addToBackStack(null)
                .commit()
            }
        textView2.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain" // send email as plain text
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("cosovic14@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            intent.putExtra(Intent.EXTRA_TEXT, "mail body")
            startActivity(Intent.createChooser(intent, ""))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("amer","Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("amer","Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("amer","Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("amer","Activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("amer","Activity onDestroy")
    }

}
