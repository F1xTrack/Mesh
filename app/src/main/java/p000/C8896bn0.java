package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: bn0 */
/* loaded from: classes2.dex */
public final class C8896bn0 implements Map, Serializable, InterfaceC11697xe0 {

    /* renamed from: n */
    public static final C8896bn0 f17144n;

    /* renamed from: a */
    public Object[] f17145a;

    /* renamed from: b */
    public Object[] f17146b;

    /* renamed from: c */
    public int[] f17147c;

    /* renamed from: d */
    public int[] f17148d;

    /* renamed from: e */
    public int f17149e;

    /* renamed from: f */
    public int f17150f;

    /* renamed from: g */
    public int f17151g;

    /* renamed from: h */
    public int f17152h;

    /* renamed from: i */
    public int f17153i;

    /* renamed from: j */
    public C9024cn0 f17154j;

    /* renamed from: k */
    public C9157dn0 f17155k;

    /* renamed from: l */
    public C9024cn0 f17156l;

    /* renamed from: m */
    public boolean f17157m;

    static {
        C8896bn0 c8896bn0 = new C8896bn0(0);
        c8896bn0.f17157m = true;
        f17144n = c8896bn0;
    }

    public C8896bn0() {
        this(8);
    }

    /* renamed from: a */
    public final int m10509a(Object obj) {
        m10511c();
        while (true) {
            int iM10518l = m10518l(obj);
            int i = this.f17149e * 2;
            int length = this.f17148d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f17148d;
                int i3 = iArr[iM10518l];
                if (i3 <= 0) {
                    int i4 = this.f17150f;
                    Object[] objArr = this.f17145a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f17150f = i5;
                        objArr[i4] = obj;
                        this.f17147c[i4] = iM10518l;
                        iArr[iM10518l] = i5;
                        this.f17153i++;
                        this.f17152h++;
                        if (i2 > this.f17149e) {
                            this.f17149e = i2;
                        }
                        return i4;
                    }
                    m10515i(1);
                } else {
                    if (O90.m5963a(this.f17145a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m10519m(this.f17148d.length * 2);
                        break;
                    }
                    iM10518l = iM10518l == 0 ? this.f17148d.length - 1 : iM10518l - 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final C8896bn0 m10510b() {
        m10511c();
        this.f17157m = true;
        if (this.f17153i > 0) {
            return this;
        }
        C8896bn0 c8896bn0 = f17144n;
        O90.m5966d(c8896bn0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c8896bn0;
    }

    /* renamed from: c */
    public final void m10511c() {
        if (this.f17157m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m10511c();
        int i = this.f17150f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f17147c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f17148d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC4061fZ.m18256f(this.f17145a, 0, this.f17150f);
        Object[] objArr = this.f17146b;
        if (objArr != null) {
            AbstractC4061fZ.m18256f(objArr, 0, this.f17150f);
        }
        this.f17153i = 0;
        this.f17150f = 0;
        this.f17152h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m10516j(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m10517k(obj) >= 0;
    }

    /* renamed from: d */
    public final void m10512d(boolean z) {
        int i;
        Object[] objArr = this.f17146b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f17150f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f17147c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f17145a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f17148d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC4061fZ.m18256f(this.f17145a, i3, i);
        if (objArr != null) {
            AbstractC4061fZ.m18256f(objArr, i3, this.f17150f);
        }
        this.f17150f = i3;
    }

    /* renamed from: e */
    public final boolean m10513e(Collection collection) {
        O90.m5968f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m10514f((Map.Entry) obj)) {
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
        C9024cn0 c9024cn0 = this.f17156l;
        if (c9024cn0 != null) {
            return c9024cn0;
        }
        C9024cn0 c9024cn02 = new C9024cn0(this, 0);
        this.f17156l = c9024cn02;
        return c9024cn02;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f17153i != map.size() || !m10513e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m10514f(Map.Entry entry) {
        O90.m5968f(entry, "entry");
        int iM10516j = m10516j(entry.getKey());
        if (iM10516j < 0) {
            return false;
        }
        Object[] objArr = this.f17146b;
        O90.m5965c(objArr);
        return O90.m5963a(objArr[iM10516j], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM10516j = m10516j(obj);
        if (iM10516j < 0) {
            return null;
        }
        Object[] objArr = this.f17146b;
        O90.m5965c(objArr);
        return objArr[iM10516j];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C8586Ym0 c8586Ym0 = new C8586Ym0(this, 0);
        int i = 0;
        while (c8586Ym0.hasNext()) {
            int i2 = c8586Ym0.f15692a;
            C8896bn0 c8896bn0 = (C8896bn0) c8586Ym0.f15695d;
            if (i2 >= c8896bn0.f17150f) {
                throw new NoSuchElementException();
            }
            c8586Ym0.f15692a = i2 + 1;
            c8586Ym0.f15693b = i2;
            Object obj = c8896bn0.f17145a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c8896bn0.f17146b;
            O90.m5965c(objArr);
            Object obj2 = objArr[c8586Ym0.f15693b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c8586Ym0.m9816d();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* renamed from: i */
    public final void m10515i(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f17145a;
        int length = objArr.length;
        int i2 = this.f17150f;
        int i3 = length - i2;
        int i4 = i2 - this.f17153i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m10512d(true);
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
            O90.m5967e(objArrCopyOf2, "copyOf(...)");
            this.f17145a = objArrCopyOf2;
            Object[] objArr2 = this.f17146b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i6);
                O90.m5967e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f17146b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f17147c, i6);
            O90.m5967e(iArrCopyOf, "copyOf(...)");
            this.f17147c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f17148d.length) {
                m10519m(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f17153i == 0;
    }

    /* renamed from: j */
    public final int m10516j(Object obj) {
        int iM10518l = m10518l(obj);
        int i = this.f17149e;
        while (true) {
            int i2 = this.f17148d[iM10518l];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (O90.m5963a(this.f17145a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM10518l = iM10518l == 0 ? this.f17148d.length - 1 : iM10518l - 1;
        }
    }

    /* renamed from: k */
    public final int m10517k(Object obj) {
        int i = this.f17150f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f17147c[i] >= 0) {
                Object[] objArr = this.f17146b;
                O90.m5965c(objArr);
                if (O90.m5963a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        C9024cn0 c9024cn0 = this.f17154j;
        if (c9024cn0 != null) {
            return c9024cn0;
        }
        C9024cn0 c9024cn02 = new C9024cn0(this, 1);
        this.f17154j = c9024cn02;
        return c9024cn02;
    }

    /* renamed from: l */
    public final int m10518l(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f17151g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f17147c[r2] = r0;
        r2 = r6;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10519m(int r6) {
        /*
            r5 = this;
            int r0 = r5.f17152h
            int r0 = r0 + 1
            r5.f17152h = r0
            int r0 = r5.f17150f
            int r1 = r5.f17153i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.m10512d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f17148d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f17151g = r6
        L1c:
            int r6 = r5.f17150f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f17145a
            r0 = r0[r2]
            int r0 = r5.m10518l(r0)
            int r1 = r5.f17149e
        L2c:
            int[] r3 = r5.f17148d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f17147c
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C8896bn0.m10519m(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[LOOP:0: B:43:0x0024->B:67:?, LOOP_END, SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10520n(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f17145a
            java.lang.String r1 = "<this>"
            p000.O90.m5968f(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f17146b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f17147c
            r0 = r0[r12]
            int r1 = r11.f17149e
            int r1 = r1 * 2
            int[] r2 = r11.f17148d
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
            int[] r0 = r11.f17148d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f17149e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f17148d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f17148d
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
            java.lang.Object[] r5 = r11.f17145a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.m10518l(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f17148d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f17147c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f17148d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f17147c
            r0[r12] = r6
            int r12 = r11.f17153i
            int r12 = r12 + r6
            r11.f17153i = r12
            int r12 = r11.f17152h
            int r12 = r12 + 1
            r11.f17152h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8896bn0.m10520n(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m10511c();
        int iM10509a = m10509a(obj);
        Object[] objArr = this.f17146b;
        if (objArr == null) {
            int length = this.f17145a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f17146b = objArr;
        }
        if (iM10509a >= 0) {
            objArr[iM10509a] = obj2;
            return null;
        }
        int i = (-iM10509a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        O90.m5968f(map, "from");
        m10511c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m10515i(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM10509a = m10509a(entry.getKey());
            Object[] objArr = this.f17146b;
            if (objArr == null) {
                int length = this.f17145a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f17146b = objArr;
            }
            if (iM10509a >= 0) {
                objArr[iM10509a] = entry.getValue();
            } else {
                int i = (-iM10509a) - 1;
                if (!O90.m5963a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m10511c();
        int iM10516j = m10516j(obj);
        if (iM10516j < 0) {
            return null;
        }
        Object[] objArr = this.f17146b;
        O90.m5965c(objArr);
        Object obj2 = objArr[iM10516j];
        m10520n(iM10516j);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f17153i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f17153i * 3) + 2);
        sb.append("{");
        C8586Ym0 c8586Ym0 = new C8586Ym0(this, 0);
        int i = 0;
        while (c8586Ym0.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c8586Ym0.f15692a;
            C8896bn0 c8896bn0 = (C8896bn0) c8586Ym0.f15695d;
            if (i2 >= c8896bn0.f17150f) {
                throw new NoSuchElementException();
            }
            c8586Ym0.f15692a = i2 + 1;
            c8586Ym0.f15693b = i2;
            Object obj = c8896bn0.f17145a[i2];
            if (obj == c8896bn0) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c8896bn0.f17146b;
            O90.m5965c(objArr);
            Object obj2 = objArr[c8586Ym0.f15693b];
            if (obj2 == c8896bn0) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c8586Ym0.m9816d();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C9157dn0 c9157dn0 = this.f17155k;
        if (c9157dn0 != null) {
            return c9157dn0;
        }
        C9157dn0 c9157dn02 = new C9157dn0(this);
        this.f17155k = c9157dn02;
        return c9157dn02;
    }

    public C8896bn0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f17145a = objArr;
        this.f17146b = null;
        this.f17147c = iArr;
        this.f17148d = new int[iHighestOneBit];
        this.f17149e = 2;
        this.f17150f = 0;
        this.f17151g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
