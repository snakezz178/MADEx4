package com.example.androidfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfragments.StudentBasic
import com.example.androidfragments.StudentMarks

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Correct reference to the layout

        // Load Student Basic Details Fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_basic_details, StudentBasic())
            .commit()

        // Load Student Mark Fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_marks, StudentMarks())
            .commit()
    }
}
