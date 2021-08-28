package com.example.tokyoolympics.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympics.R
import com.example.tokyoolympics.data.domain.Game
import com.example.tokyoolympics.ui.viewHolders.GameViewHolder

class GameAdapter(val list: List<Game>) : RecyclerView.Adapter<GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_game, parent, false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val currentGame = list[position]
        holder.apply {
            textViewTeamName.text = currentGame.teamNoc
            rankOfTheTeam.text = currentGame.teamRank.toString()
            rankOfTheTeamByTotal.text = currentGame.rankByTotal.toString()
            goldMedal.text = currentGame.goldMedal.toString()
            silverMedal.text = currentGame.silverMedal.toString()
            bronzeMedal.text = currentGame.bronzeMedal.toString()
            totalPoint.text = currentGame.totalPoint.toString()
        }
    }

    override fun getItemCount() = list.size


}