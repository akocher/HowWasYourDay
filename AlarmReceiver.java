package com.example.alex.howwasyourday;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;

        import android.content.Context;
        import android.content.Intent;
        import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context arg0, Intent arg1) {
        Toast.makeText(arg0, "Alarm received!", Toast.LENGTH_LONG).show();
        /*Intent intent = new Intent();
        PendingIntent pIntent = PendingIntent.getActivity(, 0, intent, 0);
        Notification noti = new Notification.Builder()
                .setTicker("Ticker Title")
                .setContentTitle("Content Title")
                .setContentText("Notification content.")
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentIntent(pIntent).getNotification();
        noti.flags=Notification.FLAG_AUTO_CANCEL;
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, noti);*/
    }

}