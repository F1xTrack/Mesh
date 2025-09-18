package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class L01 {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;
    public int[] a = AbstractC0300Dp0.a;
    public Object[] b = AbstractC0300Dp0.c;
    public int c = 0;

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (L01.class) {
                try {
                    if (g < 10) {
                        objArr[0] = f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
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
            synchronized (L01.class) {
                try {
                    if (e < 10) {
                        objArr[0] = d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        d = objArr;
                        e++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (L01.class) {
                try {
                    Object[] objArr = f;
                    if (objArr != null) {
                        this.b = objArr;
                        f = (Object[]) objArr[0];
                        this.a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (L01.class) {
                try {
                    Object[] objArr2 = d;
                    if (objArr2 != null) {
                        this.b = objArr2;
                        d = (Object[]) objArr2[0];
                        this.a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.a = new int[i];
        this.b = new Object[i << 1];
    }

    public final void b(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            a(i);
            if (this.c > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i2);
                System.arraycopy(objArr, 0, this.b, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.a;
            Object[] objArr = this.b;
            this.a = AbstractC0300Dp0.a;
            this.b = AbstractC0300Dp0.c;
            this.c = 0;
            c(iArr, objArr, i);
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0300Dp0.a(i2, i, this.a);
            if (iA < 0 || obj.equals(this.b[iA << 1])) {
                return iA;
            }
            int i3 = iA + 1;
            while (i3 < i2 && this.a[i3] == i) {
                if (obj.equals(this.b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == i; i4--) {
                if (obj.equals(this.b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L01) {
            L01 l01 = (L01) obj;
            if (this.c != l01.c) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                Object objI = i(i);
                Object objM = m(i);
                Object orDefault = l01.getOrDefault(objI, null);
                if (objM == null) {
                    if (orDefault != null || !l01.containsKey(objI)) {
                        return false;
                    }
                } else if (!objM.equals(orDefault)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                Object objI2 = i(i2);
                Object objM2 = m(i2);
                Object obj2 = map.get(objI2);
                if (objM2 == null) {
                    if (obj2 != null || !map.containsKey(objI2)) {
                        return false;
                    }
                } else if (!objM2.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0300Dp0.a(i, 0, this.a);
            if (iA < 0 || this.b[iA << 1] == null) {
                return iA;
            }
            int i2 = iA + 1;
            while (i2 < i && this.a[i2] == 0) {
                if (this.b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iA - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
                if (this.b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.b[(iE << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        return this.b[i << 1];
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public void j(C7925x8 c7925x8) {
        int i = c7925x8.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c7925x8.i(i2), c7925x8.m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c7925x8.a, 0, this.a, 0, i);
            System.arraycopy(c7925x8.b, 0, this.b, 0, i << 1);
            this.c = i;
        }
    }

    public Object k(int i) {
        Object[] objArr = this.b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.c;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 - i;
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr2 = this.b;
                    System.arraycopy(objArr2, i5 << 1, objArr2, i2, i6 << 1);
                }
                Object[] objArr3 = this.b;
                int i7 = i4 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.a, 0, i);
                    System.arraycopy(objArr, 0, this.b, 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    System.arraycopy(iArr, i8, this.a, i, i9);
                    System.arraycopy(objArr, i8 << 1, this.b, i2, i9 << 1);
                }
            }
            if (i3 != this.c) {
                throw new ConcurrentModificationException();
            }
            this.c = i4;
        }
        return obj;
    }

    public Object l(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object m(int i) {
        return this.b[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int iD;
        int i2 = this.c;
        if (obj == null) {
            iD = f();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iD = d(iHashCode, obj);
        }
        if (iD >= 0) {
            int i3 = (iD << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iD;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.b;
            a(i5);
            if (i2 != this.c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.b, 0, objArr2.length);
            }
            c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.c - i4) << 1);
        }
        int i7 = this.c;
        if (i2 == i7) {
            int[] iArr4 = this.a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.b;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return k(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return l(iE, obj2);
        }
        return null;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objI = i(i);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM = m(i);
            if (objM != this) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objM = m(iE);
        if (obj2 != objM && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        k(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objM = m(iE);
        if (objM != obj2 && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        l(iE, obj3);
        return true;
    }
}
