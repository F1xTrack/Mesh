package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import p000.C8834bI0;
import p000.C9095dI0;

/* loaded from: classes.dex */
public class RNPushNotificationBootEventReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("rn_push_notification", 0);
        Set<String> setKeySet = sharedPreferences.getAll().keySet();
        C9095dI0 c9095dI0 = new C9095dI0((Application) context.getApplicationContext());
        Iterator<String> it = setKeySet.iterator();
        while (it.hasNext()) {
            try {
                String string = sharedPreferences.getString(it.next(), null);
                if (string != null) {
                    C8834bI0 c8834bI0 = new C8834bI0(new JSONObject(string));
                    if (c8834bI0.f16947c < System.currentTimeMillis()) {
                        c9095dI0.m17527h(c8834bI0.m10443a());
                    } else {
                        c9095dI0.m17526g(c8834bI0.m10443a());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
