package defpackage;

import java.util.HashSet;

/* renamed from: ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7641ve {
    public final HashSet a;

    public C7641ve(HashSet hashSet) {
        this.a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7641ve)) {
            return false;
        }
        return this.a.equals(((C7641ve) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
