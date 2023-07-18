package com.example.surveyproject

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.example.surveyproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navi.setOnItemSelectedListener{
            when (it.itemId) {
                R.id.home -> {
                    loadFragment(FirstFragment())
                }
                R.id.about -> {
                    loadFragment(SecondFragment())
                }
                R.id.gallery -> {
                    loadFragment(ThirdFragment())
                }
                R.id.contact -> {
                    loadFragment(ThirdFragment())
                }
            }
            true
        }

       loadFragment(FirstFragment())


    }
    fun loadFragment(fragment:Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

}