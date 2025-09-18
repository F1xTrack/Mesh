package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: r30 */
/* loaded from: classes.dex */
public final class C6766r30 extends AbstractC6883rg {
    public final CF h;
    public final C0136Bm1 i;
    public final C7304tt j;
    public final C22 k;
    public final RL l;
    public final C3547eG m;
    public final boolean n;
    public final int o;
    public final FF p;
    public final long q;
    public C5766lp0 r;
    public InterfaceC4188hc1 s;
    public C6721qp0 t;

    static {
        AbstractC6911rp0.a("media3.exoplayer.hls");
    }

    public C6766r30(C6721qp0 c6721qp0, C0136Bm1 c0136Bm1, CF cf, C7304tt c7304tt, C22 c22, RL rl, C3547eG c3547eG, FF ff, long j, boolean z, int i) {
        this.t = c6721qp0;
        this.r = c6721qp0.c;
        this.i = c0136Bm1;
        this.h = cf;
        this.j = c7304tt;
        this.k = c22;
        this.l = rl;
        this.m = c3547eG;
        this.p = ff;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static C5621l30 u(P70 p70, long j) {
        C5621l30 c5621l30 = null;
        for (int i = 0; i < p70.size(); i++) {
            C5621l30 c5621l302 = (C5621l30) p70.get(i);
            long j2 = c5621l302.e;
            if (j2 > j || !c5621l302.l) {
                if (j2 > j) {
                    break;
                }
            } else {
                c5621l30 = c5621l302;
            }
        }
        return c5621l30;
    }

    @Override // defpackage.AbstractC6883rg
    public final InterfaceC8435zp0 b(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j) {
        VY vyA = a(c0456Fp0);
        OL ol = new OL(this.d.c, 0, c0456Fp0);
        InterfaceC4188hc1 interfaceC4188hc1 = this.s;
        NB0 nb0 = this.g;
        YN1.h(nb0);
        return new C5430k30(this.h, this.p, this.i, interfaceC4188hc1, this.k, this.l, ol, this.m, vyA, c5272jE, this.j, this.n, this.o, nb0);
    }

    @Override // defpackage.AbstractC6883rg
    public final synchronized C6721qp0 h() {
        return this.t;
    }

    @Override // defpackage.AbstractC6883rg
    public final void j() throws IOException {
        FF ff = this.p;
        C1857Xo1 c1857Xo1 = ff.g;
        if (c1857Xo1 != null) {
            c1857Xo1.a();
        }
        Uri uri = ff.k;
        if (uri != null) {
            EF ef = (EF) ff.d.get(uri);
            ef.b.a();
            IOException iOException = ef.j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.AbstractC6883rg
    public final void l(InterfaceC4188hc1 interfaceC4188hc1) {
        this.s = interfaceC4188hc1;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        NB0 nb0 = this.g;
        YN1.h(nb0);
        RL rl = this.l;
        rl.i(looperMyLooper, nb0);
        rl.e();
        VY vyA = a(null);
        C5957mp0 c5957mp0 = h().b;
        c5957mp0.getClass();
        FF ff = this.p;
        ff.getClass();
        ff.h = AbstractC0277Dh1.n(null);
        ff.f = vyA;
        ff.i = this;
        C6025nA0 c6025nA0 = new C6025nA0(((WC) ff.a.b).s0(), c5957mp0.a, 4, ff.b.j());
        YN1.f(ff.g == null);
        C1857Xo1 c1857Xo1 = new C1857Xo1("DefaultHlsPlaylistTracker:MultivariantPlaylist", 2);
        ff.g = c1857Xo1;
        C3547eG c3547eG = ff.c;
        int i = c6025nA0.c;
        vyA.S(new C4020gk0(c6025nA0.a, c6025nA0.b, c1857Xo1.S(c6025nA0, ff, c3547eG.d(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.AbstractC6883rg
    public final void o(InterfaceC8435zp0 interfaceC8435zp0) {
        C5430k30 c5430k30 = (C5430k30) interfaceC8435zp0;
        c5430k30.b.e.remove(c5430k30);
        for (E30 e30 : c5430k30.u) {
            if (e30.D) {
                for (D30 d30 : e30.v) {
                    d30.j();
                    LL ll = d30.h;
                    if (ll != null) {
                        ll.d(d30.e);
                        d30.h = null;
                        d30.g = null;
                    }
                }
            }
            C4081h30 c4081h30 = e30.d;
            EF ef = (EF) c4081h30.g.d.get(c4081h30.e[c4081h30.r.l()]);
            if (ef != null) {
                ef.k = false;
            }
            c4081h30.o = null;
            e30.j.P(e30);
            e30.r.removeCallbacksAndMessages(null);
            e30.H = true;
            e30.s.clear();
        }
        c5430k30.r = null;
    }

    @Override // defpackage.AbstractC6883rg
    public final void q() {
        FF ff = this.p;
        ff.k = null;
        ff.l = null;
        ff.j = null;
        ff.n = -9223372036854775807L;
        ff.g.P(null);
        ff.g = null;
        HashMap map = ff.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((EF) it.next()).b.P(null);
        }
        ff.h.removeCallbacksAndMessages(null);
        ff.h = null;
        map.clear();
        this.l.release();
    }

    @Override // defpackage.AbstractC6883rg
    public final synchronized void t(C6721qp0 c6721qp0) {
        this.t = c6721qp0;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(defpackage.C6576q30 r42) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6766r30.w(q30):void");
    }
}
