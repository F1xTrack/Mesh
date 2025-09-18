package com.huawei.hms.p015rn.push.receiver;

import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.huawei.hms.p015rn.push.local.HmsLocalNotificationController;
import com.huawei.hms.p015rn.push.utils.BundleUtils;

/* loaded from: classes.dex */
public class HmsLocalNotificationActionsReceiver extends BroadcastReceiver {
    private final String TAG = "HmsLocalNotificationActionsReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws NumberFormatException, ClassNotFoundException {
        Bundle bundleExtra;
        NotificationManager notificationManager;
        String str = context.getPackageName() + ".ACTION_";
        if (intent.getAction() == null || !intent.getAction().startsWith(str)) {
            return;
        }
        try {
            bundleExtra = intent.getBundleExtra("notification");
        } catch (Exception unused) {
            bundleExtra = null;
        }
        if (bundleExtra == null || (notificationManager = (NotificationManager) context.getSystemService("notification")) == null) {
            return;
        }
        int i = Integer.parseInt(BundleUtils.get(bundleExtra, NotificationConstants.f19487ID));
        if (BundleUtils.getB(bundleExtra, "autoCancel", true)) {
            if (BundleUtils.contains(bundleExtra, "tag")) {
                notificationManager.cancel(BundleUtils.get(bundleExtra, "tag"), i);
            } else {
                notificationManager.cancel(i);
            }
        }
        if (BundleUtils.getB(bundleExtra, NotificationConstants.INVOKE_APP, true)) {
            new HmsLocalNotificationController((Application) context.getApplicationContext()).invokeApp(bundleExtra);
        } else {
            new Handler(Looper.getMainLooper()).post(new NotificationActionHandler(context, bundleExtra));
        }
    }
}
