package com.example.ligadonasaude

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.ligadonasaude.databinding.ActivityAppImcBinding

class AppImc : AppCompatActivity() {

    private lateinit var binding: ActivityAppImcBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppImcBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imcBotao.setOnClickListener {
            var imcaltura = binding.imcAltura.text.trim().toString().toDouble()
            var imcpeso = binding.imcPeso.text.trim().toString().toDouble()

            var resul1 = (imcpeso / (imcaltura * imcaltura))

            binding.imcResultado.text = resul1.toString()
        }




    }
}