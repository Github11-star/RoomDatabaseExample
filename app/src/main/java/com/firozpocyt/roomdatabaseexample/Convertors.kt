package com.firozpocyt.roomdatabaseexample

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.Date

class Convertors {

    @TypeConverter
    fun fromDateToLong(value: Date) : Long {
        return value.time
    }

    @TypeConverter
    fun fromLongToDate(value: Long) : Date {
        return Date(value)
    }
}