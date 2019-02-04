package com.amrhsyn.githubtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFirst()

    }

    private fun addFirst() {
        val a = 1
        val b = 2
        var c = a + b
    }
}
