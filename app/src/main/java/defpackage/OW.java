package defpackage;

/* loaded from: classes2.dex */
public final class OW {
    public final int a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final int f;
    public final int g;

    public OW(int i, double d, double d2, double d3, double d4, int i2, int i3) {
        this.a = i;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OW)) {
            return false;
        }
        OW ow = (OW) obj;
        return this.a == ow.a && Double.compare(this.b, ow.b) == 0 && Double.compare(this.c, ow.c) == 0 && Double.compare(this.d, ow.d) == 0 && Double.compare(this.e, ow.e) == 0 && this.f == ow.f && this.g == ow.g;
    }

    public final int hashCode() {
        int i = this.a * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        int i2 = (i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.c);
        int i3 = (i2 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.d);
        int i4 = (i3 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.e);
        return ((((i4 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return "FocusedInputSelectionChangedEventData(target=" + this.a + ", startX=" + this.b + ", startY=" + this.c + ", endX=" + this.d + ", endY=" + this.e + ", start=" + this.f + ", end=" + this.g + ")";
    }
}
