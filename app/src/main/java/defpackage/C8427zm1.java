package defpackage;

import java.math.RoundingMode;

/* renamed from: zm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8427zm1 implements CX0 {
    public final K9 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public C8427zm1(K9 k9, int i, long j, long j2) {
        this.a = k9;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / k9.d;
        this.d = j3;
        this.e = b(j3);
    }

    public final long b(long j) {
        long j2 = j * this.b;
        long j3 = this.a.c;
        int i = AbstractC0277Dh1.a;
        return AbstractC0277Dh1.Y(j2, 1000000L, j3, RoundingMode.FLOOR);
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return true;
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        K9 k9 = this.a;
        long j2 = this.d;
        long jK = AbstractC0277Dh1.k((k9.c * j) / (this.b * 1000000), 0L, j2 - 1);
        long j3 = this.c;
        long jB = b(jK);
        EX0 ex0 = new EX0(jB, (k9.d * jK) + j3);
        if (jB >= j || jK == j2 - 1) {
            return new BX0(ex0, ex0);
        }
        long j4 = jK + 1;
        return new BX0(ex0, new EX0(b(j4), (k9.d * j4) + j3));
    }

    @Override // defpackage.CX0
    public final long k() {
        return this.e;
    }
}
