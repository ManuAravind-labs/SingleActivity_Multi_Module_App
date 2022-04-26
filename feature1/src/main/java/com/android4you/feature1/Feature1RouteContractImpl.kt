package com.android4you.feature1

import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.android4you.core.Screen1RouteContract

class Feature1RouteContractImpl : Screen1RouteContract {

    override fun show(dataToPass: String, navController: NavController) {
        navController.navigate(R.id.nav_graph_1, bundleOf("argAValue" to dataToPass))
    }
}
