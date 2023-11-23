package com.bangkit.tmdbmovieclient.data.repository.tvshow.datasourceImpl

import com.bangkit.tmdbmovieclient.data.model.tvshow.TvShow
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl : TvShowCacheDataSource {
    private var tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(tvShows)
    }
}