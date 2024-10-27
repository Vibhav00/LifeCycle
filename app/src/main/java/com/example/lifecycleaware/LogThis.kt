package com.example.lifecycleaware

import android.util.Log

class LogThis(private val text:String, private val from:String, private val emoji:String) {
    operator fun invoke(){
        Log.e("lifecycleCheck","$text is Called from $from [$emoji]")
    }
}