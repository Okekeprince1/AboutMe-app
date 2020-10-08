package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val donBtn: Button = findViewById(R.id.done)


        donBtn.setOnClickListener{ changeNickname(it) }
    }

    private fun changeNickname(view: View){
        val nicknameText: TextView = findViewById(R.id.nickName)
        val nicknameEditText: EditText = findViewById(R.id.editNickName)
        nicknameText.text = nicknameEditText.text

        nicknameEditText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameText.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}