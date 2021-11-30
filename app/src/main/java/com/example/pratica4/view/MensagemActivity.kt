package com.example.pratica4.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pratica4.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensagem)
        setTitle("Nova Mensagem")
        val mensagem = findViewById<FloatingActionButton>(R.id.fabEnviar)
        mensagem.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}