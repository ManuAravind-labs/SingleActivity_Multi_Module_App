package com.android4you.core

import androidx.navigation.NavController

interface Screen2RouteContract {
    fun show(dataToPass: String, navController: NavController)
}
