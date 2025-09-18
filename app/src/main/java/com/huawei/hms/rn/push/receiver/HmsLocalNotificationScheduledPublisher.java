package com.huawei.hms.rn.push.receiver;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.rn.push.local.HmsLocalNotificationController;
import com.huawei.hms.rn.push.utils.NotificationConfigUtils;

/* loaded from: classes.dex */
public class HmsLocalNotificationScheduledPublisher extends BroadcastReceiver {
    private void handleLocalNotification(Context context, Bundle bundle) {
        NotificationConfigUtils.configId(bundle);
        new HmsLocalNotificationController((Application) context.getApplicationContext()).localNotificationNow(bundle, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        handleLocalNotification(context, intent.getExtras());
    }
}
