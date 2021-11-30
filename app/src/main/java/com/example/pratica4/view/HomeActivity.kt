package com.example.pratica4.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.example.pratica4.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setTitle("Mensagens")

        val lista = findViewById<ListView>(R.id.listaMensagens)
        val contatos = arrayOf("Anthony", "Benedict", "Colin", "Daphne", "Eloise")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contatos )

        lista.setAdapter(adaptador)

        val mensagem = findViewById<FloatingActionButton>(R.id.fabMensagem)
        mensagem.setOnClickListener {
            val intent = Intent(this, MensagemActivity::class.java)
            startActivity(intent)
        }

    }
}