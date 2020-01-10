package com.antonioleiva.daggerexample.app.ui.main

import android.content.Context
import com.antonioleiva.daggerexample.app.getFromDagger1
import dagger.Module2
import dagger.Provides2

@Module2
object MainActivityBridgeModule {

    @JvmStatic @Provides2
    fun provideOneDependency(context: Context): MainPresenter = context.getFromDagger1()
}