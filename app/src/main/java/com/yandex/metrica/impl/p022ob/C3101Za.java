package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Za */
/* loaded from: classes2.dex */
public class C3101Za<T> {

    /* renamed from: a */
    private final Context f22941a;

    /* renamed from: b */
    private final String f22942b;

    /* renamed from: c */
    private final InterfaceC3076Ya<T> f22943c;

    /* renamed from: d */
    private final InterfaceC3013Vm<C3051Xa, C3026Wa> f22944d;

    /* renamed from: e */
    private final InterfaceC3179cb f22945e;

    /* renamed from: f */
    private final C3153bb f22946f;

    /* renamed from: g */
    private final InterfaceC3016W0 f22947g;

    /* renamed from: h */
    private final InterfaceC2839Om f22948h;

    public C3101Za(Context context, InterfaceC3117a1 interfaceC3117a1, String str, InterfaceC3076Ya<T> interfaceC3076Ya, InterfaceC3013Vm<C3051Xa, C3026Wa> interfaceC3013Vm, InterfaceC3179cb interfaceC3179cb) {
        this(context, str, interfaceC3076Ya, interfaceC3013Vm, interfaceC3179cb, new C3153bb(context, str, interfaceC3179cb, interfaceC3117a1), C2834Oh.m14711a(), new C2814Nm());
    }

    /* renamed from: a */
    public synchronized void m15538a(T t, C3051Xa c3051Xa) {
        if (this.f22946f.m15681a(this.f22944d.mo13948a(c3051Xa))) {
            this.f22947g.mo14379a(this.f22942b, this.f22943c.mo15176a(t));
            this.f22945e.mo15271a(new C2551D9(C2877Qa.m14815a(this.f22941a).m14831g()), this.f22948h.mo14675b());
        }
    }

    public C3101Za(Context context, String str, InterfaceC3076Ya<T> interfaceC3076Ya, InterfaceC3013Vm<C3051Xa, C3026Wa> interfaceC3013Vm, InterfaceC3179cb interfaceC3179cb, C3153bb c3153bb, InterfaceC3016W0 interfaceC3016W0, InterfaceC2839Om interfaceC2839Om) {
        this.f22941a = context;
        this.f22942b = str;
        this.f22943c = interfaceC3076Ya;
        this.f22944d = interfaceC3013Vm;
        this.f22945e = interfaceC3179cb;
        this.f22946f = c3153bb;
        this.f22947g = interfaceC3016W0;
        this.f22948h = interfaceC2839Om;
    }
}
