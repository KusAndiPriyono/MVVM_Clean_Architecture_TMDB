package com.bangkit.tmdbmovieclient.domain.usecase

import com.bangkit.tmdbmovieclient.data.model.artist.Artist
import com.bangkit.tmdbmovieclient.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute(): List<Artist>? = artistRepository.getArtists()
}