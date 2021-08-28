package com.example.tokyoolympics.data.domain

data class Game(
    val teamRank: Int,
    val teamNoc: String,
    val goldMedal: Int,
    val silverMedal: Int,
    val bronzeMedal: Int,
    val totalPoint: Int,
    val rankByTotal: Int

)