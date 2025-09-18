package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: Oy1 */
/* loaded from: classes.dex */
public abstract class AbstractC8091Oy1 extends AbstractC11484vy1 implements List, RandomAccess {

    /* renamed from: b */
    public static final C7519Dy1 f8764b = new C7519Dy1(C7729Hz1.f4623e, 0);

    /* renamed from: s */
    public static AbstractC8091Oy1 m6190s(Collection collection) {
        if (!(collection instanceof AbstractC11484vy1)) {
            Object[] array = collection.toArray();
            int length = array.length;
            N12.m5522b(length, array);
            return length == 0 ? C7729Hz1.f4623e : new C7729Hz1(length, array);
        }
        AbstractC8091Oy1 abstractC8091Oy1Mo6191i = ((AbstractC11484vy1) collection).mo6191i();
        if (!abstractC8091Oy1Mo6191i.mo3660k()) {
            return abstractC8091Oy1Mo6191i;
        }
        Object[] array2 = abstractC8091Oy1Mo6191i.toArray(AbstractC11484vy1.f44622a);
        int length2 = array2.length;
        return length2 == 0 ? C7729Hz1.f4623e : new C7729Hz1(length2, array2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: b */
    public int mo3657b(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                C7519Dy1 c7519Dy1ListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (c7519Dy1ListIterator.hasNext()) {
                        if (!it.hasNext() || ((next = c7519Dy1ListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r */
    public AbstractC8091Oy1 subList(int i, int i2) {
        G12.m2913d(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C7729Hz1.f4623e : new C7831Jy1(this, i, i3);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: t */
    public final C7519Dy1 listIterator(int i) {
        G12.m2912c(i, size());
        return isEmpty() ? f8764b : new C7519Dy1(this, i);
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: i */
    public final AbstractC8091Oy1 mo6191i() {
        return this;
    }
}
