package com.p018my.tracker.obfuscated;

import android.content.Context;
import com.p018my.tracker.MyTrackerParams;
import com.p018my.tracker.obfuscated.C2298b3;
import java.util.Objects;
import p000.C7655Go1;
import p000.RunnableC8176Qp0;

/* renamed from: com.my.tracker.obfuscated.m2 */
/* loaded from: classes2.dex */
public final class C2343m2 implements InterfaceC2379v2, InterfaceC2375u2 {

    /* renamed from: g */
    private static volatile C2343m2 f20040g;

    /* renamed from: a */
    final C2331j2 f20041a = new C2331j2(InterfaceC2327i2.f19986a, new C7655Go1(9, this));

    /* renamed from: b */
    private C2395z2 f20042b;

    /* renamed from: c */
    private Context f20043c;

    /* renamed from: d */
    InterfaceC2355p2 f20044d;

    /* renamed from: e */
    C2347n2 f20045e;

    /* renamed from: f */
    C2339l2 f20046f;

    private C2343m2() {
    }

    /* renamed from: c */
    public static C2343m2 m13307c() {
        C2343m2 c2343m2 = f20040g;
        if (c2343m2 == null) {
            synchronized (C2343m2.class) {
                try {
                    c2343m2 = f20040g;
                    if (c2343m2 == null) {
                        c2343m2 = new C2343m2();
                        f20040g = c2343m2;
                    }
                } finally {
                }
            }
        }
        return c2343m2;
    }

    /* renamed from: d */
    public static InterfaceC2375u2 m13308d() {
        return m13307c();
    }

    /* renamed from: e */
    public static InterfaceC2379v2 m13309e() {
        return m13307c();
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2375u2
    /* renamed from: b */
    public synchronized void mo13314b() {
        AbstractC2391y2.m13568a("TimeSpentModule: onAppGoingBackground");
        if (this.f20044d == null) {
            AbstractC2391y2.m13568a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.f20041a.m13253d();
        }
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2379v2
    /* renamed from: a */
    public synchronized void mo13311a(int i) {
        AbstractC2391y2.m13568a("TimeSpentModule: incrementEventTimeSpent id = " + i);
        if (this.f20044d != null) {
            this.f20041a.m13238a(i);
            return;
        }
        AbstractC2391y2.m13574c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called incrementEventTimeSpent id = " + i + ")");
    }

    /* renamed from: b */
    public void m13316b(C2363r2 c2363r2, C2298b3 c2298b3) {
        AbstractC2391y2.m13568a("TimeSpentModule: core tick DTO collected, sending to repository...");
        if (this.f20044d == null) {
            AbstractC2391y2.m13572b("TimeSpentModule: repository was not created, can't store and send this packet, drop");
            return;
        }
        if (this.f20046f == null) {
            AbstractC2391y2.m13568a("TimeSpentModule: packetGenerator was not initialized, drop");
        } else if (this.f20042b == null) {
            AbstractC2391y2.m13568a("TimeSpentModule: config is not specified, drop");
        } else {
            AbstractC2340m.m13293d(new RunnableC8176Qp0(this, c2363r2, c2298b3, 24));
        }
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2375u2
    /* renamed from: a */
    public void mo13313a(C2395z2 c2395z2, Context context) {
        C2359q2 c2359q2M13451a = C2359q2.m13451a(700, c2395z2, context);
        this.f20044d = c2359q2M13451a;
        this.f20045e = C2347n2.m13341a(10, c2395z2, c2359q2M13451a);
        MyTrackerParams myTrackerParamsM13613m = c2395z2.m13613m();
        final C2331j2 c2331j2 = this.f20041a;
        Objects.requireNonNull(c2331j2);
        final int i = 0;
        InterfaceC2368t interfaceC2368t = new InterfaceC2368t() { // from class: Sv1
            @Override // com.p018my.tracker.obfuscated.InterfaceC2368t
            /* renamed from: a */
            public final void mo7467a(Object obj) {
                switch (i) {
                    case 0:
                        c2331j2.m13250b((C2298b3) obj);
                        break;
                    default:
                        c2331j2.m13243a((C2298b3) obj);
                        break;
                }
            }
        };
        final C2331j2 c2331j22 = this.f20041a;
        Objects.requireNonNull(c2331j22);
        final int i2 = 1;
        myTrackerParamsM13613m.m12753a(interfaceC2368t, new InterfaceC2368t() { // from class: Sv1
            @Override // com.p018my.tracker.obfuscated.InterfaceC2368t
            /* renamed from: a */
            public final void mo7467a(Object obj) {
                switch (i2) {
                    case 0:
                        c2331j22.m13250b((C2298b3) obj);
                        break;
                    default:
                        c2331j22.m13243a((C2298b3) obj);
                        break;
                }
            }
        });
        this.f20041a.m13237a();
        this.f20046f = new C2339l2();
        this.f20043c = context;
        this.f20042b = c2395z2;
        AbstractC2391y2.m13568a("TimeSpentModule: TimeSpentModule initialized");
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2379v2
    /* renamed from: b */
    public synchronized void mo13315b(int i, boolean z) {
        AbstractC2391y2.m13568a("TimeSpentModule: stopTimeSpent id = " + i + ", canUseInBackground = " + z);
        if (this.f20044d != null) {
            this.f20041a.m13246b(i, z);
            return;
        }
        AbstractC2391y2.m13574c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called stopTimeSpent id = " + i + ")");
    }

    /* renamed from: a */
    public /* synthetic */ void m13306a(C2363r2 c2363r2, C2298b3 c2298b3) {
        if (!AbstractC2367s2.m13493a(c2363r2)) {
            AbstractC2391y2.m13568a("TimeSpentModule: collected dto data is empty, no need to send");
            return;
        }
        if (!AbstractC2367s2.m13495c(c2363r2)) {
            AbstractC2391y2.m13568a("TimeSpentModule: collected dto data is corrupted, sending anyway");
        }
        try {
            this.f20044d.mo13390a(c2363r2.m13473c(), this.f20046f.m13289a(this.f20042b.m13615o(), c2298b3, c2363r2, this.f20042b.m13608h(), this.f20042b.m13614n(), this.f20043c));
            AbstractC2391y2.m13568a("TimeSpentModule: successfully stored new time spent tick in repository, notifying sender...");
            this.f20045e.m13346c();
        } catch (Exception unused) {
            AbstractC2391y2.m13572b("TimeSpentModule: something went wrong while storing new timeSpentTick in repository, this tick didn't stored and wouldn't be sent");
        }
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2375u2
    /* renamed from: a */
    public synchronized void mo13310a() {
        AbstractC2391y2.m13568a("TimeSpentModule: onAppGoingForeground");
        if (this.f20044d == null) {
            AbstractC2391y2.m13568a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.f20041a.m13255e();
        }
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2379v2
    /* renamed from: a */
    public synchronized void mo13312a(int i, boolean z) {
        AbstractC2391y2.m13568a("TimeSpentModule: startTimeSpent id = " + i + ", canUseInBackground = " + z);
        if (this.f20044d != null) {
            this.f20041a.m13239a(i, z);
            return;
        }
        AbstractC2391y2.m13574c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called startTimeSpent id = " + i + ")");
    }
}
