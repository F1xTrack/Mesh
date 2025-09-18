package p000;

/* loaded from: classes2.dex */
public final class JF0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public int f5420b;

    /* renamed from: c */
    public int f5421c;

    /* renamed from: d */
    public int f5422d;

    /* renamed from: e */
    public KF0 f5423e;

    /* renamed from: f */
    public int f5424f;

    /* renamed from: g */
    public int f5425g;

    /* renamed from: h */
    public LF0 f5426h;

    /* renamed from: l */
    public static JF0 m4263l() {
        JF0 jf0 = new JF0();
        jf0.f5423e = KF0.ERROR;
        jf0.f5426h = LF0.LANGUAGE_VERSION;
        return jf0;
    }

    public final Object clone() {
        JF0 jf0M4263l = m4263l();
        jf0M4263l.m4265m(m4264k());
        return jf0M4263l;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        MF0 mf0M4264k = m4264k();
        if (mf0M4264k.mo131e()) {
            return mf0M4264k;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r2, p000.C0217DR r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            xd0 r0 = p000.MF0.f7062l     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            MF0 r0 = new MF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.m4265m(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            K0 r0 = r2.f14178a     // Catch: java.lang.Throwable -> Lf
            MF0 r0 = (p000.MF0) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.m4265m(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.JF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m4265m((MF0) a00);
        return this;
    }

    /* renamed from: k */
    public final MF0 m4264k() {
        MF0 mf0 = new MF0(this);
        int i = this.f5420b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        mf0.f7065c = this.f5421c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        mf0.f7066d = this.f5422d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        mf0.f7067e = this.f5423e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        mf0.f7068f = this.f5424f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        mf0.f7069g = this.f5425g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        mf0.f7070h = this.f5426h;
        mf0.f7064b = i2;
        return mf0;
    }

    /* renamed from: m */
    public final void m4265m(MF0 mf0) {
        if (mf0 == MF0.f7061k) {
            return;
        }
        int i = mf0.f7064b;
        if ((i & 1) == 1) {
            int i2 = mf0.f7065c;
            this.f5420b = 1 | this.f5420b;
            this.f5421c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = mf0.f7066d;
            this.f5420b = 2 | this.f5420b;
            this.f5422d = i3;
        }
        if ((i & 4) == 4) {
            KF0 kf0 = mf0.f7067e;
            kf0.getClass();
            this.f5420b = 4 | this.f5420b;
            this.f5423e = kf0;
        }
        int i4 = mf0.f7064b;
        if ((i4 & 8) == 8) {
            int i5 = mf0.f7068f;
            this.f5420b = 8 | this.f5420b;
            this.f5424f = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = mf0.f7069g;
            this.f5420b = 16 | this.f5420b;
            this.f5425g = i6;
        }
        if ((i4 & 32) == 32) {
            LF0 lf0 = mf0.f7070h;
            lf0.getClass();
            this.f5420b = 32 | this.f5420b;
            this.f5426h = lf0;
        }
        this.f41281a = this.f41281a.m3573d(mf0.f7063a);
    }
}
