package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: m8 */
/* loaded from: classes2.dex */
public final class C6407m8 implements Collection, InterfaceC11315ue0 {

    /* renamed from: a */
    public final Object[] f37494a;

    /* renamed from: b */
    public final boolean f37495b;

    public C6407m8(Object[] objArr, boolean z) {
        O90.m5968f(objArr, "values");
        this.f37494a = objArr;
        this.f37495b = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC0576J8.m4178e(this.f37494a, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        O90.m5968f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!AbstractC0576J8.m4178e(this.f37494a, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f37494a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return HN1.m3386a(this.f37494a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f37494a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f37494a;
        O90.m5968f(objArr, "<this>");
        if (this.f37495b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        O90.m5967e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        O90.m5968f(objArr, "array");
        return N90.m5580c(this, objArr);
    }
}
