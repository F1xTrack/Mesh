package p000;

import java.util.ArrayList;

/* renamed from: wd */
/* loaded from: classes.dex */
public final class C7087wd {

    /* renamed from: a */
    public final R61 f44999a;

    /* renamed from: b */
    public final R61 f45000b;

    /* renamed from: c */
    public final ArrayList f45001c;

    public C7087wd(R61 r61, R61 r612, ArrayList arrayList) {
        if (r61 == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f44999a = r61;
        if (r612 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f45000b = r612;
        this.f45001c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7087wd)) {
            return false;
        }
        C7087wd c7087wd = (C7087wd) obj;
        return this.f44999a.equals(c7087wd.f44999a) && this.f45000b.equals(c7087wd.f45000b) && this.f45001c.equals(c7087wd.f45001c);
    }

    public final int hashCode() {
        return ((((this.f44999a.hashCode() ^ 1000003) * 1000003) ^ this.f45000b.hashCode()) * 1000003) ^ this.f45001c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f44999a + ", secondarySurfaceEdge=" + this.f45000b + ", outConfigs=" + this.f45001c + "}";
    }
}
