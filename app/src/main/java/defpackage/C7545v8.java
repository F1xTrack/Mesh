package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7545v8 implements Collection {
    public final /* synthetic */ C7925x8 a;

    public C7545v8(C7925x8 c7925x8) {
        this.a = c7925x8;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.g(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6972s8(this.a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C7925x8 c7925x8 = this.a;
        int iG = c7925x8.g(obj);
        if (iG < 0) {
            return false;
        }
        c7925x8.k(iG);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C7925x8 c7925x8 = this.a;
        int i = c7925x8.c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c7925x8.m(i2))) {
                c7925x8.k(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C7925x8 c7925x8 = this.a;
        int i = c7925x8.c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c7925x8.m(i2))) {
                c7925x8.k(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C7925x8 c7925x8 = this.a;
        int i = c7925x8.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c7925x8.m(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.o(1, objArr);
    }
}
