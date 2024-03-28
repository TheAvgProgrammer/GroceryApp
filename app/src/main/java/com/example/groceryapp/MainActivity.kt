package com.example.groceryapp

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )

        var groceryItems:ArrayList<ItemModel> = ArrayList()

        val v1 = ItemModel("Grocery", "Sweet ahh groceries", R.drawable.grocery)
        val v2 = ItemModel("FastFood","You'll get fat but the taste def worth it!!", R.drawable.fastfood)
        val v3 = ItemModel("Bakery", "Crazy pasteries and spicy puffs to balance it out", R.drawable.bakery)
        val v4 = ItemModel("Milk","Gotta get that calcium huh", R.drawable.milk)
        val v5 = ItemModel("Vegetables", "Dude ik you're not gonna eat em but get em for your mom", R.drawable.vegetable)
        val v6 = ItemModel("IceCream", "An icecream to make your hot summer a lil better", R.drawable.icecream)
        val v7 = ItemModel("Supplements", "Get crazy gains king!!", R.drawable.protein)
        val v8 = ItemModel("Beverages", "Knock yourself out w a beer", R.drawable.beer)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)
        groceryItems.add(v6)
        groceryItems.add(v7)
        groceryItems.add(v8)


        val adapter: RecyclerViewAdapter = RecyclerViewAdapter(
            groceryItems
        )
        recyclerView.adapter = adapter
    }
}