package com.example.demodagger.di

import com.example.demodagger.model.Info
import dagger.Module
import dagger.Provides

@Module
class MagicModule {
    @Provides
    fun infoText(): Info {
        return Info("Learn Dagger 2")
    }
}