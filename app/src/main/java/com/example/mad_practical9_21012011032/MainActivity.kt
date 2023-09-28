package com.example.mad_practical9_21012011032

import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageView=findViewById<ImageView>(R.id.imageview)
        imageView.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation=imageView.background as AnimationDrawable

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            alarmanimation.start()
        }
        else{
            alarmanimation.stop()
        }
    }

}