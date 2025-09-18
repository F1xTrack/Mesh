package com.yandex.metrica.impl.ob;

import defpackage.NX;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.yandex.metrica.impl.ob.wn */
/* loaded from: classes2.dex */
public class ThreadFactoryC3191wn implements ThreadFactory {
    private static final AtomicInteger b = new AtomicInteger(0);
    private final String a;

    public ThreadFactoryC3191wn(String str) {
        this.a = str;
    }

    private String a() {
        StringBuilder sbK = NX.k(this.a, "-");
        sbK.append(b.incrementAndGet());
        return sbK.toString();
    }

    public static int c() {
        return b.incrementAndGet();
    }

    public HandlerThreadC3136un b() {
        return new HandlerThreadC3136un(a());
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new C3166vn(runnable, a());
    }

    public static C3166vn a(String str, Runnable runnable) {
        return new C3166vn(runnable, new ThreadFactoryC3191wn(str).a());
    }

    public static String a(String str) {
        StringBuilder sbK = NX.k(str, "-");
        sbK.append(b.incrementAndGet());
        return sbK.toString();
    }
}
