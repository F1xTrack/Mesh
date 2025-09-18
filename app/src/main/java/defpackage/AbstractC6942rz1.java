package defpackage;

import java.util.Iterator;
import java.util.Set;

/* renamed from: rz1 */
/* loaded from: classes.dex */
public abstract class AbstractC6942rz1 extends AbstractC7703vy1 implements Set {
    public transient AbstractC1185Oy1 b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
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
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // defpackage.AbstractC7703vy1
    public AbstractC1185Oy1 i() {
        AbstractC1185Oy1 abstractC1185Oy1 = this.b;
        if (abstractC1185Oy1 != null) {
            return abstractC1185Oy1;
        }
        AbstractC1185Oy1 abstractC1185Oy1R = r();
        this.b = abstractC1185Oy1R;
        return abstractC1185Oy1R;
    }

    public AbstractC1185Oy1 r() {
        Object[] array = toArray(AbstractC7703vy1.a);
        C0328Dy1 c0328Dy1 = AbstractC1185Oy1.b;
        int length = array.length;
        return length == 0 ? C0643Hz1.e : new C0643Hz1(length, array);
    }
}
