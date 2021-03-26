package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class BirthdayGreeting : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val receiver_msg = findViewById<TextView>(R.id.birthdayGreeting)
        val name = intent.getStringExtra(NAME_EXTRA)
        receiver_msg.text = "Happy Birthday\n$name!"

    }
}