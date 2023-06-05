package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickGoList(view: View) {

        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)

    }

    fun onClickGoLogIn(view: View) {

        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)

    }
}