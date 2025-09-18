package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: Oy1 */
/* loaded from: classes.dex */
public abstract class AbstractC1185Oy1 extends AbstractC7703vy1 implements List, RandomAccess {
    public static final C0328Dy1 b = new C0328Dy1(C0643Hz1.e, 0);

    public static AbstractC1185Oy1 s(Collection collection) {
        if (!(collection instanceof AbstractC7703vy1)) {
            Object[] array = collection.toArray();
            int length = array.length;
            N12.b(length, array);
            return length == 0 ? C0643Hz1.e : new C0643Hz1(length, array);
        }
        AbstractC1185Oy1 abstractC1185Oy1I = ((AbstractC7703vy1) collection).i();
        if (!abstractC1185Oy1I.k()) {
            return abstractC1185Oy1I;
        }
        Object[] array2 = abstractC1185Oy1I.toArray(AbstractC7703vy1.a);
        int length2 = array2.length;
        return length2 == 0 ? C0643Hz1.e : new C0643Hz1(length2, array2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC7703vy1
    public int b(Object[] objArr) {
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
                C0328Dy1 c0328Dy1ListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (c0328Dy1ListIterator.hasNext()) {
                        if (!it.hasNext() || ((next = c0328Dy1ListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
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
    public AbstractC1185Oy1 subList(int i, int i2) {
        G12.d(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C0643Hz1.e : new C0796Jy1(this, i, i3);
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
    public final C0328Dy1 listIterator(int i) {
        G12.c(i, size());
        return isEmpty() ? b : new C0328Dy1(this, i);
    }

    @Override // defpackage.AbstractC7703vy1
    public final AbstractC1185Oy1 i() {
        return this;
    }
}
