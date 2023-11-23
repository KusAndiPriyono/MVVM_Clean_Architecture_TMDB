package com.bangkit.tmdbmovieclient.domain.usecase

import com.bangkit.tmdbmovieclient.data.model.tvshow.TvShow
import com.bangkit.tmdbmovieclient.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {

    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()
}