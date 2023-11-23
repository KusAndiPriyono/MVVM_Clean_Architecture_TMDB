package com.bangkit.tmdbmovieclient.domain.repository

import com.bangkit.tmdbmovieclient.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}