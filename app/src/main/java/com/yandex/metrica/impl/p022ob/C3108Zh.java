package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Zh */
/* loaded from: classes2.dex */
class C3108Zh {

    /* renamed from: a */
    private final String f22993a;

    /* renamed from: b */
    private final C2893R2 f22994b;

    /* renamed from: c */
    private final InterfaceC2839Om f22995c;

    /* renamed from: d */
    private final C3058Xh f22996d;

    public C3108Zh(String str, C3033Wh c3033Wh) {
        this(str, new C2893R2(), new C2814Nm(), new C3058Xh(c3033Wh));
    }

    /* renamed from: a */
    public void m15556a(InterfaceC3290gi interfaceC3290gi, int i, C2585Ei c2585Ei) {
        this.f22996d.m15427a(c2585Ei.f21128g);
        if (this.f22994b.m14970b(this.f22996d.m15425a(i), c2585Ei.f21128g, "report " + this.f22993a)) {
            ((RunnableC3368ji) interfaceC3290gi).m16182a(this.f22993a, Integer.valueOf(i));
            this.f22996d.m15426a(i, this.f22995c.mo14675b());
        }
    }

    public C3108Zh(String str, C2893R2 c2893r2, InterfaceC2839Om interfaceC2839Om, C3058Xh c3058Xh) {
        this.f22993a = str;
        this.f22994b = c2893r2;
        this.f22995c = interfaceC2839Om;
        this.f22996d = c3058Xh;
    }
}
