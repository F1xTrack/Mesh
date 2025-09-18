package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.Fj */
/* loaded from: classes2.dex */
public final class C4500Fj implements ServiceWakeLock {

    /* renamed from: a */
    public final Context f30149a;

    /* renamed from: b */
    public final C4476Ej f30150b;

    /* renamed from: c */
    public final HashMap f30151c = new HashMap();

    public C4500Fj(Context context, C4476Ej c4476Ej) {
        this.f30149a = context;
        this.f30150b = c4476Ej;
    }

    /* renamed from: a */
    public final String m19420a(String str) {
        return AbstractC7222ym.m26245v("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.f30151c.get(str) == null) {
                HashMap map = this.f30151c;
                C4476Ej c4476Ej = this.f30150b;
                Context context = this.f30149a;
                String strM19420a = m19420a(str);
                c4476Ej.f30104a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(strM19420a);
                ServiceConnectionC4451Dj serviceConnectionC4451Dj = new ServiceConnectionC4451Dj();
                try {
                    context.bindService(intent, serviceConnectionC4451Dj, 1);
                } catch (Throwable unused) {
                    serviceConnectionC4451Dj = null;
                }
                map.put(str, serviceConnectionC4451Dj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f30151c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f30151c.get(str);
        if (serviceConnection != null) {
            C4476Ej c4476Ej = this.f30150b;
            m19420a(str);
            Context context = this.f30149a;
            c4476Ej.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
