package com.example.guia5

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_muestra, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.opcion1 -> {
                startActivity(Intent(this, Opcion1Activity::class.java))
                true
            }

            R.id.opcion2 -> {
                startActivity(Intent(this, Opcion2Activity::class.java))
                true
            }

            R.id.opcion3 -> {
                startActivity(Intent(this, Opcion3Activity::class.java))
                true
            }

            R.id.opcion4 -> {
                startActivity(Intent(this, Opcion4Activity::class.java))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}
