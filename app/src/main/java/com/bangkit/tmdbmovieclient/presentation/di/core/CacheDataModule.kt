package com.bangkit.tmdbmovieclient.presentation.di.core

import com.bangkit.tmdbmovieclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.bangkit.tmdbmovieclient.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.bangkit.tmdbmovieclient.data.repository.movie.datasource.MovieCacheDataSource
import com.bangkit.tmdbmovieclient.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CacheDataModule {

    @Provides
    @Singleton
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}