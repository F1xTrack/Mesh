package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.obfuscated.b3;
import defpackage.C0532Go1;
import defpackage.RunnableC1313Qp0;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class m2 implements v2, u2 {
    private static volatile m2 g;
    final j2 a = new j2(i2.a, new C0532Go1(9, this));
    private z2 b;
    private Context c;
    p2 d;
    n2 e;
    l2 f;

    private m2() {
    }

    public static m2 c() {
        m2 m2Var = g;
        if (m2Var == null) {
            synchronized (m2.class) {
                try {
                    m2Var = g;
                    if (m2Var == null) {
                        m2Var = new m2();
                        g = m2Var;
                    }
                } finally {
                }
            }
        }
        return m2Var;
    }

    public static u2 d() {
        return c();
    }

    public static v2 e() {
        return c();
    }

    @Override // com.my.tracker.obfuscated.u2
    public synchronized void b() {
        y2.a("TimeSpentModule: onAppGoingBackground");
        if (this.d == null) {
            y2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.a.d();
        }
    }

    @Override // com.my.tracker.obfuscated.v2
    public synchronized void a(int i) {
        y2.a("TimeSpentModule: incrementEventTimeSpent id = " + i);
        if (this.d != null) {
            this.a.a(i);
            return;
        }
        y2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called incrementEventTimeSpent id = " + i + ")");
    }

    public void b(r2 r2Var, b3 b3Var) {
        y2.a("TimeSpentModule: core tick DTO collected, sending to repository...");
        if (this.d == null) {
            y2.b("TimeSpentModule: repository was not created, can't store and send this packet, drop");
            return;
        }
        if (this.f == null) {
            y2.a("TimeSpentModule: packetGenerator was not initialized, drop");
        } else if (this.b == null) {
            y2.a("TimeSpentModule: config is not specified, drop");
        } else {
            m.d(new RunnableC1313Qp0(this, r2Var, b3Var, 24));
        }
    }

    @Override // com.my.tracker.obfuscated.u2
    public void a(z2 z2Var, Context context) {
        q2 q2VarA = q2.a(700, z2Var, context);
        this.d = q2VarA;
        this.e = n2.a(10, z2Var, q2VarA);
        MyTrackerParams myTrackerParamsM = z2Var.m();
        final j2 j2Var = this.a;
        Objects.requireNonNull(j2Var);
        final int i = 0;
        t tVar = new t() { // from class: Sv1
            @Override // com.my.tracker.obfuscated.t
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        j2Var.b((b3) obj);
                        break;
                    default:
                        j2Var.a((b3) obj);
                        break;
                }
            }
        };
        final j2 j2Var2 = this.a;
        Objects.requireNonNull(j2Var2);
        final int i2 = 1;
        myTrackerParamsM.a(tVar, new t() { // from class: Sv1
            @Override // com.my.tracker.obfuscated.t
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        j2Var2.b((b3) obj);
                        break;
                    default:
                        j2Var2.a((b3) obj);
                        break;
                }
            }
        });
        this.a.a();
        this.f = new l2();
        this.c = context;
        this.b = z2Var;
        y2.a("TimeSpentModule: TimeSpentModule initialized");
    }

    @Override // com.my.tracker.obfuscated.v2
    public synchronized void b(int i, boolean z) {
        y2.a("TimeSpentModule: stopTimeSpent id = " + i + ", canUseInBackground = " + z);
        if (this.d != null) {
            this.a.b(i, z);
            return;
        }
        y2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called stopTimeSpent id = " + i + ")");
    }

    public /* synthetic */ void a(r2 r2Var, b3 b3Var) {
        if (!s2.a(r2Var)) {
            y2.a("TimeSpentModule: collected dto data is empty, no need to send");
            return;
        }
        if (!s2.c(r2Var)) {
            y2.a("TimeSpentModule: collected dto data is corrupted, sending anyway");
        }
        try {
            this.d.a(r2Var.c(), this.f.a(this.b.o(), b3Var, r2Var, this.b.h(), this.b.n(), this.c));
            y2.a("TimeSpentModule: successfully stored new time spent tick in repository, notifying sender...");
            this.e.c();
        } catch (Exception unused) {
            y2.b("TimeSpentModule: something went wrong while storing new timeSpentTick in repository, this tick didn't stored and wouldn't be sent");
        }
    }

    @Override // com.my.tracker.obfuscated.u2
    public synchronized void a() {
        y2.a("TimeSpentModule: onAppGoingForeground");
        if (this.d == null) {
            y2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.a.e();
        }
    }

    @Override // com.my.tracker.obfuscated.v2
    public synchronized void a(int i, boolean z) {
        y2.a("TimeSpentModule: startTimeSpent id = " + i + ", canUseInBackground = " + z);
        if (this.d != null) {
            this.a.a(i, z);
            return;
        }
        y2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called startTimeSpent id = " + i + ")");
    }
}
