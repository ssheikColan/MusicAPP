package com.example.musicapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.example.musicapp.R
import com.example.musicapp.adapter.RecentAdapter
import com.example.musicapp.databinding.FragmentMainBinding
import com.example.newproject.extension.viewBinding

class MainFragment : Fragment() {
    private val binding by viewBinding (FragmentMainBinding::inflate)

    private lateinit var recentAdapter : RecentAdapter
    lateinit var layoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recentAdapter = RecentAdapter()
        layoutManager =LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recentRecycle.adapter= recentAdapter
        binding.recentRecycle.layoutManager=layoutManager
    }
}



