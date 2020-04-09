package com.example.demodagger.di

import com.example.demodagger.ui.MainActivity
import dagger.Component

@Component(modules = [MagicModule::class])
interface MagicBoxComponent {
    fun inject(app: MainActivity)
}