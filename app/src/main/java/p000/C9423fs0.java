package p000;

import android.util.Pair;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: fs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9423fs0 implements GX0 {

    /* renamed from: a */
    public final long[] f27440a;

    /* renamed from: b */
    public final long[] f27441b;

    /* renamed from: c */
    public final long f27442c;

    public C9423fs0(long j, long[] jArr, long[] jArr2) {
        this.f27440a = jArr;
        this.f27441b = jArr2;
        this.f27442c = j == -9223372036854775807L ? AbstractC7485Dh1.m1802Q(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: b */
    public static Pair m18301b(long j, long[] jArr, long[] jArr2) {
        int iM1821f = AbstractC7485Dh1.m1821f(jArr, j, true);
        long j2 = jArr[iM1821f];
        long j3 = jArr2[iM1821f];
        int i = iM1821f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? ConfigValue.DOUBLE_DEFAULT_VALUE : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p000.GX0
    /* renamed from: a */
    public final long mo927a(long j) {
        return AbstractC7485Dh1.m1802Q(((Long) m18301b(j, this.f27440a, this.f27441b).second).longValue());
    }

    @Override // p000.GX0
    /* renamed from: c */
    public final long mo928c() {
        return -1L;
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        return true;
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        Pair pairM18301b = m18301b(AbstractC7485Dh1.m1819d0(AbstractC7485Dh1.m1826k(j, 0L, this.f27442c)), this.f27441b, this.f27440a);
        EX0 ex0 = new EX0(AbstractC7485Dh1.m1802Q(((Long) pairM18301b.first).longValue()), ((Long) pairM18301b.second).longValue());
        return new BX0(ex0, ex0);
    }

    @Override // p000.GX0
    /* renamed from: j */
    public final int mo929j() {
        return -2147483647;
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        return this.f27442c;
    }
}
