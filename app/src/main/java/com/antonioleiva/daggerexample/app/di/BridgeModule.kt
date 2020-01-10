package com.antonioleiva.daggerexample.app.di

import android.content.Context
import com.antonioleiva.daggerexample.app.getFromDagger1
import com.antonioleiva.daggerexample.app.interactors.FindItemsInteractor
import dagger.Module2
import dagger.Provides2

@Module2
object BridgeModule {

  @Provides2 fun provideFindItemsInteractor(context: Context): FindItemsInteractor = context.getFromDagger1()
}
