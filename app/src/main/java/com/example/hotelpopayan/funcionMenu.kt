package com.example.hotelpopayan

import android.app.Activity
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView

fun setupBottomNav(activity: Activity, bottomNav: BottomNavigationView, current: Int) {

    bottomNav.selectedItemId = current

    bottomNav.setOnItemSelectedListener { item ->

        if (item.itemId == current) return@setOnItemSelectedListener true

        val intent = when (item.itemId) {

            R.id.nav_home -> Intent(activity, MainActivity::class.java)
            R.id.nav_reservas -> Intent(activity, ReservasActivity::class.java)
            R.id.nav_rooms -> Intent(activity, RoomsActivity::class.java)
            R.id.nav_profile -> Intent(activity, PerfilActivity::class.java)

            else -> null
        }

        intent?.apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            activity.startActivity(this)
        }

        true
    }
}