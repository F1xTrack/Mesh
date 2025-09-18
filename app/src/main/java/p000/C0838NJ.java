package p000;

/* renamed from: NJ */
/* loaded from: classes2.dex */
public final class C0838NJ {

    /* renamed from: a */
    public final double f7723a;

    /* renamed from: b */
    public final double f7724b;

    public C0838NJ(double d, double d2) {
        this.f7723a = d;
        this.f7724b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0838NJ)) {
            return false;
        }
        C0838NJ c0838nj = (C0838NJ) obj;
        return Double.compare(this.f7723a, c0838nj.f7723a) == 0 && Double.compare(this.f7724b, c0838nj.f7724b) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f7723a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f7724b);
        return i + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "Dimensions(width=" + this.f7723a + ", height=" + this.f7724b + ")";
    }
}
