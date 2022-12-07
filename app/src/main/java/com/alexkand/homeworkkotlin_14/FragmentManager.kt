package com.alexkand.homeworkkotlin_14

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.navigateToFragment(fragment: Fragment) {
    beginTransaction().replace(R.id.fragment_container, fragment).commit()
}