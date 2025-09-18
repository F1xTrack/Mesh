package defpackage;

/* loaded from: classes2.dex */
public final class JF0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public int b;
    public int c;
    public int d;
    public KF0 e;
    public int f;
    public int g;
    public LF0 h;

    public static JF0 l() {
        JF0 jf0 = new JF0();
        jf0.e = KF0.ERROR;
        jf0.h = LF0.LANGUAGE_VERSION;
        return jf0;
    }

    public final Object clone() {
        JF0 jf0L = l();
        jf0L.m(k());
        return jf0L;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        MF0 mf0K = k();
        if (mf0K.e()) {
            return mf0K;
        }
        throw new C7074sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r2, defpackage.DR r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            xd0 r0 = defpackage.MF0.l     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            MF0 r0 = new MF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.m(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            K0 r0 = r2.a     // Catch: java.lang.Throwable -> Lf
            MF0 r0 = (defpackage.MF0) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.m(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((MF0) a00);
        return this;
    }

    public final MF0 k() {
        MF0 mf0 = new MF0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        mf0.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        mf0.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        mf0.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        mf0.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        mf0.g = this.g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        mf0.h = this.h;
        mf0.b = i2;
        return mf0;
    }

    public final void m(MF0 mf0) {
        if (mf0 == MF0.k) {
            return;
        }
        int i = mf0.b;
        if ((i & 1) == 1) {
            int i2 = mf0.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = mf0.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            KF0 kf0 = mf0.e;
            kf0.getClass();
            this.b = 4 | this.b;
            this.e = kf0;
        }
        int i4 = mf0.b;
        if ((i4 & 8) == 8) {
            int i5 = mf0.f;
            this.b = 8 | this.b;
            this.f = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = mf0.g;
            this.b = 16 | this.b;
            this.g = i6;
        }
        if ((i4 & 32) == 32) {
            LF0 lf0 = mf0.h;
            lf0.getClass();
            this.b = 32 | this.b;
            this.h = lf0;
        }
        this.a = this.a.d(mf0.a);
    }
}
