package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

import androidx.room.TypeConverter

class StringListConverter {
    @TypeConverter
    fun fromString(stringListString: String): MutableList<String> {
        return stringListString.split(",").map { it }.toMutableList()
    }

    @TypeConverter
    fun toString(stringList: MutableList<String>): String {
        return stringList.joinToString(separator = ",")
    }
}