package com.example.tokyoolympics.util

import com.example.tokyoolympics.data.domain.Game

class CsvParser {
    fun parse(row: String): Game {
        val tokens = row.split(",")
        return Game(
            teamRank = tokens[Constants.ColumnIndex.RANK].toInt(),
            teamNoc = tokens[Constants.ColumnIndex.TEAM_NOC],
            goldMedal = tokens[Constants.ColumnIndex.GOLD_MEDAL].toIntOrNull()?:0,
            silverMedal = tokens[Constants.ColumnIndex.SILVER_MEDAL].toInt(),
            bronzeMedal = tokens[Constants.ColumnIndex.BRONZE_MEDAL].toInt(),
            totalPoint = tokens[Constants.ColumnIndex.TOTAL].toInt(),
            rankByTotal = tokens[Constants.ColumnIndex.RANK_BY_TOTAL].toInt()
        )


    }
}