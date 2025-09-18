package defpackage;

/* loaded from: classes2.dex */
public final class HU0 {
    public final GU0 a;
    public final GU0 b;
    public final GU0 c;
    public final GU0 d;

    public HU0(GU0 gu0, GU0 gu02, GU0 gu03, GU0 gu04) {
        this.a = gu0;
        this.b = gu02;
        this.c = gu03;
        this.d = gu04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HU0)) {
            return false;
        }
        HU0 hu0 = (HU0) obj;
        return this.a == hu0.a && this.b == hu0.b && this.c == hu0.c && this.d == hu0.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewEdges(top=" + this.a + ", right=" + this.b + ", bottom=" + this.c + ", left=" + this.d + ")";
    }
}
