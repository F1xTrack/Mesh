package p000;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: mE0 */
/* loaded from: classes.dex */
public final class C10239mE0 implements InterfaceC10175lk0 {

    /* renamed from: b */
    public final Uri f37570b;

    /* renamed from: c */
    public final M41 f37571c;

    /* renamed from: d */
    public final C10910rT1 f37572d;

    /* renamed from: e */
    public final C10623pE0 f37573e;

    /* renamed from: f */
    public final C0328FC f37574f;

    /* renamed from: h */
    public volatile boolean f37576h;

    /* renamed from: j */
    public long f37578j;

    /* renamed from: l */
    public InterfaceC8357Ub1 f37580l;

    /* renamed from: m */
    public boolean f37581m;

    /* renamed from: n */
    public final /* synthetic */ C10623pE0 f37582n;

    /* renamed from: g */
    public final C1164SV f37575g = new C1164SV();

    /* renamed from: i */
    public boolean f37577i = true;

    /* renamed from: a */
    public final long f37569a = C9535gk0.f27975b.getAndIncrement();

    /* renamed from: k */
    public C3976eD f37579k = m22705a(0);

    public C10239mE0(C10623pE0 c10623pE0, Uri uri, InterfaceC1586ZC interfaceC1586ZC, C10910rT1 c10910rT1, C10623pE0 c10623pE02, C0328FC c0328fc) {
        this.f37582n = c10623pE0;
        this.f37570b = uri;
        this.f37571c = new M41(interfaceC1586ZC);
        this.f37572d = c10910rT1;
        this.f37573e = c10623pE02;
        this.f37574f = c0328fc;
    }

    /* renamed from: a */
    public final C3976eD m22705a(long j) {
        Collections.emptyMap();
        this.f37582n.getClass();
        Map map = C10623pE0.f39915N;
        Uri uri = this.f37570b;
        YN1.m9284i(uri, "The uri must be set.");
        return new C3976eD(uri, 0L, 1, null, map, j, -1L, null, 6);
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: e */
    public final void mo388e() {
        InterfaceC1586ZC o50;
        InterfaceC1412WR interfaceC1412WR;
        int i;
        int iMo738d = 0;
        while (iMo738d == 0 && !this.f37576h) {
            try {
                long j = this.f37575g.f10814a;
                C3976eD c3976eDM22705a = m22705a(j);
                this.f37579k = c3976eDM22705a;
                long jMo2365c = this.f37571c.mo2365c(c3976eDM22705a);
                if (this.f37576h) {
                    if (iMo738d != 1 && this.f37572d.m24383t() != -1) {
                        this.f37575g.f10814a = this.f37572d.m24383t();
                    }
                    AbstractC9770iZ1.m19065b(this.f37571c);
                    return;
                }
                if (jMo2365c != -1) {
                    jMo2365c += j;
                    C10623pE0 c10623pE0 = this.f37582n;
                    c10623pE0.f39945p.post(new RunnableC9983kE0(c10623pE0, 0));
                }
                long j2 = jMo2365c;
                this.f37582n.f39947r = Q50.m6572a(this.f37571c.f6985a.mo3793l());
                M41 m41 = this.f37571c;
                Q50 q50 = this.f37582n.f39947r;
                if (q50 == null || (i = q50.f9476f) == -1) {
                    o50 = m41;
                } else {
                    o50 = new O50(m41, i, this);
                    C10623pE0 c10623pE02 = this.f37582n;
                    c10623pE02.getClass();
                    InterfaceC8357Ub1 interfaceC8357Ub1M23652B = c10623pE02.m23652B(new C10495oE0(0, true));
                    this.f37580l = interfaceC8357Ub1M23652B;
                    interfaceC8357Ub1M23652B.mo965f(C10623pE0.f39916O);
                }
                long jM24383t = j;
                this.f37572d.m24368A(o50, this.f37570b, this.f37571c.f6985a.mo3793l(), j, j2, this.f37573e);
                if (this.f37582n.f39947r != null && (interfaceC1412WR = (InterfaceC1412WR) this.f37572d.f41679c) != null) {
                    InterfaceC1412WR interfaceC1412WRMo737b = interfaceC1412WR.mo737b();
                    if (interfaceC1412WRMo737b instanceof C8546Xs0) {
                        ((C8546Xs0) interfaceC1412WRMo737b).f14027r = true;
                    }
                }
                if (this.f37577i) {
                    C10910rT1 c10910rT1 = this.f37572d;
                    long j3 = this.f37578j;
                    InterfaceC1412WR interfaceC1412WR2 = (InterfaceC1412WR) c10910rT1.f41679c;
                    interfaceC1412WR2.getClass();
                    interfaceC1412WR2.mo740g(jM24383t, j3);
                    this.f37577i = false;
                }
                while (true) {
                    long j4 = jM24383t;
                    while (iMo738d == 0 && !this.f37576h) {
                        try {
                            C0328FC c0328fc = this.f37574f;
                            synchronized (c0328fc) {
                                while (!c0328fc.f3086a) {
                                    c0328fc.wait();
                                }
                            }
                            C10910rT1 c10910rT12 = this.f37572d;
                            C1164SV c1164sv = this.f37575g;
                            InterfaceC1412WR interfaceC1412WR3 = (InterfaceC1412WR) c10910rT12.f41679c;
                            interfaceC1412WR3.getClass();
                            C7000vF c7000vF = (C7000vF) c10910rT12.f41680d;
                            c7000vF.getClass();
                            iMo738d = interfaceC1412WR3.mo738d(c7000vF, c1164sv);
                            jM24383t = this.f37572d.m24383t();
                            if (jM24383t > this.f37582n.f39938i + j4) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f37574f.m2549d();
                    C10623pE0 c10623pE03 = this.f37582n;
                    c10623pE03.f39945p.post(c10623pE03.f39944o);
                }
                if (iMo738d == 1) {
                    iMo738d = 0;
                } else if (this.f37572d.m24383t() != -1) {
                    this.f37575g.f10814a = this.f37572d.m24383t();
                }
                AbstractC9770iZ1.m19065b(this.f37571c);
            } catch (Throwable th) {
                if (iMo738d != 1 && this.f37572d.m24383t() != -1) {
                    this.f37575g.f10814a = this.f37572d.m24383t();
                }
                AbstractC9770iZ1.m19065b(this.f37571c);
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: s */
    public final void mo402s() {
        this.f37576h = true;
    }
}
