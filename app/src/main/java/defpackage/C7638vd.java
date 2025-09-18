package defpackage;

/* renamed from: vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7638vd {
    public final C2553ce a;
    public final C2553ce b;

    public C7638vd(C2553ce c2553ce, C2553ce c2553ce2) {
        this.a = c2553ce;
        this.b = c2553ce2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7638vd)) {
            return false;
        }
        C7638vd c7638vd = (C7638vd) obj;
        return this.a.equals(c7638vd.a) && this.b.equals(c7638vd.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
