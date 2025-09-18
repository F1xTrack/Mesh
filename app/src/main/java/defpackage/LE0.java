package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class LE0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public int b;
    public ME0 c;
    public long d;
    public float e;
    public double f;
    public int g;
    public int h;
    public int i;
    public QE0 j;
    public List k;
    public int l;
    public int m;

    public static LE0 l() {
        LE0 le0 = new LE0();
        le0.c = ME0.BYTE;
        le0.j = QE0.g;
        le0.k = Collections.emptyList();
        return le0;
    }

    public final Object clone() {
        LE0 le0L = l();
        le0L.m(k());
        return le0L;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        NE0 ne0K = k();
        if (ne0K.e()) {
            return ne0K;
        }
        throw new C7074sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r3, defpackage.DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = defpackage.NE0.q     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            NE0 r1 = new NE0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            NE0 r4 = (defpackage.NE0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LE0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((NE0) a00);
        return this;
    }

    public final NE0 k() {
        NE0 ne0 = new NE0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ne0.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ne0.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ne0.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ne0.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ne0.g = this.g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        ne0.h = this.h;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        ne0.i = this.i;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        ne0.j = this.j;
        if ((i & 256) == 256) {
            this.k = Collections.unmodifiableList(this.k);
            this.b &= -257;
        }
        ne0.k = this.k;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        ne0.l = this.l;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        ne0.m = this.m;
        ne0.b = i2;
        return ne0;
    }

    public final void m(NE0 ne0) {
        QE0 qe0;
        if (ne0 == NE0.p) {
            return;
        }
        if ((ne0.b & 1) == 1) {
            ME0 me0 = ne0.c;
            me0.getClass();
            this.b = 1 | this.b;
            this.c = me0;
        }
        int i = ne0.b;
        if ((i & 2) == 2) {
            long j = ne0.d;
            this.b |= 2;
            this.d = j;
        }
        if ((i & 4) == 4) {
            float f = ne0.e;
            this.b = 4 | this.b;
            this.e = f;
        }
        if ((i & 8) == 8) {
            double d = ne0.f;
            this.b |= 8;
            this.f = d;
        }
        if ((i & 16) == 16) {
            int i2 = ne0.g;
            this.b = 16 | this.b;
            this.g = i2;
        }
        if ((i & 32) == 32) {
            int i3 = ne0.h;
            this.b = 32 | this.b;
            this.h = i3;
        }
        if ((i & 64) == 64) {
            int i4 = ne0.i;
            this.b = 64 | this.b;
            this.i = i4;
        }
        if ((i & 128) == 128) {
            QE0 qe02 = ne0.j;
            if ((this.b & 128) != 128 || (qe0 = this.j) == QE0.g) {
                this.j = qe02;
            } else {
                PE0 pe0 = new PE0(0);
                pe0.d = Collections.emptyList();
                pe0.p(qe0);
                pe0.p(qe02);
                this.j = pe0.l();
            }
            this.b |= 128;
        }
        if (!ne0.k.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = ne0.k;
                this.b &= -257;
            } else {
                if ((this.b & 256) != 256) {
                    this.k = new ArrayList(this.k);
                    this.b |= 256;
                }
                this.k.addAll(ne0.k);
            }
        }
        int i5 = ne0.b;
        if ((i5 & 256) == 256) {
            int i6 = ne0.l;
            this.b |= 512;
            this.l = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = ne0.m;
            this.b |= 1024;
            this.m = i7;
        }
        this.a = this.a.d(ne0.a);
    }
}
