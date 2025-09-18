package p000;

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
public final class C10557oj0 extends AbstractC0882O0 implements RandomAccess, Serializable {

    /* renamed from: a */
    public Object[] f39199a;

    /* renamed from: b */
    public final int f39200b;

    /* renamed from: c */
    public int f39201c;

    /* renamed from: d */
    public final C10557oj0 f39202d;

    /* renamed from: e */
    public final C10685pj0 f39203e;

    public C10557oj0(Object[] objArr, int i, int i2, C10557oj0 c10557oj0, C10685pj0 c10685pj0) {
        O90.m5968f(objArr, "backing");
        O90.m5968f(c10685pj0, "root");
        this.f39199a = objArr;
        this.f39200b = i;
        this.f39201c = i2;
        this.f39202d = c10557oj0;
        this.f39203e = c10685pj0;
        ((AbstractList) this).modCount = ((AbstractList) c10685pj0).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m23532s();
        m23531r();
        m23530q(this.f39200b + this.f39201c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        O90.m5968f(collection, "elements");
        m23532s();
        m23531r();
        int size = collection.size();
        m23529k(this.f39200b + this.f39201c, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC0882O0
    /* renamed from: b */
    public final int mo5922b() {
        m23531r();
        return this.f39201c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m23532s();
        m23531r();
        m23534u(this.f39200b, this.f39201c);
    }

    @Override // p000.AbstractC0882O0
    /* renamed from: d */
    public final Object mo5923d(int i) {
        m23532s();
        m23531r();
        int i2 = this.f39201c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        return m23533t(this.f39200b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m23531r();
        if (obj != this) {
            if (obj instanceof List) {
                if (AbstractC4061fZ.m18251a(this.f39199a, this.f39200b, this.f39201c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m23531r();
        int i2 = this.f39201c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        return this.f39199a[this.f39200b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m23531r();
        Object[] objArr = this.f39199a;
        int i = this.f39201c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f39200b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m23531r();
        for (int i = 0; i < this.f39201c; i++) {
            if (O90.m5963a(this.f39199a[this.f39200b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m23531r();
        return this.f39201c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: k */
    public final void m23529k(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C10685pj0 c10685pj0 = this.f39203e;
        C10557oj0 c10557oj0 = this.f39202d;
        if (c10557oj0 != null) {
            c10557oj0.m23529k(i, collection, i2);
        } else {
            C10685pj0 c10685pj02 = C10685pj0.f40350d;
            c10685pj0.m23852k(i, collection, i2);
        }
        this.f39199a = c10685pj0.f40351a;
        this.f39201c += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m23531r();
        for (int i = this.f39201c - 1; i >= 0; i--) {
            if (O90.m5963a(this.f39199a[this.f39200b + i], obj)) {
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
    public final void m23530q(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C10685pj0 c10685pj0 = this.f39203e;
        C10557oj0 c10557oj0 = this.f39202d;
        if (c10557oj0 != null) {
            c10557oj0.m23530q(i, obj);
        } else {
            C10685pj0 c10685pj02 = C10685pj0.f40350d;
            c10685pj0.m23853q(i, obj);
        }
        this.f39199a = c10685pj0.f40351a;
        this.f39201c++;
    }

    /* renamed from: r */
    public final void m23531r() {
        if (((AbstractList) this.f39203e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m23532s();
        m23531r();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo5923d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        O90.m5968f(collection, "elements");
        m23532s();
        m23531r();
        return m23535v(this.f39200b, this.f39201c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        O90.m5968f(collection, "elements");
        m23532s();
        m23531r();
        return m23535v(this.f39200b, this.f39201c, collection, true) > 0;
    }

    /* renamed from: s */
    public final void m23532s() {
        if (this.f39203e.f40353c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m23532s();
        m23531r();
        int i2 = this.f39201c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        Object[] objArr = this.f39199a;
        int i3 = this.f39200b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC9360fM1.m18221a(i, i2, this.f39201c);
        return new C10557oj0(this.f39199a, this.f39200b + i, i2 - i, this, this.f39203e);
    }

    /* renamed from: t */
    public final Object m23533t(int i) {
        Object objM23856t;
        ((AbstractList) this).modCount++;
        C10557oj0 c10557oj0 = this.f39202d;
        if (c10557oj0 != null) {
            objM23856t = c10557oj0.m23533t(i);
        } else {
            C10685pj0 c10685pj0 = C10685pj0.f40350d;
            objM23856t = this.f39203e.m23856t(i);
        }
        this.f39201c--;
        return objM23856t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        O90.m5968f(objArr, "array");
        m23531r();
        int length = objArr.length;
        int i = this.f39201c;
        int i2 = this.f39200b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f39199a, i2, i + i2, objArr.getClass());
            O90.m5967e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC0576J8.m4180g(0, i2, i + i2, this.f39199a, objArr);
        int i3 = this.f39201c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m23531r();
        return AbstractC4061fZ.m18252b(this.f39199a, this.f39200b, this.f39201c, this);
    }

    /* renamed from: u */
    public final void m23534u(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C10557oj0 c10557oj0 = this.f39202d;
        if (c10557oj0 != null) {
            c10557oj0.m23534u(i, i2);
        } else {
            C10685pj0 c10685pj0 = C10685pj0.f40350d;
            this.f39203e.m23857u(i, i2);
        }
        this.f39201c -= i2;
    }

    /* renamed from: v */
    public final int m23535v(int i, int i2, Collection collection, boolean z) {
        int iM23858v;
        C10557oj0 c10557oj0 = this.f39202d;
        if (c10557oj0 != null) {
            iM23858v = c10557oj0.m23535v(i, i2, collection, z);
        } else {
            C10685pj0 c10685pj0 = C10685pj0.f40350d;
            iM23858v = this.f39203e.m23858v(i, i2, collection, z);
        }
        if (iM23858v > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f39201c -= iM23858v;
        return iM23858v;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m23531r();
        int i2 = this.f39201c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        return new C10429nj0(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m23532s();
        m23531r();
        int i2 = this.f39201c;
        if (i >= 0 && i <= i2) {
            m23530q(this.f39200b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        O90.m5968f(collection, "elements");
        m23532s();
        m23531r();
        int i2 = this.f39201c;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m23529k(this.f39200b + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m23531r();
        Object[] objArr = this.f39199a;
        int i = this.f39201c;
        int i2 = this.f39200b;
        return AbstractC0576J8.m4183j(objArr, i2, i + i2);
    }
}
