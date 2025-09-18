package p000;

import java.util.List;

/* renamed from: Me */
/* loaded from: classes.dex */
public final class C0796Me {

    /* renamed from: a */
    public final R61 f7278a;

    /* renamed from: b */
    public final List f7279b;

    public C0796Me(R61 r61, List list) {
        if (r61 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f7278a = r61;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f7279b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0796Me)) {
            return false;
        }
        C0796Me c0796Me = (C0796Me) obj;
        return this.f7278a.equals(c0796Me.f7278a) && this.f7279b.equals(c0796Me.f7279b);
    }

    public final int hashCode() {
        return ((this.f7278a.hashCode() ^ 1000003) * 1000003) ^ this.f7279b.hashCode();
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.f7278a + ", outConfigs=" + this.f7279b + "}";
    }
}
