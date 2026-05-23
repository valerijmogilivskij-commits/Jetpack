package com.aliasadi.domain.usecase

import com.aliasadi.domain.entities.MovieEntity
import com.aliasadi.domain.repository.MovieRepository
import com.aliasadi.domain.util.Result

/**
 * Created 
 **/
class GetMovieDetails(
    private val movieRepository: MovieRepository
) {
    suspend operator fun invoke(movieId: Int): Result<MovieEntity> = movieRepository.getMovie(movieId)
}
