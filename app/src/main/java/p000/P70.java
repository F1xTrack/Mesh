package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class P70 extends J70 implements List, RandomAccess {

    /* renamed from: b */
    public static final N70 f8867b = new N70(C9367fQ0.f27184e, 0);

    /* renamed from: A */
    public static C9367fQ0 m6228A(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        AbstractC9088dE1.m17509a(5, objArr);
        return m6232s(5, objArr);
    }

    /* renamed from: B */
    public static C9367fQ0 m6229B(Object obj) {
        Object[] objArr = {obj};
        AbstractC9088dE1.m17509a(1, objArr);
        return m6232s(1, objArr);
    }

    /* renamed from: C */
    public static C9367fQ0 m6230C(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC9088dE1.m17509a(2, objArr);
        return m6232s(2, objArr);
    }

    /* renamed from: E */
    public static C9367fQ0 m6231E(AbstractC7986My0 abstractC7986My0, Collection collection) {
        Collection collection2;
        abstractC7986My0.getClass();
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
        AbstractC9088dE1.m17509a(array.length, array);
        Arrays.sort(array, abstractC7986My0);
        return m6232s(array.length, array);
    }

    /* renamed from: s */
    public static C9367fQ0 m6232s(int i, Object[] objArr) {
        return i == 0 ? C9367fQ0.f27184e : new C9367fQ0(i, objArr);
    }

    /* renamed from: t */
    public static M70 m6233t() {
        return new M70(4);
    }

    /* renamed from: u */
    public static P70 m6234u(Collection collection) {
        if (!(collection instanceof J70)) {
            Object[] array = collection.toArray();
            AbstractC9088dE1.m17509a(array.length, array);
            return m6232s(array.length, array);
        }
        P70 p70Mo4159b = ((J70) collection).mo4159b();
        if (!p70Mo4159b.mo4164q()) {
            return p70Mo4159b;
        }
        Object[] array2 = p70Mo4159b.toArray(J70.f5350a);
        return m6232s(array2.length, array2);
    }

    /* renamed from: v */
    public static C9367fQ0 m6235v(Object[] objArr) {
        if (objArr.length == 0) {
            return C9367fQ0.f27184e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC9088dE1.m17509a(objArr2.length, objArr2);
        return m6232s(objArr2.length, objArr2);
    }

    /* renamed from: z */
    public static C9367fQ0 m6236z() {
        return C9367fQ0.f27184e;
    }

    @Override // java.util.List
    /* renamed from: F */
    public P70 subList(int i, int i2) {
        QL1.m6670f(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C9367fQ0.f27184e : new O70(this, i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.J70, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p000.J70
    /* renamed from: d */
    public int mo4160d(int i, Object[] objArr) {
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
                        if (AbstractC9984kE1.m22173a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && AbstractC9984kE1.m22173a(it.next(), it2.next())) {
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

    @Override // p000.J70, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // p000.J70
    /* renamed from: r */
    public final AbstractC10168lg1 iterator() {
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
        QL1.m6669e(i, size());
        return isEmpty() ? f8867b : new N70(this, i);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p000.J70
    /* renamed from: b */
    public final P70 mo4159b() {
        return this;
    }
}
