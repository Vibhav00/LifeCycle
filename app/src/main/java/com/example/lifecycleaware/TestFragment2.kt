package com.example.lifecycleaware

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifecycleaware.databinding.FragmentTestBinding
import com.example.lifecycleaware.databinding.FragmentTwoBinding
import com.example.lifecycleaware.databinding.TesttingViewBinding
import kotlin.random.Random


class TestFragment2 : Fragment() {
    lateinit var fragmentTestBinding: FragmentTwoBinding
    val fragmentName = "TestFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        LogThis("Fragment OnCreateView","$fragmentName","🖼️")()
        fragmentTestBinding = FragmentTwoBinding.inflate(layoutInflater)
        return fragmentTestBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LogThis("Fragment OnViewCreated","$fragmentName","\uD83D\uDDBC\uFE0F")()

        val myLifecycleObserver = MyLifecycleObserver("TestFragment")
        lifecycle.addObserver(myLifecycleObserver)

        fragmentTestBinding.btnFragment.setText("finish")
        fragmentTestBinding.btnFragment.setOnClickListener {
            this.requireActivity().finish()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogThis("Fragment OnCreate","$fragmentName","🖼️")()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        LogThis("Fragment OnViewStateRestored","$fragmentName","🖼️")()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        LogThis("Fragment OnSaveInstanceState","$fragmentName","🖼️")()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        LogThis("Fragment View Destroyed ","$fragmentName","🖼️")()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        LogThis("Fragment On Attach ","$fragmentName","🖼️")()

    }



    override fun onDetach() {
        super.onDetach()
        LogThis("Fragment On_Detach ","$fragmentName","🖼️")()
    }


    override fun onStart() {
        super.onStart()
        LogThis("Fragment Started","$fragmentName","🖼️")()
    }


    override fun onResume() {
        super.onResume()
        LogThis("Fragment Resumed","$fragmentName","🖼️")()
    }

    override fun onPause() {
        super.onPause()
        LogThis("Fragment Paused","$fragmentName","🖼️")()
    }

    override fun onStop() {
        super.onStop()
        LogThis("Fragment Stopped ","$fragmentName","🖼️")()
    }

    override fun onDestroy() {
        LogThis("Fragment Destroyed ","$fragmentName","🖼️")()
        super.onDestroy()
    }












//    private fun getRandomColor(): Int {
//        // Generate random values for RGB components
//        val red = Random.nextInt(256) // 0 to 255
//        val green = Random.nextInt(256)
//        val blue = Random.nextInt(256)
//
//        // Return the color using the Color.rgb method
//        return Color.rgb(red, green, blue)
//
//
//        val binding = TesttingViewBinding.inflate(layoutInflater)
//        binding.btnMain.setOnClickListener {
//
//        }
//    }
}