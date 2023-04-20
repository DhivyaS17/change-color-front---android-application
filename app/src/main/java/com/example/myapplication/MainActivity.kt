package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView:TextView=findViewById(R.id.usertext)
        var button:Button=findViewById(R.id.button)
        var variableforedit:EditText=findViewById(R.id.editextname)
        button.setOnClickListener {
            Toast.makeText(this,"Here is a toast message from Dhivya",Toast.LENGTH_LONG).show()
            textView.typeface = ResourcesCompat.getFont(this, R.font.night)
            textView.setTextColor(Color.BLUE)
            variableforedit.typeface = ResourcesCompat.getFont(this, R.font.night)
            variableforedit.setTextColor(Color.BLUE)
        }
    }
}