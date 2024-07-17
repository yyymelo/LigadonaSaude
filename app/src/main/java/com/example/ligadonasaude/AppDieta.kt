package com.example.ligadonasaude

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ligadonasaude.databinding.ActivityAppDietaBinding

class AppDieta : AppCompatActivity() {

    private lateinit var binding: ActivityAppDietaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppDietaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editDietaBotao.setOnClickListener {
            val peso = binding.editDietaPeso.text.toString().toDouble()

            var carbo_buk = 6.0
            var proteina_buk = 2.1


            val somac = carbo_buk * peso
            val somap = proteina_buk * peso

            binding.editDietaResultado1.setText("Carbo:$somac")
            binding.editDietaResultado2.setText("Proteina:$somap")
            binding.editDietaResultado3.setText("Gordura Boa:$peso")


            var carbo_cut = 3.0
            var proteina_cut = 2.1

            val somacut = carbo_cut * peso
            val somacutt = proteina_buk * peso

            binding.editDietaResultado4.setText("Carbo: $somacut")
            binding.editDietaResultado5.setText("Proteina: $somacutt")
            binding.editDietaResultado6.setText("Gordura Boa: $peso")

        }

    }
}
