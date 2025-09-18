package com.yandex.metrica.impl.p022ob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC0852NX;

/* renamed from: com.yandex.metrica.impl.ob.wn */
/* loaded from: classes2.dex */
public class ThreadFactoryC3711wn implements ThreadFactory {

    /* renamed from: b */
    private static final AtomicInteger f25209b = new AtomicInteger(0);

    /* renamed from: a */
    private final String f25210a;

    public ThreadFactoryC3711wn(String str) {
        this.f25210a = str;
    }

    /* renamed from: a */
    private String m17151a() {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(this.f25210a, "-");
        sbM5762k.append(f25209b.incrementAndGet());
        return sbM5762k.toString();
    }

    /* renamed from: c */
    public static int m17153c() {
        return f25209b.incrementAndGet();
    }

    /* renamed from: b */
    public HandlerThreadC3659un m17154b() {
        return new HandlerThreadC3659un(m17151a());
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new C3685vn(runnable, m17151a());
    }

    /* renamed from: a */
    public static C3685vn m17150a(String str, Runnable runnable) {
        return new C3685vn(runnable, new ThreadFactoryC3711wn(str).m17151a());
    }

    /* renamed from: a */
    public static String m17152a(String str) {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, "-");
        sbM5762k.append(f25209b.incrementAndGet());
        return sbM5762k.toString();
    }
}
