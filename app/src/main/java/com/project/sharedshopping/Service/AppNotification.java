package com.project.sharedshopping.Service;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class AppNotification extends Application {
    public static final String CHANNEL_ID = "ServiceChannel";
    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
    }
    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel serviceChannel = new NotificationChannel(
                    CHANNEL_ID,
                    "Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            serviceChannel.setDescription("Service channel");
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(serviceChannel);
        }
    }
}

