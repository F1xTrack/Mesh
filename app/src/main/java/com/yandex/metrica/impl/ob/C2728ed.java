package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.ed, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2728ed {
    private final C3061rn a = P0.i().s().c();
    private final B8 b;
    private final A8 c;
    private final C2903le d;
    private final C2754fe e;

    public C2728ed(Context context) {
        this.b = Qa.a(context).f();
        this.c = Qa.a(context).e();
        C2903le c2903le = new C2903le();
        this.d = c2903le;
        this.e = new C2754fe(c2903le.a());
    }

    public C3061rn a() {
        return this.a;
    }

    public A8 b() {
        return this.c;
    }

    public B8 c() {
        return this.b;
    }

    public C2754fe d() {
        return this.e;
    }

    public C2903le e() {
        return this.d;
    }
}
