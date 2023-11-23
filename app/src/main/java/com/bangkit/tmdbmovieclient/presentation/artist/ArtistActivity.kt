package com.bangkit.tmdbmovieclient.presentation.artist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.tmdbmovieclient.databinding.ActivityArtistBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ArtistActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArtistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}