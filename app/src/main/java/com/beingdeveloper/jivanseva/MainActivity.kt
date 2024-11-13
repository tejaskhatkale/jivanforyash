package com.beingdeveloper.jivanseva


import android.os.Bundle

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import androidx.fragment.app.Fragment

import com.beingdeveloper.fragment.HomeFragment
import com.beingdeveloper.fragment.NotificationFragment
import com.beingdeveloper.fragment.ProfileFragment
import com.beingdeveloper.fragment.SettingFragment

import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton



class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fab_with_bottom)



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_notification -> {
                    replaceFragment(NotificationFragment())
                    title = "Notification"
                }
                R.id.nav_home -> {
                    replaceFragment(HomeFragment())
                    title = "Home"
                }
                R.id.nav_profile -> {
                    replaceFragment(ProfileFragment())
                    title = "Profile"
                }
                R.id.nav_setting -> {
                    replaceFragment(SettingFragment())
                    title = "Setting"
                }
            }
            true
        }

        // default bottom tab selected
        replaceFragment(HomeFragment())
        title = "Home"
        bottomNavigationView.selectedItemId = R.id.nav_home


        val addFab = findViewById<FloatingActionButton>(R.id.addFab)
        addFab.setOnClickListener {
            Toast.makeText(this,"Clicked", Toast.LENGTH_LONG).show()
        }
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer,fragment)
            .commit()
    }

}
