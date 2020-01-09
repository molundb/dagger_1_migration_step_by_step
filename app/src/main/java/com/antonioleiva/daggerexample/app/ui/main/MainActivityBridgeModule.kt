package com.antonioleiva.daggerexample.app.ui.main

import android.content.Context
import dagger.Module2
import dagger.Provides2

@Module2
object RandomClassBridgeModule {

    @JvmStatic @Provides2
    fun provideOneDependency(context: Context): MainPresenter = context.getFromDagger1()
}