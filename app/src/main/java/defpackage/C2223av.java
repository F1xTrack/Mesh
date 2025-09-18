package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: av */
/* loaded from: classes.dex */
public final class C2223av extends AbstractMap implements Serializable {
    public static final Object k = new Object();
    public static final Object l = new Object();
    public final /* synthetic */ int a;
    public transient Object b;
    public transient int[] c;
    public transient Object[] d;
    public transient Object[] e;
    public transient int f;
    public transient int g;
    public transient AbstractSet h;
    public transient AbstractSet i;
    public transient AbstractCollection j;

    public C2223av(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.f = Math.min(Math.max(12, 1), 1073741823);
                break;
        }
    }

    public static C2223av a() {
        C2223av c2223av = new C2223av(0);
        c2223av.f = AbstractC6955s22.c(3, 1);
        return c2223av;
    }

    public static C2223av b(int i) {
        C2223av c2223av = new C2223av(0);
        if (i < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        c2223av.f = AbstractC6955s22.c(i, 1);
        return c2223av;
    }

    public Map c() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                if (!g()) {
                    this.f += 32;
                    Map mapC = c();
                    if (mapC == null) {
                        Arrays.fill(k(), 0, this.g, (Object) null);
                        Arrays.fill(l(), 0, this.g, (Object) null);
                        Object obj = this.b;
                        Objects.requireNonNull(obj);
                        if (obj instanceof byte[]) {
                            Arrays.fill((byte[]) obj, (byte) 0);
                        } else if (obj instanceof short[]) {
                            Arrays.fill((short[]) obj, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj, 0);
                        }
                        Arrays.fill(j(), 0, this.g, 0);
                        this.g = 0;
                        break;
                    } else {
                        this.f = AbstractC6955s22.c(size(), 3);
                        mapC.clear();
                        this.b = null;
                        this.g = 0;
                        break;
                    }
                }
                break;
            default:
                if (!s()) {
                    this.f += 32;
                    Map mapQ = q();
                    if (mapQ == null) {
                        Arrays.fill(o(), 0, this.g, (Object) null);
                        Arrays.fill(p(), 0, this.g, (Object) null);
                        Object obj2 = this.b;
                        Objects.requireNonNull(obj2);
                        if (obj2 instanceof byte[]) {
                            Arrays.fill((byte[]) obj2, (byte) 0);
                        } else if (obj2 instanceof short[]) {
                            Arrays.fill((short[]) obj2, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj2, 0);
                        }
                        Arrays.fill(n(), 0, this.g, 0);
                        this.g = 0;
                        break;
                    } else {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        mapQ.clear();
                        this.b = null;
                        this.g = 0;
                        break;
                    }
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                Map mapC = c();
                return mapC != null ? mapC.containsKey(obj) : e(obj) != -1;
            default:
                Map mapQ = q();
                return mapQ != null ? mapQ.containsKey(obj) : u(obj) != -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                Map mapC = c();
                if (mapC != null) {
                    return mapC.containsValue(obj);
                }
                for (int i = 0; i < this.g; i++) {
                    if (AbstractC5465kE1.a(obj, l()[i])) {
                        return true;
                    }
                }
                return false;
            default:
                Map mapQ = q();
                if (mapQ != null) {
                    return mapQ.containsValue(obj);
                }
                for (int i2 = 0; i2 < this.g; i2++) {
                    if (O12.b(obj, p()[i2])) {
                        return true;
                    }
                }
                return false;
        }
    }

    public int d() {
        return (1 << (this.f & 31)) - 1;
    }

    public int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iB = J12.b(obj);
        int iD = d();
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int iF = AT1.f(iB & iD, obj2);
        if (iF == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iB & i;
        do {
            int i3 = iF - 1;
            int i4 = j()[i3];
            if ((i4 & i) == i2 && AbstractC5465kE1.a(obj, k()[i3])) {
                return i3;
            }
            iF = i4 & iD;
        } while (iF != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                C1873Xu c1873Xu = (C1873Xu) this.i;
                if (c1873Xu != null) {
                    return c1873Xu;
                }
                C1873Xu c1873Xu2 = new C1873Xu(this, 0);
                this.i = c1873Xu2;
                return c1873Xu2;
            default:
                VC1 vc1 = (VC1) this.i;
                if (vc1 != null) {
                    return vc1;
                }
                VC1 vc12 = new VC1(this, 0);
                this.i = vc12;
                return vc12;
        }
    }

    public void f(int i, int i2) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrL = l();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrK[i] = null;
            objArrL[i] = null;
            iArrJ[i] = 0;
            return;
        }
        Object obj2 = objArrK[i3];
        objArrK[i] = obj2;
        objArrL[i] = objArrL[i3];
        objArrK[i3] = null;
        objArrL[i3] = null;
        iArrJ[i] = iArrJ[i3];
        iArrJ[i3] = 0;
        int iB = J12.b(obj2) & i2;
        int iF = AT1.f(iB, obj);
        if (iF == size) {
            AT1.g(iB, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iF - 1;
            int i5 = iArrJ[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrJ[i4] = AT1.c(i5, i + 1, i2);
                return;
            }
            iF = i6;
        }
    }

    public boolean g() {
        return this.b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                Map mapC = c();
                if (mapC != null) {
                    return mapC.get(obj);
                }
                int iE = e(obj);
                if (iE == -1) {
                    return null;
                }
                return l()[iE];
            default:
                Map mapQ = q();
                if (mapQ != null) {
                    return mapQ.get(obj);
                }
                int iU = u(obj);
                if (iU == -1) {
                    return null;
                }
                return p()[iU];
        }
    }

    public Object i(Object obj) {
        boolean zG = g();
        Object obj2 = k;
        if (zG) {
            return obj2;
        }
        int iD = d();
        Object obj3 = this.b;
        Objects.requireNonNull(obj3);
        int iE = AT1.e(obj, null, iD, obj3, j(), k(), null);
        if (iE == -1) {
            return obj2;
        }
        Object obj4 = l()[iE];
        f(iE, iD);
        this.g--;
        this.f += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (size() == 0) {
                }
                break;
            default:
                if (size() == 0) {
                }
                break;
        }
        return false;
    }

    public int[] j() {
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public Object[] k() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                C1873Xu c1873Xu = (C1873Xu) this.h;
                if (c1873Xu != null) {
                    return c1873Xu;
                }
                C1873Xu c1873Xu2 = new C1873Xu(this, 1);
                this.h = c1873Xu2;
                return c1873Xu2;
            default:
                VC1 vc1 = (VC1) this.h;
                if (vc1 != null) {
                    return vc1;
                }
                VC1 vc12 = new VC1(this, 1);
                this.h = vc12;
                return vc12;
        }
    }

    public Object[] l() {
        Object[] objArr = this.e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public int m(int i, int i2, int i3, int i4) {
        Object objA = AT1.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AT1.g(i3 & i5, i4 + 1, objA);
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iF = AT1.f(i6, obj);
            while (iF != 0) {
                int i7 = iF - 1;
                int i8 = iArrJ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iF2 = AT1.f(i10, objA);
                AT1.g(i10, iF, objA);
                iArrJ[i7] = AT1.c(i9, iF2, i5);
                iF = i8 & i;
            }
        }
        this.b = objA;
        this.f = AT1.c(this.f, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    public int[] n() {
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public Object[] o() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public Object[] p() {
        Object[] objArr = this.e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x0266  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x0279 -> B:215:0x0261). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2223av.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public Map q() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public void r(int i, int i2) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArrN = n();
        Object[] objArrO = o();
        Object[] objArrP = p();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrO[i] = null;
            objArrP[i] = null;
            iArrN[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrO[i3];
        objArrO[i] = obj2;
        objArrP[i] = objArrP[i3];
        objArrO[i3] = null;
        objArrP[i3] = null;
        iArrN[i] = iArrN[i3];
        iArrN[i3] = 0;
        int iD = AbstractC3316d22.d(obj2) & i2;
        int iE = AbstractC2440c22.e(iD, obj);
        if (iE == size) {
            AbstractC2440c22.g(iD, i4, obj);
            return;
        }
        while (true) {
            int i5 = iE - 1;
            int i6 = iArrN[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrN[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            iE = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                Map mapC = c();
                if (mapC != null) {
                    return mapC.remove(obj);
                }
                Object objI = i(obj);
                if (objI == k) {
                    return null;
                }
                return objI;
            default:
                Map mapQ = q();
                if (mapQ != null) {
                    return mapQ.remove(obj);
                }
                Object objW = w(obj);
                if (objW == l) {
                    return null;
                }
                return objW;
        }
    }

    public boolean s() {
        return this.b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
            case 0:
                Map mapC = c();
                if (mapC == null) {
                    break;
                } else {
                    break;
                }
            default:
                Map mapQ = q();
                if (mapQ == null) {
                    break;
                } else {
                    break;
                }
        }
        return this.g;
    }

    public int t() {
        return (1 << (this.f & 31)) - 1;
    }

    public int u(Object obj) {
        if (s()) {
            return -1;
        }
        int iD = AbstractC3316d22.d(obj);
        int iT = t();
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int iE = AbstractC2440c22.e(iD & iT, obj2);
        if (iE != 0) {
            int i = ~iT;
            int i2 = iD & i;
            do {
                int i3 = iE - 1;
                int i4 = n()[i3];
                if ((i4 & i) == i2 && O12.b(obj, o()[i3])) {
                    return i3;
                }
                iE = i4 & iT;
            } while (iE != 0);
        }
        return -1;
    }

    public int v(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objF = AbstractC2440c22.f(i2);
        if (i4 != 0) {
            AbstractC2440c22.g(i3 & i5, i4 + 1, objF);
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArrN = n();
        for (int i6 = 0; i6 <= i; i6++) {
            int iE = AbstractC2440c22.e(i6, obj);
            while (iE != 0) {
                int i7 = iE - 1;
                int i8 = iArrN[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iE2 = AbstractC2440c22.e(i10, objF);
                AbstractC2440c22.g(i10, iE, objF);
                iArrN[i7] = ((~i5) & i9) | (iE2 & i5);
                iE = i8 & i;
            }
        }
        this.b = objF;
        this.f = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                M0 m0 = (M0) this.j;
                if (m0 != null) {
                    return m0;
                }
                M0 m02 = new M0(1, this);
                this.j = m02;
                return m02;
            default:
                M0 m03 = (M0) this.j;
                if (m03 != null) {
                    return m03;
                }
                M0 m04 = new M0(3, this);
                this.j = m04;
                return m04;
        }
    }

    public Object w(Object obj) {
        if (!s()) {
            int iT = t();
            Object obj2 = this.b;
            Objects.requireNonNull(obj2);
            int iD = AbstractC2440c22.d(obj, null, iT, obj2, n(), o(), null);
            if (iD != -1) {
                Object obj3 = p()[iD];
                r(iD, iT);
                this.g--;
                this.f += 32;
                return obj3;
            }
        }
        return l;
    }
}
