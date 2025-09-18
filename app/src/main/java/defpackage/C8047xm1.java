package defpackage;

import java.math.RoundingMode;

/* renamed from: xm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8047xm1 implements InterfaceC7857wm1 {
    public final YR a;
    public final InterfaceC1584Ub1 b;
    public final K9 c;
    public final C6666qX d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public C8047xm1(YR yr, InterfaceC1584Ub1 interfaceC1584Ub1, K9 k9, String str, int i) throws C5643lA0 {
        this.a = yr;
        this.b = interfaceC1584Ub1;
        this.c = k9;
        int i2 = k9.e;
        int i3 = k9.b;
        int i4 = (i2 * i3) / 8;
        int i5 = k9.d;
        if (i5 != i4) {
            throw C5643lA0.a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = k9.c;
        int i7 = i6 * i4;
        int i8 = i7 * 8;
        int iMax = Math.max(i4, i7 / 10);
        this.e = iMax;
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n(str);
        c6475pX.g = i8;
        c6475pX.h = i8;
        c6475pX.m = iMax;
        c6475pX.z = i3;
        c6475pX.A = i6;
        c6475pX.B = i;
        this.d = new C6666qX(c6475pX);
    }

    @Override // defpackage.InterfaceC7857wm1
    public final boolean a(C7566vF c7566vF, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iE = this.b.e(c7566vF, (int) Math.min(i2 - i, j2), true);
            if (iE == -1) {
                j2 = 0;
            } else {
                this.g += iE;
                j2 -= iE;
            }
        }
        K9 k9 = this.c;
        int i3 = this.g;
        int i4 = k9.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = k9.c;
            int i6 = AbstractC0277Dh1.a;
            long jY = j3 + AbstractC0277Dh1.Y(j4, 1000000L, j5, RoundingMode.FLOOR);
            int i7 = i5 * i4;
            int i8 = this.g - i7;
            this.b.a(jY, 1, i7, i8, null);
            this.h += i5;
            this.g = i8;
        }
        return j2 <= 0;
    }

    @Override // defpackage.InterfaceC7857wm1
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.InterfaceC7857wm1
    public final void c(int i, long j) {
        this.a.x(new C8427zm1(this.c, 1, i, j));
        this.b.f(this.d);
    }
}
