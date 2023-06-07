package com.example.opsc7311part2gr10

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.*
import com.google.android.gms.cast.framework.media.ImagePicker
import java.text.SimpleDateFormat
import java.util.*


class Timesheet : AppCompatActivity() {

    var imagePicker :  ImageView ?= null
    private lateinit var button: Button
    private lateinit var imageView: ImageView


    companion object {
        val IMAGE_REQUEST_CODE = 100
      }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timesheet)

//        imagePicker = findViewById(R.id.ivImage)

        val gallery = findViewById<Button>(R.id.btnGallery)
        val camera = findViewById<Button>(R.id.btnCamera)
        val buttonTimesheets = findViewById<Button>(R.id.btnHomeTimsheet)

        buttonTimesheets.setOnClickListener {
            val Intent = Intent(this, HomePage::class.java)
            startActivity(Intent)
        }

        gallery.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, IMAGE_REQUEST_CODE)
        }

        camera.setOnClickListener {
            var intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, 123)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    {
       super.onActivityResult(requestCode, resultCode,data)
        if(requestCode == 123){
            var bmp:Bitmap = data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(bmp)

        }
       else if(requestCode == IMAGE_REQUEST_CODE)
       {
         imageView.setImageURI(data?.data)
    }

    }


    }














