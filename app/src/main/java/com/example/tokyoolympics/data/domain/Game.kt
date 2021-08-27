package com.example.tokyoolympics.data.domain

data class Game(
    val rank: Int,
    val teamNoc: String,
    val goldMedal: Int,
    val silverMedal: Int,
    val bronzeMedal: Int,
    val total: Int,
    val rankByTotal: Int

)