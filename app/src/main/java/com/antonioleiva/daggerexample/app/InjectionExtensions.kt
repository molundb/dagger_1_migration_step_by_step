package com.antonioleiva.daggerexample.app

import android.content.Context

//inline val Context.objectGraph get() = (applicationContext as App).objectGraph
inline val Context.objectGraph get() = (applicationContext as App).objectGraph

inline fun <reified T> Context.getFromDagger1(): T = objectGraph.get(T::class.java)