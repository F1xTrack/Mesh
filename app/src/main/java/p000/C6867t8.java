package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: t8 */
/* loaded from: classes.dex */
public final class C6867t8 implements Set {

    /* renamed from: a */
    public final /* synthetic */ C7119x8 f42880a;

    public C6867t8(C7119x8 c7119x8) {
        this.f42880a = c7119x8;
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
        this.f42880a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f42880a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C7119x8 c7119x8 = this.f42880a;
        c7119x8.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c7119x8.containsKey(it.next())) {
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
        C7119x8 c7119x8 = this.f42880a;
        int iHashCode = 0;
        for (int i = c7119x8.f6450c - 1; i >= 0; i--) {
            Object objM4827i = c7119x8.m4827i(i);
            iHashCode += objM4827i == null ? 0 : objM4827i.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f42880a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6804s8(this.f42880a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C7119x8 c7119x8 = this.f42880a;
        int iM4824e = c7119x8.m4824e(obj);
        if (iM4824e < 0) {
            return false;
        }
        c7119x8.mo4829k(iM4824e);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C7119x8 c7119x8 = this.f42880a;
        int i = c7119x8.f6450c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c7119x8.remove(it.next());
        }
        return i != c7119x8.f6450c;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f42880a.m25775n(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f42880a.f6450c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C7119x8 c7119x8 = this.f42880a;
        int i = c7119x8.f6450c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c7119x8.m4827i(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f42880a.m25776o(0, objArr);
    }
}
