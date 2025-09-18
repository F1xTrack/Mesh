package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public class Za<T> {
    private final Context a;
    private final String b;
    private final Ya<T> c;
    private final Vm<Xa, Wa> d;
    private final InterfaceC2676cb e;
    private final C2651bb f;
    private final W0 g;
    private final Om h;

    public Za(Context context, InterfaceC2616a1 interfaceC2616a1, String str, Ya<T> ya, Vm<Xa, Wa> vm, InterfaceC2676cb interfaceC2676cb) {
        this(context, str, ya, vm, interfaceC2676cb, new C2651bb(context, str, interfaceC2676cb, interfaceC2616a1), Oh.a(), new Nm());
    }

    public synchronized void a(T t, Xa xa) {
        if (this.f.a(this.d.a(xa))) {
            this.g.a(this.b, this.c.a(t));
            this.e.a(new D9(Qa.a(this.a).g()), this.h.b());
        }
    }

    public Za(Context context, String str, Ya<T> ya, Vm<Xa, Wa> vm, InterfaceC2676cb interfaceC2676cb, C2651bb c2651bb, W0 w0, Om om) {
        this.a = context;
        this.b = str;
        this.c = ya;
        this.d = vm;
        this.e = interfaceC2676cb;
        this.f = c2651bb;
        this.g = w0;
        this.h = om;
    }
}
