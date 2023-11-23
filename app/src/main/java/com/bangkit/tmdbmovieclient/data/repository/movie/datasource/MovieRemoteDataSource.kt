package com.bangkit.tmdbmovieclient.data.repository.movie.datasource

import com.bangkit.tmdbmovieclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>
}