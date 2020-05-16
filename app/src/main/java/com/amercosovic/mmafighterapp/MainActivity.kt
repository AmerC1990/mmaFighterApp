package com.amercosovic.mmafighterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amercosovic.mmafighterapp.fragments.RankingsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rankings_button.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, RankingsFragment())
                addToBackStack(null)
                commit()
            }
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