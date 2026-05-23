package com.aliasadi.domain.usecase

import androidx.paging.PagingData
import com.aliasadi.domain.entities.MovieEntity
import com.aliasadi.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow

/**
 * @author
 */
class GetFavoriteMovies(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(pageSize: Int): Flow<PagingData<MovieEntity>> = movieRepository.favoriteMovies(pageSize)
}