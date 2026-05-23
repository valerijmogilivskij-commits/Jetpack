package com.aliasadi.domain.usecase

import com.aliasadi.domain.repository.MovieRepository

/**
 * @author 
 */
class RemoveMovieFromFavorite(
    private val movieRepository: MovieRepository
) {
    suspend operator fun invoke(movieId: Int) = movieRepository.removeMovieFromFavorite(movieId)
}