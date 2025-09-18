package p000;

import java.util.HashSet;

/* renamed from: Gc */
/* loaded from: classes.dex */
public final class C0417Gc {

    /* renamed from: a */
    public final HashSet f3816a;

    public C0417Gc(HashSet hashSet) {
        this.f3816a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0417Gc)) {
            return false;
        }
        return this.f3816a.equals(((C0417Gc) obj).f3816a);
    }

    public final int hashCode() {
        return this.f3816a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f3816a + "}";
    }
}
