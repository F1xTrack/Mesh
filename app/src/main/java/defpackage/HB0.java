package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class HB0 {
    public final Object a;
    public final int b;
    public final C6721qp0 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        AbstractC8235ym.t(0, 1, 2, 3, 4);
        AbstractC0277Dh1.L(5);
        AbstractC0277Dh1.L(6);
    }

    public HB0(Object obj, int i, C6721qp0 c6721qp0, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = c6721qp0;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HB0.class != obj.getClass()) {
            return false;
        }
        HB0 hb0 = (HB0) obj;
        return this.b == hb0.b && this.e == hb0.e && this.f == hb0.f && this.g == hb0.g && this.h == hb0.h && this.i == hb0.i && AbstractC5465kE1.a(this.c, hb0.c) && AbstractC5465kE1.a(this.a, hb0.a) && AbstractC5465kE1.a(this.d, hb0.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
