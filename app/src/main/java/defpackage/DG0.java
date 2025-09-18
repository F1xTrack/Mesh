package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class DG0 {
    public final boolean a;
    public final Set b;
    public final Set c;

    public DG0(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.a = z;
        this.b = hashSet == null ? Collections.emptySet() : new HashSet(hashSet);
        this.c = hashSet2 == null ? Collections.emptySet() : new HashSet(hashSet2);
    }

    public final boolean a(boolean z, Class cls) {
        if (this.b.contains(cls)) {
            return true;
        }
        if (this.c.contains(cls)) {
            return false;
        }
        return this.a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DG0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        DG0 dg0 = (DG0) obj;
        return this.a == dg0.a && Objects.equals(this.b, dg0.b) && Objects.equals(this.c, dg0.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
