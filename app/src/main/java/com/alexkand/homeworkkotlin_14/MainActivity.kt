package com.alexkand.homeworkkotlin_14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //Сделайте приложение, которое будет хранить в себе несколько кнопок с разными background элементами.
    // Поработайте с состояниями кнопок, с gradient, с stroke.

        supportFragmentManager.navigateToFragment(fragment = FirstFragment())
        //делает навигацию на фрагмент
    }
}