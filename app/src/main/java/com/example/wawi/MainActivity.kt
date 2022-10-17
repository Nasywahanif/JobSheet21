package com.example.wawi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

        val list = ArrayList<Makanan>()
        val listMakanan = arrayOf(
            "Maulana Zahrony",
            "Maya Indah Lestari",
            "Muhammad Khusnu Marom",
            "Muhammad Huda Gunawan",
            "Mutmainah Septiarini",
            "Nasywa Sukria Hanifa",
            "Nor Hidayah Fitriyani",
            "Novita Sari",
            "Nur Izza",
            "Riska Anggun Anggriani",
            "Sahrul Lukman Hakim"
        )
        lateinit var makananView: RecyclerView
        lateinit var makananAdapter: MakananAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            makananView = findViewById(R.id.makananView)
            makananView.layoutManager = LinearLayoutManager(this)

            for (i in listMakanan.indices){
                list.add(Makanan(listMakanan[i]))
            }

            makananAdapter = MakananAdapter(list)
            makananAdapter.notifyDataSetChanged()
            makananView.adapter = makananAdapter
        }
    }
