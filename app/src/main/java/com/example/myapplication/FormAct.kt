package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class FormAct : AppCompatActivity() {

    lateinit var finame: TextInputLayout
    lateinit var laname: TextInputLayout
    lateinit var email1: TextInputLayout
    lateinit var password1: TextInputLayout
    lateinit var signup1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_form3)

        finame = findViewById(R.id.firstName1)
        laname = findViewById(R.id.lastName1)
        email1 = findViewById(R.id.email1)
        password1 = findViewById(R.id.password1)
        signup1= findViewById(R.id.button2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
