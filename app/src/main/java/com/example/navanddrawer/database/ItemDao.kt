package com.example.navanddrawer.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.navanddrawer.model.Item
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {

    @Insert
    suspend fun insertItem(item: Item)

    @Query("SELECT * FROM items ORDER BY id DESC")
    fun getAllItems(): Flow<List<Item>>

    @Query("SELECT * FROM items WHERE title LIKE '%' || :search || '%' ORDER BY id DESC")
    fun searchItems(search: String): Flow<List<Item>>
}