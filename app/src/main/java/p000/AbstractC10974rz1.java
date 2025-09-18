package p000;

import java.util.Iterator;
import java.util.Set;

/* renamed from: rz1 */
/* loaded from: classes.dex */
public abstract class AbstractC10974rz1 extends AbstractC11484vy1 implements Set {

    /* renamed from: b */
    public transient AbstractC8091Oy1 f42186b;

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

    @Override // p000.AbstractC11484vy1
    /* renamed from: i */
    public AbstractC8091Oy1 mo6191i() {
        AbstractC8091Oy1 abstractC8091Oy1 = this.f42186b;
        if (abstractC8091Oy1 != null) {
            return abstractC8091Oy1;
        }
        AbstractC8091Oy1 abstractC8091Oy1Mo7835r = mo7835r();
        this.f42186b = abstractC8091Oy1Mo7835r;
        return abstractC8091Oy1Mo7835r;
    }

    /* renamed from: r */
    public AbstractC8091Oy1 mo7835r() {
        Object[] array = toArray(AbstractC11484vy1.f44622a);
        C7519Dy1 c7519Dy1 = AbstractC8091Oy1.f8764b;
        int length = array.length;
        return length == 0 ? C7729Hz1.f4623e : new C7729Hz1(length, array);
    }
}
