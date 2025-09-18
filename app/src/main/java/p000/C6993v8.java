package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: v8 */
/* loaded from: classes.dex */
public final class C6993v8 implements Collection {

    /* renamed from: a */
    public final /* synthetic */ C7119x8 f44207a;

    public C6993v8(C7119x8 c7119x8) {
        this.f44207a = c7119x8;
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
        this.f44207a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f44207a.m4826g(obj) >= 0;
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
        return this.f44207a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6804s8(this.f44207a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C7119x8 c7119x8 = this.f44207a;
        int iM4826g = c7119x8.m4826g(obj);
        if (iM4826g < 0) {
            return false;
        }
        c7119x8.mo4829k(iM4826g);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C7119x8 c7119x8 = this.f44207a;
        int i = c7119x8.f6450c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c7119x8.m4831m(i2))) {
                c7119x8.mo4829k(i2);
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
        C7119x8 c7119x8 = this.f44207a;
        int i = c7119x8.f6450c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c7119x8.m4831m(i2))) {
                c7119x8.mo4829k(i2);
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
        return this.f44207a.f6450c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C7119x8 c7119x8 = this.f44207a;
        int i = c7119x8.f6450c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c7119x8.m4831m(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f44207a.m25776o(1, objArr);
    }
}
