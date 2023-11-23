package com.bangkit.tmdbmovieclient.data.repository.artist.datasource

import com.bangkit.tmdbmovieclient.data.model.artist.Artist

interface ArtistLocalDataSource {

    suspend fun getArtistsFromDB(): List<Artist>
    suspend fun saveArtistsToDB(artists: List<Artist>)
    suspend fun clearAll()
}