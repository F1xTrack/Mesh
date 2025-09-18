package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g0 */
/* loaded from: classes2.dex */
public final class C5134g0 {

    /* renamed from: j */
    public static final long f31705j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    public final Context f31706a;

    /* renamed from: b */
    public final ICommonExecutor f31707b;

    /* renamed from: e */
    public CountDownLatch f31710e;

    /* renamed from: g */
    public final C4506G1 f31712g;

    /* renamed from: d */
    public IAppMetricaService f31709d = null;

    /* renamed from: f */
    public final Object f31711f = new Object();

    /* renamed from: h */
    public final RunnableC5084e0 f31713h = new RunnableC5084e0(this);

    /* renamed from: i */
    public final ServiceConnectionC5109f0 f31714i = new ServiceConnectionC5109f0(this);

    /* renamed from: c */
    public boolean f31708c = false;

    public C5134g0(Context context, ICommonExecutor iCommonExecutor, C4506G1 c4506g1) {
        this.f31706a = context.getApplicationContext();
        this.f31707b = iCommonExecutor;
        this.f31712g = c4506g1;
    }

    /* renamed from: a */
    public final synchronized boolean m20402a() {
        return this.f31709d != null;
    }

    /* renamed from: b */
    public final void m20403b() {
        synchronized (this.f31711f) {
            this.f31707b.remove(this.f31713h);
        }
    }

    /* renamed from: c */
    public final void m20404c() {
        ICommonExecutor iCommonExecutor = this.f31707b;
        synchronized (this.f31711f) {
            try {
                iCommonExecutor.remove(this.f31713h);
                if (!this.f31708c) {
                    iCommonExecutor.executeDelayed(this.f31713h, f31705j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m20401a(Long l) throws InterruptedException {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f31710e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
