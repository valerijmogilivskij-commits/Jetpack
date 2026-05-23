package com.aliasadi.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author
 */
@Entity(tableName = "favorite_movies")
data class FavoriteMovieDbData(
    @PrimaryKey val movieId: Int
)
