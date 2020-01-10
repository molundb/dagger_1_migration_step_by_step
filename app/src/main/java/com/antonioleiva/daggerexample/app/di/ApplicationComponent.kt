package com.antonioleiva.daggerexample.app.di

import android.content.Context
import com.antonioleiva.daggerexample.app.ui.main.MainComponent
import dagger.BindsInstance
import dagger.Component

@Component(modules = [BridgeModule::class])
interface ApplicationComponent {

  @Component.Factory
  interface Factory {

    fun create(@BindsInstance context: Context): ApplicationComponent
  }

  val mainComponentFactory: MainComponent.Factory
}
