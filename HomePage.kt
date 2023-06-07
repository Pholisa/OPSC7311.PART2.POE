package com.example.opsc7311part2gr10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

 class HomePage : AppCompatActivity() {


     private lateinit var drawerToggle: ActionBarDrawerToggle


     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)


         val buttonViewEntries = findViewById<Button>(R.id.btnViewEntries)
         val buttonAddCategory = findViewById<Button>(R.id.btnAddCategory)
         val buttonHourGoal = findViewById<Button>(R.id.btnMinandMax)
         val buttonTimesheetEntry = findViewById<Button>(R.id.btnTimesheet)
         val buttonDate = findViewById<Button>(R.id.btnSetDate)
         val buttonTimes = findViewById<Button>(R.id.btnTime)
         val buttonLogOut = findViewById<Button>(R.id.btnLogOut)




         buttonViewEntries.setOnClickListener{
             val Intent = Intent(this, TimesheetEntryList::class.java)
             startActivity(Intent)
         }

         buttonAddCategory.setOnClickListener{
             val Intent = Intent(this, Category::class.java)
             startActivity(Intent)
         }

         buttonHourGoal.setOnClickListener{
             val Intent = Intent(this, SeekBar::class.java)
             startActivity(Intent)
         }

         buttonTimesheetEntry.setOnClickListener{
             val Intent = Intent(this, Timesheet::class.java)
             startActivity(Intent)
         }

         buttonDate.setOnClickListener{
             val Intent = Intent(this, TheUserCalendarDate::class.java)
             startActivity(Intent)
         }

         buttonTimes.setOnClickListener{
             val Intent = Intent(this, StartAndEndTime::class.java)
             startActivity(Intent)
         }

         buttonLogOut.setOnClickListener{
             val Intent = Intent(this, MainActivity::class.java)
             startActivity(Intent)
         }





         }



     }
