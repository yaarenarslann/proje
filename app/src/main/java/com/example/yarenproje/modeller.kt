package com.example.yarenproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yarenproje.databinding.ActivityMainBinding
import com.example.yarenproje.databinding.ActivityModellerBinding

class modeller : AppCompatActivity() {

    lateinit var binding: ActivityModellerBinding
    lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityModellerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val orgu1 = Landmark("Hasır Örgü Modeli", R.drawable.hasirorgu)
        val orgu2 = Landmark("Samanyolu Örgü Modeli", R.drawable.samanyoluorgu)
        val orgu3 = Landmark("Burçaklı Örgü Modeli", R.drawable.burcakliorgu)
        val orgu4 = Landmark("Bebek Battaniyesi Örgü Modeli", R.drawable.bebeorgu)

        landmarkList.add(orgu1)
        landmarkList.add(orgu2)
        landmarkList.add(orgu3)
        landmarkList.add(orgu4)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
    }
}