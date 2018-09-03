package com.example.rebelbob11.databinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.rebelbob11.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  mActivityMainBinding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
