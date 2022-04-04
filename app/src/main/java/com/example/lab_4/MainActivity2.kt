package com.example.lab_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import com.example.lab_4.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        binding = ActivityMain2Binding.inflate(layoutInflater)
        binding.celsiusText.doAfterTextChanged { CelBell() }


        setContentView(binding.root)

        binding.BackText.setOnClickListener {
            finish()
        }
    }
    fun CelBell(){
        val Celsius = binding.celsiusText.text.toString().toDoubleOrNull()

        var Fahrenheit = (Celsius!! -35) * 9/5

        val message ="Result is"
        val displayMessage = "$message $Fahrenheit"

        binding.result2.text = displayMessage
    }
}

