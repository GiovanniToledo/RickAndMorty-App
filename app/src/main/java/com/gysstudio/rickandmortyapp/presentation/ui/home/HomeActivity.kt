package com.gysstudio.rickandmortyapp.presentation.ui.home

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.gysstudio.rickandmortyapp.core.RetrofitHelper
import com.gysstudio.rickandmortyapp.data.RickAndMortyAPIs
import com.gysstudio.rickandmortyapp.data.source.remote.CharacterRepositoryImpl
import com.gysstudio.rickandmortyapp.presentation.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupNavigation()
        lifecycleScope.launch {
            CharacterRepositoryImpl(RetrofitHelper.getRetrofit().create(RickAndMortyAPIs::class.java)).getAllCharacters()
        }
    }


}