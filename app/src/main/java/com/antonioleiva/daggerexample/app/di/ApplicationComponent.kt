package com.antonioleiva.daggerexample.app.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component
interface ApplicationComponent {

  @Component.Factory
  interface Factory {

    fun create(@BindsInstance context: Context): ApplicationComponent
  }
}
