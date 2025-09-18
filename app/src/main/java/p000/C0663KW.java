package p000;

/* renamed from: KW */
/* loaded from: classes2.dex */
public final class C0663KW {

    /* renamed from: a */
    public final double f6134a;

    /* renamed from: b */
    public final double f6135b;

    /* renamed from: c */
    public final double f6136c;

    /* renamed from: d */
    public final double f6137d;

    /* renamed from: e */
    public final double f6138e;

    /* renamed from: f */
    public final double f6139f;

    /* renamed from: g */
    public final int f6140g;

    /* renamed from: h */
    public final int f6141h;

    public C0663KW(double d, double d2, double d3, double d4, double d5, double d6, int i, int i2) {
        this.f6134a = d;
        this.f6135b = d2;
        this.f6136c = d3;
        this.f6137d = d4;
        this.f6138e = d5;
        this.f6139f = d6;
        this.f6140g = i;
        this.f6141h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0663KW)) {
            return false;
        }
        C0663KW c0663kw = (C0663KW) obj;
        return Double.compare(this.f6134a, c0663kw.f6134a) == 0 && Double.compare(this.f6135b, c0663kw.f6135b) == 0 && Double.compare(this.f6136c, c0663kw.f6136c) == 0 && Double.compare(this.f6137d, c0663kw.f6137d) == 0 && Double.compare(this.f6138e, c0663kw.f6138e) == 0 && Double.compare(this.f6139f, c0663kw.f6139f) == 0 && this.f6140g == c0663kw.f6140g && this.f6141h == c0663kw.f6141h;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f6134a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f6135b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f6136c);
        int i2 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f6137d);
        int i3 = (i2 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f6138e);
        int i4 = (i3 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f6139f);
        return ((((i4 + ((int) ((jDoubleToLongBits6 >>> 32) ^ jDoubleToLongBits6))) * 31) + this.f6140g) * 31) + this.f6141h;
    }

    public final String toString() {
        return "FocusedInputLayoutChangedEventData(x=" + this.f6134a + ", y=" + this.f6135b + ", width=" + this.f6136c + ", height=" + this.f6137d + ", absoluteX=" + this.f6138e + ", absoluteY=" + this.f6139f + ", target=" + this.f6140g + ", parentScrollViewTarget=" + this.f6141h + ")";
    }
}
