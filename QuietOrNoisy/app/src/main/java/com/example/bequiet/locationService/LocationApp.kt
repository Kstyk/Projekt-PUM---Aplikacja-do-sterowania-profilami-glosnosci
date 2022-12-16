package com.example.bequiet.locationService

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context

class LocationApp: Application() {
    override fun onCreate() {
        super.onCreate()
        val channel = NotificationChannel(
            "location",
            "location",
            NotificationManager.IMPORTANCE_LOW
        )

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationManager.createNotificationChannel(channel)
    }
}