package com.bangkit.tmdbmovieclient.data.repository.artist.datasourceImpl

import com.bangkit.tmdbmovieclient.data.api.TMDBService
import com.bangkit.tmdbmovieclient.data.model.artist.ArtistList
import com.bangkit.tmdbmovieclient.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    ArtistRemoteDataSource {
    override suspend fun getArtist(): Response<ArtistList> {
        return tmdbService.getPopularArtist(apiKey)
    }
}