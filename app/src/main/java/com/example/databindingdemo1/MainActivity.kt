package com.example.databindingdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo1.databinding.ActivityMainBinding

//Normal demo without data binding
/*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtQuote = findViewById<TextView>(R.id.txtQuote);
        val txtAuther = findViewById<TextView>(R.id.txtAuther);

        val quote = "If you want to shine like a sun, first burn like a sun."

        val author = "A. P. J. Abdul Kalam"

        txtQuote.text = quote
        txtAuther.text = author


    }
}*/


// Data binding without data variable
/*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        val binding : ActivityMainBinding =   DataBindingUtil.setContentView(this,R.layout.activity_main)

        val quote = "If you want to shine like a sun, first burn like a sun."

        val author = "A. P. J. Abdul Kalam"

        binding.txtQuote.text = quote
        binding.txtAuther.text = author


    }
}*/


//Data binding using data variable
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding : ActivityMainBinding =   DataBindingUtil.setContentView(this,R.layout.activity_main)


        val quoteString = "If you want to shine like a sun, first burn like a sun."

        val author = "A. P. J. Abdul Kalam"

        val quote = Quote(quoteString,author)
        binding.quoteObj = quote


//        binding.txtQuote.text = quote
//        binding.txtAuther.text = author


    }
}
