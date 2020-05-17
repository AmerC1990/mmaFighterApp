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

//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://api.sportradar.us")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        val api = retrofit.create(ApiInterface::class.java)
//
//        suspend fun getRankings() {
//            val results = api.getRankings("rfv7h9ntruudcnm59vhg4x5h")
//            Log.d("amer", "$results")
//            withContext(Dispatchers.Main) {
////            Toast.makeText(this@MainActivity, "API CALL IS SUCCESSFUL", Toast.LENGTH_LONG).show()
//
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

    }
