package com.android4you.core

import androidx.navigation.NavController

interface Screen1RouteContract {
    fun show(dataToPass: String, navController: NavController)
}
