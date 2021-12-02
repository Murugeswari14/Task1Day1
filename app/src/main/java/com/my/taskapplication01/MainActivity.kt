package com.my.taskapplication01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showColorDisplayView=findViewById<TextView>(R.id.notyetclicked)
        val clickMeButton1=findViewById<TextView>(R.id.button1)
        val clickMeButton2=findViewById<TextView>(R.id.button2)
        val clickMeButton3=findViewById<TextView>(R.id.button3)

        clickMeButton1.setOnClickListener{


            showColorDisplayView.text="Red was clicked"
        }
        clickMeButton2.setOnClickListener{


            showColorDisplayView.text="Green was clicked"
        }

        clickMeButton3.setOnClickListener{


            showColorDisplayView.text="Blue was clicked"
        }

    }
}