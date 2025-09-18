package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: bn0 */
/* loaded from: classes2.dex */
public final class C2391bn0 implements Map, Serializable, InterfaceC8022xe0 {
    public static final C2391bn0 n;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public C2581cn0 j;
    public C3457dn0 k;
    public C2581cn0 l;
    public boolean m;

    static {
        C2391bn0 c2391bn0 = new C2391bn0(0);
        c2391bn0.m = true;
        n = c2391bn0;
    }

    public C2391bn0() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iL = l(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iL];
                if (i3 <= 0) {
                    int i4 = this.f;
                    Object[] objArr = this.a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f = i5;
                        objArr[i4] = obj;
                        this.c[i4] = iL;
                        iArr[iL] = i5;
                        this.i++;
                        this.h++;
                        if (i2 > this.e) {
                            this.e = i2;
                        }
                        return i4;
                    }
                    i(1);
                } else {
                    if (O90.a(this.a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m(this.d.length * 2);
                        break;
                    }
                    iL = iL == 0 ? this.d.length - 1 : iL - 1;
                }
            }
        }
    }

    public final C2391bn0 b() {
        c();
        this.m = true;
        if (this.i > 0) {
            return this;
        }
        C2391bn0 c2391bn0 = n;
        O90.d(c2391bn0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c2391bn0;
    }

    public final void c() {
        if (this.m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC3795fZ.f(this.a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            AbstractC3795fZ.f(objArr, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return j(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return k(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC3795fZ.f(this.a, i3, i);
        if (objArr != null) {
            AbstractC3795fZ.f(objArr, i3, this.f);
        }
        this.f = i3;
    }

    public final boolean e(Collection collection) {
        O90.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2581cn0 c2581cn0 = this.l;
        if (c2581cn0 != null) {
            return c2581cn0;
        }
        C2581cn0 c2581cn02 = new C2581cn0(this, 0);
        this.l = c2581cn02;
        return c2581cn02;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.i != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        O90.f(entry, "entry");
        int iJ = j(entry.getKey());
        if (iJ < 0) {
            return false;
        }
        Object[] objArr = this.b;
        O90.c(objArr);
        return O90.a(objArr[iJ], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.b;
        O90.c(objArr);
        return objArr[iJ];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1928Ym0 c1928Ym0 = new C1928Ym0(this, 0);
        int i = 0;
        while (c1928Ym0.hasNext()) {
            int i2 = c1928Ym0.a;
            C2391bn0 c2391bn0 = (C2391bn0) c1928Ym0.d;
            if (i2 >= c2391bn0.f) {
                throw new NoSuchElementException();
            }
            c1928Ym0.a = i2 + 1;
            c1928Ym0.b = i2;
            Object obj = c2391bn0.a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c2391bn0.b;
            O90.c(objArr);
            Object obj2 = objArr[c1928Ym0.b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c1928Ym0.d();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final void i(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i6);
            O90.e(objArrCopyOf2, "copyOf(...)");
            this.a = objArrCopyOf2;
            Object[] objArr2 = this.b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i6);
                O90.e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.c, i6);
            O90.e(iArrCopyOf, "copyOf(...)");
            this.c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.d.length) {
                m(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final int j(Object obj) {
        int iL = l(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[iL];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (O90.a(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iL = iL == 0 ? this.d.length - 1 : iL - 1;
        }
    }

    public final int k(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                O90.c(objArr);
                if (O90.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2581cn0 c2581cn0 = this.j;
        if (c2581cn0 != null) {
            return c2581cn0;
        }
        C2581cn0 c2581cn02 = new C2581cn0(this, 1);
        this.j = c2581cn02;
        return c2581cn02;
    }

    public final int l(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0032, code lost:
    
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r6) {
        /*
            r5 = this;
            int r0 = r5.h
            int r0 = r0 + 1
            r5.h = r0
            int r0 = r5.f
            int r1 = r5.i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.g = r6
        L1c:
            int r6 = r5.f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.a
            r0 = r0[r2]
            int r0 = r5.l(r0)
            int r1 = r5.e
        L2c:
            int[] r3 = r5.d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2391bn0.m(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[LOOP:0: B:43:0x0024->B:67:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.a
            java.lang.String r1 = "<this>"
            defpackage.O90.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.c
            r0 = r0[r12]
            int r1 = r11.e
            int r1 = r1 * 2
            int[] r2 = r11.d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.l(r5)
            int r5 = r5 - r0
            int[] r9 = r11.d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.c
            r0[r12] = r6
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
            int r12 = r11.h
            int r12 = r12 + 1
            r11.h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2391bn0.n(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        O90.f(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        i(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!O90.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.b;
        O90.c(objArr);
        Object obj2 = objArr[iJ];
        n(iJ);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        C1928Ym0 c1928Ym0 = new C1928Ym0(this, 0);
        int i = 0;
        while (c1928Ym0.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c1928Ym0.a;
            C2391bn0 c2391bn0 = (C2391bn0) c1928Ym0.d;
            if (i2 >= c2391bn0.f) {
                throw new NoSuchElementException();
            }
            c1928Ym0.a = i2 + 1;
            c1928Ym0.b = i2;
            Object obj = c2391bn0.a[i2];
            if (obj == c2391bn0) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c2391bn0.b;
            O90.c(objArr);
            Object obj2 = objArr[c1928Ym0.b];
            if (obj2 == c2391bn0) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c1928Ym0.d();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C3457dn0 c3457dn0 = this.k;
        if (c3457dn0 != null) {
            return c3457dn0;
        }
        C3457dn0 c3457dn02 = new C3457dn0(this);
        this.k = c3457dn02;
        return c3457dn02;
    }

    public C2391bn0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
