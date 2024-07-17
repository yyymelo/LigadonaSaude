package com.example.ligadonasaude

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ligadonasaude.databinding.ActivityAppBasalBinding
import com.example.ligadonasaude.databinding.ActivityMainBinding

class AppBasal : AppCompatActivity() {

    private lateinit var binding: ActivityAppBasalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppBasalBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.botaoHomen.setOnClickListener {
            var altura = binding.editAltura.text.toString().toDouble()
            var peso = binding.editPeso.text.toString().toDouble()
            var idade = binding.editIdade.text.toString().toDouble()

            val result = 66.47 + (13.75 * peso) + (5 * altura) - (6.76 * idade)

            binding.resultt.setText("sua taxa metabolica basal é de $result kcal")
        }

        binding.botaoMulher.setOnClickListener {
            var altura = binding.editAltura.text.toString().toDouble()
            var peso = binding.editPeso.text.toString().toDouble()
            var idade = binding.editIdade.text.toString().toDouble()

            val result = 655.1 + (9.56 * peso) + (1.85 * altura) - (4.68 * idade)

            binding.resultt.setText("sua taxa metabolica basal é de $result kcal")
        }
    }
}
