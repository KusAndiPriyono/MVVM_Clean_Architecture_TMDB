package com.bangkit.tmdbmovieclient.data.repository.artist.datasource

import com.bangkit.tmdbmovieclient.data.model.artist.Artist

interface ArtistCacheDataSource {

    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)
}