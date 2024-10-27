package com.example.lifecycleaware

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lifecycleaware.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  activityMainBinding: ActivityMainBinding

    private lateinit var myLifecycleObserver: MyLifecycleObserver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogThis("Activity Created ","Main Activity","\uD83E\uDD20 ")()

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        // Initialize and register the lifecycle observer
        myLifecycleObserver = MyLifecycleObserver(this.localClassName)
        lifecycle.addObserver(myLifecycleObserver)

        supportFragmentManager.beginTransaction().replace(R.id.fl,TestFragment()).commit()

    }
    override fun onStart() {
        super.onStart()
        LogThis("Activity Started","Main Activity","\uD83E\uDD20")()
    }

    override fun onRestart() {
        super.onRestart()
        LogThis("Activity Restarted","Main Activity","\uD83E\uDD20")()
    }

    override fun onResume() {
        super.onResume()
        LogThis("Activity Resumed","Main Activity","\uD83E\uDD20")()
    }

    override fun onPause() {
        super.onPause()
        LogThis("Activity Paused","Main Activity","\uD83E\uDD20")()
    }

    override fun onStop() {
        super.onStop()
        LogThis("Activity Stopped ","Main Activity","\uD83E\uDD20")()
    }

    override fun onDestroy() {
        LogThis("Activity Destroyed ","Main Activity","\uD83E\uDD20")()
        super.onDestroy()
    }




}