package com.example.primerparcial

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val boton = findViewById<Button>(R.id.button_finish)
        boton.setOnClickListener{
            finish()
        }
    }
}