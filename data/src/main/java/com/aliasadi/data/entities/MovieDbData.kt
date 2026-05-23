package com.aliasadi.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.aliasadi.domain.entities.MovieEntity

/**
 * Created 
 */
@Entity(tableName = "movies")
data class MovieDbData(
    @PrimaryKey val id: Int,
    val description: String,
    val image: String,
    val title: String,
    val category: String,
)

fun MovieDbData.toDomain() = MovieEntity(
    id = id,
    image = image,
    description = description,
    title = title,
    category = category
)
