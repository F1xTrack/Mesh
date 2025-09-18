package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n8 */
/* loaded from: classes2.dex */
public final class C6470n8 extends AbstractC0882O0 {

    /* renamed from: d */
    public static final Object[] f38132d = new Object[0];

    /* renamed from: a */
    public int f38133a;

    /* renamed from: b */
    public Object[] f38134b = f38132d;

    /* renamed from: c */
    public int f38135c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f38135c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        if (i == i2) {
            m23084i(obj);
            return;
        }
        if (i == 0) {
            m23091v();
            m23086q(this.f38135c + 1);
            int i3 = this.f38133a;
            int iM4189p = i3 == 0 ? AbstractC0576J8.m4189p(this.f38134b) : i3 - 1;
            this.f38133a = iM4189p;
            this.f38134b[iM4189p] = obj;
            this.f38135c++;
            return;
        }
        m23091v();
        m23086q(this.f38135c + 1);
        int iM23090u = m23090u(this.f38133a + i);
        int i4 = this.f38135c;
        if (i < ((i4 + 1) >> 1)) {
            int iM4189p2 = iM23090u == 0 ? AbstractC0576J8.m4189p(this.f38134b) : iM23090u - 1;
            int i5 = this.f38133a;
            int iM4189p3 = i5 == 0 ? AbstractC0576J8.m4189p(this.f38134b) : i5 - 1;
            int i6 = this.f38133a;
            if (iM4189p2 >= i6) {
                Object[] objArr = this.f38134b;
                objArr[iM4189p3] = objArr[i6];
                AbstractC0576J8.m4180g(i6, i6 + 1, iM4189p2 + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.f38134b;
                AbstractC0576J8.m4180g(i6 - 1, i6, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.f38134b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC0576J8.m4180g(0, 1, iM4189p2 + 1, objArr3, objArr3);
            }
            this.f38134b[iM4189p2] = obj;
            this.f38133a = iM4189p3;
        } else {
            int iM23090u2 = m23090u(i4 + this.f38133a);
            if (iM23090u < iM23090u2) {
                Object[] objArr4 = this.f38134b;
                AbstractC0576J8.m4180g(iM23090u + 1, iM23090u, iM23090u2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f38134b;
                AbstractC0576J8.m4180g(1, 0, iM23090u2, objArr5, objArr5);
                Object[] objArr6 = this.f38134b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0576J8.m4180g(iM23090u + 1, iM23090u, objArr6.length - 1, objArr6, objArr6);
            }
            this.f38134b[iM23090u] = obj;
        }
        this.f38135c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        O90.m5968f(collection, "elements");
        int i2 = this.f38135c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f38135c) {
            return addAll(collection);
        }
        m23091v();
        m23086q(collection.size() + this.f38135c);
        int iM23090u = m23090u(this.f38135c + this.f38133a);
        int iM23090u2 = m23090u(this.f38133a + i);
        int size = collection.size();
        if (i < ((this.f38135c + 1) >> 1)) {
            int i3 = this.f38133a;
            int length = i3 - size;
            if (iM23090u2 < i3) {
                Object[] objArr = this.f38134b;
                AbstractC0576J8.m4180g(length, i3, objArr.length, objArr, objArr);
                if (size >= iM23090u2) {
                    Object[] objArr2 = this.f38134b;
                    AbstractC0576J8.m4180g(objArr2.length - size, 0, iM23090u2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f38134b;
                    AbstractC0576J8.m4180g(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f38134b;
                    AbstractC0576J8.m4180g(0, size, iM23090u2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f38134b;
                AbstractC0576J8.m4180g(length, i3, iM23090u2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f38134b;
                length += objArr6.length;
                int i4 = iM23090u2 - i3;
                int length2 = objArr6.length - length;
                if (length2 >= i4) {
                    AbstractC0576J8.m4180g(length, i3, iM23090u2, objArr6, objArr6);
                } else {
                    AbstractC0576J8.m4180g(length, i3, i3 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f38134b;
                    AbstractC0576J8.m4180g(0, this.f38133a + length2, iM23090u2, objArr7, objArr7);
                }
            }
            this.f38133a = length;
            m23085k(m23088s(iM23090u2 - size), collection);
        } else {
            int i5 = iM23090u2 + size;
            if (iM23090u2 < iM23090u) {
                int i6 = size + iM23090u;
                Object[] objArr8 = this.f38134b;
                if (i6 <= objArr8.length) {
                    AbstractC0576J8.m4180g(i5, iM23090u2, iM23090u, objArr8, objArr8);
                } else if (i5 >= objArr8.length) {
                    AbstractC0576J8.m4180g(i5 - objArr8.length, iM23090u2, iM23090u, objArr8, objArr8);
                } else {
                    int length3 = iM23090u - (i6 - objArr8.length);
                    AbstractC0576J8.m4180g(0, length3, iM23090u, objArr8, objArr8);
                    Object[] objArr9 = this.f38134b;
                    AbstractC0576J8.m4180g(i5, iM23090u2, length3, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f38134b;
                AbstractC0576J8.m4180g(size, 0, iM23090u, objArr10, objArr10);
                Object[] objArr11 = this.f38134b;
                if (i5 >= objArr11.length) {
                    AbstractC0576J8.m4180g(i5 - objArr11.length, iM23090u2, objArr11.length, objArr11, objArr11);
                } else {
                    AbstractC0576J8.m4180g(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f38134b;
                    AbstractC0576J8.m4180g(i5, iM23090u2, objArr12.length - size, objArr12, objArr12);
                }
            }
            m23085k(iM23090u2, collection);
        }
        return true;
    }

    @Override // p000.AbstractC0882O0
    /* renamed from: b */
    public final int mo5922b() {
        return this.f38135c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m23091v();
            m23089t(this.f38133a, m23090u(mo5922b() + this.f38133a));
        }
        this.f38133a = 0;
        this.f38135c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC0882O0
    /* renamed from: d */
    public final Object mo5923d(int i) {
        int i2 = this.f38135c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", i2, ", size: "));
        }
        if (i == AbstractC7230yu.m26273d(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            m23091v();
            int iM23090u = m23090u(AbstractC7230yu.m26273d(this) + this.f38133a);
            Object[] objArr = this.f38134b;
            Object obj = objArr[iM23090u];
            objArr[iM23090u] = null;
            this.f38135c--;
            return obj;
        }
        if (i == 0) {
            return m23092y();
        }
        m23091v();
        int iM23090u2 = m23090u(this.f38133a + i);
        Object[] objArr2 = this.f38134b;
        Object obj2 = objArr2[iM23090u2];
        if (i < (this.f38135c >> 1)) {
            int i3 = this.f38133a;
            if (iM23090u2 >= i3) {
                AbstractC0576J8.m4180g(i3 + 1, i3, iM23090u2, objArr2, objArr2);
            } else {
                AbstractC0576J8.m4180g(1, 0, iM23090u2, objArr2, objArr2);
                Object[] objArr3 = this.f38134b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.f38133a;
                AbstractC0576J8.m4180g(i4 + 1, i4, objArr3.length - 1, objArr3, objArr3);
            }
            Object[] objArr4 = this.f38134b;
            int i5 = this.f38133a;
            objArr4[i5] = null;
            this.f38133a = m23087r(i5);
        } else {
            int iM23090u3 = m23090u(AbstractC7230yu.m26273d(this) + this.f38133a);
            if (iM23090u2 <= iM23090u3) {
                Object[] objArr5 = this.f38134b;
                AbstractC0576J8.m4180g(iM23090u2, iM23090u2 + 1, iM23090u3 + 1, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f38134b;
                AbstractC0576J8.m4180g(iM23090u2, iM23090u2 + 1, objArr6.length, objArr6, objArr6);
                Object[] objArr7 = this.f38134b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC0576J8.m4180g(0, 1, iM23090u3 + 1, objArr7, objArr7);
            }
            this.f38134b[iM23090u3] = null;
        }
        this.f38135c--;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo5922b = mo5922b();
        if (i < 0 || i >= iMo5922b) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", iMo5922b, ", size: "));
        }
        return this.f38134b[m23090u(this.f38133a + i)];
    }

    /* renamed from: i */
    public final void m23084i(Object obj) {
        m23091v();
        m23086q(mo5922b() + 1);
        this.f38134b[m23090u(mo5922b() + this.f38133a)] = obj;
        this.f38135c = mo5922b() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM23090u = m23090u(mo5922b() + this.f38133a);
        int length = this.f38133a;
        if (length < iM23090u) {
            while (length < iM23090u) {
                if (O90.m5963a(obj, this.f38134b[length])) {
                    i = this.f38133a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM23090u) {
            return -1;
        }
        int length2 = this.f38134b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM23090u; i2++) {
                    if (O90.m5963a(obj, this.f38134b[i2])) {
                        length = i2 + this.f38134b.length;
                        i = this.f38133a;
                    }
                }
                return -1;
            }
            if (O90.m5963a(obj, this.f38134b[length])) {
                i = this.f38133a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo5922b() == 0;
    }

    /* renamed from: k */
    public final void m23085k(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f38134b.length;
        while (i < length && it.hasNext()) {
            this.f38134b[i] = it.next();
            i++;
        }
        int i2 = this.f38133a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f38134b[i3] = it.next();
        }
        this.f38135c = collection.size() + mo5922b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iM4189p;
        int i;
        int iM23090u = m23090u(mo5922b() + this.f38133a);
        int i2 = this.f38133a;
        if (i2 < iM23090u) {
            iM4189p = iM23090u - 1;
            if (i2 <= iM4189p) {
                while (!O90.m5963a(obj, this.f38134b[iM4189p])) {
                    if (iM4189p != i2) {
                        iM4189p--;
                    }
                }
                i = this.f38133a;
                return iM4189p - i;
            }
            return -1;
        }
        if (i2 > iM23090u) {
            int i3 = iM23090u - 1;
            while (true) {
                if (-1 >= i3) {
                    iM4189p = AbstractC0576J8.m4189p(this.f38134b);
                    int i4 = this.f38133a;
                    if (i4 <= iM4189p) {
                        while (!O90.m5963a(obj, this.f38134b[iM4189p])) {
                            if (iM4189p != i4) {
                                iM4189p--;
                            }
                        }
                        i = this.f38133a;
                    }
                } else {
                    if (O90.m5963a(obj, this.f38134b[i3])) {
                        iM4189p = i3 + this.f38134b.length;
                        i = this.f38133a;
                        break;
                    }
                    i3--;
                }
            }
            return iM4189p - i;
        }
        return -1;
    }

    /* renamed from: q */
    public final void m23086q(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f38134b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f38132d) {
            if (i < 10) {
                i = 10;
            }
            this.f38134b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC0576J8.m4180g(0, this.f38133a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f38134b;
        int length2 = objArr3.length;
        int i3 = this.f38133a;
        AbstractC0576J8.m4180g(length2 - i3, 0, i3, objArr3, objArr2);
        this.f38133a = 0;
        this.f38134b = objArr2;
    }

    /* renamed from: r */
    public final int m23087r(int i) {
        if (i == AbstractC0576J8.m4189p(this.f38134b)) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo5923d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM23090u;
        O90.m5968f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f38134b.length != 0) {
            int iM23090u2 = m23090u(this.f38135c + this.f38133a);
            int i = this.f38133a;
            if (i < iM23090u2) {
                iM23090u = i;
                while (i < iM23090u2) {
                    Object obj = this.f38134b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f38134b[iM23090u] = obj;
                        iM23090u++;
                    }
                    i++;
                }
                AbstractC0576J8.m4184k(this.f38134b, iM23090u, iM23090u2);
            } else {
                int length = this.f38134b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f38134b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f38134b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM23090u = m23090u(i2);
                for (int i3 = 0; i3 < iM23090u2; i3++) {
                    Object[] objArr2 = this.f38134b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f38134b[iM23090u] = obj3;
                        iM23090u = m23087r(iM23090u);
                    }
                }
                z = z2;
            }
            if (z) {
                m23091v();
                this.f38135c = m23088s(iM23090u - this.f38133a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC9360fM1.m18221a(i, i2, this.f38135c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f38135c) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo5923d(i);
            return;
        }
        m23091v();
        if (i < this.f38135c - i2) {
            int iM23090u = m23090u((i - 1) + this.f38133a);
            int iM23090u2 = m23090u((i2 - 1) + this.f38133a);
            while (i > 0) {
                int i4 = iM23090u + 1;
                int iMin = Math.min(i, Math.min(i4, iM23090u2 + 1));
                Object[] objArr = this.f38134b;
                int i5 = iM23090u2 - iMin;
                int i6 = iM23090u - iMin;
                AbstractC0576J8.m4180g(i5 + 1, i6 + 1, i4, objArr, objArr);
                iM23090u = m23088s(i6);
                iM23090u2 = m23088s(i5);
                i -= iMin;
            }
            int iM23090u3 = m23090u(this.f38133a + i3);
            m23089t(this.f38133a, iM23090u3);
            this.f38133a = iM23090u3;
        } else {
            int iM23090u4 = m23090u(this.f38133a + i2);
            int iM23090u5 = m23090u(this.f38133a + i);
            int i7 = this.f38135c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f38134b;
                i2 = Math.min(i7, Math.min(objArr2.length - iM23090u4, objArr2.length - iM23090u5));
                Object[] objArr3 = this.f38134b;
                int i8 = iM23090u4 + i2;
                AbstractC0576J8.m4180g(iM23090u5, iM23090u4, i8, objArr3, objArr3);
                iM23090u4 = m23090u(i8);
                iM23090u5 = m23090u(iM23090u5 + i2);
            }
            int iM23090u6 = m23090u(this.f38135c + this.f38133a);
            m23089t(m23088s(iM23090u6 - i3), iM23090u6);
        }
        this.f38135c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM23090u;
        O90.m5968f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f38134b.length != 0) {
            int iM23090u2 = m23090u(this.f38135c + this.f38133a);
            int i = this.f38133a;
            if (i < iM23090u2) {
                iM23090u = i;
                while (i < iM23090u2) {
                    Object obj = this.f38134b[i];
                    if (collection.contains(obj)) {
                        this.f38134b[iM23090u] = obj;
                        iM23090u++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC0576J8.m4184k(this.f38134b, iM23090u, iM23090u2);
            } else {
                int length = this.f38134b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f38134b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f38134b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM23090u = m23090u(i2);
                for (int i3 = 0; i3 < iM23090u2; i3++) {
                    Object[] objArr2 = this.f38134b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f38134b[iM23090u] = obj3;
                        iM23090u = m23087r(iM23090u);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m23091v();
                this.f38135c = m23088s(iM23090u - this.f38133a);
            }
        }
        return z;
    }

    /* renamed from: s */
    public final int m23088s(int i) {
        return i < 0 ? i + this.f38134b.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo5922b = mo5922b();
        if (i < 0 || i >= iMo5922b) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", iMo5922b, ", size: "));
        }
        int iM23090u = m23090u(this.f38133a + i);
        Object[] objArr = this.f38134b;
        Object obj2 = objArr[iM23090u];
        objArr[iM23090u] = obj;
        return obj2;
    }

    /* renamed from: t */
    public final void m23089t(int i, int i2) {
        if (i < i2) {
            AbstractC0576J8.m4184k(this.f38134b, i, i2);
            return;
        }
        Object[] objArr = this.f38134b;
        AbstractC0576J8.m4184k(objArr, i, objArr.length);
        AbstractC0576J8.m4184k(this.f38134b, 0, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo5922b()]);
    }

    /* renamed from: u */
    public final int m23090u(int i) {
        Object[] objArr = this.f38134b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: v */
    public final void m23091v() {
        ((AbstractList) this).modCount++;
    }

    /* renamed from: y */
    public final Object m23092y() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m23091v();
        Object[] objArr = this.f38134b;
        int i = this.f38133a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f38133a = m23087r(i);
        this.f38135c = mo5922b() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        O90.m5968f(objArr, "array");
        int length = objArr.length;
        int i = this.f38135c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            O90.m5966d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM23090u = m23090u(this.f38135c + this.f38133a);
        int i2 = this.f38133a;
        if (i2 < iM23090u) {
            AbstractC0576J8.m4180g(0, i2, iM23090u, this.f38134b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f38134b;
            AbstractC0576J8.m4180g(0, this.f38133a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f38134b;
            AbstractC0576J8.m4180g(objArr3.length - this.f38133a, 0, iM23090u, objArr3, objArr);
        }
        int i3 = this.f38135c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m23084i(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        O90.m5968f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m23091v();
        m23086q(collection.size() + mo5922b());
        m23085k(m23090u(mo5922b() + this.f38133a), collection);
        return true;
    }
}
