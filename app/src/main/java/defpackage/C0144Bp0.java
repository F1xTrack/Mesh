package defpackage;

/* renamed from: Bp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144Bp0 {
    public final C0456Fp0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public C0144Bp0(C0456Fp0 c0456Fp0, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        YN1.c(!z4 || z2);
        YN1.c(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        YN1.c(z5);
        this.a = c0456Fp0;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final C0144Bp0 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new C0144Bp0(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final C0144Bp0 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new C0144Bp0(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0144Bp0.class != obj.getClass()) {
            return false;
        }
        C0144Bp0 c0144Bp0 = (C0144Bp0) obj;
        return this.b == c0144Bp0.b && this.c == c0144Bp0.c && this.d == c0144Bp0.d && this.e == c0144Bp0.e && this.f == c0144Bp0.f && this.g == c0144Bp0.g && this.h == c0144Bp0.h && this.i == c0144Bp0.i && AbstractC0277Dh1.a(this.a, c0144Bp0.a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
