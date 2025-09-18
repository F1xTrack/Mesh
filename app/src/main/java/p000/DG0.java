package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class DG0 {

    /* renamed from: a */
    public final boolean f1931a;

    /* renamed from: b */
    public final Set f1932b;

    /* renamed from: c */
    public final Set f1933c;

    public DG0(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.f1931a = z;
        this.f1932b = hashSet == null ? Collections.emptySet() : new HashSet(hashSet);
        this.f1933c = hashSet2 == null ? Collections.emptySet() : new HashSet(hashSet2);
    }

    /* renamed from: a */
    public final boolean m1607a(boolean z, Class cls) {
        if (this.f1932b.contains(cls)) {
            return true;
        }
        if (this.f1933c.contains(cls)) {
            return false;
        }
        return this.f1931a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DG0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        DG0 dg0 = (DG0) obj;
        return this.f1931a == dg0.f1931a && Objects.equals(this.f1932b, dg0.f1932b) && Objects.equals(this.f1933c, dg0.f1933c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1931a), this.f1932b, this.f1933c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f1931a + ", forceEnabledQuirks=" + this.f1932b + ", forceDisabledQuirks=" + this.f1933c + '}';
    }
}
