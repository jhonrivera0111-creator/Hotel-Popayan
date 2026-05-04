package com.example.hotelpopayan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        setupBottomNav(this, bottomNav, R.id.nav_profile)
    }
}