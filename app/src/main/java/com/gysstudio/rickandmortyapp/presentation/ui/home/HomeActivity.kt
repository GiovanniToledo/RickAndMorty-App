package com.gysstudio.rickandmortyapp.presentation.ui.home

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import com.gysstudio.rickandmortyapp.databinding.HomeActivityBinding
import java.lang.reflect.Modifier

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: HomeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContent() {
            GetBaseScaffold()
        }
    }

    @Composable
    fun GetBaseScaffold() {
        Scaffold() {
            Column() {
                Text(text = "Home activity!")
                Text(text = "Home activity2!")

            }
        }
    }

}