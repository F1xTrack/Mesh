package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.C5122f;
import io.sentry.C5185y;
import io.sentry.EnumC5148n1;
import java.nio.charset.Charset;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class g0 extends BroadcastReceiver {
    public final io.sentry.E a;
    public final SentryAndroidOptions b;
    public final io.sentry.android.core.internal.util.d c;

    public g0(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.E e = io.sentry.E.a;
        this.c = new io.sentry.android.core.internal.util.d(60000L, 0);
        this.a = e;
        this.b = sentryAndroidOptions;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        final String action = intent.getAction();
        final boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
        if (zEquals && this.c.a()) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.f0
                @Override // java.lang.Runnable
                public final void run() {
                    String strSubstring;
                    int i;
                    g0 g0Var = this.a;
                    g0Var.getClass();
                    C5122f c5122f = new C5122f(jCurrentTimeMillis);
                    c5122f.d = "system";
                    c5122f.f = "device.event";
                    Charset charset = io.sentry.util.h.a;
                    String str = action;
                    if (str != null) {
                        int iLastIndexOf = str.lastIndexOf(".");
                        strSubstring = (iLastIndexOf < 0 || str.length() <= (i = iLastIndexOf + 1)) ? str : str.substring(i);
                    } else {
                        strSubstring = null;
                    }
                    if (strSubstring != null) {
                        c5122f.b(strSubstring, NotificationConstants.ACTION);
                    }
                    Intent intent2 = intent;
                    boolean z = zEquals;
                    SentryAndroidOptions sentryAndroidOptions2 = g0Var.b;
                    if (z) {
                        Float fB = G.b(intent2, sentryAndroidOptions2);
                        if (fB != null) {
                            c5122f.b(fB, "level");
                        }
                        Boolean boolD = G.d(intent2, sentryAndroidOptions2);
                        if (boolD != null) {
                            c5122f.b(boolD, "charging");
                        }
                    } else {
                        Bundle extras = intent2.getExtras();
                        HashMap map = new HashMap();
                        if (extras != null && !extras.isEmpty()) {
                            for (String str2 : extras.keySet()) {
                                try {
                                    Object obj = extras.get(str2);
                                    if (obj != null) {
                                        map.put(str2, obj.toString());
                                    }
                                } catch (Throwable th) {
                                    sentryAndroidOptions2.getLogger().c(EnumC5148n1.ERROR, th, "%s key of the %s action threw an error.", str2, str);
                                }
                            }
                            c5122f.b(map, "extras");
                        }
                    }
                    c5122f.h = EnumC5148n1.INFO;
                    C5185y c5185y = new C5185y();
                    c5185y.c(intent2, "android:intent");
                    g0Var.a.v(c5122f, c5185y);
                }
            });
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(EnumC5148n1.ERROR, th, "Failed to submit system event breadcrumb action.", new Object[0]);
        }
    }
}
