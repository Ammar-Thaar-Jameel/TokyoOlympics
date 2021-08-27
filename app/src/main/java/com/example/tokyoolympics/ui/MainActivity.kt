package com.example.tokyoolympics.ui


import android.util.Log
import android.view.LayoutInflater

import com.example.tokyoolympics.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding=ActivityMainBinding::inflate


    override fun setUp() {
       parsfile()
    }

    override fun addCallBacks() {

    }
    private fun parsfile() {
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine {
            Log.v("MAin", it)
        }
    }


}