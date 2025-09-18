package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7163t8 implements Set {
    public final /* synthetic */ C7925x8 a;

    public C7163t8(C7925x8 c7925x8) {
        this.a = c7925x8;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C7925x8 c7925x8 = this.a;
        c7925x8.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c7925x8.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
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

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C7925x8 c7925x8 = this.a;
        int iHashCode = 0;
        for (int i = c7925x8.c - 1; i >= 0; i--) {
            Object objI = c7925x8.i(i);
            iHashCode += objI == null ? 0 : objI.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6972s8(this.a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C7925x8 c7925x8 = this.a;
        int iE = c7925x8.e(obj);
        if (iE < 0) {
            return false;
        }
        c7925x8.k(iE);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C7925x8 c7925x8 = this.a;
        int i = c7925x8.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c7925x8.remove(it.next());
        }
        return i != c7925x8.c;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.a.n(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C7925x8 c7925x8 = this.a;
        int i = c7925x8.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c7925x8.i(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.o(0, objArr);
    }
}
