package p000;

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
public final class C1752av extends AbstractMap implements Serializable {

    /* renamed from: k */
    public static final Object f16662k = new Object();

    /* renamed from: l */
    public static final Object f16663l = new Object();

    /* renamed from: a */
    public final /* synthetic */ int f16664a;

    /* renamed from: b */
    public transient Object f16665b;

    /* renamed from: c */
    public transient int[] f16666c;

    /* renamed from: d */
    public transient Object[] f16667d;

    /* renamed from: e */
    public transient Object[] f16668e;

    /* renamed from: f */
    public transient int f16669f;

    /* renamed from: g */
    public transient int f16670g;

    /* renamed from: h */
    public transient AbstractSet f16671h;

    /* renamed from: i */
    public transient AbstractSet f16672i;

    /* renamed from: j */
    public transient AbstractCollection f16673j;

    public C1752av(int i) {
        this.f16664a = i;
        switch (i) {
            case 1:
                this.f16669f = Math.min(Math.max(12, 1), 1073741823);
                break;
        }
    }

    /* renamed from: a */
    public static C1752av m10357a() {
        C1752av c1752av = new C1752av(0);
        c1752av.f16669f = AbstractC10983s22.m24581c(3, 1);
        return c1752av;
    }

    /* renamed from: b */
    public static C1752av m10358b(int i) {
        C1752av c1752av = new C1752av(0);
        if (i < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        c1752av.f16669f = AbstractC10983s22.m24581c(i, 1);
        return c1752av;
    }

    /* renamed from: c */
    public Map m10359c() {
        Object obj = this.f16665b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f16664a) {
            case 0:
                if (!m10363g()) {
                    this.f16669f += 32;
                    Map mapM10359c = m10359c();
                    if (mapM10359c == null) {
                        Arrays.fill(m10366k(), 0, this.f16670g, (Object) null);
                        Arrays.fill(m10367l(), 0, this.f16670g, (Object) null);
                        Object obj = this.f16665b;
                        Objects.requireNonNull(obj);
                        if (obj instanceof byte[]) {
                            Arrays.fill((byte[]) obj, (byte) 0);
                        } else if (obj instanceof short[]) {
                            Arrays.fill((short[]) obj, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj, 0);
                        }
                        Arrays.fill(m10365j(), 0, this.f16670g, 0);
                        this.f16670g = 0;
                        break;
                    } else {
                        this.f16669f = AbstractC10983s22.m24581c(size(), 3);
                        mapM10359c.clear();
                        this.f16665b = null;
                        this.f16670g = 0;
                        break;
                    }
                }
                break;
            default:
                if (!m10374s()) {
                    this.f16669f += 32;
                    Map mapM10372q = m10372q();
                    if (mapM10372q == null) {
                        Arrays.fill(m10370o(), 0, this.f16670g, (Object) null);
                        Arrays.fill(m10371p(), 0, this.f16670g, (Object) null);
                        Object obj2 = this.f16665b;
                        Objects.requireNonNull(obj2);
                        if (obj2 instanceof byte[]) {
                            Arrays.fill((byte[]) obj2, (byte) 0);
                        } else if (obj2 instanceof short[]) {
                            Arrays.fill((short[]) obj2, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj2, 0);
                        }
                        Arrays.fill(m10369n(), 0, this.f16670g, 0);
                        this.f16670g = 0;
                        break;
                    } else {
                        this.f16669f = Math.min(Math.max(size(), 3), 1073741823);
                        mapM10372q.clear();
                        this.f16665b = null;
                        this.f16670g = 0;
                        break;
                    }
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f16664a) {
            case 0:
                Map mapM10359c = m10359c();
                return mapM10359c != null ? mapM10359c.containsKey(obj) : m10361e(obj) != -1;
            default:
                Map mapM10372q = m10372q();
                return mapM10372q != null ? mapM10372q.containsKey(obj) : m10376u(obj) != -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f16664a) {
            case 0:
                Map mapM10359c = m10359c();
                if (mapM10359c != null) {
                    return mapM10359c.containsValue(obj);
                }
                for (int i = 0; i < this.f16670g; i++) {
                    if (AbstractC9984kE1.m22173a(obj, m10367l()[i])) {
                        return true;
                    }
                }
                return false;
            default:
                Map mapM10372q = m10372q();
                if (mapM10372q != null) {
                    return mapM10372q.containsValue(obj);
                }
                for (int i2 = 0; i2 < this.f16670g; i2++) {
                    if (O12.m5941b(obj, m10371p()[i2])) {
                        return true;
                    }
                }
                return false;
        }
    }

    /* renamed from: d */
    public int m10360d() {
        return (1 << (this.f16669f & 31)) - 1;
    }

    /* renamed from: e */
    public int m10361e(Object obj) {
        if (m10363g()) {
            return -1;
        }
        int iM4132b = J12.m4132b(obj);
        int iM10360d = m10360d();
        Object obj2 = this.f16665b;
        Objects.requireNonNull(obj2);
        int iM192f = AT1.m192f(iM4132b & iM10360d, obj2);
        if (iM192f == 0) {
            return -1;
        }
        int i = ~iM10360d;
        int i2 = iM4132b & i;
        do {
            int i3 = iM192f - 1;
            int i4 = m10365j()[i3];
            if ((i4 & i) == i2 && AbstractC9984kE1.m22173a(obj, m10366k()[i3])) {
                return i3;
            }
            iM192f = i4 & iM10360d;
        } while (iM192f != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f16664a) {
            case 0:
                C1504Xu c1504Xu = (C1504Xu) this.f16672i;
                if (c1504Xu != null) {
                    return c1504Xu;
                }
                C1504Xu c1504Xu2 = new C1504Xu(this, 0);
                this.f16672i = c1504Xu2;
                return c1504Xu2;
            default:
                VC1 vc1 = (VC1) this.f16672i;
                if (vc1 != null) {
                    return vc1;
                }
                VC1 vc12 = new VC1(this, 0);
                this.f16672i = vc12;
                return vc12;
        }
    }

    /* renamed from: f */
    public void m10362f(int i, int i2) {
        Object obj = this.f16665b;
        Objects.requireNonNull(obj);
        int[] iArrM10365j = m10365j();
        Object[] objArrM10366k = m10366k();
        Object[] objArrM10367l = m10367l();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM10366k[i] = null;
            objArrM10367l[i] = null;
            iArrM10365j[i] = 0;
            return;
        }
        Object obj2 = objArrM10366k[i3];
        objArrM10366k[i] = obj2;
        objArrM10367l[i] = objArrM10367l[i3];
        objArrM10366k[i3] = null;
        objArrM10367l[i3] = null;
        iArrM10365j[i] = iArrM10365j[i3];
        iArrM10365j[i3] = 0;
        int iM4132b = J12.m4132b(obj2) & i2;
        int iM192f = AT1.m192f(iM4132b, obj);
        if (iM192f == size) {
            AT1.m193g(iM4132b, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iM192f - 1;
            int i5 = iArrM10365j[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrM10365j[i4] = AT1.m189c(i5, i + 1, i2);
                return;
            }
            iM192f = i6;
        }
    }

    /* renamed from: g */
    public boolean m10363g() {
        return this.f16665b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.f16664a) {
            case 0:
                Map mapM10359c = m10359c();
                if (mapM10359c != null) {
                    return mapM10359c.get(obj);
                }
                int iM10361e = m10361e(obj);
                if (iM10361e == -1) {
                    return null;
                }
                return m10367l()[iM10361e];
            default:
                Map mapM10372q = m10372q();
                if (mapM10372q != null) {
                    return mapM10372q.get(obj);
                }
                int iM10376u = m10376u(obj);
                if (iM10376u == -1) {
                    return null;
                }
                return m10371p()[iM10376u];
        }
    }

