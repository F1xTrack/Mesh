package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: oj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6321oj0 extends O0 implements RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final C6321oj0 d;
    public final C6512pj0 e;

    public C6321oj0(Object[] objArr, int i, int i2, C6321oj0 c6321oj0, C6512pj0 c6512pj0) {
        O90.f(objArr, "backing");
        O90.f(c6512pj0, "root");
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = c6321oj0;
        this.e = c6512pj0;
        ((AbstractList) this).modCount = ((AbstractList) c6512pj0).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        s();
        r();
        q(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        O90.f(collection, "elements");
        s();
        r();
        int size = collection.size();
        k(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // defpackage.O0
    public final int b() {
        r();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        s();
        r();
        u(this.b, this.c);
    }

    @Override // defpackage.O0
    public final Object d(int i) {
        s();
        r();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        return t(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        r();
        if (obj != this) {
            if (obj instanceof List) {
                if (AbstractC3795fZ.a(this.a, this.b, this.c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        r();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        r();
        Object[] objArr = this.a;
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        r();
        for (int i = 0; i < this.c; i++) {
            if (O90.a(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        r();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C6512pj0 c6512pj0 = this.e;
        C6321oj0 c6321oj0 = this.d;
        if (c6321oj0 != null) {
            c6321oj0.k(i, collection, i2);
        } else {
            C6512pj0 c6512pj02 = C6512pj0.d;
            c6512pj0.k(i, collection, i2);
        }
        this.a = c6512pj0.a;
        this.c += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        r();
        for (int i = this.c - 1; i >= 0; i--) {
            if (O90.a(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void q(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C6512pj0 c6512pj0 = this.e;
        C6321oj0 c6321oj0 = this.d;
        if (c6321oj0 != null) {
            c6321oj0.q(i, obj);
        } else {
            C6512pj0 c6512pj02 = C6512pj0.d;
            c6512pj0.q(i, obj);
        }
        this.a = c6512pj0.a;
        this.c++;
    }

    public final void r() {
        if (((AbstractList) this.e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        s();
        r();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        O90.f(collection, "elements");
        s();
        r();
        return v(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        O90.f(collection, "elements");
        s();
        r();
        return v(this.b, this.c, collection, true) > 0;
    }

    public final void s() {
        if (this.e.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        s();
        r();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        Object[] objArr = this.a;
        int i3 = this.b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC3758fM1.a(i, i2, this.c);
        return new C6321oj0(this.a, this.b + i, i2 - i, this, this.e);
    }

    public final Object t(int i) {
        Object objT;
        ((AbstractList) this).modCount++;
        C6321oj0 c6321oj0 = this.d;
        if (c6321oj0 != null) {
            objT = c6321oj0.t(i);
        } else {
            C6512pj0 c6512pj0 = C6512pj0.d;
            objT = this.e.t(i);
        }
        this.c--;
        return objT;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        O90.f(objArr, "array");
        r();
        int length = objArr.length;
        int i = this.c;
        int i2 = this.b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.a, i2, i + i2, objArr.getClass());
            O90.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        J8.g(0, i2, i + i2, this.a, objArr);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        r();
        return AbstractC3795fZ.b(this.a, this.b, this.c, this);
    }

    public final void u(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C6321oj0 c6321oj0 = this.d;
        if (c6321oj0 != null) {
            c6321oj0.u(i, i2);
        } else {
            C6512pj0 c6512pj0 = C6512pj0.d;
            this.e.u(i, i2);
        }
        this.c -= i2;
    }

    public final int v(int i, int i2, Collection collection, boolean z) {
        int iV;
        C6321oj0 c6321oj0 = this.d;
        if (c6321oj0 != null) {
            iV = c6321oj0.v(i, i2, collection, z);
        } else {
            C6512pj0 c6512pj0 = C6512pj0.d;
            iV = this.e.v(i, i2, collection, z);
        }
        if (iV > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= iV;
        return iV;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        r();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        return new C6130nj0(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        s();
        r();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            q(this.b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        O90.f(collection, "elements");
        s();
        r();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            k(this.b + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        r();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return J8.j(objArr, i2, i + i2);
    }
}
