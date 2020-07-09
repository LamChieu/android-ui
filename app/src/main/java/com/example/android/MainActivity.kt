package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = this
        btnLearn.setOnClickListener {
            val intent = Intent(context, Main2Activity::class.java)
            startActivity(intent)
        }
        btnPratice.setOnClickListener {
            val intent = Intent(context, Main2Activity::class.java)
            startActivity(intent)
        }
        btnTest.setOnClickListener {
            val intent = Intent(context, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
