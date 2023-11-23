package com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource

import com.bangkit.tmdbmovieclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {

    suspend fun getTvShows(): Response<TvShowList>
}