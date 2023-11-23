package com.bangkit.tmdbmovieclient.data.repository.tvshow.datasourceImpl

import com.bangkit.tmdbmovieclient.data.api.TMDBService
import com.bangkit.tmdbmovieclient.data.model.tvshow.TvShowList
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> {
        return tmdbService.getPopularTvShow(apiKey)
    }
}