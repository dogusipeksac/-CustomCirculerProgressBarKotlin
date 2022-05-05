package com.example.customcirculerprogressbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private lateinit var progressBar: CircularProgressView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressBar=findViewById(R.id.progressbar)


        progressBar.setProgressWidth(30f)
        progressBar.setProgressBackgroundColor(Color.GRAY)
        progressBar.setProgress(75.0F)
        progressBar.setProgressColor(Color.BLUE)
        progressBar.setRounded(true)




    }
}