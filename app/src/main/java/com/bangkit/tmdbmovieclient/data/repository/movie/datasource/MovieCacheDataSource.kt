package com.bangkit.tmdbmovieclient.data.repository.movie.datasource

import com.bangkit.tmdbmovieclient.data.model.movie.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}