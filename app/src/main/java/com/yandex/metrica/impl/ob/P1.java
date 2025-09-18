package com.yandex.metrica.impl.ob;

import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
class P1 implements Thread.UncaughtExceptionHandler {
    private static final AtomicBoolean f = new AtomicBoolean();
    private final List<InterfaceC2822i7> a;
    private final Thread.UncaughtExceptionHandler b;
    private final E3 c;
    private final Hm d;
    private final C3 e;

    public P1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, List<InterfaceC2822i7> list, Hm hm, C3 c3, E3 e3) {
        this.a = list;
        this.b = uncaughtExceptionHandler;
        this.d = hm;
        this.e = c3;
        this.c = e3;
    }

    public static boolean a() {
        return f.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            f.set(true);
            C2722e7 c2722e7 = new C2722e7(this.e.a(thread), this.c.a(thread), ((Dm) this.d).b());
            Iterator<InterfaceC2822i7> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(th, c2722e7);
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
