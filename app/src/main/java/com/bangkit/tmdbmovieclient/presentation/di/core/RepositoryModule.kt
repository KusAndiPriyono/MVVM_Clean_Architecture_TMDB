package com.bangkit.tmdbmovieclient.presentation.di.core

import com.bangkit.tmdbmovieclient.data.repository.artist.ArtistRepositoryImpl
import com.bangkit.tmdbmovieclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.bangkit.tmdbmovieclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.bangkit.tmdbmovieclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.bangkit.tmdbmovieclient.data.repository.movie.MovieRepositoryImpl
import com.bangkit.tmdbmovieclient.data.repository.movie.datasource.MovieCacheDataSource
import com.bangkit.tmdbmovieclient.data.repository.movie.datasource.MovieLocalDataSource
import com.bangkit.tmdbmovieclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.bangkit.tmdbmovieclient.data.repository.tvshow.TvShowRepositoryImpl
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.bangkit.tmdbmovieclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.bangkit.tmdbmovieclient.domain.repository.ArtistRepository
import com.bangkit.tmdbmovieclient.domain.repository.MovieRepository
import com.bangkit.tmdbmovieclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieCacheDataSource: MovieCacheDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(
            tvShowRemoteDataSource, tvShowLocalDataSource, tvShowCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistCacheDataSource: ArtistCacheDataSource,
        artistLocalDataSource: ArtistLocalDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(
            artistRemoteDataSource, artistLocalDataSource, artistCacheDataSource
        )
    }
}