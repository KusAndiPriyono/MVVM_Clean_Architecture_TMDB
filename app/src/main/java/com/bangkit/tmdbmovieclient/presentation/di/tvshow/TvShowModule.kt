package com.bangkit.tmdbmovieclient.presentation.di.tvshow

import com.bangkit.tmdbmovieclient.domain.usecase.GetTvShowsUseCase
import com.bangkit.tmdbmovieclient.domain.usecase.UpdateTvShowsUseCase
import com.bangkit.tmdbmovieclient.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class TvShowModule {

    @ActivityScoped
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowUseCase, updateTvShowsUseCase)
    }
}