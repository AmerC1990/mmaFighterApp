package com.amercosovic.mmafighterapp.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

import com.amercosovic.mmafighterapp.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home_page.*
import kotlinx.android.synthetic.main.fragment_rankings.*

class HomePageFragment : Fragment() {

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
        val v = inflater.inflate(R.layout.fragment_home_page,container,false)
        Log.d("amer","Fragment onCreateView")
//         Inflate the layout for this fragment
        val textViewContact: TextView = v.findViewById(R.id.contact_developer_textview)
        textViewContact.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain" // send email as plain text
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("cosovic14@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            intent.putExtra(Intent.EXTRA_TEXT, "mail body")
            startActivity(Intent.createChooser(intent, ""))
        }
        val context = activity as AppCompatActivity
        val fightersButton: Button = v.findViewById(R.id.fighters_button)
        fightersButton.setOnClickListener {
                context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout,RankingsFragment())
                .addToBackStack(null)
                .commit()
        }
        val eventsButton: Button = v.findViewById(R.id.events_button)
        eventsButton.setOnClickListener {
                context.supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout,EventsFragment())
                .addToBackStack(null)
                .commit()
        }
        return v
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

