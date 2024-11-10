package com.sandy.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sandy.viewdata.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding

    // Deklarasi data
    var dataBuah = arrayOf("Alpukat", "Durian", "Jambu Air", "Manggis", "Strawberry")
    var dataGambar = arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawberry
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Custom adapter
        val adapter = BuahAdapter(this, dataBuah, dataGambar)

        // Buat layout manager
        val layoutManager = LinearLayoutManager(applicationContext)

        // Set adapter dan layout manager ke RecyclerView
        binding.recylerView.adapter = adapter
        binding.recylerView.layoutManager = layoutManager
    }
}
