package com.p018my.tracker.obfuscated;

import p000.AbstractC1374Vq;

/* renamed from: com.my.tracker.obfuscated.i */
/* loaded from: classes2.dex */
public final class C2324i {

    /* renamed from: a */
    final InterfaceC2378v1 f19978a = new C2382w1(0, -2147483648L);

    /* renamed from: b */
    final InterfaceC2311e2 f19979b = new C2319g2(0);

    /* renamed from: c */
    int f19980c = 0;

    /* renamed from: a */
    private String m13193a(String str, String str2) {
        return AbstractC1374Vq.m8590i("app state changed ", str, "-> ", str2);
    }

    /* renamed from: b */
    public boolean m13197b() {
        int i = this.f19980c;
        return i == 1 || i == 0;
    }

    /* renamed from: c */
    public boolean m13199c() {
        return this.f19980c == 3;
    }

    /* renamed from: d */
    public void m13201d(long j) {
        m13203f(j);
    }

    /* renamed from: e */
    public void m13202e(long j) {
        if (this.f19980c == 1) {
            m13203f(j);
        }
    }

    /* renamed from: f */
    public void m13203f(long j) {
        long jMo13521e = j - this.f19978a.mo13521e();
        if (AbstractC2391y2.m13571a()) {
            long jMo12954b = this.f19980c == 3 ? this.f19979b.mo12954b() : this.f19979b.mo12955c();
            AbstractC2391y2.m13568a("TimeSpentCore: AppTimeManager: " + m13192a() + "slicing app TimeSpent, " + jMo12954b + "(existed ms) + " + jMo13521e + "(add ms) = " + (jMo12954b + jMo13521e) + "(total ms), timestamp = " + j);
        }
        int i = this.f19980c;
        if (i == 1) {
            this.f19979b.mo12953a(jMo13521e);
        } else if (i != 3) {
            AbstractC2391y2.m13568a("TimeSpentCore: AppTimeManager: trying to slice app time, but now is useless background state - skip");
        } else {
            this.f19979b.mo12956c(jMo13521e);
        }
    }

    /* renamed from: g */
    public void m13204g(long j) {
        m13203f(j);
        AbstractC2391y2.m13568a("TimeSpentCore: AppTimeManager: " + m13193a(m13192a(), "[BACKGROUND(useless)]"));
        this.f19980c = 0;
    }

    /* renamed from: h */
    public void m13205h(long j) {
        this.f19978a.mo13520b(j);
        AbstractC2391y2.m13568a("TimeSpentCore: AppTimeManager: " + m13193a(m13192a(), "[BACKGROUND(useful)]"));
        this.f19980c = 1;
    }

    /* renamed from: b */
    public void m13196b(long j) {
        if (this.f19980c == 1) {
            this.f19978a.mo13520b(j);
        }
    }

    /* renamed from: c */
    public void m13198c(long j) {
        this.f19978a.mo13520b(j);
    }

    /* renamed from: d */
    public void m13200d() {
        AbstractC2391y2.m13568a("TimeSpentCore: AppTimeManager: " + m13193a(m13192a(), "[FOREGROUND]"));
        this.f19980c = 3;
    }

    /* renamed from: a */
    public InterfaceC2315f2 m13194a(long j) {
        AbstractC2391y2.m13568a("TimeSpentCore: AppTimeManager: " + m13192a() + "onTick: start collecting app TimeSpent");
        if (this.f19980c != 0) {
            m13203f(j);
            this.f19978a.mo13520b(j);
        }
        InterfaceC2311e2 interfaceC2311e2M26666clone = this.f19979b.m26666clone();
        this.f19979b.mo12957g();
        AbstractC2391y2.m13568a("TimeSpentCore: AppTimeManager: " + m13192a() + "onTick: collected app TimeSpent (foregroundMs = " + interfaceC2311e2M26666clone.mo12954b() + ", usefulBackgroundMs = " + interfaceC2311e2M26666clone.mo12955c() + ")");
        if (interfaceC2311e2M26666clone.mo12954b() == 0 && interfaceC2311e2M26666clone.mo12955c() == 0) {
            return null;
        }
        return interfaceC2311e2M26666clone;
    }

    /* renamed from: a */
    private String m13192a() {
        int i = this.f19980c;
        return i != 0 ? i != 1 ? i != 3 ? "" : "[FOREGROUND] " : "[BACKGROUND(useful)] " : "[BACKGROUND(useless)] ";
    }

    /* renamed from: a */
    public void m13195a(int i) {
        int i2;
        if (i == 0) {
            AbstractC2391y2.m13568a("TimeSpentCore: AppTimeManager: " + m13193a(m13192a(), "[BACKGROUND(useless)]"));
            i2 = 0;
        } else {
            AbstractC2391y2.m13568a("TimeSpentCore: AppTimeManager: " + m13193a(m13192a(), "[BACKGROUND(useful)]"));
            i2 = 1;
        }
        this.f19980c = i2;
    }
}
