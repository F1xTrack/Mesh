package defpackage;

import java.util.List;

/* renamed from: Me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0967Me {
    public final R61 a;
    public final List b;

    public C0967Me(R61 r61, List list) {
        if (r61 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.a = r61;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0967Me)) {
            return false;
        }
        C0967Me c0967Me = (C0967Me) obj;
        return this.a.equals(c0967Me.a) && this.b.equals(c0967Me.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.a + ", outConfigs=" + this.b + "}";
    }
}
