package defpackage;

/* loaded from: classes2.dex */
public final class KW {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final int g;
    public final int h;

    public KW(double d, double d2, double d3, double d4, double d5, double d6, int i, int i2) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KW)) {
            return false;
        }
        KW kw = (KW) obj;
        return Double.compare(this.a, kw.a) == 0 && Double.compare(this.b, kw.b) == 0 && Double.compare(this.c, kw.c) == 0 && Double.compare(this.d, kw.d) == 0 && Double.compare(this.e, kw.e) == 0 && Double.compare(this.f, kw.f) == 0 && this.g == kw.g && this.h == kw.h;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i2 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.d);
        int i3 = (i2 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.e);
        int i4 = (i3 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f);
        return ((((i4 + ((int) ((jDoubleToLongBits6 >>> 32) ^ jDoubleToLongBits6))) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        return "FocusedInputLayoutChangedEventData(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ", absoluteX=" + this.e + ", absoluteY=" + this.f + ", target=" + this.g + ", parentScrollViewTarget=" + this.h + ")";
    }
}
