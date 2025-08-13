package com.example.navanddrawer.Repository

import com.example.navanddrawer.database.ItemDao
import com.example.navanddrawer.model.Item

class ItemRepository (private val dao: ItemDao) {

    fun getAllItems() = dao.getAllItems()

    fun searchItems(query: String) = dao.searchItems(query)

    suspend fun insertItem(item: Item) = dao.insertItem(item)
}