package p000;

import java.util.HashSet;

/* renamed from: ve */
/* loaded from: classes.dex */
public final class C7025ve {

    /* renamed from: a */
    public final HashSet f44461a;

    public C7025ve(HashSet hashSet) {
        this.f44461a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7025ve)) {
            return false;
        }
        return this.f44461a.equals(((C7025ve) obj).f44461a);
    }

    public final int hashCode() {
        return this.f44461a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f44461a + "}";
    }
}
