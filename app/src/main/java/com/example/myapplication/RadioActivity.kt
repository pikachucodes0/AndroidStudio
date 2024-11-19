package com.example.myapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class RadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var Valo: RadioButton
        lateinit var Gta: RadioButton
        lateinit var pubg: RadioButton
        lateinit var image : ImageView
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        Valo = findViewById(R.id.ButtonApple)
        Gta = findViewById(R.id.ButtonGrapes)
        pubg = findViewById(R.id.ButtonMango)
        image = findViewById(R.id.imageViewRadio)

        Valo.setOnClickListener{
            image.setImageResource(R.drawable.apple)
        }
        Gta.setOnClickListener{
            image.setImageResource(R.drawable.grapes)
        }
        pubg.setOnClickListener{
            image.setImageResource(R.drawable.mango)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}