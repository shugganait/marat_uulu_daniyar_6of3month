package com.kg.marat_uulu_daniyar_6of3month

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kg.marat_uulu_daniyar_6of3month.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvName.text = intent.getStringExtra("name").toString()
        binding.tvPlayer.text = intent.getStringExtra("player").toString()
    }
}