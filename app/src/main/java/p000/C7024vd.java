package p000;

/* renamed from: vd */
/* loaded from: classes.dex */
public final class C7024vd {

    /* renamed from: a */
    public final C1860ce f44449a;

    /* renamed from: b */
    public final C1860ce f44450b;

    public C7024vd(C1860ce c1860ce, C1860ce c1860ce2) {
        this.f44449a = c1860ce;
        this.f44450b = c1860ce2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7024vd)) {
            return false;
        }
        C7024vd c7024vd = (C7024vd) obj;
        return this.f44449a.equals(c7024vd.f44449a) && this.f44450b.equals(c7024vd.f44450b);
    }

    public final int hashCode() {
        return ((this.f44449a.hashCode() ^ 1000003) * 1000003) ^ this.f44450b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f44449a + ", secondaryOutConfig=" + this.f44450b + "}";
    }
}
