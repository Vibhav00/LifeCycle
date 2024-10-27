package com.example.lifecycleaware

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyLifecycleObserver(val name: String) : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateEvent() {
        // Handle onCreate lifecycle event
        LogThis("Event OnCreate", "$name Observer", "❣\uFE0F")()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartEvent() {
        // Handle onStart lifecycle event
        LogThis("Event ON_START", "$name Observer", "❣\uFE0F")()
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeEvent() {
        // Handle onResume lifecycle event
        LogThis("Event ON_RESUME", "$name Observer", "❣\uFE0F")()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseEvent() {
        // Handle onPause lifecycle event
        LogThis("Event ON_PAUSE", "$name Observer", "❣\uFE0F")()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopEvent() {
        // Handle onStop lifecycle event
        LogThis("Event ON_STOP", "$name Observer", "❣\uFE0F")()
    }

//    fun onLife

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyEvent() {
        // Handle onDestroy lifecycle event
        LogThis("Event ON_DESTROY", "$name Observer", "❣\uFE0F")()
    }
}
