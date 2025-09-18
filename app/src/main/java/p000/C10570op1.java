package p000;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: op1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10570op1 implements GX0 {

    /* renamed from: a */
    public final long f39287a;

    /* renamed from: b */
    public final int f39288b;

    /* renamed from: c */
    public final long f39289c;

    /* renamed from: d */
    public final int f39290d;

    /* renamed from: e */
    public final long f39291e;

    /* renamed from: f */
    public final long f39292f;

    /* renamed from: g */
    public final long[] f39293g;

    public C10570op1(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f39287a = j;
        this.f39288b = i;
        this.f39289c = j2;
        this.f39290d = i2;
        this.f39291e = j3;
        this.f39293g = jArr;
        this.f39292f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // p000.GX0
    /* renamed from: a */
    public final long mo927a(long j) {
        long j2 = j - this.f39287a;
        if (!mo413e() || j2 <= this.f39288b) {
            return 0L;
        }
        long[] jArr = this.f39293g;
        YN1.m9283h(jArr);
        double d = (j2 * 256.0d) / this.f39291e;
        int iM1821f = AbstractC7485Dh1.m1821f(jArr, (long) d, true);
        long j3 = this.f39289c;
        long j4 = (iM1821f * j3) / 100;
        long j5 = jArr[iM1821f];
        int i = iM1821f + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iM1821f == 99 ? 256L : jArr[i]) ? ConfigValue.DOUBLE_DEFAULT_VALUE : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p000.GX0
    /* renamed from: c */
    public final long mo928c() {
        return this.f39292f;
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        return this.f39293g != null;
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        double d;
        boolean zMo413e = mo413e();
        int i = this.f39288b;
        long j2 = this.f39287a;
        if (!zMo413e) {
            EX0 ex0 = new EX0(0L, j2 + i);
            return new BX0(ex0, ex0);
        }
        long jM1826k = AbstractC7485Dh1.m1826k(j, 0L, this.f39289c);
        double d2 = (jM1826k * 100.0d) / this.f39289c;
        double d3 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (d2 <= ConfigValue.DOUBLE_DEFAULT_VALUE) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = this.f39293g;
            YN1.m9283h(jArr);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - i2)) + d4;
            d = 256.0d;
        }
        double d5 = d3 / d;
        long j3 = this.f39291e;
        EX0 ex02 = new EX0(jM1826k, j2 + AbstractC7485Dh1.m1826k(Math.round(d5 * j3), i, j3 - 1));
        return new BX0(ex02, ex02);
    }

    @Override // p000.GX0
    /* renamed from: j */
    public final int mo929j() {
        return this.f39290d;
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        return this.f39289c;
    }
}
