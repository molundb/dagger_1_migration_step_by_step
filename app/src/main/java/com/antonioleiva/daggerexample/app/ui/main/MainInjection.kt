package com.antonioleiva.daggerexample.app.ui.main

import dagger.Binds
import dagger.BindsInstance
import dagger.Module2
import dagger.Provides2
import dagger.Subcomponent

@Subcomponent(modules = [MainModule2::class])
interface MainComponent {

  @Subcomponent.Factory
  interface Factory {

    fun create(@BindsInstance view: MainView): MainComponent
  }

  fun inject(activity: MainActivity)
}

@Module2
abstract class MainModule2 {

  @Binds abstract fun bind(presenter: MainPresenterImpl): MainPresenter
}
