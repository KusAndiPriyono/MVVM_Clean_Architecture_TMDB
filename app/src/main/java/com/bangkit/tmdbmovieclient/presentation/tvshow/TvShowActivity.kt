package com.bangkit.tmdbmovieclient.presentation.tvshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.tmdbmovieclient.databinding.ActivityTvShowBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TvShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTvShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTvShowBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}