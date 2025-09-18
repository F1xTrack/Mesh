package defpackage;

import java.util.Set;

/* renamed from: gy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4061gy {
    public static final C4061gy i = new C4061gy(1, false, false, false, false, -1, -1, SN.a);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;

    public C4061gy(int i2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        NX.m(i2, "requiredNetworkType");
        O90.f(set, "contentUriTriggers");
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = j2;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C4061gy.class.equals(obj.getClass())) {
            return false;
        }
        C4061gy c4061gy = (C4061gy) obj;
        if (this.b == c4061gy.b && this.c == c4061gy.c && this.d == c4061gy.d && this.e == c4061gy.e && this.f == c4061gy.f && this.g == c4061gy.g && this.a == c4061gy.a) {
            return O90.a(this.h, c4061gy.h);
        }
        return false;
    }

    public final int hashCode() {
        int iX = ((((((((AbstractC8235ym.x(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iX + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
