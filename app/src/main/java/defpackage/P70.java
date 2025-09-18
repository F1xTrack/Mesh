package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class P70 extends J70 implements List, RandomAccess {
    public static final N70 b = new N70(C3769fQ0.e, 0);

    public static C3769fQ0 A(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        AbstractC3353dE1.a(5, objArr);
        return s(5, objArr);
    }

    public static C3769fQ0 B(Object obj) {
        Object[] objArr = {obj};
        AbstractC3353dE1.a(1, objArr);
        return s(1, objArr);
    }

    public static C3769fQ0 C(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC3353dE1.a(2, objArr);
        return s(2, objArr);
    }

    public static C3769fQ0 E(AbstractC1028My0 abstractC1028My0, Collection collection) {
        Collection collection2;
        abstractC1028My0.getClass();
        Collection collection3 = collection;
        if (collection3 instanceof Collection) {
            collection2 = collection3;
        } else {
            Iterator it = collection3.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection2 = arrayList;
        }
        Object[] array = collection2.toArray();
        AbstractC3353dE1.a(array.length, array);
        Arrays.sort(array, abstractC1028My0);
        return s(array.length, array);
    }

    public static C3769fQ0 s(int i, Object[] objArr) {
        return i == 0 ? C3769fQ0.e : new C3769fQ0(i, objArr);
    }

    public static M70 t() {
        return new M70(4);
    }

    public static P70 u(Collection collection) {
        if (!(collection instanceof J70)) {
            Object[] array = collection.toArray();
            AbstractC3353dE1.a(array.length, array);
            return s(array.length, array);
        }
        P70 p70B = ((J70) collection).b();
        if (!p70B.q()) {
            return p70B;
        }
        Object[] array2 = p70B.toArray(J70.a);
        return s(array2.length, array2);
    }

    public static C3769fQ0 v(Object[] objArr) {
        if (objArr.length == 0) {
            return C3769fQ0.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC3353dE1.a(objArr2.length, objArr2);
        return s(objArr2.length, objArr2);
    }

    public static C3769fQ0 z() {
        return C3769fQ0.e;
    }

    @Override // java.util.List
    /* renamed from: F */
    public P70 subList(int i, int i2) {
        QL1.f(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C3769fQ0.e : new O70(this, i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.J70, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.J70
    public int d(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (AbstractC5465kE1.a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && AbstractC5465kE1.a(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
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

    @Override // defpackage.J70, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
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

    @Override // defpackage.J70
    /* renamed from: r */
    public final AbstractC5740lg1 iterator() {
        return listIterator(0);
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
    /* renamed from: y */
    public final N70 listIterator(int i) {
        QL1.e(i, size());
        return isEmpty() ? b : new N70(this, i);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.J70
    public final P70 b() {
        return this;
    }
}
