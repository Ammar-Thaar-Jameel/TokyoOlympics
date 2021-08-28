package com.example.tokyoolympics.ui.viewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympics.R


class GameViewHolder(viewItem:View):RecyclerView.ViewHolder(viewItem) {

    val textViewTeamName:TextView=viewItem.findViewById(R.id.team_name)
    val rankOfTheTeam:TextView=viewItem.findViewById(R.id.rank_of_the_team)
    val rankOfTheTeamByTotal:TextView=viewItem.findViewById(R.id.rank_of_the_team_by_total)
    val goldMedal:TextView=viewItem.findViewById(R.id.gold_medal)
    val silverMedal:TextView=viewItem.findViewById(R.id.silver_medal)
    val bronzeMedal:TextView=viewItem.findViewById(R.id.bronze_medal)
    val totalPoint:TextView=viewItem.findViewById(R.id.total_point)

}