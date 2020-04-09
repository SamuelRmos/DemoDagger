package com.example.demodagger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demodagger.databinding.ActivityMainBinding
import com.example.demodagger.di.DaggerMagicBoxComponent
import com.example.demodagger.model.Info
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var info: Info
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        DaggerMagicBoxComponent.create().inject(this)
        tvPrinciple.text = info.text
    }
}
