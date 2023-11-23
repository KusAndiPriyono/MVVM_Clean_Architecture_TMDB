package com.bangkit.tmdbmovieclient.presentation.di.core

import com.bangkit.tmdbmovieclient.domain.repository.ArtistRepository
import com.bangkit.tmdbmovieclient.domain.repository.MovieRepository
import com.bangkit.tmdbmovieclient.domain.repository.TvShowRepository
import com.bangkit.tmdbmovieclient.domain.usecase.GetArtistsUseCase
import com.bangkit.tmdbmovieclient.domain.usecase.GetMoviesUseCase
import com.bangkit.tmdbmovieclient.domain.usecase.GetTvShowsUseCase
import com.bangkit.tmdbmovieclient.domain.usecase.UpdateArtistsUseCase
import com.bangkit.tmdbmovieclient.domain.usecase.UpdateMoviesUseCase
import com.bangkit.tmdbmovieclient.domain.usecase.UpdateTvShowsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideGetMoviesUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    @Singleton
    fun provideUpdateMoviesUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase {
        return UpdateMoviesUseCase(movieRepository)
    }

    @Provides
    @Singleton
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowsUseCase {
        return GetTvShowsUseCase(tvShowRepository)
    }

    @Provides
    @Singleton
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowsUseCase {
        return UpdateTvShowsUseCase(tvShowRepository)
    }

    @Provides
    @Singleton
    fun provideGetArtistUseCase(artistRepository: ArtistRepository): GetArtistsUseCase {
        return GetArtistsUseCase(artistRepository)
    }

    @Provides
    @Singleton
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository): UpdateArtistsUseCase {
        return UpdateArtistsUseCase(artistRepository)
    }
}