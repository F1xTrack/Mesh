package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class SB0 extends AbstractC0178Ca1 {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final C8280z01 c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final AbstractC0178Ca1[] h;
    public final Object[] i;
    public final HashMap j;

    /* JADX WARN: Illegal instructions before constructor call */
    public SB0(ArrayList arrayList, C8280z01 c8280z01) {
        AbstractC0178Ca1[] abstractC0178Ca1Arr = new AbstractC0178Ca1[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC0178Ca1Arr[i2] = ((InterfaceC0924Lp0) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC0924Lp0) it2.next()).a();
            i++;
        }
        this(abstractC0178Ca1Arr, objArr, c8280z01);
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int a(boolean z) {
        if (this.b == 0) {
            return -1;
        }
        int iQ = 0;
        if (z) {
            int[] iArr = this.c.b;
            iQ = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            AbstractC0178Ca1[] abstractC0178Ca1Arr = this.h;
            if (!abstractC0178Ca1Arr[iQ].p()) {
                return abstractC0178Ca1Arr[iQ].a(z) + this.g[iQ];
            }
            iQ = q(iQ, z);
        } while (iQ != -1);
        return -1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iB = this.h[iIntValue].b(obj3)) == -1) {
            return -1;
        }
        return this.f[iIntValue] + iB;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int c(boolean z) {
        int iR;
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.c.b;
            iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iR = i - 1;
        }
        do {
            AbstractC0178Ca1[] abstractC0178Ca1Arr = this.h;
            if (!abstractC0178Ca1Arr[iR].p()) {
                return abstractC0178Ca1Arr[iR].c(z) + this.g[iR];
            }
            iR = r(iR, z);
        } while (iR != -1);
        return -1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iE = AbstractC0277Dh1.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        AbstractC0178Ca1[] abstractC0178Ca1Arr = this.h;
        int iE2 = abstractC0178Ca1Arr[iE].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE2 != -1) {
            return i3 + iE2;
        }
        int iQ = q(iE, z);
        while (iQ != -1 && abstractC0178Ca1Arr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return abstractC0178Ca1Arr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final C0022Aa1 f(int i, C0022Aa1 c0022Aa1, boolean z) {
        int[] iArr = this.f;
        int iE = AbstractC0277Dh1.e(iArr, i + 1, false, false);
        int i2 = this.g[iE];
        this.h[iE].f(i - iArr[iE], c0022Aa1, z);
        c0022Aa1.c += i2;
        if (z) {
            Object obj = this.i[iE];
            Object obj2 = c0022Aa1.b;
            obj2.getClass();
            c0022Aa1.b = Pair.create(obj, obj2);
        }
        return c0022Aa1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final C0022Aa1 g(Object obj, C0022Aa1 c0022Aa1) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.g[iIntValue];
        this.h[iIntValue].g(obj3, c0022Aa1);
        c0022Aa1.c += i;
        c0022Aa1.b = obj;
        return c0022Aa1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int h() {
        return this.e;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iE = AbstractC0277Dh1.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        AbstractC0178Ca1[] abstractC0178Ca1Arr = this.h;
        int iK = abstractC0178Ca1Arr[iE].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iE, z);
        while (iR != -1 && abstractC0178Ca1Arr[iR].p()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return abstractC0178Ca1Arr[iR].c(z) + iArr[iR];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final Object l(int i) {
        int[] iArr = this.f;
        int iE = AbstractC0277Dh1.e(iArr, i + 1, false, false);
        return Pair.create(this.i[iE], this.h[iE].l(i - iArr[iE]));
    }

    @Override // defpackage.AbstractC0178Ca1
    public final C0100Ba1 m(int i, C0100Ba1 c0100Ba1, long j) {
        int[] iArr = this.g;
        int iE = AbstractC0277Dh1.e(iArr, i + 1, false, false);
        int i2 = iArr[iE];
        int i3 = this.f[iE];
        this.h[iE].m(i - i2, c0100Ba1, j);
        Object objCreate = this.i[iE];
        if (!C0100Ba1.q.equals(c0100Ba1.a)) {
            objCreate = Pair.create(objCreate, c0100Ba1.a);
        }
        c0100Ba1.a = objCreate;
        c0100Ba1.n += i3;
        c0100Ba1.o += i3;
        return c0100Ba1;
    }

    @Override // defpackage.AbstractC0178Ca1
    public final int o() {
        return this.d;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        C8280z01 c8280z01 = this.c;
        int i2 = c8280z01.c[i] + 1;
        int[] iArr = c8280z01.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        C8280z01 c8280z01 = this.c;
        int i2 = c8280z01.c[i] - 1;
        if (i2 >= 0) {
            return c8280z01.b[i2];
        }
        return -1;
    }

    public SB0(AbstractC0178Ca1[] abstractC0178Ca1Arr, Object[] objArr, C8280z01 c8280z01) {
        this.c = c8280z01;
        this.b = c8280z01.b.length;
        int length = abstractC0178Ca1Arr.length;
        this.h = abstractC0178Ca1Arr;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int length2 = abstractC0178Ca1Arr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC0178Ca1 abstractC0178Ca1 = abstractC0178Ca1Arr[i];
            this.h[i2] = abstractC0178Ca1;
            this.g[i2] = iO;
            this.f[i2] = iH;
            iO += abstractC0178Ca1.o();
            iH += this.h[i2].h();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.d = iO;
        this.e = iH;
    }
}
