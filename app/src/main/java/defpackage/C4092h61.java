package defpackage;

import java.io.EOFException;

/* renamed from: h61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4092h61 implements InterfaceC1584Ub1 {
    public final InterfaceC1584Ub1 a;
    public final InterfaceC2453c61 b;
    public InterfaceC3519e61 g;
    public C6666qX h;
    public int d = 0;
    public int e = 0;
    public byte[] f = AbstractC0277Dh1.f;
    public final C4103hA0 c = new C4103hA0();

    public C4092h61(InterfaceC1584Ub1 interfaceC1584Ub1, InterfaceC2453c61 interfaceC2453c61) {
        this.a = interfaceC1584Ub1;
        this.b = interfaceC2453c61;
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void a(long j, int i, int i2, int i3, C1506Tb1 c1506Tb1) {
        if (this.g == null) {
            this.a.a(j, i, i2, i3, c1506Tb1);
            return;
        }
        YN1.b("DRM on subtitles is not supported", c1506Tb1 == null);
        int i4 = (this.e - i3) - i2;
        this.g.m(this.f, i4, i2, C3329d61.c, new C6036nE(this, j, i));
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void b(C4103hA0 c4103hA0, int i, int i2) {
        if (this.g == null) {
            this.a.b(c4103hA0, i, i2);
            return;
        }
        g(i);
        c4103hA0.e(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int c(RC rc, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.c(rc, i, z);
        }
        g(i);
        int iR = rc.r(this.f, this.e, i);
        if (iR != -1) {
            this.e += iR;
            return iR;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final /* synthetic */ void d(int i, C4103hA0 c4103hA0) {
        F91.n(this, c4103hA0, i);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int e(RC rc, int i, boolean z) {
        return c(rc, i, z);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void f(C6666qX c6666qX) {
        c6666qX.m.getClass();
        String str = c6666qX.m;
        YN1.c(AbstractC1865Xr0.h(str) == 3);
        boolean zEquals = c6666qX.equals(this.h);
        InterfaceC2453c61 interfaceC2453c61 = this.b;
        if (!zEquals) {
            this.h = c6666qX;
            this.g = interfaceC2453c61.b(c6666qX) ? interfaceC2453c61.f(c6666qX) : null;
        }
        InterfaceC3519e61 interfaceC3519e61 = this.g;
        InterfaceC1584Ub1 interfaceC1584Ub1 = this.a;
        if (interfaceC3519e61 == null) {
            interfaceC1584Ub1.f(c6666qX);
            return;
        }
        C6475pX c6475pXA = c6666qX.a();
        c6475pXA.l = AbstractC1865Xr0.n("application/x-media3-cues");
        c6475pXA.i = str;
        c6475pXA.q = Long.MAX_VALUE;
        c6475pXA.F = interfaceC2453c61.h(c6666qX);
        F91.B(c6475pXA, interfaceC1584Ub1);
    }

    public final void g(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
