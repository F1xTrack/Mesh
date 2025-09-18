package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class KB0 implements InterfaceC1584Ub1 {
    public final C2527cV0 a;
    public final N8 b = new N8(12, false);
    public final C0774Jr0 c = new C0774Jr0(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ LB0 e;

    public KB0(LB0 lb0, C5272jE c5272jE) {
        this.e = lb0;
        this.a = new C2527cV0(c5272jE, null, null);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void a(long j, int i, int i2, int i3, C1506Tb1 c1506Tb1) {
        long jH;
        long jT;
        this.a.a(j, i, i2, i3, c1506Tb1);
        while (this.a.w(false)) {
            C0774Jr0 c0774Jr0 = this.c;
            c0774Jr0.t();
            if (this.a.B(this.b, c0774Jr0, 0, false) == -4) {
                c0774Jr0.w();
            } else {
                c0774Jr0 = null;
            }
            if (c0774Jr0 != null) {
                long j2 = c0774Jr0.g;
                C0540Gr0 c0540Gr0B = this.e.c.b(c0774Jr0);
                if (c0540Gr0B != null) {
                    LP lp = (LP) c0540Gr0B.a[0];
                    String str = lp.a;
                    String str2 = lp.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jT = AbstractC0277Dh1.T(AbstractC0277Dh1.o(lp.e));
                        } catch (C5643lA0 unused) {
                            jT = -9223372036854775807L;
                        }
                        if (jT != -9223372036854775807L) {
                            JB0 jb0 = new JB0(j2, jT);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, jb0));
                        }
                    }
                }
            }
        }
        C2527cV0 c2527cV0 = this.a;
        ZU0 zu0 = c2527cV0.a;
        synchronized (c2527cV0) {
            int i4 = c2527cV0.s;
            jH = i4 == 0 ? -1L : c2527cV0.h(i4);
        }
        zu0.b(jH);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void b(C4103hA0 c4103hA0, int i, int i2) {
        C2527cV0 c2527cV0 = this.a;
        c2527cV0.getClass();
        c2527cV0.b(c4103hA0, i, 0);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int c(RC rc, int i, boolean z) {
        C2527cV0 c2527cV0 = this.a;
        c2527cV0.getClass();
        return c2527cV0.c(rc, i, z);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void d(int i, C4103hA0 c4103hA0) {
        b(c4103hA0, i, 0);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int e(RC rc, int i, boolean z) {
        return c(rc, i, z);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void f(C6666qX c6666qX) {
        this.a.f(c6666qX);
    }
}
