package com.example.margo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { if (edittext != null && edittext2 != null) TextView.text = "answer:" + (edittext.text.toString().toDouble() + edittext2.text.toString().toDouble()) }
        button3.setOnClickListener { if (edittext != null && edittext2 != null) TextView.text = "answer:" + (edittext.text.toString().toDouble() - edittext2.text.toString().toDouble()) }
        button4.setOnClickListener { if (edittext != null && edittext2 != null) TextView.text = "answer:" + (edittext.text.toString().toDouble() * edittext2.text.toString().toDouble()) }
        button5.setOnClickListener { if (edittext != null && edittext2 != null) TextView.text = "answer:" + (edittext.text.toString().toDouble() / edittext2.text.toString().toDouble()) }

    }
}
