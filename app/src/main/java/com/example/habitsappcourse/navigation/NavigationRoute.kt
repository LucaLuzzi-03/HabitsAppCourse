package com.example.habitsappcourse.navigation

sealed class NavigationRoute(val route: String) {
    object OnBoarding : NavigationRoute("onboarding")
}