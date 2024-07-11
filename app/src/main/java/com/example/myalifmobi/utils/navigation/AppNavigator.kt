package com.example.myalifmobi.utils.navigation

import cafe.adriel.voyager.core.screen.Screen

typealias AppScreen = Screen

interface AppNavigator {
    suspend fun back()
    suspend fun backUntilRoot()
    suspend fun backAll()
    suspend fun push(screen: AppScreen)
    suspend fun replace(screen: AppScreen)
    suspend fun replaceAll(screen: AppScreen)
    suspend fun navigateTo(screen: AppScreen)
}