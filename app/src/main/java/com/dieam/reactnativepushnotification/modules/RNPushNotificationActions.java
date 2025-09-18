package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import p000.C7621Fx1;
import p000.JQ0;
import p000.RunnableC1420WZ;

/* loaded from: classes.dex */
public class RNPushNotificationActions extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws NumberFormatException {
        String str = context.getPackageName() + ".ACTION_";
        if (intent.getAction() == null || !intent.getAction().startsWith(str)) {
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("notification");
        Bundle bundleM4316b = JQ0.m4316b(intent);
        if (bundleM4316b != null) {
            bundleExtra.putCharSequence("reply_text", bundleM4316b.getCharSequence(RNPushNotification.KEY_TEXT_REPLY));
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        int i = Integer.parseInt(bundleExtra.getString(NotificationConstants.f19487ID));
        if (bundleExtra.getBoolean("autoCancel", true)) {
            if (bundleExtra.containsKey("tag")) {
                notificationManager.cancel(bundleExtra.getString("tag"), i);
            } else {
                notificationManager.cancel(i);
            }
        }
        if (!bundleExtra.getBoolean(NotificationConstants.INVOKE_APP, true)) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1420WZ(context, 11, bundleExtra));
            return;
        }
        Application application = (Application) context.getApplicationContext();
        new C7621Fx1(application);
        application.getSharedPreferences("rn_push_notification", 0);
        try {
            Intent intent2 = new Intent(application, Class.forName(application.getPackageManager().getLaunchIntentForPackage(application.getPackageName()).getComponent().getClassName()));
            intent2.putExtra("notification", bundleExtra);
            intent2.addFlags(268435456);
            application.startActivity(intent2);
        } catch (Exception unused) {
        }
        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }
}
