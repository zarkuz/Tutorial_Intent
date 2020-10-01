package com.example.tutorial_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IntentExplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_explicit)

        val t_nomor: TextView = findViewById(R.id.tampil_nomor)
        val t_nama: TextView = findViewById(R.id.tampil_nama)

        t_nomor.setText(intent.getStringExtra("nomor"))
        t_nama.setText(intent.getStringExtra("nama"))

    }
}