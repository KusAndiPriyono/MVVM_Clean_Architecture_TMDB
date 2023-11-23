package com.bangkit.tmdbmovieclient.domain.usecase

import com.bangkit.tmdbmovieclient.data.model.movie.Movie
import com.bangkit.tmdbmovieclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}