    /* renamed from: i */
    public Object m10364i(Object obj) {
        boolean zM10363g = m10363g();
        Object obj2 = f16662k;
        if (zM10363g) {
            return obj2;
        }
        int iM10360d = m10360d();
        Object obj3 = this.f16665b;
        Objects.requireNonNull(obj3);
        int iM191e = AT1.m191e(obj, null, iM10360d, obj3, m10365j(), m10366k(), null);
        if (iM191e == -1) {
            return obj2;
        }
        Object obj4 = m10367l()[iM191e];
        m10362f(iM191e, iM10360d);
        this.f16670g--;
        this.f16669f += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        switch (this.f16664a) {
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

    /* renamed from: j */
    public int[] m10365j() {
        int[] iArr = this.f16666c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: k */
    public Object[] m10366k() {
        Object[] objArr = this.f16667d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        switch (this.f16664a) {
            case 0:
                C1504Xu c1504Xu = (C1504Xu) this.f16671h;
                if (c1504Xu != null) {
                    return c1504Xu;
                }
                C1504Xu c1504Xu2 = new C1504Xu(this, 1);
                this.f16671h = c1504Xu2;
                return c1504Xu2;
            default:
                VC1 vc1 = (VC1) this.f16671h;
                if (vc1 != null) {
                    return vc1;
                }
                VC1 vc12 = new VC1(this, 1);
                this.f16671h = vc12;
                return vc12;
        }
    }

    /* renamed from: l */
    public Object[] m10367l() {
        Object[] objArr = this.f16668e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: m */
    public int m10368m(int i, int i2, int i3, int i4) {
        Object objM187a = AT1.m187a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AT1.m193g(i3 & i5, i4 + 1, objM187a);
        }
        Object obj = this.f16665b;
        Objects.requireNonNull(obj);
        int[] iArrM10365j = m10365j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM192f = AT1.m192f(i6, obj);
            while (iM192f != 0) {
                int i7 = iM192f - 1;
                int i8 = iArrM10365j[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM192f2 = AT1.m192f(i10, objM187a);
                AT1.m193g(i10, iM192f, objM187a);
                iArrM10365j[i7] = AT1.m189c(i9, iM192f2, i5);
                iM192f = i8 & i;
            }
        }
        this.f16665b = objM187a;
        this.f16669f = AT1.m189c(this.f16669f, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* renamed from: n */
    public int[] m10369n() {
        int[] iArr = this.f16666c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: o */
    public Object[] m10370o() {
        Object[] objArr = this.f16667d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: p */
    public Object[] m10371p() {
        Object[] objArr = this.f16668e;
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C1752av.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: q */
    public Map m10372q() {
        Object obj = this.f16665b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: r */
    public void m10373r(int i, int i2) {
        Object obj = this.f16665b;
        Objects.requireNonNull(obj);
        int[] iArrM10369n = m10369n();
        Object[] objArrM10370o = m10370o();
        Object[] objArrM10371p = m10371p();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM10370o[i] = null;
            objArrM10371p[i] = null;
            iArrM10369n[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrM10370o[i3];
        objArrM10370o[i] = obj2;
        objArrM10371p[i] = objArrM10371p[i3];
        objArrM10370o[i3] = null;
        objArrM10371p[i3] = null;
        iArrM10369n[i] = iArrM10369n[i3];
        iArrM10369n[i3] = 0;
        int iM17480d = AbstractC9063d22.m17480d(obj2) & i2;
        int iM10577e = AbstractC8930c22.m10577e(iM17480d, obj);
        if (iM10577e == size) {
            AbstractC8930c22.m10579g(iM17480d, i4, obj);
            return;
        }
        while (true) {
            int i5 = iM10577e - 1;
            int i6 = iArrM10369n[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrM10369n[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            iM10577e = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.f16664a) {
            case 0:
                Map mapM10359c = m10359c();
                if (mapM10359c != null) {
                    return mapM10359c.remove(obj);
                }
                Object objM10364i = m10364i(obj);
                if (objM10364i == f16662k) {
                    return null;
                }
                return objM10364i;
            default:
                Map mapM10372q = m10372q();
                if (mapM10372q != null) {
                    return mapM10372q.remove(obj);
                }
                Object objM10378w = m10378w(obj);
                if (objM10378w == f16663l) {
                    return null;
                }
                return objM10378w;
        }
    }

    /* renamed from: s */
    public boolean m10374s() {
        return this.f16665b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f16664a) {
            case 0:
                Map mapM10359c = m10359c();
                if (mapM10359c == null) {
                    break;
                } else {
                    break;
                }
            default:
                Map mapM10372q = m10372q();
                if (mapM10372q == null) {
                    break;
                } else {
                    break;
                }
        }
        return this.f16670g;
    }

    /* renamed from: t */
    public int m10375t() {
        return (1 << (this.f16669f & 31)) - 1;
    }

    /* renamed from: u */
    public int m10376u(Object obj) {
        if (m10374s()) {
            return -1;
        }
        int iM17480d = AbstractC9063d22.m17480d(obj);
        int iM10375t = m10375t();
        Object obj2 = this.f16665b;
        Objects.requireNonNull(obj2);
        int iM10577e = AbstractC8930c22.m10577e(iM17480d & iM10375t, obj2);
        if (iM10577e != 0) {
            int i = ~iM10375t;
            int i2 = iM17480d & i;
            do {
                int i3 = iM10577e - 1;
                int i4 = m10369n()[i3];
                if ((i4 & i) == i2 && O12.m5941b(obj, m10370o()[i3])) {
                    return i3;
                }
                iM10577e = i4 & iM10375t;
            } while (iM10577e != 0);
        }
        return -1;
    }

    /* renamed from: v */
    public int m10377v(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objM10578f = AbstractC8930c22.m10578f(i2);
        if (i4 != 0) {
            AbstractC8930c22.m10579g(i3 & i5, i4 + 1, objM10578f);
        }
        Object obj = this.f16665b;
        Objects.requireNonNull(obj);
        int[] iArrM10369n = m10369n();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM10577e = AbstractC8930c22.m10577e(i6, obj);
            while (iM10577e != 0) {
                int i7 = iM10577e - 1;
                int i8 = iArrM10369n[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM10577e2 = AbstractC8930c22.m10577e(i10, objM10578f);
                AbstractC8930c22.m10579g(i10, iM10577e, objM10578f);
                iArrM10369n[i7] = ((~i5) & i9) | (iM10577e2 & i5);
                iM10577e = i8 & i;
            }
        }
        this.f16665b = objM10578f;
        this.f16669f = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f16669f & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f16664a) {
            case 0:
                C0756M0 c0756m0 = (C0756M0) this.f16673j;
                if (c0756m0 != null) {
                    return c0756m0;
                }
                C0756M0 c0756m02 = new C0756M0(1, this);
                this.f16673j = c0756m02;
                return c0756m02;
            default:
                C0756M0 c0756m03 = (C0756M0) this.f16673j;
                if (c0756m03 != null) {
                    return c0756m03;
                }
                C0756M0 c0756m04 = new C0756M0(3, this);
                this.f16673j = c0756m04;
                return c0756m04;
        }
    }

    /* renamed from: w */
    public Object m10378w(Object obj) {
        if (!m10374s()) {
            int iM10375t = m10375t();
            Object obj2 = this.f16665b;
            Objects.requireNonNull(obj2);
            int iM10576d = AbstractC8930c22.m10576d(obj, null, iM10375t, obj2, m10369n(), m10370o(), null);
            if (iM10576d != -1) {
                Object obj3 = m10371p()[iM10576d];
                m10373r(iM10576d, iM10375t);
                this.f16670g--;
                this.f16669f += 32;
                return obj3;
            }
        }
        return f16663l;
    }
}
