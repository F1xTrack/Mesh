package defpackage;

import java.util.ArrayList;

/* renamed from: wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7828wd {
    public final R61 a;
    public final R61 b;
    public final ArrayList c;

    public C7828wd(R61 r61, R61 r612, ArrayList arrayList) {
        if (r61 == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.a = r61;
        if (r612 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.b = r612;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7828wd)) {
            return false;
        }
        C7828wd c7828wd = (C7828wd) obj;
        return this.a.equals(c7828wd.a) && this.b.equals(c7828wd.b) && this.c.equals(c7828wd.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.c + "}";
    }
}
