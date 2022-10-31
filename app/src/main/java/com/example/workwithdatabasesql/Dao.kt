package com.example.workwithdatabasesql
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    // Лучше использовать корутины
    @Insert
    fun insertItem(item: Item)

    @Query("SELECT * FROM items")
    fun getAllItems(): Flow<List<Item>>
}