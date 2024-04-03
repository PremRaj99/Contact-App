package com.cuteboy.contact.utils

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.cuteboy.contact.dummydata.Category
import com.cuteboy.contact.dummydata.CategoryList1
import com.google.gson.Gson

object CategoryDataManager {
//    var CategoryList = emptyArray<Category>()
    var CategoryList = CategoryList1

//    var isDataLoded = mutableStateOf(false)
    var isDataLoded = mutableStateOf(true)

//    fun LoadAssetsFromFile(context: Context) {
//        val inputStream = context.assets.open("category.json")
//        val size: Int = inputStream.available()
//        val buffer = ByteArray(size)
//        inputStream.read(buffer)
//        inputStream.close()
//        val json = String(buffer, Charsets.UTF_8)
//        val gson = Gson()
//        CategoryList = gson.fromJson(json, Array<Category>::class.java)
//        isDataLoded.value = true
//
//    }
}