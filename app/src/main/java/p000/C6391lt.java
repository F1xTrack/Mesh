package p000;

/* renamed from: lt */
/* loaded from: classes.dex */
public final class C6391lt implements InterfaceC11973zp0, InterfaceC11846yp0 {

    /* renamed from: a */
    public final InterfaceC11973zp0 f37332a;

    /* renamed from: b */
    public InterfaceC11846yp0 f37333b;

    /* renamed from: c */
    public C6328kt[] f37334c = new C6328kt[0];

    /* renamed from: d */
    public long f37335d;

    /* renamed from: e */
    public long f37336e;

    /* renamed from: f */
    public long f37337f;

    /* renamed from: g */
    public C6517nt f37338g;

    public C6391lt(InterfaceC11973zp0 interfaceC11973zp0, boolean z, long j, long j2) {
        this.f37332a = interfaceC11973zp0;
        this.f37335d = z ? j : -9223372036854775807L;
        this.f37336e = j;
        this.f37337f = j2;
    }

    @Override // p000.InterfaceC11846yp0
    /* renamed from: a */
    public final void mo1876a(InterfaceC11973zp0 interfaceC11973zp0) {
        if (this.f37338g != null) {
            return;
        }
        InterfaceC11846yp0 interfaceC11846yp0 = this.f37333b;
        interfaceC11846yp0.getClass();
        interfaceC11846yp0.mo1876a(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: b */
    public final long mo1877b(long j, DX0 dx0) {
        long j2 = this.f37336e;
        if (j == j2) {
            return j2;
        }
        long jM1826k = AbstractC7485Dh1.m1826k(dx0.f2040a, 0L, j - j2);
        long j3 = this.f37337f;
        long jM1826k2 = AbstractC7485Dh1.m1826k(dx0.f2041b, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jM1826k != dx0.f2040a || jM1826k2 != dx0.f2041b) {
            dx0 = new DX0(jM1826k, jM1826k2);
        }
        return this.f37332a.mo1877b(j, dx0);
    }

    /* renamed from: c */
    public final boolean m22570c() {
        return this.f37335d != -9223372036854775807L;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:195:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0124  */
    @Override // p000.InterfaceC11973zp0
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo1879d(p000.InterfaceC6237jR[] r16, boolean[] r17, p000.InterfaceC9121dV0[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6391lt.mo1879d(jR[], boolean[], dV0[], boolean[], long):long");
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        long jMo1880e = this.f37332a.mo1880e();
        if (jMo1880e != Long.MIN_VALUE) {
            long j = this.f37337f;
            if (j == Long.MIN_VALUE || jMo1880e < j) {
                return jMo1880e;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: g */
    public final void mo1881g() throws C6517nt {
        C6517nt c6517nt = this.f37338g;
        if (c6517nt != null) {
            throw c6517nt;
        }
        this.f37332a.mo1881g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0033  */
    @Override // p000.InterfaceC11973zp0
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo1882h(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f37335d = r0
            kt[] r0 = r5.f37334c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f36741b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            zp0 r0 = r5.f37332a
            long r0 = r0.mo1882h(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f37336e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f37337f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            p000.YN1.m9281f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6391lt.mo1882h(long):long");
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: i */
    public final void mo1883i(long j) {
        this.f37332a.mo1883i(j);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        return this.f37332a.mo1884l();
    }

    @Override // p000.InterfaceC9383fY0
    /* renamed from: m */
    public final void mo1885m(InterfaceC9511gY0 interfaceC9511gY0) {
        InterfaceC11846yp0 interfaceC11846yp0 = this.f37333b;
        interfaceC11846yp0.getClass();
        interfaceC11846yp0.mo1885m(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: n */
    public final long mo1886n() {
        if (m22570c()) {
            long j = this.f37335d;
            this.f37335d = -9223372036854775807L;
            long jMo1886n = mo1886n();
            return jMo1886n != -9223372036854775807L ? jMo1886n : j;
        }
        long jMo1886n2 = this.f37332a.mo1886n();
        if (jMo1886n2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        YN1.m9281f(jMo1886n2 >= this.f37336e);
        long j2 = this.f37337f;
        YN1.m9281f(j2 == Long.MIN_VALUE || jMo1886n2 <= j2);
        return jMo1886n2;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: o */
    public final void mo1887o(InterfaceC11846yp0 interfaceC11846yp0, long j) {
        this.f37333b = interfaceC11846yp0;
        this.f37332a.mo1887o(this, j);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: q */
    public final C8201Rb1 mo1888q() {
        return this.f37332a.mo1888q();
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        return this.f37332a.mo1889r(c11455vk0);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        long jMo1890s = this.f37332a.mo1890s();
        if (jMo1890s != Long.MIN_VALUE) {
            long j = this.f37337f;
            if (j == Long.MIN_VALUE || jMo1890s < j) {
                return jMo1890s;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        this.f37332a.mo1891t(j);
    }
}
