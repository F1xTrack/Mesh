package p000;

/* renamed from: Un */
/* loaded from: classes2.dex */
public final class C1308Un {

    /* renamed from: a */
    public final boolean f12043a;

    /* renamed from: b */
    public final boolean f12044b;

    /* renamed from: c */
    public final Double f12045c;

    /* renamed from: d */
    public final Double f12046d;

    public C1308Un(boolean z, boolean z2, Double d, Double d2) {
        this.f12043a = z;
        this.f12044b = z2;
        this.f12045c = d;
        this.f12046d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1308Un)) {
            return false;
        }
        C1308Un c1308Un = (C1308Un) obj;
        return this.f12043a == c1308Un.f12043a && this.f12044b == c1308Un.f12044b && O90.m5963a(this.f12045c, c1308Un.f12045c) && O90.m5963a(this.f12046d, c1308Un.f12046d);
    }

    public final int hashCode() {
        int i = (((this.f12043a ? 1231 : 1237) * 31) + (this.f12044b ? 1231 : 1237)) * 31;
        Double d = this.f12045c;
        int iHashCode = (i + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f12046d;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "Video(isMirrored=" + this.f12043a + ", enableHdr=" + this.f12044b + ", bitRateOverride=" + this.f12045c + ", bitRateMultiplier=" + this.f12046d + ")";
    }
}
