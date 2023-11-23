package com.bangkit.tmdbmovieclient.presentation.di.core

import com.bangkit.tmdbmovieclient.BuildConfig
import com.bangkit.tmdbmovieclient.data.api.TMDBService
import com.bangkit.tmdbmovieclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.bangkit.tmdbmovieclient.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.bangkit.tmdbmovieclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.bangkit.tmdbmovieclient.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, BuildConfig.API_KEY)
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService, BuildConfig.API_KEY)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService, BuildConfig.API_KEY)
    }
}