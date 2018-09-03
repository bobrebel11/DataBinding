package com.example.rebelbob11.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.rebelbob11.databinding.BR.student
import com.example.rebelbob11.databinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)



       val student1 = Student("Babu","Goud")

      binding.student= student1
    }
}
