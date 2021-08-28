package com.example.tokyoolympics.ui


import android.util.Log
import android.view.LayoutInflater
import com.example.tokyoolympics.data.DataManger

import com.example.tokyoolympics.databinding.ActivityMainBinding
import com.example.tokyoolympics.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate


    override fun setUp() {
        parserFile()
        Log.v("GameAdapter",DataManger.games.size.toString())
        val adapter = GameAdapter(DataManger.games)
        binding?.myRecyclerOfGame?.adapter = adapter

    }

    override fun addCallBacks() {

    }

    private fun parserFile() {
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()
        buffer.forEachLine {
            val currentGame = parser.parse(it)
            DataManger.addGame(currentGame)
        }
    }


}