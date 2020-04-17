package com.example.demodagger.di

import com.example.demodagger.model.Info
import com.example.demodagger.ui.HELLO
import com.example.demodagger.ui.LOVE
import dagger.Module
import dagger.Provides

@Module
open class MagicModule {

    @Provides @Choose(LOVE)
    fun loveDagger(): Info {
        return Info("Love Dagger 2")
    }

    @Provides @Choose(HELLO)
    fun helloDagger(): Info {
        return Info("Hello Dagger 2")
    }
}