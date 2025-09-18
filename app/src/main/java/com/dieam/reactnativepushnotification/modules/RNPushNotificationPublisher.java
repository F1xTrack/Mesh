package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.p015rn.push.constants.Core;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.security.SecureRandom;
import java.util.Objects;
import p000.C9095dI0;

/* loaded from: classes.dex */
public class RNPushNotificationPublisher extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getIntExtra(Core.ScheduledPublisher.NOTIFICATION_ID, 0);
        System.currentTimeMillis();
        Bundle extras = intent.getExtras();
        Objects.toString(extras);
        if (extras.getString(NotificationConstants.f19487ID) == null) {
            extras.putString(NotificationConstants.f19487ID, String.valueOf(new SecureRandom().nextInt()));
        }
        C9095dI0 c9095dI0 = new C9095dI0((Application) context.getApplicationContext());
        extras.toString();
        c9095dI0.m17527h(extras);
    }
}
