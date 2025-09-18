package p000;

/* loaded from: classes2.dex */
public final class HU0 {

    /* renamed from: a */
    public final GU0 f4320a;

    /* renamed from: b */
    public final GU0 f4321b;

    /* renamed from: c */
    public final GU0 f4322c;

    /* renamed from: d */
    public final GU0 f4323d;

    public HU0(GU0 gu0, GU0 gu02, GU0 gu03, GU0 gu04) {
        this.f4320a = gu0;
        this.f4321b = gu02;
        this.f4322c = gu03;
        this.f4323d = gu04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HU0)) {
            return false;
        }
        HU0 hu0 = (HU0) obj;
        return this.f4320a == hu0.f4320a && this.f4321b == hu0.f4321b && this.f4322c == hu0.f4322c && this.f4323d == hu0.f4323d;
    }

    public final int hashCode() {
        return this.f4323d.hashCode() + ((this.f4322c.hashCode() + ((this.f4321b.hashCode() + (this.f4320a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewEdges(top=" + this.f4320a + ", right=" + this.f4321b + ", bottom=" + this.f4322c + ", left=" + this.f4323d + ")";
    }
}
