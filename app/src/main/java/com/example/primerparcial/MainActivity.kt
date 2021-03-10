package com.example.primerparcial

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button)
        var text_username:String = ""
        var text_password:String = ""
        val text_error = findViewById<TextView>(R.id.error)
        val correos = "daniela.cuellarc@ecci.edu.co miguela.perezc@ecci.edu.co davida.huertasc@ecci.edu.co jasond.pinedas@ecci.edu.co"
        boton.setOnClickListener{
            text_username = findViewById<EditText>(R.id.username).text.toString()
            text_password = findViewById<EditText>(R.id.password).text.toString()

            when{
                (text_username.equals("")&&text_password.equals(""))->{
                    text_error.text = "El usuario y la contraseña son obligatorios"
                }
                (text_username.indexOf("@")==-1&&text_password.equals(""))->{
                    text_error.text = "El usuario debe ser un correo y la contraseña es obligatoria"
                }
                (correos.indexOf(text_username) ==-1&&text_password.equals(""))->{
                    text_error.text = "El usuario no se un correo válido y la contraseña es obligatoria"
                }
                (text_username.equals("")&&text_password.length<=5)->{
                    text_error.text = "El usuario es obligatorio y la contraseña debe contener más de 4 dígitos"
                }
                (text_username.indexOf("@")==-1&&text_password.length<=5)->{
                    text_error.text = "El usuario debe ser un correo y la contraseña debe contener más de 4 dígitos"
                }
                (correos.indexOf(text_username) ==-1&&text_password.length<=5)->{
                    text_error.text = "El usuario no es un correo válido y la contraseña debe contener más de 4 dígitos"
                }
                (text_username.equals(""))->{
                    text_error.text = "El usuario es obligatorio"
                }
                (text_password.equals(""))->{
                    text_error.text = "La contraseña es obligatoria"
                }

                (text_username.indexOf("@")==-1)->{
                    text_error.text = "El nombre de usuario debe ser un correo"
                }

                (correos.indexOf(text_username) ==-1)->{
                    text_error.text = "El nombre de usuario no es uno de los correos de los integrantes"
                }

                (text_password.length<=5)->{
                    text_error.text = "La contraseña debe contener más de 4 digitos"
                }

                else->{
                    val intent = Intent(this, login::class.java)
                    startActivity(intent)
                }
            }

        }
    }
}