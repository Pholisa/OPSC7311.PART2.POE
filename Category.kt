package com.example.opsc7311part2gr10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Category : AppCompatActivity() {

    private val arrayList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val categoryAdd = findViewById<EditText>(R.id.etCategory)
        val button = findViewById<Button>(R.id.btnAdd)
        val buttonHomeEntry = findViewById<Button>(R.id.btnHomeCategory)


        button.setOnClickListener {
            val categories = categoryAdd.text.toString()
            if (categories.isNotEmpty()) {
                arrayList.add(categories)
                categoryAdd.text.clear()



            }
        }
        buttonHomeEntry.setOnClickListener {
            val Intent = Intent(this, HomePage::class.java)
            startActivity(Intent)
        }
    }
}