package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: fz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3875fz1 extends AbstractC0484Fy1 implements List, RandomAccess {
    public static final C1341Qy1 b = new C1341Qy1(C7324tz1.e, 0);

    public static C7324tz1 r(int i, Object[] objArr) {
        return i == 0 ? C7324tz1.e : new C7324tz1(i, objArr);
    }

    public static AbstractC3875fz1 s(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return t((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C7324tz1.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            L12.c(1, objArr);
            return r(1, objArr);
        }
        C0951Ly1 c0951Ly1 = new C0951Ly1();
        c0951Ly1.a = new Object[4];
        c0951Ly1.b = 0;
        c0951Ly1.a(next);
        while (it.hasNext()) {
            c0951Ly1.a(it.next());
        }
        c0951Ly1.c = true;
        return r(c0951Ly1.b, c0951Ly1.a);
    }

    public static AbstractC3875fz1 t(Collection collection) {
        if (!(collection instanceof AbstractC0484Fy1)) {
            Object[] array = collection.toArray();
            int length = array.length;
            L12.c(length, array);
            return r(length, array);
        }
        AbstractC3875fz1 abstractC3875fz1 = (AbstractC3875fz1) ((AbstractC0484Fy1) collection);
        abstractC3875fz1.getClass();
        if (!abstractC3875fz1.i()) {
            return abstractC3875fz1;
        }
        Object[] array2 = abstractC3875fz1.toArray(AbstractC0484Fy1.a);
        return r(array2.length, array2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC0484Fy1
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
                C1341Qy1 c1341Qy1ListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (c1341Qy1ListIterator.hasNext()) {
                        if (!it.hasNext() || ((next = c1341Qy1ListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
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
    /* renamed from: q */
    public AbstractC3875fz1 subList(int i, int i2) {
        Q22.d(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C7324tz1.e : new C1887Xy1(this, i, i3);
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
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final C1341Qy1 listIterator(int i) {
        Q22.c(i, size());
        return isEmpty() ? b : new C1341Qy1(this, i);
    }
}
