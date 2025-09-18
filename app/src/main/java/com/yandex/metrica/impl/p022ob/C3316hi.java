package com.yandex.metrica.impl.p022ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.hi */
/* loaded from: classes2.dex */
class C3316hi {

    /* renamed from: a */
    private final C2789Mm f23604a;

    /* renamed from: b */
    private final long f23605b;

    /* renamed from: c */
    private long f23606c;

    /* renamed from: d */
    private long f23607d;

    /* renamed from: e */
    private long f23608e;

    public C3316hi(InterfaceC2839Om interfaceC2839Om, C2789Mm c2789Mm) {
        this.f23605b = ((C2814Nm) interfaceC2839Om).mo14674a();
        this.f23604a = c2789Mm;
    }

    /* renamed from: a */
    public void m16050a() {
        this.f23606c = this.f23604a.m14631b(this.f23605b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public void m16051b() {
        this.f23607d = this.f23604a.m14631b(this.f23605b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public void m16052c() {
        this.f23608e = this.f23604a.m14631b(this.f23605b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    public long m16053d() {
        return this.f23606c;
    }

    /* renamed from: e */
    public long m16054e() {
        return this.f23607d;
    }

    /* renamed from: f */
    public long m16055f() {
        return this.f23608e;
    }
}
