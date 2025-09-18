package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class NX0 extends LX0 {
    public final C1857Xo1 j;
    public final C1857Xo1 k;
    public final long l;

    public NX0(C3939gJ0 c3939gJ0, long j, long j2, long j3, long j4, long j5, List list, long j6, C1857Xo1 c1857Xo1, C1857Xo1 c1857Xo12, long j7, long j8) {
        super(c3939gJ0, j, j2, j3, j5, list, j6, j7, j8);
        this.j = c1857Xo1;
        this.k = c1857Xo12;
        this.l = j4;
    }

    @Override // defpackage.QX0
    public final C3939gJ0 a(AbstractC6458pR0 abstractC6458pR0) {
        C1857Xo1 c1857Xo1 = this.j;
        if (c1857Xo1 == null) {
            return this.a;
        }
        C6666qX c6666qX = abstractC6458pR0.a;
        return new C3939gJ0(0L, -1L, c1857Xo1.o(c6666qX.a, 0L, c6666qX.i, 0L));
    }

    @Override // defpackage.LX0
    public final long d(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = AbstractC4201hh.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.LX0
    public final C3939gJ0 h(C6076nR0 c6076nR0, long j) {
        long j2 = this.d;
        List list = this.f;
        long j3 = list != null ? ((OX0) list.get((int) (j - j2))).a : (j - j2) * this.e;
        C6666qX c6666qX = c6076nR0.a;
        return new C3939gJ0(0L, -1L, this.k.o(c6666qX.a, j, c6666qX.i, j3));
    }
}
