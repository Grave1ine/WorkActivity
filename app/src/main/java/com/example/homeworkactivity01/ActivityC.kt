package com.example.homeworkactivity01

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    @SuppressLint("WrongViewCast")
    override fun onStart() {
        super.onStart()

        val buttonOpenActA = findViewById<Button>(R.id.goToButtonA)
        buttonOpenActA.setOnClickListener{
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        val buttonOpenActD = findViewById<Button>(R.id.goToButtonD)       //обращение и загрузка контента кнопки?
        buttonOpenActD.setOnClickListener{
            val intent = Intent(this, ActivityD::class.java) //намеренье перейти из this(ActivityC) в ActivityC
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)                //вытащит активити D ан вершиун стека
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)              //закроет все что ниже
            startActivity(intent)                                         //само действие перехода
        }

        val closeActC = findViewById<Button>(R.id.buttonCloseActivityC)
        closeActC.setOnClickListener{
            finish()                                                     //закрыть акт С
        }

        val closeStack = findViewById<Button>(R.id.buttonCloseStack)
        closeStack.setOnClickListener{
            finishAffinity()                                             //закрыть весь таск
        }

    }





}