package com.bangkit.tmdbmovieclient.presentation.di.core

import com.bangkit.tmdbmovieclient.data.db.ArtistDao
import com.bangkit.tmdbmovieclient.data.db.MovieDao
import com.bangkit.tmdbmovieclient.data.db.TvShowDao
import com.bangkit.tmdbmovieclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.bangkit.tmdbmovieclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.bangkit.tmdbmovieclient.data.repository.movie.datasource.MovieLocalDataSource
import com.bangkit.tmdbmovieclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {


    @Provides
    @Singleton
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)

    }

    @Provides
    @Singleton
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)

    }

    @Provides
    @Singleton
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)

    }
}