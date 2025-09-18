package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.C5760E;
import io.sentry.C6017f;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.internal.util.C5884d;
import io.sentry.util.AbstractC6175h;
import java.nio.charset.Charset;
import java.util.HashMap;

/* renamed from: io.sentry.android.core.g0 */
/* loaded from: classes2.dex */
public final class C5868g0 extends BroadcastReceiver {

    /* renamed from: a */
    public final C5760E f33696a;

    /* renamed from: b */
    public final SentryAndroidOptions f33697b;

    /* renamed from: c */
    public final C5884d f33698c;

    public C5868g0(SentryAndroidOptions sentryAndroidOptions) {
        C5760E c5760e = C5760E.f33234a;
        this.f33698c = new C5884d(60000L, 0);
        this.f33696a = c5760e;
        this.f33697b = sentryAndroidOptions;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        SentryAndroidOptions sentryAndroidOptions = this.f33697b;
        final String action = intent.getAction();
        final boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
        if (zEquals && this.f33698c.m21583a()) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.f0
                @Override // java.lang.Runnable
                public final void run() {
                    String strSubstring;
                    int i;
                    C5868g0 c5868g0 = this.f33688a;
                    c5868g0.getClass();
                    C6017f c6017f = new C6017f(jCurrentTimeMillis);
                    c6017f.f34146d = "system";
                    c6017f.f34148f = "device.event";
                    Charset charset = AbstractC6175h.f34667a;
                    String str = action;
                    if (str != null) {
                        int iLastIndexOf = str.lastIndexOf(".");
                        strSubstring = (iLastIndexOf < 0 || str.length() <= (i = iLastIndexOf + 1)) ? str : str.substring(i);
                    } else {
                        strSubstring = null;
                    }
                    if (strSubstring != null) {
                        c6017f.m21778b(strSubstring, NotificationConstants.ACTION);
                    }
                    Intent intent2 = intent;
                    boolean z = zEquals;
                    SentryAndroidOptions sentryAndroidOptions2 = c5868g0.f33697b;
                    if (z) {
                        Float fM21525b = C5835G.m21525b(intent2, sentryAndroidOptions2);
                        if (fM21525b != null) {
                            c6017f.m21778b(fM21525b, "level");
                        }
                        Boolean boolM21527d = C5835G.m21527d(intent2, sentryAndroidOptions2);
                        if (boolM21527d != null) {
                            c6017f.m21778b(boolM21527d, "charging");
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
                                    sentryAndroidOptions2.getLogger().mo21405c(EnumC6069n1.ERROR, th, "%s key of the %s action threw an error.", str2, str);
                                }
                            }
                            c6017f.m21778b(map, "extras");
                        }
                    }
                    c6017f.f34150h = EnumC6069n1.INFO;
                    C6193y c6193y = new C6193y();
                    c6193y.m21928c(intent2, "android:intent");
                    c5868g0.f33696a.mo21376v(c6017f, c6193y);
                }
            });
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Failed to submit system event breadcrumb action.", new Object[0]);
        }
    }
}
