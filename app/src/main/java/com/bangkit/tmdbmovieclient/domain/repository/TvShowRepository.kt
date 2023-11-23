package com.bangkit.tmdbmovieclient.domain.repository

import com.bangkit.tmdbmovieclient.data.model.tvshow.TvShow

interface TvShowRepository {

    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}