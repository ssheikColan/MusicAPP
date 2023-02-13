package com.example.musicapp.adapter

import android.media.session.PlaybackState.CustomAction
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.musicapp.databinding.ActivityMainBinding
import com.example.musicapp.databinding.RecentItemBinding

class RecentAdapter() : RecyclerView.Adapter<RecentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup,viewType : Int) : ViewHolder {
        val v = RecentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
    }

    override fun getItemCount(): Int {
        return 10
    }

    class ViewHolder(var itemBinding: RecentItemBinding) :
            RecyclerView.ViewHolder(itemBinding.root)
}