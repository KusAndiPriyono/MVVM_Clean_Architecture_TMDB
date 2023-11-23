package com.bangkit.tmdbmovieclient.presentation.di.core

import android.app.Application
import androidx.room.Room
import com.bangkit.tmdbmovieclient.data.db.ArtistDao
import com.bangkit.tmdbmovieclient.data.db.MovieDao
import com.bangkit.tmdbmovieclient.data.db.TMDBDatabase
import com.bangkit.tmdbmovieclient.data.db.TvShowDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {

    @Provides
    @Singleton
    fun provideMovieDataBase(app: Application): TMDBDatabase {
        return Room.databaseBuilder(app, TMDBDatabase::class.java, "tmdbclient")
            .build()
    }


    @Provides
    @Singleton
    fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDao {
        return tmdbDatabase.movieDao()
    }

    @Provides
    @Singleton
    fun provideTvDao(tmdbDatabase: TMDBDatabase): TvShowDao {
        return tmdbDatabase.tvShowDao()
    }

    @Provides
    @Singleton
    fun provideArtistDao(tmdbDatabase: TMDBDatabase): ArtistDao {
        return tmdbDatabase.artistDao()
    }
}