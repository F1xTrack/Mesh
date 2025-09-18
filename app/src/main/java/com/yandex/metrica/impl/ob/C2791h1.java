package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2791h1 {
    private final Om a;
    private final R2 b;
    private final I9 c;
    private long d;
    private C3261zi e;
    private final W0 f;

    public C2791h1(I9 i9, C3261zi c3261zi, Om om, R2 r2, W0 w0) {
        this.c = i9;
        this.e = c3261zi;
        this.d = i9.d(0L);
        this.a = om;
        this.b = r2;
        this.f = w0;
    }

    public void a() {
        C3261zi c3261zi = this.e;
        if (c3261zi == null || !this.b.b(this.d, c3261zi.a, "should send EVENT_IDENTITY_LIGHT")) {
            return;
        }
        this.f.b();
        long jB = this.a.b();
        this.d = jB;
        this.c.i(jB);
    }

    public void a(C3261zi c3261zi) {
        this.e = c3261zi;
    }
}
