package p000;

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
public final class C10685pj0 extends AbstractC0882O0 implements RandomAccess, Serializable {

    /* renamed from: d */
    public static final C10685pj0 f40350d;

    /* renamed from: a */
    public Object[] f40351a;

    /* renamed from: b */
    public int f40352b;

    /* renamed from: c */
    public boolean f40353c;

    static {
        C10685pj0 c10685pj0 = new C10685pj0(0);
        c10685pj0.f40353c = true;
        f40350d = c10685pj0;
    }

    public C10685pj0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f40351a = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m23854r();
        int i = this.f40352b;
        ((AbstractList) this).modCount++;
        m23855s(i, 1);
        this.f40351a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        O90.m5968f(collection, "elements");
        m23854r();
        int size = collection.size();
        m23852k(this.f40352b, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC0882O0
    /* renamed from: b */
    public final int mo5922b() {
        return this.f40352b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m23854r();
        m23857u(0, this.f40352b);
    }

    @Override // p000.AbstractC0882O0
    /* renamed from: d */
    public final Object mo5923d(int i) {
        m23854r();
        int i2 = this.f40352b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        return m23856t(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!AbstractC4061fZ.m18251a(this.f40351a, 0, this.f40352b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f40352b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        return this.f40351a[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f40351a;
        int i = this.f40352b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f40352b; i++) {
            if (O90.m5963a(this.f40351a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f40352b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: k */
    public final void m23852k(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m23855s(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f40351a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f40352b - 1; i >= 0; i--) {
            if (O90.m5963a(this.f40351a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: q */
    public final void m23853q(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m23855s(i, 1);
        this.f40351a[i] = obj;
    }

    /* renamed from: r */
    public final void m23854r() {
        if (this.f40353c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m23854r();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo5923d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        O90.m5968f(collection, "elements");
        m23854r();
        return m23858v(0, this.f40352b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        O90.m5968f(collection, "elements");
        m23854r();
        return m23858v(0, this.f40352b, collection, true) > 0;
    }

    /* renamed from: s */
    public final void m23855s(int i, int i2) {
        int i3 = this.f40352b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f40351a;
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
            O90.m5967e(objArrCopyOf, "copyOf(...)");
            this.f40351a = objArrCopyOf;
        }
        Object[] objArr2 = this.f40351a;
        AbstractC0576J8.m4180g(i + i2, i, this.f40352b, objArr2, objArr2);
        this.f40352b += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m23854r();
        int i2 = this.f40352b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        Object[] objArr = this.f40351a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC9360fM1.m18221a(i, i2, this.f40352b);
        return new C10557oj0(this.f40351a, i, i2 - i, null, this);
    }

    /* renamed from: t */
    public final Object m23856t(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f40351a;
        Object obj = objArr[i];
        AbstractC0576J8.m4180g(i, i + 1, this.f40352b, objArr, objArr);
        Object[] objArr2 = this.f40351a;
        int i2 = this.f40352b - 1;
        O90.m5968f(objArr2, "<this>");
        objArr2[i2] = null;
        this.f40352b--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        O90.m5968f(objArr, "array");
        int length = objArr.length;
        int i = this.f40352b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f40351a, 0, i, objArr.getClass());
            O90.m5967e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC0576J8.m4180g(0, 0, i, this.f40351a, objArr);
        int i2 = this.f40352b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC4061fZ.m18252b(this.f40351a, 0, this.f40352b, this);
    }

    /* renamed from: u */
    public final void m23857u(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f40351a;
        AbstractC0576J8.m4180g(i, i + i2, this.f40352b, objArr, objArr);
        Object[] objArr2 = this.f40351a;
        int i3 = this.f40352b;
        AbstractC4061fZ.m18256f(objArr2, i3 - i2, i3);
        this.f40352b -= i2;
    }

    /* renamed from: v */
    public final int m23858v(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f40351a[i5]) == z) {
                Object[] objArr = this.f40351a;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f40351a;
        AbstractC0576J8.m4180g(i + i4, i2 + i, this.f40352b, objArr2, objArr2);
        Object[] objArr3 = this.f40351a;
        int i7 = this.f40352b;
        AbstractC4061fZ.m18256f(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f40352b -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f40352b;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        return new C10429nj0(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        O90.m5968f(collection, "elements");
        m23854r();
        int i2 = this.f40352b;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m23852k(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m23854r();
        int i2 = this.f40352b;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            m23855s(i, 1);
            this.f40351a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0576J8.m4183j(this.f40351a, 0, this.f40352b);
    }
}
