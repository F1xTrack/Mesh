package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: xC */
/* loaded from: classes.dex */
public final class C7937xC extends AbstractC6883rg {
    public ZC A;
    public C1857Xo1 B;
    public InterfaceC4188hc1 C;
    public C6353ou D;
    public Handler E;
    public C5766lp0 F;
    public Uri G;
    public final Uri H;
    public C6412pC I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long O;
    public int P;
    public C6721qp0 Q;
    public final boolean h;
    public final WC i;
    public final VY j;
    public final C7304tt k;
    public final C22 l;
    public final RL m;
    public final C3547eG n;
    public final T71 o;
    public final long p;
    public final long q;
    public final VY r;
    public final InterfaceC5834mA0 s;
    public final C3513e41 t;
    public final Object u;
    public final SparseArray v;
    public final RunnableC7366uC w;
    public final RunnableC7366uC x;
    public final QQ0 y;
    public final InterfaceC6515pk0 z;

    static {
        AbstractC6911rp0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [uC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [uC] */
    public C7937xC(C6721qp0 c6721qp0, WC wc, InterfaceC5834mA0 interfaceC5834mA0, VY vy, C7304tt c7304tt, C22 c22, RL rl, C3547eG c3547eG, long j, long j2) {
        this.Q = c6721qp0;
        this.F = c6721qp0.c;
        C5957mp0 c5957mp0 = c6721qp0.b;
        c5957mp0.getClass();
        Uri uri = c5957mp0.a;
        this.G = uri;
        this.H = uri;
        this.I = null;
        this.i = wc;
        this.s = interfaceC5834mA0;
        this.j = vy;
        this.l = c22;
        this.m = rl;
        this.n = c3547eG;
        this.p = j;
        this.q = j2;
        this.k = c7304tt;
        this.o = new T71(3);
        this.h = false;
        this.r = a(null);
        this.u = new Object();
        this.v = new SparseArray();
        this.y = new QQ0(this);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.t = new C3513e41(11, this);
        this.z = new C0136Bm1(12, this);
        final int i = 0;
        this.w = new Runnable(this) { // from class: uC
            public final /* synthetic */ C7937xC b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.A();
                        break;
                    default:
                        this.b.z(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.x = new Runnable(this) { // from class: uC
            public final /* synthetic */ C7937xC b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.A();
                        break;
                    default:
                        this.b.z(false);
                        break;
                }
            }
        };
    }

    public static boolean u(MA0 ma0) {
        int i = 0;
        while (true) {
            List list = ma0.c;
            if (i >= list.size()) {
                return false;
            }
            int i2 = ((C3889g3) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                break;
            }
            i++;
        }
        return true;
    }

    public final void A() {
        Uri uri;
        this.E.removeCallbacks(this.w);
        if (this.B.G()) {
            return;
        }
        if (this.B.I()) {
            this.J = true;
            return;
        }
        synchronized (this.u) {
            uri = this.G;
        }
        this.J = false;
        C6025nA0 c6025nA0 = new C6025nA0(this.A, uri, 4, this.s);
        this.r.S(new C4020gk0(c6025nA0.a, c6025nA0.b, this.B.S(c6025nA0, this.t, this.n.d(4))), c6025nA0.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.AbstractC6883rg
    public final InterfaceC8435zp0 b(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j) {
        int iIntValue = ((Integer) c0456Fp0.a).intValue() - this.P;
        VY vyA = a(c0456Fp0);
        OL ol = new OL(this.d.c, 0, c0456Fp0);
        int i = this.P + iIntValue;
        C6412pC c6412pC = this.I;
        InterfaceC4188hc1 interfaceC4188hc1 = this.C;
        long j2 = this.M;
        NB0 nb0 = this.g;
        YN1.h(nb0);
        C7175tC c7175tC = new C7175tC(i, c6412pC, this.o, iIntValue, this.j, interfaceC4188hc1, this.l, this.m, ol, this.n, vyA, j2, this.z, c5272jE, this.k, this.y, nb0);
        this.v.put(i, c7175tC);
        return c7175tC;
    }

    @Override // defpackage.AbstractC6883rg
    public final synchronized C6721qp0 h() {
        return this.Q;
    }

    @Override // defpackage.AbstractC6883rg
    public final void j() {
        this.z.a();
    }

    @Override // defpackage.AbstractC6883rg
    public final void l(InterfaceC4188hc1 interfaceC4188hc1) {
        this.C = interfaceC4188hc1;
        Looper looperMyLooper = Looper.myLooper();
        NB0 nb0 = this.g;
        YN1.h(nb0);
        RL rl = this.m;
        rl.i(looperMyLooper, nb0);
        rl.e();
        if (this.h) {
            z(false);
            return;
        }
        this.A = this.i.s0();
        this.B = new C1857Xo1("DashMediaSource", 2);
        this.E = AbstractC0277Dh1.n(null);
        A();
    }

    @Override // defpackage.AbstractC6883rg
    public final void o(InterfaceC8435zp0 interfaceC8435zp0) {
        C7175tC c7175tC = (C7175tC) interfaceC8435zp0;
        LB0 lb0 = c7175tC.n;
        lb0.i = true;
        lb0.d.removeCallbacksAndMessages(null);
        for (C1708Vr c1708Vr : c7175tC.s) {
            c1708Vr.A(c7175tC);
        }
        c7175tC.r = null;
        this.v.remove(c7175tC.a);
    }

    @Override // defpackage.AbstractC6883rg
    public final void q() {
        this.J = false;
        this.A = null;
        C1857Xo1 c1857Xo1 = this.B;
        if (c1857Xo1 != null) {
            c1857Xo1.P(null);
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = -9223372036854775807L;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.v.clear();
        T71 t71 = this.o;
        ((HashMap) t71.a).clear();
        ((HashMap) t71.b).clear();
        ((HashMap) t71.c).clear();
        this.m.release();
    }

    @Override // defpackage.AbstractC6883rg
    public final synchronized void t(C6721qp0 c6721qp0) {
        this.Q = c6721qp0;
    }

    public final void w() {
        boolean z;
        C1857Xo1 c1857Xo1 = this.B;
        C1304Qm0 c1304Qm0 = new C1304Qm0(12, this);
        synchronized (II1.b) {
            z = II1.c;
        }
        if (z) {
            c1304Qm0.w();
            return;
        }
        if (c1857Xo1 == null) {
            c1857Xo1 = new C1857Xo1("SntpClient", 2);
        }
        c1857Xo1.S(new C0084Av0(21), new C6845rT0(c1304Qm0), 1);
    }

    public final void x(C6025nA0 c6025nA0, long j, long j2) {
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.n.getClass();
        this.r.J(c4020gk0, c6025nA0.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        AbstractC6789rA1.e("Failed to resolve time offset.", iOException);
        this.M = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:357:0x01c6, code lost:
    
        r2 = r40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:396:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x03a4  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r2v20, types: [jR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(boolean r41) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7937xC.z(boolean):void");
    }
}
