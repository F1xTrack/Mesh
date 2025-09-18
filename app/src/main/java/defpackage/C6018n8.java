package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n8 */
/* loaded from: classes2.dex */
public final class C6018n8 extends O0 {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        if (i == i2) {
            i(obj);
            return;
        }
        if (i == 0) {
            v();
            q(this.c + 1);
            int i3 = this.a;
            int iP = i3 == 0 ? J8.p(this.b) : i3 - 1;
            this.a = iP;
            this.b[iP] = obj;
            this.c++;
            return;
        }
        v();
        q(this.c + 1);
        int iU = u(this.a + i);
        int i4 = this.c;
        if (i < ((i4 + 1) >> 1)) {
            int iP2 = iU == 0 ? J8.p(this.b) : iU - 1;
            int i5 = this.a;
            int iP3 = i5 == 0 ? J8.p(this.b) : i5 - 1;
            int i6 = this.a;
            if (iP2 >= i6) {
                Object[] objArr = this.b;
                objArr[iP3] = objArr[i6];
                J8.g(i6, i6 + 1, iP2 + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.b;
                J8.g(i6 - 1, i6, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.b;
                objArr3[objArr3.length - 1] = objArr3[0];
                J8.g(0, 1, iP2 + 1, objArr3, objArr3);
            }
            this.b[iP2] = obj;
            this.a = iP3;
        } else {
            int iU2 = u(i4 + this.a);
            if (iU < iU2) {
                Object[] objArr4 = this.b;
                J8.g(iU + 1, iU, iU2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.b;
                J8.g(1, 0, iU2, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                J8.g(iU + 1, iU, objArr6.length - 1, objArr6, objArr6);
            }
            this.b[iU] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        O90.f(collection, "elements");
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        v();
        q(collection.size() + this.c);
        int iU = u(this.c + this.a);
        int iU2 = u(this.a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i3 = this.a;
            int length = i3 - size;
            if (iU2 < i3) {
                Object[] objArr = this.b;
                J8.g(length, i3, objArr.length, objArr, objArr);
                if (size >= iU2) {
                    Object[] objArr2 = this.b;
                    J8.g(objArr2.length - size, 0, iU2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.b;
                    J8.g(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    J8.g(0, size, iU2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.b;
                J8.g(length, i3, iU2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.b;
                length += objArr6.length;
                int i4 = iU2 - i3;
                int length2 = objArr6.length - length;
                if (length2 >= i4) {
                    J8.g(length, i3, iU2, objArr6, objArr6);
                } else {
                    J8.g(length, i3, i3 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.b;
                    J8.g(0, this.a + length2, iU2, objArr7, objArr7);
                }
            }
            this.a = length;
            k(s(iU2 - size), collection);
        } else {
            int i5 = iU2 + size;
            if (iU2 < iU) {
                int i6 = size + iU;
                Object[] objArr8 = this.b;
                if (i6 <= objArr8.length) {
                    J8.g(i5, iU2, iU, objArr8, objArr8);
                } else if (i5 >= objArr8.length) {
                    J8.g(i5 - objArr8.length, iU2, iU, objArr8, objArr8);
                } else {
                    int length3 = iU - (i6 - objArr8.length);
                    J8.g(0, length3, iU, objArr8, objArr8);
                    Object[] objArr9 = this.b;
                    J8.g(i5, iU2, length3, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.b;
                J8.g(size, 0, iU, objArr10, objArr10);
                Object[] objArr11 = this.b;
                if (i5 >= objArr11.length) {
                    J8.g(i5 - objArr11.length, iU2, objArr11.length, objArr11, objArr11);
                } else {
                    J8.g(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.b;
                    J8.g(i5, iU2, objArr12.length - size, objArr12, objArr12);
                }
            }
            k(iU2, collection);
        }
        return true;
    }

    @Override // defpackage.O0
    public final int b() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            v();
            t(this.a, u(b() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.O0
    public final Object d(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", i2, ", size: "));
        }
        if (i == AbstractC8259yu.d(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            v();
            int iU = u(AbstractC8259yu.d(this) + this.a);
            Object[] objArr = this.b;
            Object obj = objArr[iU];
            objArr[iU] = null;
            this.c--;
            return obj;
        }
        if (i == 0) {
            return y();
        }
        v();
        int iU2 = u(this.a + i);
        Object[] objArr2 = this.b;
        Object obj2 = objArr2[iU2];
        if (i < (this.c >> 1)) {
            int i3 = this.a;
            if (iU2 >= i3) {
                J8.g(i3 + 1, i3, iU2, objArr2, objArr2);
            } else {
                J8.g(1, 0, iU2, objArr2, objArr2);
                Object[] objArr3 = this.b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.a;
                J8.g(i4 + 1, i4, objArr3.length - 1, objArr3, objArr3);
            }
            Object[] objArr4 = this.b;
            int i5 = this.a;
            objArr4[i5] = null;
            this.a = r(i5);
        } else {
            int iU3 = u(AbstractC8259yu.d(this) + this.a);
            if (iU2 <= iU3) {
                Object[] objArr5 = this.b;
                J8.g(iU2, iU2 + 1, iU3 + 1, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.b;
                J8.g(iU2, iU2 + 1, objArr6.length, objArr6, objArr6);
                Object[] objArr7 = this.b;
                objArr7[objArr7.length - 1] = objArr7[0];
                J8.g(0, 1, iU3 + 1, objArr7, objArr7);
            }
            this.b[iU3] = null;
        }
        this.c--;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iB = b();
        if (i < 0 || i >= iB) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", iB, ", size: "));
        }
        return this.b[u(this.a + i)];
    }

    public final void i(Object obj) {
        v();
        q(b() + 1);
        this.b[u(b() + this.a)] = obj;
        this.c = b() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iU = u(b() + this.a);
        int length = this.a;
        if (length < iU) {
            while (length < iU) {
                if (O90.a(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iU) {
            return -1;
        }
        int length2 = this.b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iU; i2++) {
                    if (O90.a(obj, this.b[i2])) {
                        length = i2 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (O90.a(obj, this.b[length])) {
                i = this.a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final void k(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iP;
        int i;
        int iU = u(b() + this.a);
        int i2 = this.a;
        if (i2 < iU) {
            iP = iU - 1;
            if (i2 <= iP) {
                while (!O90.a(obj, this.b[iP])) {
                    if (iP != i2) {
                        iP--;
                    }
                }
                i = this.a;
                return iP - i;
            }
            return -1;
        }
        if (i2 > iU) {
            int i3 = iU - 1;
            while (true) {
                if (-1 >= i3) {
                    iP = J8.p(this.b);
                    int i4 = this.a;
                    if (i4 <= iP) {
                        while (!O90.a(obj, this.b[iP])) {
                            if (iP != i4) {
                                iP--;
                            }
                        }
                        i = this.a;
                    }
                } else {
                    if (O90.a(obj, this.b[i3])) {
                        iP = i3 + this.b.length;
                        i = this.a;
                        break;
                    }
                    i3--;
                }
            }
            return iP - i;
        }
        return -1;
    }

    public final void q(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
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
        J8.g(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        J8.g(length2 - i3, 0, i3, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    public final int r(int i) {
        if (i == J8.p(this.b)) {
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
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iU;
        O90.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iU2 = u(this.c + this.a);
            int i = this.a;
            if (i < iU2) {
                iU = i;
                while (i < iU2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[iU] = obj;
                        iU++;
                    }
                    i++;
                }
                J8.k(this.b, iU, iU2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iU = u(i2);
                for (int i3 = 0; i3 < iU2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[iU] = obj3;
                        iU = r(iU);
                    }
                }
                z = z2;
            }
            if (z) {
                v();
                this.c = s(iU - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC3758fM1.a(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
            return;
        }
        if (i3 == 1) {
            d(i);
            return;
        }
        v();
        if (i < this.c - i2) {
            int iU = u((i - 1) + this.a);
            int iU2 = u((i2 - 1) + this.a);
            while (i > 0) {
                int i4 = iU + 1;
                int iMin = Math.min(i, Math.min(i4, iU2 + 1));
                Object[] objArr = this.b;
                int i5 = iU2 - iMin;
                int i6 = iU - iMin;
                J8.g(i5 + 1, i6 + 1, i4, objArr, objArr);
                iU = s(i6);
                iU2 = s(i5);
                i -= iMin;
            }
            int iU3 = u(this.a + i3);
            t(this.a, iU3);
            this.a = iU3;
        } else {
            int iU4 = u(this.a + i2);
            int iU5 = u(this.a + i);
            int i7 = this.c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i7, Math.min(objArr2.length - iU4, objArr2.length - iU5));
                Object[] objArr3 = this.b;
                int i8 = iU4 + i2;
                J8.g(iU5, iU4, i8, objArr3, objArr3);
                iU4 = u(i8);
                iU5 = u(iU5 + i2);
            }
            int iU6 = u(this.c + this.a);
            t(s(iU6 - i3), iU6);
        }
        this.c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iU;
        O90.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iU2 = u(this.c + this.a);
            int i = this.a;
            if (i < iU2) {
                iU = i;
                while (i < iU2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[iU] = obj;
                        iU++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                J8.k(this.b, iU, iU2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iU = u(i2);
                for (int i3 = 0; i3 < iU2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iU] = obj3;
                        iU = r(iU);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                v();
                this.c = s(iU - this.a);
            }
        }
        return z;
    }

    public final int s(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iB = b();
        if (i < 0 || i >= iB) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", iB, ", size: "));
        }
        int iU = u(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iU];
        objArr[iU] = obj;
        return obj2;
    }

    public final void t(int i, int i2) {
        if (i < i2) {
            J8.k(this.b, i, i2);
            return;
        }
        Object[] objArr = this.b;
        J8.k(objArr, i, objArr.length);
        J8.k(this.b, 0, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    public final int u(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void v() {
        ((AbstractList) this).modCount++;
    }

    public final Object y() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        v();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = r(i);
        this.c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        O90.f(objArr, "array");
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            O90.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iU = u(this.c + this.a);
        int i2 = this.a;
        if (i2 < iU) {
            J8.g(0, i2, iU, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            J8.g(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            J8.g(objArr3.length - this.a, 0, iU, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        O90.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        v();
        q(collection.size() + b());
        k(u(b() + this.a), collection);
        return true;
    }
}
