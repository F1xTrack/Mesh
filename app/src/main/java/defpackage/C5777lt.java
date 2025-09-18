package defpackage;

/* renamed from: lt */
/* loaded from: classes.dex */
public final class C5777lt implements InterfaceC8435zp0, InterfaceC8245yp0 {
    public final InterfaceC8435zp0 a;
    public InterfaceC8245yp0 b;
    public C5586kt[] c = new C5586kt[0];
    public long d;
    public long e;
    public long f;
    public C6159nt g;

    public C5777lt(InterfaceC8435zp0 interfaceC8435zp0, boolean z, long j, long j2) {
        this.a = interfaceC8435zp0;
        this.d = z ? j : -9223372036854775807L;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.InterfaceC8245yp0
    public final void a(InterfaceC8435zp0 interfaceC8435zp0) {
        if (this.g != null) {
            return;
        }
        InterfaceC8245yp0 interfaceC8245yp0 = this.b;
        interfaceC8245yp0.getClass();
        interfaceC8245yp0.a(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long b(long j, DX0 dx0) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        long jK = AbstractC0277Dh1.k(dx0.a, 0L, j - j2);
        long j3 = this.f;
        long jK2 = AbstractC0277Dh1.k(dx0.b, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jK != dx0.a || jK2 != dx0.b) {
            dx0 = new DX0(jK, jK2);
        }
        return this.a.b(j, dx0);
    }

    public final boolean c() {
        return this.d != -9223372036854775807L;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:195:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0124  */
    @Override // defpackage.InterfaceC8435zp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(defpackage.InterfaceC5311jR[] r16, boolean[] r17, defpackage.InterfaceC3403dV0[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5777lt.d(jR[], boolean[], dV0[], boolean[], long):long");
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        long jE = this.a.e();
        if (jE != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jE < j) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void g() throws C6159nt {
        C6159nt c6159nt = this.g;
        if (c6159nt != null) {
            throw c6159nt;
        }
        this.a.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0033  */
    @Override // defpackage.InterfaceC8435zp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.d = r0
            kt[] r0 = r5.c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            zp0 r0 = r5.a
            long r0 = r0.h(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            defpackage.YN1.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5777lt.h(long):long");
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void i(long j) {
        this.a.i(j);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.InterfaceC3793fY0
    public final void m(InterfaceC3984gY0 interfaceC3984gY0) {
        InterfaceC8245yp0 interfaceC8245yp0 = this.b;
        interfaceC8245yp0.getClass();
        interfaceC8245yp0.m(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long n() {
        if (c()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long jN = n();
            return jN != -9223372036854775807L ? jN : j;
        }
        long jN2 = this.a.n();
        if (jN2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        YN1.f(jN2 >= this.e);
        long j2 = this.f;
        YN1.f(j2 == Long.MIN_VALUE || jN2 <= j2);
        return jN2;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void o(InterfaceC8245yp0 interfaceC8245yp0, long j) {
        this.b = interfaceC8245yp0;
        this.a.o(this, j);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final C1350Rb1 q() {
        return this.a.q();
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        return this.a.r(c7660vk0);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        long jS = this.a.s();
        if (jS != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jS < j) {
                return jS;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        this.a.t(j);
    }
}
