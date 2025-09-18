package com.p018my.tracker.obfuscated;

import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.c */
/* loaded from: classes2.dex */
public class C2299c extends AbstractC2323h2 {
    /* renamed from: a */
    public ArrayList m12796a(long j, boolean z) {
        AbstractC2391y2.m13568a("TimeSpentCore: AnytimeTimeSpentsManager: " + m13187a(z) + "onTick: start collecting anytime TimeSpents");
        m12801b(j, z);
        m13189a(j);
        ArrayList arrayListM13188a = m13188a();
        this.f19977b.clear();
        AbstractC2391y2.m13568a("TimeSpentCore: AnytimeTimeSpentsManager: " + m13187a(z) + "onTick: collected " + arrayListM13188a.size() + " anytime TimeSpents");
        return arrayListM13188a;
    }

    /* renamed from: b */
    public void m12800b(long j) {
        AbstractC2391y2.m13568a("TimeSpentCore: AnytimeTimeSpentsManager: " + m13187a(false) + "updating all running anytime TimeSpents timestamps (size = " + this.f19976a.size() + ", new timestamp = " + j + ")");
        m13189a(j);
    }

    /* renamed from: c */
    public void m12802c(long j) {
        AbstractC2391y2.m13568a("TimeSpentCore: AnytimeTimeSpentsManager: " + m13187a(true) + "updating all running anytime TimeSpents timestamps (size = " + this.f19976a.size() + ", new timestamp = " + j + ")");
        m13189a(j);
    }

    /* renamed from: d */
    public void m12803d(long j) {
        m12801b(j, true);
    }

    /* renamed from: e */
    public void m12804e(long j) {
        m12801b(j, false);
    }

    /* renamed from: a */
    public void m12797a(int i, long j, boolean z) {
        this.f19976a.put(i, new C2382w1(i, j));
        AbstractC2391y2.m13574c("TimeSpent: " + m13187a(z) + "registered new anytime TimeSpent with id = " + i);
    }

    /* renamed from: b */
    public void m12801b(long j, boolean z) {
        AbstractC2391y2.m13568a("TimeSpentCore: AnytimeTimeSpentsManager: " + m13187a(z) + "slicing all running anytime TimeSpents (size = " + this.f19976a.size() + ")");
        for (int i = 0; i < this.f19976a.size(); i++) {
            m12798a(j, (InterfaceC2378v1) this.f19976a.valueAt(i), z);
        }
    }

    /* renamed from: a */
    public void m12798a(long j, InterfaceC2378v1 interfaceC2378v1, boolean z) {
        InterfaceC2311e2 interfaceC2311e2M13186a = m13186a(interfaceC2378v1.mo13090a());
        long jMo13521e = j - interfaceC2378v1.mo13521e();
        if (AbstractC2391y2.m13571a()) {
            long jMo12954b = z ? interfaceC2311e2M13186a.mo12954b() : interfaceC2311e2M13186a.mo12955c();
            AbstractC2391y2.m13568a("TimeSpentCore: AnytimeTimeSpentsManager: " + m13187a(z) + "slicing anytime TimeSpent, id = " + interfaceC2378v1.mo13090a() + ", " + jMo12954b + "(existed ms) + " + jMo13521e + "(add ms) = " + (jMo12954b + jMo13521e) + "(total ms), timestamp = " + j);
        }
        if (z) {
            interfaceC2311e2M13186a.mo12956c(jMo13521e);
        } else {
            interfaceC2311e2M13186a.mo12953a(jMo13521e);
        }
    }

    /* renamed from: b */
    public void m12799b(int i, long j, boolean z) throws Exception {
        InterfaceC2378v1 interfaceC2378v1 = (InterfaceC2378v1) this.f19976a.get(i);
        if (interfaceC2378v1 == null) {
            AbstractC2391y2.m13574c("TimeSpent: " + m13187a(z) + "can't stop anytime TimeSpent with id = " + i + " (reason: not found)");
            throw new Exception();
        }
        m12798a(j, interfaceC2378v1, z);
        this.f19976a.remove(i);
        AbstractC2391y2.m13574c("TimeSpent: " + m13187a(z) + "stopped anytime TimeSpent, id = " + i);
    }
}
