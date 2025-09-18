package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: op1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6340op1 implements GX0 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public C6340op1(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.GX0
    public final long a(long j) {
        long j2 = j - this.a;
        if (!e() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        YN1.h(jArr);
        double d = (j2 * 256.0d) / this.e;
        int iF = AbstractC0277Dh1.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (iF * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iF == 99 ? 256L : jArr[i]) ? ConfigValue.DOUBLE_DEFAULT_VALUE : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.GX0
    public final long c() {
        return this.f;
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return this.g != null;
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        double d;
        boolean zE = e();
        int i = this.b;
        long j2 = this.a;
        if (!zE) {
            EX0 ex0 = new EX0(0L, j2 + i);
            return new BX0(ex0, ex0);
        }
        long jK = AbstractC0277Dh1.k(j, 0L, this.c);
        double d2 = (jK * 100.0d) / this.c;
        double d3 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (d2 <= ConfigValue.DOUBLE_DEFAULT_VALUE) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = this.g;
            YN1.h(jArr);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - i2)) + d4;
            d = 256.0d;
        }
        double d5 = d3 / d;
        long j3 = this.e;
        EX0 ex02 = new EX0(jK, j2 + AbstractC0277Dh1.k(Math.round(d5 * j3), i, j3 - 1));
        return new BX0(ex02, ex02);
    }

    @Override // defpackage.GX0
    public final int j() {
        return this.d;
    }

    @Override // defpackage.CX0
    public final long k() {
        return this.c;
    }
}
