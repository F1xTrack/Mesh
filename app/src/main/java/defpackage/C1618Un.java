package defpackage;

/* renamed from: Un, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1618Un {
    public final boolean a;
    public final boolean b;
    public final Double c;
    public final Double d;

    public C1618Un(boolean z, boolean z2, Double d, Double d2) {
        this.a = z;
        this.b = z2;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1618Un)) {
            return false;
        }
        C1618Un c1618Un = (C1618Un) obj;
        return this.a == c1618Un.a && this.b == c1618Un.b && O90.a(this.c, c1618Un.c) && O90.a(this.d, c1618Un.d);
    }

    public final int hashCode() {
        int i = (((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        Double d = this.c;
        int iHashCode = (i + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "Video(isMirrored=" + this.a + ", enableHdr=" + this.b + ", bitRateOverride=" + this.c + ", bitRateMultiplier=" + this.d + ")";
    }
}
