package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import p000.AbstractC1374Vq;
import p000.InterfaceC6497nZ;

/* renamed from: io.appmetrica.analytics.identifiers.impl.f */
/* loaded from: classes2.dex */
public final class C4340f {

    /* renamed from: a */
    public final ServiceConnectionC4339e f29821a;

    /* renamed from: b */
    public final InterfaceC6497nZ f29822b;

    /* renamed from: c */
    public final String f29823c;

    /* renamed from: d */
    public final SafePackageManager f29824d;

    public C4340f(ServiceConnectionC4339e serviceConnectionC4339e, InterfaceC6497nZ interfaceC6497nZ, String str, SafePackageManager safePackageManager) {
        this.f29821a = serviceConnectionC4339e;
        this.f29822b = interfaceC6497nZ;
        this.f29823c = str;
        this.f29824d = safePackageManager;
    }

    /* renamed from: a */
    public final Object m19173a(Context context) throws C4341g {
        IBinder iBinder;
        ServiceConnectionC4339e serviceConnectionC4339e;
        if (this.f29824d.resolveService(context, this.f29821a.f29818a, 0) == null) {
            throw new C4346l(AbstractC1374Vq.m8593l(new StringBuilder("could not resolve "), this.f29823c, " services"));
        }
        try {
            serviceConnectionC4339e = this.f29821a;
        } catch (Throwable unused) {
        }
        if (context.bindService(serviceConnectionC4339e.f29818a, serviceConnectionC4339e, 1)) {
            ServiceConnectionC4339e serviceConnectionC4339e2 = this.f29821a;
            if (serviceConnectionC4339e2.f29819b == null) {
                synchronized (serviceConnectionC4339e2.f29820c) {
                    if (serviceConnectionC4339e2.f29819b == null) {
                        try {
                            serviceConnectionC4339e2.f29820c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = serviceConnectionC4339e2.f29819b;
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            return this.f29822b.invoke(iBinder);
        }
        throw new C4341g(AbstractC1374Vq.m8593l(new StringBuilder("could not bind to "), this.f29823c, " services"));
    }

    /* renamed from: b */
    public final void m19174b(Context context) {
        try {
            this.f29821a.m19172a(context);
        } catch (Throwable unused) {
        }
    }

    public C4340f(Intent intent, InterfaceC6497nZ interfaceC6497nZ, String str) {
        this(new ServiceConnectionC4339e(intent, str), interfaceC6497nZ, str, new SafePackageManager());
    }
}
