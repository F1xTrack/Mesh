package io.sentry;

/* loaded from: classes2.dex */
public final /* synthetic */ class J1 implements M0, R1 {
    public final /* synthetic */ M1 a;

    public /* synthetic */ J1(M1 m1) {
        this.a = m1;
    }

    @Override // io.sentry.R1
    public void a(P1 p1) {
        M1 m1 = this.a;
        b2 b2Var = m1.q;
        if (b2Var != null) {
            b2Var.b(p1);
        }
        L1 l1 = m1.f;
        a2 a2Var = m1.r;
        if (a2Var.e == null) {
            if (l1.a) {
                m1.p(l1.b, null);
            }
        } else if (!a2Var.d || m1.u()) {
            m1.l();
        }
    }

    @Override // io.sentry.M0
    public void b(L0 l0) {
        M1 m1 = this.a;
        m1.getClass();
        synchronized (l0.m) {
            if (l0.a == m1) {
                l0.c();
            }
        }
    }
}
