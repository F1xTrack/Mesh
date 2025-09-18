package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import defpackage.AbstractC8235ym;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Fj implements ServiceWakeLock {
    public final Context a;
    public final Ej b;
    public final HashMap c = new HashMap();

    public Fj(Context context, Ej ej) {
        this.a = context;
        this.b = ej;
    }

    public final String a(String str) {
        return AbstractC8235ym.v("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.c.get(str) == null) {
                HashMap map = this.c;
                Ej ej = this.b;
                Context context = this.a;
                String strA = a(str);
                ej.a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(strA);
                Dj dj = new Dj();
                try {
                    context.bindService(intent, dj, 1);
                } catch (Throwable unused) {
                    dj = null;
                }
                map.put(str, dj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.c.get(str);
        if (serviceConnection != null) {
            Ej ej = this.b;
            a(str);
            Context context = this.a;
            ej.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
