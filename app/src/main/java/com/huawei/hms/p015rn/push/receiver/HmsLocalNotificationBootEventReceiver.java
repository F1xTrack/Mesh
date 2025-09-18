package com.huawei.hms.p015rn.push.receiver;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.huawei.hms.p015rn.push.config.NotificationAttributes;
import com.huawei.hms.p015rn.push.constants.Core;
import com.huawei.hms.p015rn.push.local.HmsLocalNotificationController;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class HmsLocalNotificationBootEventReceiver extends BroadcastReceiver {
    private final String TAG = "HmsLocalNotificationBootEventReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals(Core.ScheduledPublisher.BOOT_EVENT)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Core.PREFERENCE_NAME, 0);
            Set<String> setKeySet = sharedPreferences.getAll().keySet();
            HmsLocalNotificationController hmsLocalNotificationController = new HmsLocalNotificationController((Application) context.getApplicationContext());
            Iterator<String> it = setKeySet.iterator();
            while (it.hasNext()) {
                try {
                    String string = sharedPreferences.getString(it.next(), null);
                    if (string != null) {
                        NotificationAttributes notificationAttributesFromJson = NotificationAttributes.fromJson(string);
                        if (notificationAttributesFromJson.getFireDate() < System.currentTimeMillis()) {
                            hmsLocalNotificationController.localNotificationNow(notificationAttributesFromJson.toBundle(), null);
                        } else {
                            hmsLocalNotificationController.localNotificationScheduleSetAlarm(notificationAttributesFromJson.toBundle());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
