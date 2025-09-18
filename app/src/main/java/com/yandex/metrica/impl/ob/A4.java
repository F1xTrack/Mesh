package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class A4 implements E4 {
    private final C3042r4 a;
    private final Dd b;

    public A4(Context context, C3042r4 c3042r4) {
        this(context, c3042r4, new Dd(C2703dd.a(context), C2643b3.a(context), P0.i().u()));
    }

    @Override // com.yandex.metrica.impl.ob.E4
    public void a(C2864k0 c2864k0, X3 x3) {
        b(c2864k0, x3);
    }

    public C3042r4 b() {
        return this.a;
    }

    public abstract void b(C2864k0 c2864k0, X3 x3);

    public Dd c() {
        return this.b;
    }

    @Override // com.yandex.metrica.impl.ob.E4
    public void a() {
        this.a.b(this);
        this.b.b(this);
    }

    public A4(Context context, C3042r4 c3042r4, Dd dd) {
        context.getApplicationContext();
        this.a = c3042r4;
        this.b = dd;
        c3042r4.a(this);
        dd.a(this);
    }
}
