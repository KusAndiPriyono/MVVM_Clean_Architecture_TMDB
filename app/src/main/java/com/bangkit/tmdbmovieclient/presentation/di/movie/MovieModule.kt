package com.bangkit.tmdbmovieclient.presentation.di.movie

import com.bangkit.tmdbmovieclient.domain.usecase.GetMoviesUseCase
import com.bangkit.tmdbmovieclient.domain.usecase.UpdateMoviesUseCase
import com.bangkit.tmdbmovieclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class MovieModule {

    @ActivityScoped
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }
}