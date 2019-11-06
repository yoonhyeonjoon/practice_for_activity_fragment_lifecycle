package com.example.practice_activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import vlm.R


class testbase : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.withme_m0_mainstream)
        println("testbase onCreate called")
        Log.e("msg", "testbase onCreate called")
    }


    override fun onStart() {
        super.onStart()
        println("testbase onStart called")
        Log.e("msg", "testbase onStart called")
    }

    override fun onResume() {
        super.onResume()
        println("testbase onResume called")
        Log.e("msg", "testbase onResume called")
    }


    override fun onPause() {
        super.onPause()
        println("testbase onPause called")
        Log.e("msg", "testbase onPause called")
    }

    override fun onStop() {
        super.onStop()
        println("testbase onStop called")
        Log.e("msg", "testbase onStop called")
    }


    override fun onDestroy() {
        super.onDestroy()
        println("testbase onDestroy called")
        Log.e("msg", "testbase onDestroy called")
    }










}
