package p000;

import java.util.Set;

/* renamed from: gy */
/* loaded from: classes.dex */
public final class C4149gy {

    /* renamed from: i */
    public static final C4149gy f28115i = new C4149gy(1, false, false, false, false, -1, -1, C1156SN.f10705a);

    /* renamed from: a */
    public final int f28116a;

    /* renamed from: b */
    public final boolean f28117b;

    /* renamed from: c */
    public final boolean f28118c;

    /* renamed from: d */
    public final boolean f28119d;

    /* renamed from: e */
    public final boolean f28120e;

    /* renamed from: f */
    public final long f28121f;

    /* renamed from: g */
    public final long f28122g;

    /* renamed from: h */
    public final Set f28123h;

    public C4149gy(int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        AbstractC0852NX.m5764m(i, "requiredNetworkType");
        O90.m5968f(set, "contentUriTriggers");
        this.f28116a = i;
        this.f28117b = z;
        this.f28118c = z2;
        this.f28119d = z3;
        this.f28120e = z4;
        this.f28121f = j;
        this.f28122g = j2;
        this.f28123h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C4149gy.class.equals(obj.getClass())) {
            return false;
        }
        C4149gy c4149gy = (C4149gy) obj;
        if (this.f28117b == c4149gy.f28117b && this.f28118c == c4149gy.f28118c && this.f28119d == c4149gy.f28119d && this.f28120e == c4149gy.f28120e && this.f28121f == c4149gy.f28121f && this.f28122g == c4149gy.f28122g && this.f28116a == c4149gy.f28116a) {
            return O90.m5963a(this.f28123h, c4149gy.f28123h);
        }
        return false;
    }

    public final int hashCode() {
        int iM26247x = ((((((((AbstractC7222ym.m26247x(this.f28116a) * 31) + (this.f28117b ? 1 : 0)) * 31) + (this.f28118c ? 1 : 0)) * 31) + (this.f28119d ? 1 : 0)) * 31) + (this.f28120e ? 1 : 0)) * 31;
        long j = this.f28121f;
        int i = (iM26247x + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f28122g;
        return this.f28123h.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
