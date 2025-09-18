package defpackage;

import android.util.Pair;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: fs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3853fs0 implements GX0 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public C3853fs0(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? AbstractC0277Dh1.Q(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair b(long j, long[] jArr, long[] jArr2) {
        int iF = AbstractC0277Dh1.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? ConfigValue.DOUBLE_DEFAULT_VALUE : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.GX0
    public final long a(long j) {
        return AbstractC0277Dh1.Q(((Long) b(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.GX0
    public final long c() {
        return -1L;
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return true;
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        Pair pairB = b(AbstractC0277Dh1.d0(AbstractC0277Dh1.k(j, 0L, this.c)), this.b, this.a);
        EX0 ex0 = new EX0(AbstractC0277Dh1.Q(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new BX0(ex0, ex0);
    }

    @Override // defpackage.GX0
    public final int j() {
        return -2147483647;
    }

    @Override // defpackage.CX0
    public final long k() {
        return this.c;
    }
}
