package com.example.yarenproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.yarenproje.databinding.ActivityMainBinding
import com.example.yarenproje.databinding.ActivityModellerBinding

class MainActivity : AppCompatActivity() {

    lateinit var modellerBtn : Button // buton tanımla
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        modellerBtn = findViewById(R.id.butonModeller) // butonu ata
        modellerBtn.setOnClickListener{ // butona tıklanınca yapılacak olay
            val Intent = Intent(this, modeller::class.java) // bu sayfadan modeller sayfasına geçiş
            startActivity(Intent) // çalıştır
        }
    }
}

