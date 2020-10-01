package com.example.tutorial_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit_nomor: EditText = findViewById(R.id.edit_nomor)
        val edit_nama: EditText = findViewById(R.id.edit_nama)
        val btn_intent: Button = findViewById(R.id.btn_intent)
        val btn_intentExplicit: Button = findViewById(R.id.btn_intentExplicit)
        val btn_intentExpilcitBundle: Button = findViewById(R.id.btn_intentExplicitBundle)
        val btn_intentImplicit: Button = findViewById(R.id.btn_intentImplicit)

        btn_intent.setOnClickListener {
            startActivity(Intent(this, IntentActivity::class.java))
        }

        btn_intentExplicit.setOnClickListener {
            val intent = Intent(this, IntentExplicitActivity::class.java)
            intent.putExtra("nomor", edit_nomor.text.toString())
            intent.putExtra("nama", edit_nama.text.toString())
            startActivity(intent)
        }

        btn_intentExpilcitBundle.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nomor",edit_nomor.text.toString())
            bundle.putString("nama", edit_nama.text.toString())
            val intent = Intent(this, IntentExplicitActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btn_intentImplicit.setOnClickListener {
            val panggil_nomor = edit_nomor.text.toString()
            val Dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$panggil_nomor"))
            startActivity(Dial)
        }

    }
}