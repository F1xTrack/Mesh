package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Y3 {
    public final long a;
    public final AbstractC0178Ca1 b;
    public final int c;
    public final C0456Fp0 d;
    public final long e;
    public final AbstractC0178Ca1 f;
    public final int g;
    public final C0456Fp0 h;
    public final long i;
    public final long j;

    public Y3(long j, AbstractC0178Ca1 abstractC0178Ca1, int i, C0456Fp0 c0456Fp0, long j2, AbstractC0178Ca1 abstractC0178Ca12, int i2, C0456Fp0 c0456Fp02, long j3, long j4) {
        this.a = j;
        this.b = abstractC0178Ca1;
        this.c = i;
        this.d = c0456Fp0;
        this.e = j2;
        this.f = abstractC0178Ca12;
        this.g = i2;
        this.h = c0456Fp02;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y3.class != obj.getClass()) {
            return false;
        }
        Y3 y3 = (Y3) obj;
        return this.a == y3.a && this.c == y3.c && this.e == y3.e && this.g == y3.g && this.i == y3.i && this.j == y3.j && AbstractC5465kE1.a(this.b, y3.b) && AbstractC5465kE1.a(this.d, y3.d) && AbstractC5465kE1.a(this.f, y3.f) && AbstractC5465kE1.a(this.h, y3.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
