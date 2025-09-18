package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: mE0 */
/* loaded from: classes.dex */
public final class C5846mE0 implements InterfaceC5751lk0 {
    public final Uri b;
    public final M41 c;
    public final C6846rT1 d;
    public final C6419pE0 e;
    public final FC f;
    public volatile boolean h;
    public long j;
    public InterfaceC1584Ub1 l;
    public boolean m;
    public final /* synthetic */ C6419pE0 n;
    public final SV g = new SV();
    public boolean i = true;
    public final long a = C4020gk0.b.getAndIncrement();
    public C3538eD k = a(0);

    public C5846mE0(C6419pE0 c6419pE0, Uri uri, ZC zc, C6846rT1 c6846rT1, C6419pE0 c6419pE02, FC fc) {
        this.n = c6419pE0;
        this.b = uri;
        this.c = new M41(zc);
        this.d = c6846rT1;
        this.e = c6419pE02;
        this.f = fc;
    }

    public final C3538eD a(long j) {
        Collections.emptyMap();
        this.n.getClass();
        Map map = C6419pE0.N;
        Uri uri = this.b;
        YN1.i(uri, "The uri must be set.");
        return new C3538eD(uri, 0L, 1, null, map, j, -1L, null, 6);
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void e() {
        ZC o50;
        WR wr;
        int i;
        int iD = 0;
        while (iD == 0 && !this.h) {
            try {
                long j = this.g.a;
                C3538eD c3538eDA = a(j);
                this.k = c3538eDA;
                long jC = this.c.c(c3538eDA);
                if (this.h) {
                    if (iD != 1 && this.d.t() != -1) {
                        this.g.a = this.d.t();
                    }
                    AbstractC4370iZ1.b(this.c);
                    return;
                }
                if (jC != -1) {
                    jC += j;
                    C6419pE0 c6419pE0 = this.n;
                    c6419pE0.p.post(new RunnableC5464kE0(c6419pE0, 0));
                }
                long j2 = jC;
                this.n.r = Q50.a(this.c.a.l());
                M41 m41 = this.c;
                Q50 q50 = this.n.r;
                if (q50 == null || (i = q50.f) == -1) {
                    o50 = m41;
                } else {
                    o50 = new O50(m41, i, this);
                    C6419pE0 c6419pE02 = this.n;
                    c6419pE02.getClass();
                    InterfaceC1584Ub1 interfaceC1584Ub1B = c6419pE02.B(new C6228oE0(0, true));
                    this.l = interfaceC1584Ub1B;
                    interfaceC1584Ub1B.f(C6419pE0.O);
                }
                long jT = j;
                this.d.A(o50, this.b, this.c.a.l(), j, j2, this.e);
                if (this.n.r != null && (wr = (WR) this.d.c) != null) {
                    WR wrB = wr.b();
                    if (wrB instanceof C1868Xs0) {
                        ((C1868Xs0) wrB).r = true;
                    }
                }
                if (this.i) {
                    C6846rT1 c6846rT1 = this.d;
                    long j3 = this.j;
                    WR wr2 = (WR) c6846rT1.c;
                    wr2.getClass();
                    wr2.g(jT, j3);
                    this.i = false;
                }
                while (true) {
                    long j4 = jT;
                    while (iD == 0 && !this.h) {
                        try {
                            FC fc = this.f;
                            synchronized (fc) {
                                while (!fc.a) {
                                    fc.wait();
                                }
                            }
                            C6846rT1 c6846rT12 = this.d;
                            SV sv = this.g;
                            WR wr3 = (WR) c6846rT12.c;
                            wr3.getClass();
                            C7566vF c7566vF = (C7566vF) c6846rT12.d;
                            c7566vF.getClass();
                            iD = wr3.d(c7566vF, sv);
                            jT = this.d.t();
                            if (jT > this.n.i + j4) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f.d();
                    C6419pE0 c6419pE03 = this.n;
                    c6419pE03.p.post(c6419pE03.o);
                }
                if (iD == 1) {
                    iD = 0;
                } else if (this.d.t() != -1) {
                    this.g.a = this.d.t();
                }
                AbstractC4370iZ1.b(this.c);
            } catch (Throwable th) {
                if (iD != 1 && this.d.t() != -1) {
                    this.g.a = this.d.t();
                }
                AbstractC4370iZ1.b(this.c);
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void s() {
        this.h = true;
    }
}
