package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Data bing variable declaration
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Data bing variable initialization
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.done.setOnClickListener{ changeNickname() }
    }

    private fun changeNickname(){
        binding.nickName.text = binding.editNickName.text.toString()
        binding.editNickName.visibility = View.GONE
        binding.done.visibility = View.GONE
        binding.nickName.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.done.windowToken, 0)
    }
}