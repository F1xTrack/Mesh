package p000;

import java.util.List;

/* renamed from: pd */
/* loaded from: classes.dex */
public final class C6629pd extends AbstractC0892OA {

    /* renamed from: a */
    public final List f40244a;

    public C6629pd(List list) {
        this.f40244a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0892OA)) {
            return false;
        }
        return this.f40244a.equals(((C6629pd) ((AbstractC0892OA) obj)).f40244a);
    }

    public final int hashCode() {
        return this.f40244a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f40244a + "}";
    }
}
