package com.example.opsc7311part2gr10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class TimesheetEntryList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timesheet_entry_list)

        val myListData = mutableListOf<MyData>()

        myListData.add(MyData(R.drawable.bookslogo, "Reading", "13 May 2023", "13:00", "14:30", "Born A Crime"))
        myListData.add(MyData(R.drawable.weights, "Gym", "24 May 2023", "08:00", "10:00", "Virgin Active"))

        val myListView = findViewById<ListView>(R.id.lvMyListView)
        myListView.adapter = MyCustomAdapter(this,myListData)

    }
}