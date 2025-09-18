package com.p018my.tracker.obfuscated;

import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.k0 */
/* loaded from: classes2.dex */
public class C2333k0 extends AbstractC2323h2 {
    /* renamed from: a */
    public ArrayList m13265a(long j, boolean z) {
        AbstractC2391y2.m13568a("TimeSpentCore: ForegroundTimeSpentsManager: " + m13187a(z) + "onTick: start collecting foreground TimeSpents");
        if (z) {
            m13273f(j);
            m13189a(j);
        }
        ArrayList arrayListM13188a = m13188a();
        this.f19977b.clear();
        AbstractC2391y2.m13568a("TimeSpentCore: ForegroundTimeSpentsManager: " + m13187a(z) + "onTick: collected " + arrayListM13188a.size() + " foreground TimeSpents");
        return arrayListM13188a;
    }

    /* renamed from: b */
    public void m13269b(long j) {
    }

    /* renamed from: c */
    public void m13270c(long j) {
        AbstractC2391y2.m13568a("TimeSpentCore: ForegroundTimeSpentsManager: " + m13187a(true) + "updating all running foreground TimeSpents timestamps (size = " + this.f19976a.size() + ", new timestamp = " + j + ")");
        m13189a(j);
    }

    /* renamed from: d */
    public void m13271d(long j) {
        m13273f(j);
    }

    /* renamed from: e */
    public void m13272e(long j) {
    }

    /* renamed from: f */
    public void m13273f(long j) {
        AbstractC2391y2.m13568a("TimeSpentCore: ForegroundTimeSpentsManager: " + m13187a(true) + "slicing all running foreground TimeSpents (size = " + this.f19976a.size() + ")");
        for (int i = 0; i < this.f19976a.size(); i++) {
            m13267a(j, (InterfaceC2378v1) this.f19976a.valueAt(i));
        }
    }

    /* renamed from: a */
    public void m13266a(int i, long j, boolean z) {
        if (!z) {
            j = -2147483648L;
        }
        this.f19976a.put(i, new C2382w1(i, j));
        AbstractC2391y2.m13574c("TimeSpent: " + m13187a(z) + "registered new foreground TimeSpent with id = " + i);
    }

    /* renamed from: b */
    public void m13268b(int i, long j, boolean z) throws Exception {
        InterfaceC2378v1 interfaceC2378v1 = (InterfaceC2378v1) this.f19976a.get(i);
        if (interfaceC2378v1 == null) {
            AbstractC2391y2.m13574c("TimeSpent: " + m13187a(z) + " can't stop foreground TimeSpent with id = " + i + " (reason: not found)");
            throw new Exception();
        }
        if (z) {
            m13267a(j, interfaceC2378v1);
        }
        this.f19976a.remove(i);
        AbstractC2391y2.m13574c("TimeSpent: " + m13187a(z) + "stopped foreground TimeSpent, id = " + i);
    }

    /* renamed from: a */
    public void m13267a(long j, InterfaceC2378v1 interfaceC2378v1) {
        InterfaceC2311e2 interfaceC2311e2M13186a = m13186a(interfaceC2378v1.mo13090a());
        long jMo13521e = j - interfaceC2378v1.mo13521e();
        if (AbstractC2391y2.m13571a()) {
            long jMo12954b = interfaceC2311e2M13186a.mo12954b();
            AbstractC2391y2.m13568a("TimeSpentCore: ForegroundTimeSpentsManager: " + m13187a(true) + "slicing foreground TimeSpent, id = " + interfaceC2378v1.mo13090a() + ", " + jMo12954b + "(existed ms) + " + jMo13521e + "(add ms) = " + (jMo12954b + jMo13521e) + "(total ms), timestamp = " + j);
        }
        interfaceC2311e2M13186a.mo12956c(jMo13521e);
    }
}
