package p000;

/* renamed from: HC */
/* loaded from: classes.dex */
public final class C0454HC {

    /* renamed from: a */
    public final EnumC0391GC f4163a;

    /* renamed from: b */
    public final EnumC0391GC f4164b;

    /* renamed from: c */
    public final double f4165c;

    public C0454HC(EnumC0391GC enumC0391GC, EnumC0391GC enumC0391GC2, double d) {
        this.f4163a = enumC0391GC;
        this.f4164b = enumC0391GC2;
        this.f4165c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0454HC)) {
            return false;
        }
        C0454HC c0454hc = (C0454HC) obj;
        return this.f4163a == c0454hc.f4163a && this.f4164b == c0454hc.f4164b && Double.compare(this.f4165c, c0454hc.f4165c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f4164b.hashCode() + (this.f4163a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f4165c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f4163a + ", crashlytics=" + this.f4164b + ", sessionSamplingRate=" + this.f4165c + ')';
    }
}
