package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: C8 */
/* loaded from: classes.dex */
public final class C0135C8 implements Collection, Set {

    /* renamed from: d */
    public static Object[] f1215d;

    /* renamed from: e */
    public static int f1216e;

    /* renamed from: f */
    public static Object[] f1217f;

    /* renamed from: g */
    public static int f1218g;

    /* renamed from: h */
    public static final Object f1219h = new Object();

    /* renamed from: i */
    public static final Object f1220i = new Object();

    /* renamed from: a */
    public int[] f1221a;

    /* renamed from: b */
    public Object[] f1222b;

    /* renamed from: c */
    public int f1223c;

    public C0135C8(int i) {
        if (i == 0) {
            this.f1221a = AbstractC7500Dp0.f2262a;
            this.f1222b = AbstractC7500Dp0.f2264c;
        } else {
            m989b(i);
        }
        this.f1223c = 0;
    }

    /* renamed from: d */
    public static void m988d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f1220i) {
                try {
                    if (f1218g < 10) {
                        objArr[0] = f1217f;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f1217f = objArr;
                        f1218g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (f1219h) {
                try {
                    if (f1216e < 10) {
                        objArr[0] = f1215d;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f1215d = objArr;
                        f1216e++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM990h;
        int i2 = this.f1223c;
        if (obj == null) {
            iM990h = m991i();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM990h = m990h(iHashCode, obj);
        }
        if (iM990h >= 0) {
            return false;
        }
        int i3 = ~iM990h;
        int[] iArr = this.f1221a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f1222b;
            m989b(i4);
            if (i2 != this.f1223c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1221a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1222b, 0, objArr.length);
            }
            m988d(iArr, objArr, i2);
        }
        if (i3 < i2) {
            int[] iArr3 = this.f1221a;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.f1222b;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.f1223c;
        if (i2 == i7) {
            int[] iArr4 = this.f1221a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f1222b[i3] = obj;
                this.f1223c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f1223c;
        int i = this.f1223c;
        int[] iArr = this.f1221a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1222b;
            m989b(size);
            int i2 = this.f1223c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f1221a, 0, i2);
                System.arraycopy(objArr, 0, this.f1222b, 0, this.f1223c);
            }
            m988d(iArr, objArr, this.f1223c);
        }
        if (this.f1223c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* renamed from: b */
    public final void m989b(int i) {
        if (i == 8) {
            synchronized (f1220i) {
                try {
                    Object[] objArr = f1217f;
                    if (objArr != null) {
                        try {
                            this.f1222b = objArr;
                            f1217f = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.f1221a = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                f1218g--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        f1217f = null;
                        f1218g = 0;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (f1219h) {
                try {
                    Object[] objArr2 = f1215d;
                    if (objArr2 != null) {
                        try {
                            this.f1222b = objArr2;
                            f1215d = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.f1221a = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                f1216e--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        f1215d = null;
                        f1216e = 0;
                    }
                } finally {
                }
            }
        }
        this.f1221a = new int[i];
        this.f1222b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f1223c;
        if (i != 0) {
            int[] iArr = this.f1221a;
            Object[] objArr = this.f1222b;
            this.f1221a = AbstractC7500Dp0.f2262a;
            this.f1222b = AbstractC7500Dp0.f2264c;
            this.f1223c = 0;
            m988d(iArr, objArr, i);
        }
        if (this.f1223c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m991i() : m990h(obj.hashCode(), obj)) >= 0;
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
            if (this.f1223c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f1223c; i++) {
                try {
                    if (!set.contains(this.f1222b[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int m990h(int i, Object obj) {
        int i2 = this.f1223c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM1900a = AbstractC7500Dp0.m1900a(i2, i, this.f1221a);
            if (iM1900a < 0 || obj.equals(this.f1222b[iM1900a])) {
                return iM1900a;
            }
            int i3 = iM1900a + 1;
            while (i3 < i2 && this.f1221a[i3] == i) {
                if (obj.equals(this.f1222b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM1900a - 1; i4 >= 0 && this.f1221a[i4] == i; i4--) {
                if (obj.equals(this.f1222b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f1221a;
        int i = this.f1223c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public final int m991i() {
        int i = this.f1223c;
        if (i == 0) {
            return -1;
        }
        try {
            int iM1900a = AbstractC7500Dp0.m1900a(i, 0, this.f1221a);
            if (iM1900a < 0 || this.f1222b[iM1900a] == null) {
                return iM1900a;
            }
            int i2 = iM1900a + 1;
            while (i2 < i && this.f1221a[i2] == 0) {
                if (this.f1222b[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM1900a - 1; i3 >= 0 && this.f1221a[i3] == 0; i3--) {
                if (this.f1222b[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1223c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6804s8(this);
    }

    /* renamed from: k */
    public final void m992k(int i) {
        int i2 = this.f1223c;
        Object[] objArr = this.f1222b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f1221a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                int i5 = i3 - i;
                System.arraycopy(iArr, i4, iArr, i, i5);
                Object[] objArr2 = this.f1222b;
                System.arraycopy(objArr2, i4, objArr2, i, i5);
            }
            this.f1222b[i3] = null;
        } else {
            m989b(i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f1221a, 0, i);
                System.arraycopy(objArr, 0, this.f1222b, 0, i);
            }
            if (i < i3) {
                int i6 = i + 1;
                int i7 = i3 - i;
                System.arraycopy(iArr, i6, this.f1221a, i, i7);
                System.arraycopy(objArr, i6, this.f1222b, i, i7);
            }
        }
        if (i2 != this.f1223c) {
            throw new ConcurrentModificationException();
        }
        this.f1223c = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM991i = obj == null ? m991i() : m990h(obj.hashCode(), obj);
        if (iM991i < 0) {
            return false;
        }
        m992k(iM991i);
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
        for (int i = this.f1223c - 1; i >= 0; i--) {
            if (!collection.contains(this.f1222b[i])) {
                m992k(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1223c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f1223c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1222b, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1223c * 14);
        sb.append('{');
        for (int i = 0; i < this.f1223c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f1222b[i];
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
        if (objArr.length < this.f1223c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f1223c);
        }
        System.arraycopy(this.f1222b, 0, objArr, 0, this.f1223c);
        int length = objArr.length;
        int i = this.f1223c;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
