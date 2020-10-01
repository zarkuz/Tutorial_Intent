package com.example.tutorial_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IntentExplicitBundleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_explicit_bundle)

        val t_nomor: TextView = findViewById(R.id.tampil_nomor)
        val t_nama: TextView = findViewById(R.id.tampil_nama)

        val bundle = intent.extras
        t_nomor.setText(bundle?.getString("nomor"))
        t_nama.setText(bundle?.getString("nama"))
    }
}