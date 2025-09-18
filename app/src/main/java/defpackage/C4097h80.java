package defpackage;

import java.math.RoundingMode;

/* renamed from: h80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4097h80 implements GX0 {
    public final long a;
    public final C1204Pf b;
    public final C1204Pf c;
    public final int d;
    public long e;

    public C4097h80(long j, long j2, long j3) {
        this.e = j;
        this.a = j3;
        C1204Pf c1204Pf = new C1204Pf(10, (byte) 0);
        this.b = c1204Pf;
        C1204Pf c1204Pf2 = new C1204Pf(10, (byte) 0);
        this.c = c1204Pf2;
        c1204Pf.c(0L);
        c1204Pf2.c(j2);
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.d = -2147483647;
            return;
        }
        long jY = AbstractC0277Dh1.Y(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (jY > 0 && jY <= 2147483647L) {
            i = (int) jY;
        }
        this.d = i;
    }

    @Override // defpackage.GX0
    public final long a(long j) {
        return this.b.h(AbstractC0277Dh1.c(this.c, j));
    }

    public final boolean b(long j) {
        C1204Pf c1204Pf = this.b;
        return j - c1204Pf.h(c1204Pf.b - 1) < 100000;
    }

    @Override // defpackage.GX0
    public final long c() {
        return this.a;
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return true;
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        C1204Pf c1204Pf = this.b;
        int iC = AbstractC0277Dh1.c(c1204Pf, j);
        long jH = c1204Pf.h(iC);
        C1204Pf c1204Pf2 = this.c;
        EX0 ex0 = new EX0(jH, c1204Pf2.h(iC));
        if (jH == j || iC == c1204Pf.b - 1) {
            return new BX0(ex0, ex0);
        }
        int i = iC + 1;
        return new BX0(ex0, new EX0(c1204Pf.h(i), c1204Pf2.h(i)));
    }

    @Override // defpackage.GX0
    public final int j() {
        return this.d;
    }

    @Override // defpackage.CX0
    public final long k() {
        return this.e;
    }
}
