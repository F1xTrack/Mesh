package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: iY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9768iY1 {

    /* renamed from: a */
    public final C10152lY1 f29314a;

    /* renamed from: b */
    public int f29315b = 1;

    /* renamed from: c */
    public long f29316c = m19061a();

    public C9768iY1(C10152lY1 c10152lY1) {
        this.f29314a = c10152lY1;
    }

    /* renamed from: a */
    public final long m19061a() {
        C10152lY1 c10152lY1 = this.f29314a;
        Preconditions.checkNotNull(c10152lY1);
        long jLongValue = ((Long) IB1.f4826u.m3028a(null)).longValue();
        long jLongValue2 = ((Long) IB1.f4828v.m3028a(null)).longValue();
        for (int i = 1; i < this.f29315b; i++) {
            jLongValue <<= 1;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return Math.min(jLongValue, jLongValue2) + c10152lY1.zzb().currentTimeMillis();
    }
}
