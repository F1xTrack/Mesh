package defpackage;

/* renamed from: Bd0 */
/* loaded from: classes2.dex */
public final class C0108Bd0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public int b;
    public C8399zd0 c;
    public C0030Ad0 d;
    public C0030Ad0 e;
    public C0030Ad0 f;
    public C0030Ad0 g;

    public static C0108Bd0 l() {
        C0108Bd0 c0108Bd0 = new C0108Bd0();
        c0108Bd0.c = C8399zd0.g;
        C0030Ad0 c0030Ad0 = C0030Ad0.g;
        c0108Bd0.d = c0030Ad0;
        c0108Bd0.e = c0030Ad0;
        c0108Bd0.f = c0030Ad0;
        c0108Bd0.g = c0030Ad0;
        return c0108Bd0;
    }

    public final Object clone() {
        C0108Bd0 c0108Bd0L = l();
        c0108Bd0L.m(k());
        return c0108Bd0L;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C0186Cd0 c0186Cd0K = k();
        if (c0186Cd0K.e()) {
            return c0186Cd0K;
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
            xd0 r1 = defpackage.C0186Cd0.k     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            Cd0 r1 = new Cd0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            Cd0 r4 = (defpackage.C0186Cd0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0108Bd0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((C0186Cd0) a00);
        return this;
    }

    public final C0186Cd0 k() {
        C0186Cd0 c0186Cd0 = new C0186Cd0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0186Cd0.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c0186Cd0.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c0186Cd0.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c0186Cd0.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c0186Cd0.g = this.g;
        c0186Cd0.b = i2;
        return c0186Cd0;
    }

    public final void m(C0186Cd0 c0186Cd0) {
        C0030Ad0 c0030Ad0;
        C0030Ad0 c0030Ad02;
        C0030Ad0 c0030Ad03;
        C0030Ad0 c0030Ad04;
        C8399zd0 c8399zd0;
        if (c0186Cd0 == C0186Cd0.j) {
            return;
        }
        if ((c0186Cd0.b & 1) == 1) {
            C8399zd0 c8399zd02 = c0186Cd0.c;
            if ((this.b & 1) != 1 || (c8399zd0 = this.c) == C8399zd0.g) {
                this.c = c8399zd02;
            } else {
                C8209yd0 c8209yd0 = new C8209yd0(0);
                c8209yd0.m(c8399zd0);
                c8209yd0.m(c8399zd02);
                this.c = c8209yd0.k();
            }
            this.b |= 1;
        }
        if ((c0186Cd0.b & 2) == 2) {
            C0030Ad0 c0030Ad05 = c0186Cd0.d;
            if ((this.b & 2) != 2 || (c0030Ad04 = this.d) == C0030Ad0.g) {
                this.d = c0030Ad05;
            } else {
                C8209yd0 c8209yd0I = C0030Ad0.i(c0030Ad04);
                c8209yd0I.n(c0030Ad05);
                this.d = c8209yd0I.l();
            }
            this.b |= 2;
        }
        if ((c0186Cd0.b & 4) == 4) {
            C0030Ad0 c0030Ad06 = c0186Cd0.e;
            if ((this.b & 4) != 4 || (c0030Ad03 = this.e) == C0030Ad0.g) {
                this.e = c0030Ad06;
            } else {
                C8209yd0 c8209yd0I2 = C0030Ad0.i(c0030Ad03);
                c8209yd0I2.n(c0030Ad06);
                this.e = c8209yd0I2.l();
            }
            this.b |= 4;
        }
        if ((c0186Cd0.b & 8) == 8) {
            C0030Ad0 c0030Ad07 = c0186Cd0.f;
            if ((this.b & 8) != 8 || (c0030Ad02 = this.f) == C0030Ad0.g) {
                this.f = c0030Ad07;
            } else {
                C8209yd0 c8209yd0I3 = C0030Ad0.i(c0030Ad02);
                c8209yd0I3.n(c0030Ad07);
                this.f = c8209yd0I3.l();
            }
            this.b |= 8;
        }
        if ((c0186Cd0.b & 16) == 16) {
            C0030Ad0 c0030Ad08 = c0186Cd0.g;
            if ((this.b & 16) != 16 || (c0030Ad0 = this.g) == C0030Ad0.g) {
                this.g = c0030Ad08;
            } else {
                C8209yd0 c8209yd0I4 = C0030Ad0.i(c0030Ad0);
                c8209yd0I4.n(c0030Ad08);
                this.g = c8209yd0I4.l();
            }
            this.b |= 16;
        }
        this.a = this.a.d(c0186Cd0.a);
    }
}
