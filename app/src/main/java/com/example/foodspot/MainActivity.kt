package com.example.foodspot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.foodspot.adapter.CategoryAdapter
import com.example.foodspot.data.Datasource
import com.example.foodspot.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val datasource = Datasource()
        val categoryList = datasource.getFood()

        binding.categoryRecycler.adapter = CategoryAdapter(categoryList)
    }
}