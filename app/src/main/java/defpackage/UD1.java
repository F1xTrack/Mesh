package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class UD1 extends AbstractC7371uD1 implements Set {
    public transient KD1 b;

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
        return AbstractC5237j22.d(this);
    }
}
