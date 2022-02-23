package com.gysstudio.rickandmortyapp.presentation

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.gysstudio.rickandmortyapp.R
import com.gysstudio.rickandmortyapp.databinding.HomeActivityBinding


open class BaseActivity : AppCompatActivity() {
    private lateinit var binding: HomeActivityBinding

    fun setupNavigation() {
        binding = HomeActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navController =
            (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment?)!!.navController
        NavigationUI.setupWithNavController(binding.toolbar, navController, binding.drawerLayout)
        NavigationUI.setupWithNavController(binding.bottomNavView, navController)

        findViewById<NavigationView>(R.id.nav_view)
            .setupWithNavController(navController)
        findViewById<BottomNavigationView>(R.id.bottom_nav_view)
            .setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return binding.navHostFragment.findNavController().navigateUp()
                || super.onSupportNavigateUp()
    }
}