package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class L01 {

    /* renamed from: d */
    public static Object[] f6444d;

    /* renamed from: e */
    public static int f6445e;

    /* renamed from: f */
    public static Object[] f6446f;

    /* renamed from: g */
    public static int f6447g;

    /* renamed from: a */
    public int[] f6448a = AbstractC7500Dp0.f2262a;

    /* renamed from: b */
    public Object[] f6449b = AbstractC7500Dp0.f2264c;

    /* renamed from: c */
    public int f6450c = 0;

    /* renamed from: c */
    public static void m4820c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (L01.class) {
                try {
                    if (f6447g < 10) {
                        objArr[0] = f6446f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f6446f = objArr;
                        f6447g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (L01.class) {
                try {
                    if (f6445e < 10) {
                        objArr[0] = f6444d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f6444d = objArr;
                        f6445e++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m4821a(int i) {
        if (i == 8) {
            synchronized (L01.class) {
                try {
                    Object[] objArr = f6446f;
                    if (objArr != null) {
                        this.f6449b = objArr;
                        f6446f = (Object[]) objArr[0];
                        this.f6448a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f6447g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (L01.class) {
                try {
                    Object[] objArr2 = f6444d;
                    if (objArr2 != null) {
                        this.f6449b = objArr2;
                        f6444d = (Object[]) objArr2[0];
                        this.f6448a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f6445e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f6448a = new int[i];
        this.f6449b = new Object[i << 1];
    }

    /* renamed from: b */
    public final void m4822b(int i) {
        int i2 = this.f6450c;
        int[] iArr = this.f6448a;
        if (iArr.length < i) {
            Object[] objArr = this.f6449b;
            m4821a(i);
            if (this.f6450c > 0) {
                System.arraycopy(iArr, 0, this.f6448a, 0, i2);
                System.arraycopy(objArr, 0, this.f6449b, 0, i2 << 1);
            }
            m4820c(iArr, objArr, i2);
        }
        if (this.f6450c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f6450c;
        if (i > 0) {
            int[] iArr = this.f6448a;
            Object[] objArr = this.f6449b;
            this.f6448a = AbstractC7500Dp0.f2262a;
            this.f6449b = AbstractC7500Dp0.f2264c;
            this.f6450c = 0;
            m4820c(iArr, objArr, i);
        }
        if (this.f6450c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m4824e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m4826g(obj) >= 0;
    }

    /* renamed from: d */
    public final int m4823d(int i, Object obj) {
        int i2 = this.f6450c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM1900a = AbstractC7500Dp0.m1900a(i2, i, this.f6448a);
            if (iM1900a < 0 || obj.equals(this.f6449b[iM1900a << 1])) {
                return iM1900a;
            }
            int i3 = iM1900a + 1;
            while (i3 < i2 && this.f6448a[i3] == i) {
                if (obj.equals(this.f6449b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM1900a - 1; i4 >= 0 && this.f6448a[i4] == i; i4--) {
                if (obj.equals(this.f6449b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final int m4824e(Object obj) {
        return obj == null ? m4825f() : m4823d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L01) {
            L01 l01 = (L01) obj;
            if (this.f6450c != l01.f6450c) {
                return false;
            }
            for (int i = 0; i < this.f6450c; i++) {
                Object objM4827i = m4827i(i);
                Object objM4831m = m4831m(i);
                Object orDefault = l01.getOrDefault(objM4827i, null);
                if (objM4831m == null) {
                    if (orDefault != null || !l01.containsKey(objM4827i)) {
                        return false;
                    }
                } else if (!objM4831m.equals(orDefault)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f6450c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f6450c; i2++) {
                Object objM4827i2 = m4827i(i2);
                Object objM4831m2 = m4831m(i2);
                Object obj2 = map.get(objM4827i2);
                if (objM4831m2 == null) {
                    if (obj2 != null || !map.containsKey(objM4827i2)) {
                        return false;
                    }
                } else if (!objM4831m2.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m4825f() {
        int i = this.f6450c;
        if (i == 0) {
            return -1;
        }
        try {
            int iM1900a = AbstractC7500Dp0.m1900a(i, 0, this.f6448a);
            if (iM1900a < 0 || this.f6449b[iM1900a << 1] == null) {
                return iM1900a;
            }
            int i2 = iM1900a + 1;
            while (i2 < i && this.f6448a[i2] == 0) {
                if (this.f6449b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM1900a - 1; i3 >= 0 && this.f6448a[i3] == 0; i3--) {
                if (this.f6449b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final int m4826g(Object obj) {
        int i = this.f6450c * 2;
        Object[] objArr = this.f6449b;
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
        int iM4824e = m4824e(obj);
        return iM4824e >= 0 ? this.f6449b[(iM4824e << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f6448a;
        Object[] objArr = this.f6449b;
        int i = this.f6450c;
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

    /* renamed from: i */
    public final Object m4827i(int i) {
        return this.f6449b[i << 1];
    }

    public final boolean isEmpty() {
        return this.f6450c <= 0;
    }

    /* renamed from: j */
    public void mo4828j(C7119x8 c7119x8) {
        int i = c7119x8.f6450c;
        m4822b(this.f6450c + i);
        if (this.f6450c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c7119x8.m4827i(i2), c7119x8.m4831m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c7119x8.f6448a, 0, this.f6448a, 0, i);
            System.arraycopy(c7119x8.f6449b, 0, this.f6449b, 0, i << 1);
            this.f6450c = i;
        }
    }

    /* renamed from: k */
    public Object mo4829k(int i) {
        Object[] objArr = this.f6449b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f6450c;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f6448a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 - i;
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr2 = this.f6449b;
                    System.arraycopy(objArr2, i5 << 1, objArr2, i2, i6 << 1);
                }
                Object[] objArr3 = this.f6449b;
                int i7 = i4 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                m4821a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f6450c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f6448a, 0, i);
                    System.arraycopy(objArr, 0, this.f6449b, 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    System.arraycopy(iArr, i8, this.f6448a, i, i9);
                    System.arraycopy(objArr, i8 << 1, this.f6449b, i2, i9 << 1);
                }
            }
            if (i3 != this.f6450c) {
                throw new ConcurrentModificationException();
            }
            this.f6450c = i4;
        }
        return obj;
    }

    /* renamed from: l */
    public Object mo4830l(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f6449b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* renamed from: m */
    public final Object m4831m(int i) {
        return this.f6449b[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int iM4823d;
        int i2 = this.f6450c;
        if (obj == null) {
            iM4823d = m4825f();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM4823d = m4823d(iHashCode, obj);
        }
        if (iM4823d >= 0) {
            int i3 = (iM4823d << 1) + 1;
            Object[] objArr = this.f6449b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iM4823d;
        int[] iArr = this.f6448a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f6449b;
            m4821a(i5);
            if (i2 != this.f6450c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f6448a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f6449b, 0, objArr2.length);
            }
            m4820c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f6448a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f6449b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f6450c - i4) << 1);
        }
        int i7 = this.f6450c;
        if (i2 == i7) {
            int[] iArr4 = this.f6448a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f6449b;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f6450c = i7 + 1;
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
        int iM4824e = m4824e(obj);
        if (iM4824e >= 0) {
            return mo4829k(iM4824e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM4824e = m4824e(obj);
        if (iM4824e >= 0) {
            return mo4830l(iM4824e, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f6450c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6450c * 28);
        sb.append('{');
        for (int i = 0; i < this.f6450c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM4827i = m4827i(i);
            if (objM4827i != this) {
                sb.append(objM4827i);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM4831m = m4831m(i);
            if (objM4831m != this) {
                sb.append(objM4831m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM4824e = m4824e(obj);
        if (iM4824e < 0) {
            return false;
        }
        Object objM4831m = m4831m(iM4824e);
        if (obj2 != objM4831m && (obj2 == null || !obj2.equals(objM4831m))) {
            return false;
        }
        mo4829k(iM4824e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM4824e = m4824e(obj);
        if (iM4824e < 0) {
            return false;
        }
        Object objM4831m = m4831m(iM4824e);
        if (objM4831m != obj2 && (obj2 == null || !obj2.equals(objM4831m))) {
            return false;
        }
        mo4830l(iM4824e, obj3);
        return true;
    }
}
