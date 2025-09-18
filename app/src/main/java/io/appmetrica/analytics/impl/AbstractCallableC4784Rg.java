package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import p000.C8313Tf1;

/* renamed from: io.appmetrica.analytics.impl.Rg */
/* loaded from: classes2.dex */
public abstract class AbstractCallableC4784Rg implements Callable {

    /* renamed from: d */
    public static final C4761Qg f30698d = new C4761Qg();

    /* renamed from: a */
    public final C5134g0 f30699a;

    /* renamed from: b */
    public final InterfaceC5029bk f30700b;

    /* renamed from: c */
    public boolean f30701c;

    public AbstractCallableC4784Rg(C5134g0 c5134g0, InterfaceC5029bk interfaceC5029bk) {
        this.f30699a = c5134g0;
        this.f30700b = interfaceC5029bk;
    }

    /* renamed from: a */
    public abstract void mo19541a(IAppMetricaService iAppMetricaService);

    /* renamed from: a */
    public void mo19778a(Throwable th) {
    }

    /* renamed from: b */
    public final C5134g0 m19780b() {
        return this.f30699a;
    }

    /* renamed from: c */
    public boolean mo19781c() throws InterruptedException {
        C5134g0 c5134g0 = this.f30699a;
        synchronized (c5134g0) {
            try {
                if (c5134g0.f31709d == null) {
                    c5134g0.f31710e = new CountDownLatch(1);
                    Intent intentM19284a = AbstractC4426Cj.m19284a(c5134g0.f31706a);
                    try {
                        c5134g0.f31712g.m19428b(c5134g0.f31706a);
                        c5134g0.f31706a.bindService(intentM19284a, c5134g0.f31714i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f30699a.m20401a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        mo19777a();
        return C8313Tf1.f11463a;
    }

    /* renamed from: d */
    public final boolean m19782d() {
        return this.f30701c;
    }

    /* renamed from: a */
    public final void m19779a(boolean z) {
        this.f30701c = z;
    }

    /* renamed from: a */
    public void mo19777a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f30701c) {
                return;
            }
            this.f30701c = true;
            int i = 0;
            do {
                C5134g0 c5134g0 = this.f30699a;
                synchronized (c5134g0) {
                    iAppMetricaService = c5134g0.f31709d;
                }
                if (iAppMetricaService != null) {
                    try {
                        mo19541a(iAppMetricaService);
                        InterfaceC5029bk interfaceC5029bk = this.f30700b;
                        if (interfaceC5029bk != null && !((C4374Ah) interfaceC5029bk).m19205a()) {
                            return;
                        }
                        this.f30699a.m20404c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!mo19781c() || C4722P1.f30593e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            mo19778a(th);
        }
    }
}
