package com.example.coolresume

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.Work)
        workHistory.setOnClickListener {
            println("Click is happening!!!")
            var movetoWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(movetoWorkHistory)
        }
        var achievements = findViewById<Button>(R.id.Achievements)
        achievements.setOnClickListener {
            var movetoachievements = Intent(getApplicationContext(), AchievementsActivity::class.java)
            startActivity(movetoachievements)
        }

        var calldetails = findViewById<Button>(R.id.Call)
        calldetails.setOnClickListener {
            var phoneUri = Uri.parse("tel:8892726680")
            var callIntent = Intent(Intent.ACTION_DIAL,phoneUri)
            startActivity(callIntent)
        }
        var emaildetails = findViewById<Button>(R.id.Mail)
        emaildetails.setOnClickListener {
            var emailintent = Intent(Intent.ACTION_SEND)
            emailintent.setType("plain/text")
            emailintent.putExtra(Intent.EXTRA_EMAIL,"sibardas@in.ibm.com")
            emailintent.putExtra(Intent.EXTRA_CC,"gsiwac11@in.ibm.com")
            emailintent.putExtra(Intent.EXTRA_CC,"peeyushgupta@in.ibm.com")
            emailintent.putExtra(Intent.EXTRA_SUBJECT,"This is a Resume Application")
            emailintent.putExtra(Intent.EXTRA_TEXT,"You are HIRED!!!!")
            startActivity(emailintent)
        }
    }
}