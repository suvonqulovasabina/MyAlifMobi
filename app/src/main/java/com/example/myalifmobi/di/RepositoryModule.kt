package com.example.myalifmobi.di


import com.example.myalifmobi.damin.AppRepository
import com.example.myalifmobi.damin.AppRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun signUpModel(impl: AppRepositoryImpl): AppRepository

}
