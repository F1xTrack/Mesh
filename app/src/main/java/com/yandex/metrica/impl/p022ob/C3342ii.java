package com.yandex.metrica.impl.p022ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ii */
/* loaded from: classes2.dex */
public class C3342ii {

    /* renamed from: a */
    private long f23656a;

    /* renamed from: b */
    private long f23657b;

    /* renamed from: c */
    private final InterfaceC2839Om f23658c;

    /* renamed from: d */
    private final C2789Mm f23659d;

    public C3342ii() {
        this(new C2814Nm(), new C2789Mm());
    }

    /* renamed from: a */
    public synchronized double m16093a() {
        return this.f23659d.m14631b(this.f23657b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public synchronized double m16094b() {
        return this.f23659d.m14631b(this.f23656a, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public synchronized void m16095c() {
        this.f23657b = this.f23658c.mo14674a();
    }

    /* renamed from: d */
    public synchronized void m16096d() {
        this.f23656a = this.f23658c.mo14674a();
    }

    /* renamed from: e */
    public synchronized void m16097e() {
        this.f23657b = 0L;
    }

    public C3342ii(InterfaceC2839Om interfaceC2839Om, C2789Mm c2789Mm) {
        this.f23658c = interfaceC2839Om;
        this.f23659d = c2789Mm;
    }
}
