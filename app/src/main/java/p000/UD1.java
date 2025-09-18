package p000;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class UD1 extends AbstractC11262uD1 implements Set {

    /* renamed from: b */
    public transient KD1 f11696b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC9831j22.m21969d(this);
    }
}
