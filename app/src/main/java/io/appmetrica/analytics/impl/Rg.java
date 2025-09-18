package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import defpackage.C1518Tf1;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public abstract class Rg implements Callable {
    public static final Qg d = new Qg();
    public final C4562g0 a;
    public final InterfaceC4459bk b;
    public boolean c;

    public Rg(C4562g0 c4562g0, InterfaceC4459bk interfaceC4459bk) {
        this.a = c4562g0;
        this.b = interfaceC4459bk;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C4562g0 b() {
        return this.a;
    }

    public boolean c() throws InterruptedException {
        C4562g0 c4562g0 = this.a;
        synchronized (c4562g0) {
            try {
                if (c4562g0.d == null) {
                    c4562g0.e = new CountDownLatch(1);
                    Intent intentA = Cj.a(c4562g0.a);
                    try {
                        c4562g0.g.b(c4562g0.a);
                        c4562g0.a.bindService(intentA, c4562g0.i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return C1518Tf1.a;
    }

    public final boolean d() {
        return this.c;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            int i = 0;
            do {
                C4562g0 c4562g0 = this.a;
                synchronized (c4562g0) {
                    iAppMetricaService = c4562g0.d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC4459bk interfaceC4459bk = this.b;
                        if (interfaceC4459bk != null && !((Ah) interfaceC4459bk).a()) {
                            return;
                        }
                        this.a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!c() || P1.e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
