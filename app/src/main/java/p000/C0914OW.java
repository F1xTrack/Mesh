package p000;

/* renamed from: OW */
/* loaded from: classes2.dex */
public final class C0914OW {

    /* renamed from: a */
    public final int f8466a;

    /* renamed from: b */
    public final double f8467b;

    /* renamed from: c */
    public final double f8468c;

    /* renamed from: d */
    public final double f8469d;

    /* renamed from: e */
    public final double f8470e;

    /* renamed from: f */
    public final int f8471f;

    /* renamed from: g */
    public final int f8472g;

    public C0914OW(int i, double d, double d2, double d3, double d4, int i2, int i3) {
        this.f8466a = i;
        this.f8467b = d;
        this.f8468c = d2;
        this.f8469d = d3;
        this.f8470e = d4;
        this.f8471f = i2;
        this.f8472g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0914OW)) {
            return false;
        }
        C0914OW c0914ow = (C0914OW) obj;
        return this.f8466a == c0914ow.f8466a && Double.compare(this.f8467b, c0914ow.f8467b) == 0 && Double.compare(this.f8468c, c0914ow.f8468c) == 0 && Double.compare(this.f8469d, c0914ow.f8469d) == 0 && Double.compare(this.f8470e, c0914ow.f8470e) == 0 && this.f8471f == c0914ow.f8471f && this.f8472g == c0914ow.f8472g;
    }

    public final int hashCode() {
        int i = this.f8466a * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f8467b);
        int i2 = (i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f8468c);
        int i3 = (i2 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f8469d);
        int i4 = (i3 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f8470e);
        return ((((i4 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + this.f8471f) * 31) + this.f8472g;
    }

    public final String toString() {
        return "FocusedInputSelectionChangedEventData(target=" + this.f8466a + ", startX=" + this.f8467b + ", startY=" + this.f8468c + ", endX=" + this.f8469d + ", endY=" + this.f8470e + ", start=" + this.f8471f + ", end=" + this.f8472g + ")";
    }
}
