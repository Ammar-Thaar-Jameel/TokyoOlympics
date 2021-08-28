package com.example.tokyoolympics.data

import com.example.tokyoolympics.data.domain.Game

object DataManger {
    private val  gameList= mutableListOf<Game>()
    val games:List<Game>
        get() = gameList
    fun addGame(game:Game){
        gameList.add(game)
    }
}