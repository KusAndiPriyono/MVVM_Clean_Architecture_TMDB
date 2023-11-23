package com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource

import com.bangkit.tmdbmovieclient.data.model.tvshow.TvShow

interface TvShowCacheDataSource {

    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(tvShows: List<TvShow>)
}