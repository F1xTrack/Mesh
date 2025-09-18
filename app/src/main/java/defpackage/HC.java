package defpackage;

/* loaded from: classes.dex */
public final class HC {
    public final GC a;
    public final GC b;
    public final double c;

    public HC(GC gc, GC gc2, double d) {
        this.a = gc;
        this.b = gc2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HC)) {
            return false;
        }
        HC hc = (HC) obj;
        return this.a == hc.a && this.b == hc.b && Double.compare(this.c, hc.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
