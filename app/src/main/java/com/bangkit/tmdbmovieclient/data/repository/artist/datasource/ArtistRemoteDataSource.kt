package com.bangkit.tmdbmovieclient.data.repository.artist.datasource

import com.bangkit.tmdbmovieclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {

    suspend fun getArtist(): Response<ArtistList>
}