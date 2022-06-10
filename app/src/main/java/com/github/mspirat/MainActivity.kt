package com.github.mspirat

//TODO if not needed delete adapter & models from main project directory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("testlogs","in onCreate")

        val nextScreenActivityButton = findViewById<Button>(R.id.next)
        nextScreenActivityButton.setOnClickListener(
            View.OnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        )
    }
}