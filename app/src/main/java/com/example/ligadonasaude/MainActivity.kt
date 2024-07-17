package com.example.ligadonasaude

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ligadonasaude.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.basal.setOnClickListener {
            val i = Intent(this,AppBasal::class.java)
            startActivity(i)
        }
        binding.imc.setOnClickListener {
            val b = Intent(this,AppImc::class.java)
            startActivity(b)
        }
        binding.dieta.setOnClickListener {
            val d = Intent(this,AppDieta::class.java)
            startActivity(d)
        }

    }
}
