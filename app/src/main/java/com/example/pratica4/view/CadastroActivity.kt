package com.example.pratica4.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pratica4.R

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        setTitle("Cadastre-se")

        val botao9 = findViewById<Button>(R.id.button9)
        val botao10 = findViewById<Button>(R.id.button10)
        botao9.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        botao10.setOnClickListener {
           finish()
        }
    }
}