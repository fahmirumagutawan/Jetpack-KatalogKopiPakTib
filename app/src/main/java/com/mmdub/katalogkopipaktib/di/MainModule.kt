package com.mmdub.katalogkopipaktib.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(
    includes = [
        DatastoreModule::class,
        FirebaseModule::class
    ]
)
@InstallIn(SingletonComponent::class)
object MainModule {
}