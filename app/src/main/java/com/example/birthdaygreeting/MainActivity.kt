package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

     fun createBirthdayCard(view: View) {

        val nameText = findViewById<EditText>(R.id.nameIn)
         val name = nameText.text.toString()
        val intent = Intent(this, BirthdayGreeting::class.java)
        intent.putExtra(BirthdayGreeting.NAME_EXTRA, name)
        startActivity(intent)

    }
}