package com.example.demodagger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demodagger.databinding.ActivityMainBinding
import com.example.demodagger.di.Choose
import com.example.demodagger.di.DaggerMagicBoxComponent
import com.example.demodagger.model.Info
import javax.inject.Inject

const val LOVE = "Love"
const val HELLO = "Hello"
class MainActivity : AppCompatActivity() {

    @Inject
    @field:Choose(LOVE) lateinit var infoLove: Info

    @Inject
    @field:Choose(HELLO) lateinit var infoHello: Info

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        DaggerMagicBoxComponent.create().inject(this)
        binding.tvPrinciple.text = "${infoLove.text} ${infoHello.text}"
        setContentView(binding.root)
    }
}
