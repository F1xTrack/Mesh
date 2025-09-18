package defpackage;

import java.util.HashSet;

/* renamed from: Gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494Gc {
    public final HashSet a;

    public C0494Gc(HashSet hashSet) {
        this.a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0494Gc)) {
            return false;
        }
        return this.a.equals(((C0494Gc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.a + "}";
    }
}
