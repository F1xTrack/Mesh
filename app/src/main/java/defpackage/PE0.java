package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class PE0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public final /* synthetic */ int b;
    public int c;
    public Object d;
    public int e;

    public /* synthetic */ PE0(int i) {
        this.b = i;
    }

    public static PE0 n() {
        PE0 pe0 = new PE0(1);
        pe0.d = Collections.emptyList();
        pe0.e = -1;
        return pe0;
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                PE0 pe0 = new PE0(0);
                pe0.d = Collections.emptyList();
                pe0.p(l());
                return pe0;
            case 1:
                PE0 pe0N = n();
                pe0N.q(m());
                return pe0N;
            default:
                PE0 pe02 = new PE0(2);
                pe02.d = NE0.p;
                pe02.o(k());
                return pe02;
        }
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        switch (this.b) {
            case 0:
                QE0 qe0L = l();
                if (qe0L.e()) {
                    return qe0L;
                }
                throw new C7074sg();
            case 1:
                GF0 gf0M = m();
                if (gf0M.e()) {
                    return gf0M;
                }
                throw new C7074sg();
            default:
                OE0 oe0K = k();
                if (oe0K.e()) {
                    return oe0K;
                }
                throw new C7074sg();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x003f  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r3, defpackage.DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.b
            switch(r0) {
                case 0: goto L43;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            xd0 r1 = defpackage.OE0.h     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            OE0 r1 = new OE0     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            r2.o(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> L14
            OE0 r4 = (defpackage.OE0) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.o(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            xd0 r1 = defpackage.GF0.h     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            GF0 r1 = new GF0     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            r2.q(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> L33
            GF0 r4 = (defpackage.GF0) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.q(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            xd0 r1 = defpackage.QE0.h     // Catch: java.lang.Throwable -> L50 defpackage.Y90 -> L52
            java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> L50 defpackage.Y90 -> L52
            QE0 r3 = (defpackage.QE0) r3     // Catch: java.lang.Throwable -> L50 defpackage.Y90 -> L52
            r2.p(r3)
            return r2
        L50:
            r3 = move-exception
            goto L5a
        L52:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> L50
            QE0 r4 = (defpackage.QE0) r4     // Catch: java.lang.Throwable -> L50
            throw r3     // Catch: java.lang.Throwable -> L58
        L58:
            r3 = move-exception
            r0 = r4
        L5a:
            if (r0 == 0) goto L5f
            r2.p(r0)
        L5f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PE0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        switch (this.b) {
            case 0:
                p((QE0) a00);
                break;
            case 1:
                q((GF0) a00);
                break;
            default:
                o((OE0) a00);
                break;
        }
        return this;
    }

    public OE0 k() {
        OE0 oe0 = new OE0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        oe0.c = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        oe0.d = (NE0) this.d;
        oe0.b = i2;
        return oe0;
    }

    public QE0 l() {
        QE0 qe0 = new QE0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        qe0.c = this.e;
        if ((i & 2) == 2) {
            this.d = Collections.unmodifiableList((List) this.d);
            this.c &= -3;
        }
        qe0.d = (List) this.d;
        qe0.b = i2;
        return qe0;
    }

    public GF0 m() {
        GF0 gf0 = new GF0(this);
        int i = this.c;
        if ((i & 1) == 1) {
            this.d = Collections.unmodifiableList((List) this.d);
            this.c &= -2;
        }
        gf0.c = (List) this.d;
        int i2 = (i & 2) != 2 ? 0 : 1;
        gf0.d = this.e;
        gf0.b = i2;
        return gf0;
    }

    public void o(OE0 oe0) {
        NE0 ne0;
        if (oe0 == OE0.g) {
            return;
        }
        int i = oe0.b;
        if ((i & 1) == 1) {
            int i2 = oe0.c;
            this.c = 1 | this.c;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            NE0 ne02 = oe0.d;
            if ((this.c & 2) != 2 || (ne0 = (NE0) this.d) == NE0.p) {
                this.d = ne02;
            } else {
                LE0 le0L = LE0.l();
                le0L.m(ne0);
                le0L.m(ne02);
                this.d = le0L.k();
            }
            this.c |= 2;
        }
        this.a = this.a.d(oe0.a);
    }

    public void p(QE0 qe0) {
        if (qe0 == QE0.g) {
            return;
        }
        if ((qe0.b & 1) == 1) {
            int i = qe0.c;
            this.c = 1 | this.c;
            this.e = i;
        }
        if (!qe0.d.isEmpty()) {
            if (((List) this.d).isEmpty()) {
                this.d = qe0.d;
                this.c &= -3;
            } else {
                if ((this.c & 2) != 2) {
                    this.d = new ArrayList((List) this.d);
                    this.c |= 2;
                }
                ((List) this.d).addAll(qe0.d);
            }
        }
        this.a = this.a.d(qe0.a);
    }

    public void q(GF0 gf0) {
        if (gf0 == GF0.g) {
            return;
        }
        if (!gf0.c.isEmpty()) {
            if (((List) this.d).isEmpty()) {
                this.d = gf0.c;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList((List) this.d);
                    this.c |= 1;
                }
                ((List) this.d).addAll(gf0.c);
            }
        }
        if ((gf0.b & 1) == 1) {
            int i = gf0.d;
            this.c |= 2;
            this.e = i;
        }
        this.a = this.a.d(gf0.a);
    }
}
