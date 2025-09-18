package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: iY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4367iY1 {
    public final C5716lY1 a;
    public int b = 1;
    public long c = a();

    public C4367iY1(C5716lY1 c5716lY1) {
        this.a = c5716lY1;
    }

    public final long a() {
        C5716lY1 c5716lY1 = this.a;
        Preconditions.checkNotNull(c5716lY1);
        long jLongValue = ((Long) IB1.u.a(null)).longValue();
        long jLongValue2 = ((Long) IB1.v.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue <<= 1;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return Math.min(jLongValue, jLongValue2) + c5716lY1.zzb().currentTimeMillis();
    }
}
