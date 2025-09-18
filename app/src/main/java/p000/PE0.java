package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class PE0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public final /* synthetic */ int f8930b;

    /* renamed from: c */
    public int f8931c;

    /* renamed from: d */
    public Object f8932d;

    /* renamed from: e */
    public int f8933e;

    public /* synthetic */ PE0(int i) {
        this.f8930b = i;
    }

    /* renamed from: n */
    public static PE0 m6272n() {
        PE0 pe0 = new PE0(1);
        pe0.f8932d = Collections.emptyList();
        pe0.f8933e = -1;
        return pe0;
    }

    public final Object clone() {
        switch (this.f8930b) {
            case 0:
                PE0 pe0 = new PE0(0);
                pe0.f8932d = Collections.emptyList();
                pe0.m6277p(m6274l());
                return pe0;
            case 1:
                PE0 pe0M6272n = m6272n();
                pe0M6272n.m6278q(m6275m());
                return pe0M6272n;
            default:
                PE0 pe02 = new PE0(2);
                pe02.f8932d = NE0.f7652p;
                pe02.m6276o(m6273k());
                return pe02;
        }
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        switch (this.f8930b) {
            case 0:
                QE0 qe0M6274l = m6274l();
                if (qe0M6274l.mo131e()) {
                    return qe0M6274l;
                }
                throw new C6838sg();
            case 1:
                GF0 gf0M6275m = m6275m();
                if (gf0M6275m.mo131e()) {
                    return gf0M6275m;
                }
                throw new C6838sg();
            default:
                OE0 oe0M6273k = m6273k();
                if (oe0M6273k.mo131e()) {
                    return oe0M6273k;
                }
                throw new C6838sg();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x003f  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r3, p000.C0217DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f8930b
            switch(r0) {
                case 0: goto L43;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            xd0 r1 = p000.OE0.f8318h     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            OE0 r1 = new OE0     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            r2.m6276o(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> L14
            OE0 r4 = (p000.OE0) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.m6276o(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            xd0 r1 = p000.GF0.f3649h     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            GF0 r1 = new GF0     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            r2.m6278q(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> L33
            GF0 r4 = (p000.GF0) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.m6278q(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            xd0 r1 = p000.QE0.f9541h     // Catch: java.lang.Throwable -> L50 p000.Y90 -> L52
            java.lang.Object r3 = r1.mo21982a(r3, r4)     // Catch: java.lang.Throwable -> L50 p000.Y90 -> L52
            QE0 r3 = (p000.QE0) r3     // Catch: java.lang.Throwable -> L50 p000.Y90 -> L52
            r2.m6277p(r3)
            return r2
        L50:
            r3 = move-exception
            goto L5a
        L52:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> L50
            QE0 r4 = (p000.QE0) r4     // Catch: java.lang.Throwable -> L50
            throw r3     // Catch: java.lang.Throwable -> L58
        L58:
            r3 = move-exception
            r0 = r4
        L5a:
            if (r0 == 0) goto L5f
            r2.m6277p(r0)
        L5f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.PE0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        switch (this.f8930b) {
            case 0:
                m6277p((QE0) a00);
                break;
            case 1:
                m6278q((GF0) a00);
                break;
            default:
                m6276o((OE0) a00);
                break;
        }
        return this;
    }

    /* renamed from: k */
    public OE0 m6273k() {
        OE0 oe0 = new OE0(this);
        int i = this.f8931c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        oe0.f8321c = this.f8933e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        oe0.f8322d = (NE0) this.f8932d;
        oe0.f8320b = i2;
        return oe0;
    }

    /* renamed from: l */
    public QE0 m6274l() {
        QE0 qe0 = new QE0(this);
        int i = this.f8931c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        qe0.f9544c = this.f8933e;
        if ((i & 2) == 2) {
            this.f8932d = Collections.unmodifiableList((List) this.f8932d);
            this.f8931c &= -3;
        }
        qe0.f9545d = (List) this.f8932d;
        qe0.f9543b = i2;
        return qe0;
    }

    /* renamed from: m */
    public GF0 m6275m() {
        GF0 gf0 = new GF0(this);
        int i = this.f8931c;
        if ((i & 1) == 1) {
            this.f8932d = Collections.unmodifiableList((List) this.f8932d);
            this.f8931c &= -2;
        }
        gf0.f3652c = (List) this.f8932d;
        int i2 = (i & 2) != 2 ? 0 : 1;
        gf0.f3653d = this.f8933e;
        gf0.f3651b = i2;
        return gf0;
    }

    /* renamed from: o */
    public void m6276o(OE0 oe0) {
        NE0 ne0;
        if (oe0 == OE0.f8317g) {
            return;
        }
        int i = oe0.f8320b;
        if ((i & 1) == 1) {
            int i2 = oe0.f8321c;
            this.f8931c = 1 | this.f8931c;
            this.f8933e = i2;
        }
        if ((i & 2) == 2) {
            NE0 ne02 = oe0.f8322d;
            if ((this.f8931c & 2) != 2 || (ne0 = (NE0) this.f8932d) == NE0.f7652p) {
                this.f8932d = ne02;
            } else {
                LE0 le0M4929l = LE0.m4929l();
                le0M4929l.m4931m(ne0);
                le0M4929l.m4931m(ne02);
                this.f8932d = le0M4929l.m4930k();
            }
            this.f8931c |= 2;
        }
        this.f41281a = this.f41281a.m3573d(oe0.f8319a);
    }

    /* renamed from: p */
    public void m6277p(QE0 qe0) {
        if (qe0 == QE0.f9540g) {
            return;
        }
        if ((qe0.f9543b & 1) == 1) {
            int i = qe0.f9544c;
            this.f8931c = 1 | this.f8931c;
            this.f8933e = i;
        }
        if (!qe0.f9545d.isEmpty()) {
            if (((List) this.f8932d).isEmpty()) {
                this.f8932d = qe0.f9545d;
                this.f8931c &= -3;
            } else {
                if ((this.f8931c & 2) != 2) {
                    this.f8932d = new ArrayList((List) this.f8932d);
                    this.f8931c |= 2;
                }
                ((List) this.f8932d).addAll(qe0.f9545d);
            }
        }
        this.f41281a = this.f41281a.m3573d(qe0.f9542a);
    }

    /* renamed from: q */
    public void m6278q(GF0 gf0) {
        if (gf0 == GF0.f3648g) {
            return;
        }
        if (!gf0.f3652c.isEmpty()) {
            if (((List) this.f8932d).isEmpty()) {
                this.f8932d = gf0.f3652c;
                this.f8931c &= -2;
            } else {
                if ((this.f8931c & 1) != 1) {
                    this.f8932d = new ArrayList((List) this.f8932d);
                    this.f8931c |= 1;
                }
                ((List) this.f8932d).addAll(gf0.f3652c);
            }
        }
        if ((gf0.f3651b & 1) == 1) {
            int i = gf0.f3653d;
            this.f8931c |= 2;
            this.f8933e = i;
        }
        this.f41281a = this.f41281a.m3573d(gf0.f3650a);
    }
}
