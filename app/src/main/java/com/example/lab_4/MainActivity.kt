package com.example.lab_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged
import com.example.lab_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)



        setContentView(binding.root)
        binding.fahrenhietText.doAfterTextChanged { FarBar() }
        binding.NextText.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }
    }
    fun FarBar(){
        val F = binding.fahrenhietText.text.toString().toDoubleOrNull()




        if (F == null ) {
            return
        }
        var C = (F * 9/5) + 32


        val message ="Result is"
        val displayMessage = "$message $C"


        binding.resultTextView.text = displayMessage


    }
}










