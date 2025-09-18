package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class C8 implements Collection, Set {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;
    public static final Object h = new Object();
    public static final Object i = new Object();
    public int[] a;
    public Object[] b;
    public int c;

    public C8(int i2) {
        if (i2 == 0) {
            this.a = AbstractC0300Dp0.a;
            this.b = AbstractC0300Dp0.c;
        } else {
            b(i2);
        }
        this.c = 0;
    }

    public static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (i) {
                try {
                    if (g < 10) {
                        objArr[0] = f;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f = objArr;
                        g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h) {
                try {
                    if (e < 10) {
                        objArr[0] = d;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        d = objArr;
                        e++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iH;
        int i3 = this.c;
        if (obj == null) {
            iH = i();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iH = h(iHashCode, obj);
        }
        if (iH >= 0) {
            return false;
        }
        int i4 = ~iH;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.b;
            b(i5);
            if (i3 != this.c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.b, 0, objArr.length);
            }
            d(iArr, objArr, i3);
        }
        if (i4 < i3) {
            int[] iArr3 = this.a;
            int i6 = i4 + 1;
            int i7 = i3 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            Object[] objArr2 = this.b;
            System.arraycopy(objArr2, i4, objArr2, i6, i7);
        }
        int i8 = this.c;
        if (i3 == i8) {
            int[] iArr4 = this.a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.b[i4] = obj;
                this.c = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.c;
        int i2 = this.c;
        int[] iArr = this.a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            b(size);
            int i3 = this.c;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i3);
                System.arraycopy(objArr, 0, this.b, 0, this.c);
            }
            d(iArr, objArr, this.c);
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int i2) {
        if (i2 == 8) {
            synchronized (i) {
                try {
                    Object[] objArr = f;
                    if (objArr != null) {
                        try {
                            this.b = objArr;
                            f = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.a = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                g--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        f = null;
                        g = 0;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (h) {
                try {
                    Object[] objArr2 = d;
                    if (objArr2 != null) {
                        try {
                            this.b = objArr2;
                            d = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.a = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                e--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        d = null;
                        e = 0;
                    }
                } finally {
                }
            }
        }
        this.a = new int[i2];
        this.b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.c;
        if (i2 != 0) {
            int[] iArr = this.a;
            Object[] objArr = this.b;
            this.a = AbstractC0300Dp0.a;
            this.b = AbstractC0300Dp0.c;
            this.c = 0;
            d(iArr, objArr, i2);
        }
        if (this.c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i() : h(obj.hashCode(), obj)) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                try {
                    if (!set.contains(this.b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h(int i2, Object obj) {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0300Dp0.a(i3, i2, this.a);
            if (iA < 0 || obj.equals(this.b[iA])) {
                return iA;
            }
            int i4 = iA + 1;
            while (i4 < i3 && this.a[i4] == i2) {
                if (obj.equals(this.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iA - 1; i5 >= 0 && this.a[i5] == i2; i5--) {
                if (obj.equals(this.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i2 = this.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int i() {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0300Dp0.a(i2, 0, this.a);
            if (iA < 0 || this.b[iA] == null) {
                return iA;
            }
            int i3 = iA + 1;
            while (i3 < i2 && this.a[i3] == 0) {
                if (this.b[i3] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == 0; i4--) {
                if (this.b[i4] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6972s8(this);
    }

    public final void k(int i2) {
        int i3 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
            return;
        }
        int i4 = i3 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i2 < i4) {
                int i5 = i2 + 1;
                int i6 = i4 - i2;
                System.arraycopy(iArr, i5, iArr, i2, i6);
                Object[] objArr2 = this.b;
                System.arraycopy(objArr2, i5, objArr2, i2, i6);
            }
            this.b[i4] = null;
        } else {
            b(i3 > 8 ? i3 + (i3 >> 1) : 8);
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i2);
                System.arraycopy(objArr, 0, this.b, 0, i2);
            }
            if (i2 < i4) {
                int i7 = i2 + 1;
                int i8 = i4 - i2;
                System.arraycopy(iArr, i7, this.a, i2, i8);
                System.arraycopy(objArr, i7, this.b, i2, i8);
            }
        }
        if (i3 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i2 = obj == null ? i() : h(obj.hashCode(), obj);
        if (i2 < 0) {
            return false;
        }
        k(i2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i2 = this.c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.b[i2])) {
                k(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.b, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.c);
        }
        System.arraycopy(this.b, 0, objArr, 0, this.c);
        int length = objArr.length;
        int i2 = this.c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
