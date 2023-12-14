package com.example.a2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "mu", "Манчестер Юнайтед", "Исторический клуб АПЛ"))
        items.add(Item(2, "bay", "Бавария", "Лучший клуб Бундеслиги"))
        items.add(Item(3,"rm","Реал Мадрид","Один из сильнейших клубов в мире",))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}