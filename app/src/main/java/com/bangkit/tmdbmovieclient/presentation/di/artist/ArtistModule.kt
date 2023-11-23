package com.bangkit.tmdbmovieclient.presentation.di.artist

import com.bangkit.tmdbmovieclient.domain.usecase.GetArtistsUseCase
import com.bangkit.tmdbmovieclient.domain.usecase.UpdateArtistsUseCase
import com.bangkit.tmdbmovieclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class ArtistModule {

    @ActivityScoped
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistsUseCase, updateArtistsUseCase)
    }
}