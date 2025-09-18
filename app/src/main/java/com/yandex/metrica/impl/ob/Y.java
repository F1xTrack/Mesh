package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;

/* loaded from: classes2.dex */
public class Y {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Y i;
    private final Dm a;
    private final C3113u0 b;
    private final C3037qn c;
    private final L1 d;
    private final C3217y e;
    private final I2 f;
    private final C2815i0 g;
    private final C3192x h;

    private Y() {
        this(new Dm(), new C3217y(), new C3037qn());
    }

    public static Y g() {
        if (i == null) {
            synchronized (Y.class) {
                try {
                    if (i == null) {
                        i = new Y(new Dm(), new C3217y(), new C3037qn());
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public C3192x a() {
        return this.h;
    }

    public C3217y b() {
        return this.e;
    }

    public InterfaceExecutorC3086sn c() {
        return this.c.a();
    }

    public C3037qn d() {
        return this.c;
    }

    public C2815i0 e() {
        return this.g;
    }

    public C3113u0 f() {
        return this.b;
    }

    public Dm h() {
        return this.a;
    }

    public L1 i() {
        return this.d;
    }

    public Hm j() {
        return this.a;
    }

    public I2 k() {
        return this.f;
    }

    private Y(Dm dm, C3217y c3217y, C3037qn c3037qn) {
        this(dm, c3217y, c3037qn, new C3192x(c3217y, c3037qn.a()));
    }

    private Y(Dm dm, C3217y c3217y, C3037qn c3037qn, C3192x c3192x) {
        this(dm, new C3113u0(), c3037qn, c3192x, new L1(dm), c3217y, new I2(c3217y, c3037qn.a(), c3192x), new C2815i0(c3217y));
    }

    public Y(Dm dm, C3113u0 c3113u0, C3037qn c3037qn, C3192x c3192x, L1 l1, C3217y c3217y, I2 i2, C2815i0 c2815i0) {
        this.a = dm;
        this.b = c3113u0;
        this.c = c3037qn;
        this.h = c3192x;
        this.d = l1;
        this.e = c3217y;
        this.f = i2;
        this.g = c2815i0;
    }
}
