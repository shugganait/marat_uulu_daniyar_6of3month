package com.kg.marat_uulu_daniyar_6of3month

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kg.marat_uulu_daniyar_6of3month.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container_fragment_one, HeaderFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_fragment_two, MusicFragment()).commit()
    }

}