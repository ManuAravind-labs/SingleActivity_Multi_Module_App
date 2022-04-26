package com.android4you.feature2

import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.android4you.core.Screen2RouteContract

class Feature2RouteContractImpl : Screen2RouteContract {

    override fun show(dataToPass: String, navController: NavController) {
        navController.navigate(R.id.nav_graph_2, bundleOf("argBValue" to dataToPass))
    }
}
