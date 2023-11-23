package com.bangkit.tmdbmovieclient.data.repository.movie.datasource

import com.bangkit.tmdbmovieclient.data.model.movie.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}