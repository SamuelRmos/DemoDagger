package com.example.demodagger.di

import com.example.demodagger.ui.MainActivity
import dagger.Component
import javax.inject.Qualifier

@Component(modules = [MagicModule::class])
interface MagicBoxComponent {
    fun inject(app: MainActivity)
}

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Choose(val value: String = "")