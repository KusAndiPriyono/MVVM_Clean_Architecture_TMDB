package com.bangkit.tmdbmovieclient.data.api

import com.bangkit.tmdbmovieclient.data.model.artist.ArtistList
import com.bangkit.tmdbmovieclient.data.model.movie.MovieList
import com.bangkit.tmdbmovieclient.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey: String
    ): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShow(
        @Query(
            "api_key"
        ) apiKey: String
    ): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtist(
        @Query(
            "api_key"
        ) apiKey: String
    ): Response<ArtistList>
}