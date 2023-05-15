package com.example.homeworkactivity01

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }


    @SuppressLint("WrongViewCast")
    override fun onStart() {
        super.onStart()

        val buttonB = findViewById<Button>(R.id.buttonB)    //обращение и загрузка контента кнопки?
        buttonB.setOnClickListener{
            val intent = Intent(this, ActivityC::class.java) //намеренье перейти из this(ActivityC) в ActivityC
            startActivity(intent)                                         //само действие перехода
        }
    }

}

