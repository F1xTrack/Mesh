package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.h1 */
/* loaded from: classes2.dex */
public class C3299h1 {

    /* renamed from: a */
    private final InterfaceC2839Om f23552a;

    /* renamed from: b */
    private final C2893R2 f23553b;

    /* renamed from: c */
    private final C2676I9 f23554c;

    /* renamed from: d */
    private long f23555d;

    /* renamed from: e */
    private C3784zi f23556e;

    /* renamed from: f */
    private final InterfaceC3016W0 f23557f;

    public C3299h1(C2676I9 c2676i9, C3784zi c3784zi, InterfaceC2839Om interfaceC2839Om, C2893R2 c2893r2, InterfaceC3016W0 interfaceC3016W0) {
        this.f23554c = c2676i9;
        this.f23556e = c3784zi;
        this.f23555d = c2676i9.m14321d(0L);
        this.f23552a = interfaceC2839Om;
        this.f23553b = c2893r2;
        this.f23557f = interfaceC3016W0;
    }

    /* renamed from: a */
    public void m16026a() {
        C3784zi c3784zi = this.f23556e;
        if (c3784zi == null || !this.f23553b.m14970b(this.f23555d, c3784zi.f25438a, "should send EVENT_IDENTITY_LIGHT")) {
            return;
        }
        this.f23557f.mo14381b();
        long jMo14675b = this.f23552a.mo14675b();
        this.f23555d = jMo14675b;
        this.f23554c.m14332i(jMo14675b);
    }

    /* renamed from: a */
    public void m16027a(C3784zi c3784zi) {
        this.f23556e = c3784zi;
    }
}
