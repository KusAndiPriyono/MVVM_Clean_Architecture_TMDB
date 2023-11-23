package com.bangkit.tmdbmovieclient.domain.repository

import com.bangkit.tmdbmovieclient.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}