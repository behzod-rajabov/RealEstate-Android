package me.ruyeo.realestate.presentation

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home_screen")
    object ProductDetailScreen: Screen("product_detail_screen")
}