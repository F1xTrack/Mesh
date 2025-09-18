package p000;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: r30 */
/* loaded from: classes.dex */
public final class C10856r30 extends AbstractC6758rg {

    /* renamed from: h */
    public final C0142CF f41310h;

    /* renamed from: i */
    public final C7391Bm1 f41311i;

    /* renamed from: j */
    public final C6914tt f41312j;

    /* renamed from: k */
    public final C22 f41313k;

    /* renamed from: l */
    public final InterfaceC1091RL f41314l;

    /* renamed from: m */
    public final C3979eG f41315m;

    /* renamed from: n */
    public final boolean f41316n;

    /* renamed from: o */
    public final int f41317o;

    /* renamed from: p */
    public final C0331FF f41318p;

    /* renamed from: q */
    public final long f41319q;

    /* renamed from: r */
    public C10185lp0 f41320r;

    /* renamed from: s */
    public InterfaceC9648hc1 f41321s;

    /* renamed from: t */
    public C10825qp0 f41322t;

    static {
        AbstractC10953rp0.m24489a("media3.exoplayer.hls");
    }

    public C10856r30(C10825qp0 c10825qp0, C7391Bm1 c7391Bm1, C0142CF c0142cf, C6914tt c6914tt, C22 c22, InterfaceC1091RL interfaceC1091RL, C3979eG c3979eG, C0331FF c0331ff, long j, boolean z, int i) {
        this.f41322t = c10825qp0;
        this.f41320r = c10825qp0.f41187c;
        this.f41311i = c7391Bm1;
        this.f41310h = c0142cf;
        this.f41312j = c6914tt;
        this.f41313k = c22;
        this.f41314l = interfaceC1091RL;
        this.f41315m = c3979eG;
        this.f41318p = c0331ff;
        this.f41319q = j;
        this.f41316n = z;
        this.f41317o = i;
    }

    /* renamed from: u */
    public static C10088l30 m24149u(P70 p70, long j) {
        C10088l30 c10088l30 = null;
        for (int i = 0; i < p70.size(); i++) {
            C10088l30 c10088l302 = (C10088l30) p70.get(i);
            long j2 = c10088l302.f38739e;
            if (j2 > j || !c10088l302.f36844l) {
                if (j2 > j) {
                    break;
                }
            } else {
                c10088l30 = c10088l302;
            }
        }
        return c10088l30;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: b */
    public final InterfaceC11973zp0 mo3162b(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j) {
        C1356VY c1356vyM24438a = m24438a(c7604Fp0);
        C0903OL c0903ol = new C0903OL(this.f41800d.f8366c, 0, c7604Fp0);
        InterfaceC9648hc1 interfaceC9648hc1 = this.f41321s;
        NB0 nb0 = this.f41803g;
        YN1.m9283h(nb0);
        return new C9960k30(this.f41310h, this.f41318p, this.f41311i, interfaceC9648hc1, this.f41313k, this.f41314l, c0903ol, this.f41315m, c1356vyM24438a, c6224jE, this.f41312j, this.f41316n, this.f41317o, nb0);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: h */
    public final synchronized C10825qp0 mo6202h() {
        return this.f41322t;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: j */
    public final void mo3163j() throws IOException {
        C0331FF c0331ff = this.f41318p;
        C8539Xo1 c8539Xo1 = c0331ff.f3103g;
        if (c8539Xo1 != null) {
            c8539Xo1.mo858a();
        }
        Uri uri = c0331ff.f3107k;
        if (uri != null) {
            C0268EF c0268ef = (C0268EF) c0331ff.f3100d.get(uri);
            c0268ef.f2566b.mo858a();
            IOException iOException = c0268ef.f2574j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: l */
    public final void mo6203l(InterfaceC9648hc1 interfaceC9648hc1) {
        this.f41321s = interfaceC9648hc1;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        NB0 nb0 = this.f41803g;
        YN1.m9283h(nb0);
        InterfaceC1091RL interfaceC1091RL = this.f41314l;
        interfaceC1091RL.mo6998i(looperMyLooper, nb0);
        interfaceC1091RL.mo6997e();
        C1356VY c1356vyM24438a = m24438a(null);
        C10313mp0 c10313mp0 = mo6202h().f41186b;
        c10313mp0.getClass();
        C0331FF c0331ff = this.f41318p;
        c0331ff.getClass();
        c0331ff.f3104h = AbstractC7485Dh1.m1829n(null);
        c0331ff.f3102f = c1356vyM24438a;
        c0331ff.f3105i = this;
        C10359nA0 c10359nA0 = new C10359nA0(((InterfaceC1397WC) c0331ff.f3097a.f1022b).mo506s0(), c10313mp0.f37951a, 4, c0331ff.f3098b.mo5445j());
        YN1.m9281f(c0331ff.f3103g == null);
        C8539Xo1 c8539Xo1 = new C8539Xo1("DefaultHlsPlaylistTracker:MultivariantPlaylist", 2);
        c0331ff.f3103g = c8539Xo1;
        C3979eG c3979eG = c0331ff.f3099c;
        int i = c10359nA0.f38160c;
        c1356vyM24438a.m8481S(new C9535gk0(c10359nA0.f38158a, c10359nA0.f38159b, c8539Xo1.m9136S(c10359nA0, c0331ff, c3979eG.mo17891d(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: o */
    public final void mo3164o(InterfaceC11973zp0 interfaceC11973zp0) {
        C9960k30 c9960k30 = (C9960k30) interfaceC11973zp0;
        c9960k30.f36251b.f3101e.remove(c9960k30);
        for (E30 e30 : c9960k30.f36270u) {
            if (e30.f2396D) {
                for (D30 d30 : e30.f2438v) {
                    d30.m10725j();
                    InterfaceC0715LL interfaceC0715LL = d30.f17554h;
                    if (interfaceC0715LL != null) {
                        interfaceC0715LL.mo4951d(d30.f17551e);
                        d30.f17554h = null;
                        d30.f17553g = null;
                    }
                }
            }
            C9576h30 c9576h30 = e30.f2420d;
            C0268EF c0268ef = (C0268EF) c9576h30.f28190g.f3100d.get(c9576h30.f28188e[c9576h30.f28201r.mo2731l()]);
            if (c0268ef != null) {
                c0268ef.f2575k = false;
            }
            c9576h30.f28198o = null;
            e30.f2426j.m9133P(e30);
            e30.f2434r.removeCallbacksAndMessages(null);
            e30.f2400H = true;
            e30.f2435s.clear();
        }
        c9960k30.f36267r = null;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: q */
    public final void mo3165q() {
        C0331FF c0331ff = this.f41318p;
        c0331ff.f3107k = null;
        c0331ff.f3108l = null;
        c0331ff.f3106j = null;
        c0331ff.f3110n = -9223372036854775807L;
        c0331ff.f3103g.m9133P(null);
        c0331ff.f3103g = null;
        HashMap map = c0331ff.f3100d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C0268EF) it.next()).f2566b.m9133P(null);
        }
        c0331ff.f3104h.removeCallbacksAndMessages(null);
        c0331ff.f3104h = null;
        map.clear();
        this.f41314l.release();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: t */
    public final synchronized void mo3166t(C10825qp0 c10825qp0) {
        this.f41322t = c10825qp0;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x016a  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24150w(p000.C10728q30 r42) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10856r30.m24150w(q30):void");
    }
}
