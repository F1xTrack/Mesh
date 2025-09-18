package defpackage;

/* loaded from: classes2.dex */
public final class NJ {
    public final double a;
    public final double b;

    public NJ(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NJ)) {
            return false;
        }
        NJ nj = (NJ) obj;
        return Double.compare(this.a, nj.a) == 0 && Double.compare(this.b, nj.b) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        return i + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "Dimensions(width=" + this.a + ", height=" + this.b + ")";
    }
}
