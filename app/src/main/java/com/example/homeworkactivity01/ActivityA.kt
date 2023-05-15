package com.example.homeworkactivity01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class ActivityA : AppCompatActivity() {
    //запускает методы экрана, подгружает верстку. в момент работы экран пользователю не виден
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)                //обращение и загрузка контента страницы?
    }

    //экран отрисован, пользоваться еще нельзя(не кликабельный)
    override fun onStart() {
        super.onStart()

        val buttonA = findViewById<Button>(R.id.buttonA)    //обращение и загрузка контента кнопки?
        buttonA.setOnClickListener{
            val intent = Intent(this, ActivityB::class.java) //намеренье перейти из this(ActivityA) в ActivityB
            startActivity(intent)                                         //само действие перехода
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("sdgsdfg","sdfsdgsgd")        //не работате
    }


}