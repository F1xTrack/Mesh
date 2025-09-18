package com.yandex.metrica.impl.p022ob;

import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.P1 */
/* loaded from: classes2.dex */
class C2843P1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    private static final AtomicBoolean f21918f = new AtomicBoolean();

    /* renamed from: a */
    private final List<InterfaceC3331i7> f21919a;

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f21920b;

    /* renamed from: c */
    private final C2570E3 f21921c;

    /* renamed from: d */
    private final InterfaceC2664Hm f21922d;

    /* renamed from: e */
    private final C2520C3 f21923e;

    public C2843P1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, List<InterfaceC3331i7> list, InterfaceC2664Hm interfaceC2664Hm, C2520C3 c2520c3, C2570E3 c2570e3) {
        this.f21919a = list;
        this.f21920b = uncaughtExceptionHandler;
        this.f21922d = interfaceC2664Hm;
        this.f21923e = c2520c3;
        this.f21921c = c2570e3;
    }

    /* renamed from: a */
    public static boolean m14756a() {
        return f21918f.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            f21918f.set(true);
            C3227e7 c3227e7 = new C3227e7(this.f21923e.mo13948a(thread), this.f21921c.m14030a(thread), ((C2564Dm) this.f21922d).m14015b());
            Iterator<InterfaceC3331i7> it = this.f21919a.iterator();
            while (it.hasNext()) {
                it.next().mo15983a(th, c3227e7);
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f21920b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
