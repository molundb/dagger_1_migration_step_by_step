package com.antonioleiva.daggerexample.app.interactors

import dagger.Binds
import dagger.Module2

@Module2
abstract class InteractorsModule2 {

  @Binds abstract fun bind(interactor: FindItemsInteractorImpl): FindItemsInteractor
}
