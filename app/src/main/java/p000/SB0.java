package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class SB0 extends AbstractC7419Ca1 {

    /* renamed from: k */
    public static final /* synthetic */ int f10610k = 0;

    /* renamed from: b */
    public final int f10611b;

    /* renamed from: c */
    public final C11869z01 f10612c;

    /* renamed from: d */
    public final int f10613d;

    /* renamed from: e */
    public final int f10614e;

    /* renamed from: f */
    public final int[] f10615f;

    /* renamed from: g */
    public final int[] f10616g;

    /* renamed from: h */
    public final AbstractC7419Ca1[] f10617h;

    /* renamed from: i */
    public final Object[] f10618i;

    /* renamed from: j */
    public final HashMap f10619j;

    /* JADX WARN: Illegal instructions before constructor call */
    public SB0(ArrayList arrayList, C11869z01 c11869z01) {
        AbstractC7419Ca1[] abstractC7419Ca1Arr = new AbstractC7419Ca1[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC7419Ca1Arr[i2] = ((InterfaceC7916Lp0) it.next()).mo5113b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC7916Lp0) it2.next()).mo5112a();
            i++;
        }
        this(abstractC7419Ca1Arr, objArr, c11869z01);
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: a */
    public final int mo1244a(boolean z) {
        if (this.f10611b == 0) {
            return -1;
        }
        int iM7190q = 0;
        if (z) {
            int[] iArr = this.f10612c.f46568b;
            iM7190q = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            AbstractC7419Ca1[] abstractC7419Ca1Arr = this.f10617h;
            if (!abstractC7419Ca1Arr[iM7190q].m1259p()) {
                return abstractC7419Ca1Arr[iM7190q].mo1244a(z) + this.f10616g[iM7190q];
            }
            iM7190q = m7190q(iM7190q, z);
        } while (iM7190q != -1);
        return -1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: b */
    public final int mo1245b(Object obj) {
        int iMo1245b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f10619j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iMo1245b = this.f10617h[iIntValue].mo1245b(obj3)) == -1) {
            return -1;
        }
        return this.f10615f[iIntValue] + iMo1245b;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: c */
    public final int mo1246c(boolean z) {
        int iM7191r;
        int i = this.f10611b;
        if (i == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.f10612c.f46568b;
            iM7191r = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iM7191r = i - 1;
        }
        do {
            AbstractC7419Ca1[] abstractC7419Ca1Arr = this.f10617h;
            if (!abstractC7419Ca1Arr[iM7191r].m1259p()) {
                return abstractC7419Ca1Arr[iM7191r].mo1246c(z) + this.f10616g[iM7191r];
            }
            iM7191r = m7191r(iM7191r, z);
        } while (iM7191r != -1);
        return -1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: e */
    public final int mo1248e(int i, int i2, boolean z) {
        int[] iArr = this.f10616g;
        int iM1820e = AbstractC7485Dh1.m1820e(iArr, i + 1, false, false);
        int i3 = iArr[iM1820e];
        AbstractC7419Ca1[] abstractC7419Ca1Arr = this.f10617h;
        int iMo1248e = abstractC7419Ca1Arr[iM1820e].mo1248e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iMo1248e != -1) {
            return i3 + iMo1248e;
        }
        int iM7190q = m7190q(iM1820e, z);
        while (iM7190q != -1 && abstractC7419Ca1Arr[iM7190q].m1259p()) {
            iM7190q = m7190q(iM7190q, z);
        }
        if (iM7190q != -1) {
            return abstractC7419Ca1Arr[iM7190q].mo1244a(z) + iArr[iM7190q];
        }
        if (i2 == 2) {
            return mo1244a(z);
        }
        return -1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: f */
    public final C7315Aa1 mo1249f(int i, C7315Aa1 c7315Aa1, boolean z) {
        int[] iArr = this.f10615f;
        int iM1820e = AbstractC7485Dh1.m1820e(iArr, i + 1, false, false);
        int i2 = this.f10616g[iM1820e];
        this.f10617h[iM1820e].mo1249f(i - iArr[iM1820e], c7315Aa1, z);
        c7315Aa1.f258c += i2;
        if (z) {
            Object obj = this.f10618i[iM1820e];
            Object obj2 = c7315Aa1.f257b;
            obj2.getClass();
            c7315Aa1.f257b = Pair.create(obj, obj2);
        }
        return c7315Aa1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: g */
    public final C7315Aa1 mo1250g(Object obj, C7315Aa1 c7315Aa1) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f10619j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f10616g[iIntValue];
        this.f10617h[iIntValue].mo1250g(obj3, c7315Aa1);
        c7315Aa1.f258c += i;
        c7315Aa1.f257b = obj;
        return c7315Aa1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: h */
    public final int mo1251h() {
        return this.f10614e;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: k */
    public final int mo1254k(int i, int i2, boolean z) {
        int[] iArr = this.f10616g;
        int iM1820e = AbstractC7485Dh1.m1820e(iArr, i + 1, false, false);
        int i3 = iArr[iM1820e];
        AbstractC7419Ca1[] abstractC7419Ca1Arr = this.f10617h;
        int iMo1254k = abstractC7419Ca1Arr[iM1820e].mo1254k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iMo1254k != -1) {
            return i3 + iMo1254k;
        }
        int iM7191r = m7191r(iM1820e, z);
        while (iM7191r != -1 && abstractC7419Ca1Arr[iM7191r].m1259p()) {
            iM7191r = m7191r(iM7191r, z);
        }
        if (iM7191r != -1) {
            return abstractC7419Ca1Arr[iM7191r].mo1246c(z) + iArr[iM7191r];
        }
        if (i2 == 2) {
            return mo1246c(z);
        }
        return -1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: l */
    public final Object mo1255l(int i) {
        int[] iArr = this.f10615f;
        int iM1820e = AbstractC7485Dh1.m1820e(iArr, i + 1, false, false);
        return Pair.create(this.f10618i[iM1820e], this.f10617h[iM1820e].mo1255l(i - iArr[iM1820e]));
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: m */
    public final C7367Ba1 mo1256m(int i, C7367Ba1 c7367Ba1, long j) {
        int[] iArr = this.f10616g;
        int iM1820e = AbstractC7485Dh1.m1820e(iArr, i + 1, false, false);
        int i2 = iArr[iM1820e];
        int i3 = this.f10615f[iM1820e];
        this.f10617h[iM1820e].mo1256m(i - i2, c7367Ba1, j);
        Object objCreate = this.f10618i[iM1820e];
        if (!C7367Ba1.f912q.equals(c7367Ba1.f914a)) {
            objCreate = Pair.create(objCreate, c7367Ba1.f914a);
        }
        c7367Ba1.f914a = objCreate;
        c7367Ba1.f927n += i3;
        c7367Ba1.f928o += i3;
        return c7367Ba1;
    }

    @Override // p000.AbstractC7419Ca1
    /* renamed from: o */
    public final int mo1258o() {
        return this.f10613d;
    }

    /* renamed from: q */
    public final int m7190q(int i, boolean z) {
        if (!z) {
            if (i < this.f10611b - 1) {
                return i + 1;
            }
            return -1;
        }
        C11869z01 c11869z01 = this.f10612c;
        int i2 = c11869z01.f46569c[i] + 1;
        int[] iArr = c11869z01.f46568b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: r */
    public final int m7191r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        C11869z01 c11869z01 = this.f10612c;
        int i2 = c11869z01.f46569c[i] - 1;
        if (i2 >= 0) {
            return c11869z01.f46568b[i2];
        }
        return -1;
    }

    public SB0(AbstractC7419Ca1[] abstractC7419Ca1Arr, Object[] objArr, C11869z01 c11869z01) {
        this.f10612c = c11869z01;
        this.f10611b = c11869z01.f46568b.length;
        int length = abstractC7419Ca1Arr.length;
        this.f10617h = abstractC7419Ca1Arr;
        this.f10615f = new int[length];
        this.f10616g = new int[length];
        this.f10618i = objArr;
        this.f10619j = new HashMap();
        int length2 = abstractC7419Ca1Arr.length;
        int i = 0;
        int iMo1258o = 0;
        int iMo1251h = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC7419Ca1 abstractC7419Ca1 = abstractC7419Ca1Arr[i];
            this.f10617h[i2] = abstractC7419Ca1;
            this.f10616g[i2] = iMo1258o;
            this.f10615f[i2] = iMo1251h;
            iMo1258o += abstractC7419Ca1.mo1258o();
            iMo1251h += this.f10617h[i2].mo1251h();
            this.f10619j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f10613d = iMo1258o;
        this.f10614e = iMo1251h;
    }
}
