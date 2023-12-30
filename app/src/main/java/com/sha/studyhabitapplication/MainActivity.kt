package com.sha.studyhabitapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settingFragment = SettingFragment()
        setCurrentFragment(settingFragment)

    }

    // replacing Fragment
    //ref: https://www.geeksforgeeks.org/bottom-navigation-bar-in-android/
    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainActivity_FrameLayout, fragment)
            commit()
        }
    }
}
