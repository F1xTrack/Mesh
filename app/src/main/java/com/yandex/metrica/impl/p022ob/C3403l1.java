package com.yandex.metrica.impl.p022ob;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.l1 */
/* loaded from: classes2.dex */
class C3403l1 {

    /* renamed from: a */
    private final Handler f24151a;

    /* renamed from: b */
    private final AbstractC2691J f24152b;

    /* renamed from: c */
    private final RunnableC3429m1 f24153c;

    public C3403l1(Handler handler, AbstractC2691J abstractC2691J) {
        this.f24151a = handler;
        this.f24152b = abstractC2691J;
        this.f24153c = new RunnableC3429m1(handler, abstractC2691J);
    }

    /* renamed from: a */
    public void m16343a() {
        this.f24151a.removeCallbacks(this.f24153c, this.f24152b.f21461b.m15168b().m13768a());
    }

    /* renamed from: b */
    public void m16344b() {
        m16342a(this.f24151a, this.f24152b, this.f24153c);
    }

    /* renamed from: a */
    public static void m16342a(Handler handler, AbstractC2691J abstractC2691J, Runnable runnable) {
        handler.removeCallbacks(runnable, abstractC2691J.f21461b.m15168b().m13768a());
        String strM13768a = abstractC2691J.f21461b.m15168b().m13768a();
        long jUptimeMillis = SystemClock.uptimeMillis();
        Integer asInteger = abstractC2691J.f21461b.m15168b().f20731a.getAsInteger("CFG_SESSION_TIMEOUT");
        if (asInteger == null) {
            asInteger = 10;
        }
        handler.postAtTime(runnable, strM13768a, jUptimeMillis + (asInteger.intValue() * 500));
    }
}
