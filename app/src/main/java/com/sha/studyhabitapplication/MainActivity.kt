package com.sha.studyhabitapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigation : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val timerFragment = TimerFragment()
        loadFragment(timerFragment)
// ref: https://www.geeksforgeeks.org/bottom-navigation-bar-in-android-using-kotlin/
    // should be enabled after the timer setting fragment added
        bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.settings -> {
                    loadFragment(SettingFragment())
                    true
                }
                R.id.timer -> {
                    loadFragment(TimerFragment())
                    true
                }

                else -> {
                    true
                }
            }
        }

    }

    // replacing Fragment
    //ref: https://www.geeksforgeeks.org/bottom-navigation-bar-in-android/
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainActivity_FrameLayout, fragment)
            commit()
        }
    }
}
