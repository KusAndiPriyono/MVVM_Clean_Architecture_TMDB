package com.bangkit.tmdbmovieclient.data.repository.movie.datasourceImpl

import com.bangkit.tmdbmovieclient.data.api.TMDBService
import com.bangkit.tmdbmovieclient.data.model.movie.MovieList
import com.bangkit.tmdbmovieclient.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}