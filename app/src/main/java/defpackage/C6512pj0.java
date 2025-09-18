package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: pj0 */
/* loaded from: classes2.dex */
public final class C6512pj0 extends O0 implements RandomAccess, Serializable {
    public static final C6512pj0 d;
    public Object[] a;
    public int b;
    public boolean c;

    static {
        C6512pj0 c6512pj0 = new C6512pj0(0);
        c6512pj0.c = true;
        d = c6512pj0;
    }

    public C6512pj0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.a = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        r();
        int i = this.b;
        ((AbstractList) this).modCount++;
        s(i, 1);
        this.a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        O90.f(collection, "elements");
        r();
        int size = collection.size();
        k(this.b, collection, size);
        return size > 0;
    }

    @Override // defpackage.O0
    public final int b() {
        return this.b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        r();
        u(0, this.b);
    }

    @Override // defpackage.O0
    public final Object d(int i) {
        r();
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        return t(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!AbstractC3795fZ.a(this.a, 0, this.b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        return this.a[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (O90.a(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        s(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (O90.a(this.a[i], obj)) {
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
        s(i, 1);
        this.a[i] = obj;
    }

    public final void r() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        r();
        return v(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        O90.f(collection, "elements");
        r();
        return v(0, this.b, collection, true) > 0;
    }

    public final void s(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.a;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i4);
            O90.e(objArrCopyOf, "copyOf(...)");
            this.a = objArrCopyOf;
        }
        Object[] objArr2 = this.a;
        J8.g(i + i2, i, this.b, objArr2, objArr2);
        this.b += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        r();
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC3758fM1.a(i, i2, this.b);
        return new C6321oj0(this.a, i, i2 - i, null, this);
    }

    public final Object t(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        J8.g(i, i + 1, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i2 = this.b - 1;
        O90.f(objArr2, "<this>");
        objArr2[i2] = null;
        this.b--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        O90.f(objArr, "array");
        int length = objArr.length;
        int i = this.b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.a, 0, i, objArr.getClass());
            O90.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        J8.g(0, 0, i, this.a, objArr);
        int i2 = this.b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC3795fZ.b(this.a, 0, this.b, this);
    }

    public final void u(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.a;
        J8.g(i, i + i2, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        AbstractC3795fZ.f(objArr2, i3 - i2, i3);
        this.b -= i2;
    }

    public final int v(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.a[i5]) == z) {
                Object[] objArr = this.a;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.a;
        J8.g(i + i4, i2 + i, this.b, objArr2, objArr2);
        Object[] objArr3 = this.a;
        int i7 = this.b;
        AbstractC3795fZ.f(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.b -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.b;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        return new C6130nj0(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        O90.f(collection, "elements");
        r();
        int i2 = this.b;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            k(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        r();
        int i2 = this.b;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            s(i, 1);
            this.a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return J8.j(this.a, 0, this.b);
    }
}
