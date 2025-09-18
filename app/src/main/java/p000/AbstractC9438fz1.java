package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: fz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9438fz1 extends AbstractC7623Fy1 implements List, RandomAccess {

    /* renamed from: b */
    public static final C8195Qy1 f27517b = new C8195Qy1(C11230tz1.f43437e, 0);

    /* renamed from: r */
    public static C11230tz1 m18340r(int i, Object[] objArr) {
        return i == 0 ? C11230tz1.f43437e : new C11230tz1(i, objArr);
    }

    /* renamed from: s */
    public static AbstractC9438fz1 m18341s(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return m18342t((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C11230tz1.f43437e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            L12.m4865c(1, objArr);
            return m18340r(1, objArr);
        }
        C7935Ly1 c7935Ly1 = new C7935Ly1();
        c7935Ly1.f6948a = new Object[4];
        c7935Ly1.f6949b = 0;
        c7935Ly1.m5174a(next);
        while (it.hasNext()) {
            c7935Ly1.m5174a(it.next());
        }
        c7935Ly1.f6950c = true;
        return m18340r(c7935Ly1.f6949b, c7935Ly1.f6948a);
    }

    /* renamed from: t */
    public static AbstractC9438fz1 m18342t(Collection collection) {
        if (!(collection instanceof AbstractC7623Fy1)) {
            Object[] array = collection.toArray();
            int length = array.length;
            L12.m4865c(length, array);
            return m18340r(length, array);
        }
        AbstractC9438fz1 abstractC9438fz1 = (AbstractC9438fz1) ((AbstractC7623Fy1) collection);
        abstractC9438fz1.getClass();
        if (!abstractC9438fz1.mo2866i()) {
            return abstractC9438fz1;
        }
        Object[] array2 = abstractC9438fz1.toArray(AbstractC7623Fy1.f3498a);
        return m18340r(array2.length, array2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC7623Fy1
    /* renamed from: b */
    public int mo2863b(Object[] objArr) {
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
                C8195Qy1 c8195Qy1ListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (c8195Qy1ListIterator.hasNext()) {
                        if (!it.hasNext() || ((next = c8195Qy1ListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
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
    public AbstractC9438fz1 subList(int i, int i2) {
        Q22.m6559d(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C11230tz1.f43437e : new C8559Xy1(this, i, i3);
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
    public final C8195Qy1 listIterator(int i) {
        Q22.m6558c(i, size());
        return isEmpty() ? f27517b : new C8195Qy1(this, i);
    }
}
