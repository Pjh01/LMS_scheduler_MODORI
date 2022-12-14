package com.example.lms

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Homework(
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0,
    val check : Boolean,
    val content : String,
    val year : Int,
    val month : Int,
    val day : Int
)
