package defpackage;

import java.util.List;

/* renamed from: pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6493pd extends OA {
    public final List a;

    public C6493pd(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OA)) {
            return false;
        }
        return this.a.equals(((C6493pd) ((OA) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
