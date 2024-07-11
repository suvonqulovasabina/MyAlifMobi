package com.example.myalifmobi.di



import com.example.myalifmobi.utils.navigation.AppNavigator
import com.example.myalifmobi.utils.navigation.NavigationDispatcher
import com.example.myalifmobi.utils.navigation.NavigationHandler
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface NavigatorModule {

    @Binds
    fun appNavigator(dispatcher: NavigationDispatcher) : AppNavigator

    @Binds
    fun navigationHandler(dispatcher : NavigationDispatcher) : NavigationHandler
}


