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
import com.amercosovic.mmafighterapp.AdesanyaAdapter

import com.amercosovic.mmafighterapp.R
import com.amercosovic.mmafighterapp.retrofit.ApiInterface3
import kotlinx.android.synthetic.main.fragment_adesanya.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception

/**
 * A simple [Fragment] subclass.
 */
class AdesanyaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_adesanya, container, false)
    }

    override fun onResume() {
        Log.d("amer", "Fragment onResume")
        super.onResume()
        lifecycleScope.launch(Dispatchers.IO) {
            fetchAdesanyaInfo()
        }
    }

    suspend fun fetchAdesanyaInfo() {

        val api = ApiInterface3.create()
        try {
            val result = api.getIzzyInfo("xu62qahagwqm7ndw8rb8vwgr")
            val izzy = result.info

            withContext(Dispatchers.Main) {
                if (result != null) {
                    adesanyaRecyclerView.apply {
                        layoutManager = LinearLayoutManager(this@AdesanyaFragment.context)
                        adapter = AdesanyaAdapter(listOf(izzy))
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
