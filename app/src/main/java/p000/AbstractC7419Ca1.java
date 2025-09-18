package p000;

import android.util.Pair;

/* renamed from: Ca1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7419Ca1 {

    /* renamed from: a */
    public static final C11944za1 f1466a = new C11944za1();

    static {
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
        AbstractC7485Dh1.m1797L(2);
    }

    /* renamed from: a */
    public int mo1244a(boolean z) {
        return m1259p() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo1245b(Object obj);

    /* renamed from: c */
    public int mo1246c(boolean z) {
        if (m1259p()) {
            return -1;
        }
        return mo1258o() - 1;
    }

    /* renamed from: d */
    public final int m1247d(int i, C7315Aa1 c7315Aa1, C7367Ba1 c7367Ba1, int i2, boolean z) {
        int i3 = mo1249f(i, c7315Aa1, false).f258c;
        if (mo1256m(i3, c7367Ba1, 0L).f928o != i) {
            return i + 1;
        }
        int iMo1248e = mo1248e(i3, i2, z);
        if (iMo1248e == -1) {
            return -1;
        }
        return mo1256m(iMo1248e, c7367Ba1, 0L).f927n;
    }

    /* renamed from: e */
    public int mo1248e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo1246c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo1246c(z) ? mo1244a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iMo1246c;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7419Ca1)) {
            return false;
        }
        AbstractC7419Ca1 abstractC7419Ca1 = (AbstractC7419Ca1) obj;
        if (abstractC7419Ca1.mo1258o() != mo1258o() || abstractC7419Ca1.mo1251h() != mo1251h()) {
            return false;
        }
        C7367Ba1 c7367Ba1 = new C7367Ba1();
        C7315Aa1 c7315Aa1 = new C7315Aa1();
        C7367Ba1 c7367Ba12 = new C7367Ba1();
        C7315Aa1 c7315Aa12 = new C7315Aa1();
        for (int i = 0; i < mo1258o(); i++) {
            if (!mo1256m(i, c7367Ba1, 0L).equals(abstractC7419Ca1.mo1256m(i, c7367Ba12, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo1251h(); i2++) {
            if (!mo1249f(i2, c7315Aa1, true).equals(abstractC7419Ca1.mo1249f(i2, c7315Aa12, true))) {
                return false;
            }
        }
        int iMo1244a = mo1244a(true);
        if (iMo1244a != abstractC7419Ca1.mo1244a(true) || (iMo1246c = mo1246c(true)) != abstractC7419Ca1.mo1246c(true)) {
            return false;
        }
        while (iMo1244a != iMo1246c) {
            int iMo1248e = mo1248e(iMo1244a, 0, true);
            if (iMo1248e != abstractC7419Ca1.mo1248e(iMo1244a, 0, true)) {
                return false;
            }
            iMo1244a = iMo1248e;
        }
        return true;
    }

    /* renamed from: f */
    public abstract C7315Aa1 mo1249f(int i, C7315Aa1 c7315Aa1, boolean z);

    /* renamed from: g */
    public C7315Aa1 mo1250g(Object obj, C7315Aa1 c7315Aa1) {
        return mo1249f(mo1245b(obj), c7315Aa1, true);
    }

    /* renamed from: h */
    public abstract int mo1251h();

    public final int hashCode() {
        C7367Ba1 c7367Ba1 = new C7367Ba1();
        C7315Aa1 c7315Aa1 = new C7315Aa1();
        int iMo1258o = mo1258o() + 217;
        for (int i = 0; i < mo1258o(); i++) {
            iMo1258o = (iMo1258o * 31) + mo1256m(i, c7367Ba1, 0L).hashCode();
        }
        int iMo1251h = mo1251h() + (iMo1258o * 31);
        for (int i2 = 0; i2 < mo1251h(); i2++) {
            iMo1251h = (iMo1251h * 31) + mo1249f(i2, c7315Aa1, true).hashCode();
        }
        int iMo1244a = mo1244a(true);
        while (iMo1244a != -1) {
            iMo1251h = (iMo1251h * 31) + iMo1244a;
            iMo1244a = mo1248e(iMo1244a, 0, true);
        }
        return iMo1251h;
    }

    /* renamed from: i */
    public final Pair m1252i(C7367Ba1 c7367Ba1, C7315Aa1 c7315Aa1, int i, long j) {
        Pair pairM1253j = m1253j(c7367Ba1, c7315Aa1, i, j, 0L);
        pairM1253j.getClass();
        return pairM1253j;
    }

    /* renamed from: j */
    public final Pair m1253j(C7367Ba1 c7367Ba1, C7315Aa1 c7315Aa1, int i, long j, long j2) {
        YN1.m9279d(i, mo1258o());
        mo1256m(i, c7367Ba1, j2);
        if (j == -9223372036854775807L) {
            j = c7367Ba1.f925l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c7367Ba1.f927n;
        mo1249f(i2, c7315Aa1, false);
        while (i2 < c7367Ba1.f928o && c7315Aa1.f260e != j) {
            int i3 = i2 + 1;
            if (mo1249f(i3, c7315Aa1, false).f260e > j) {
                break;
            }
            i2 = i3;
        }
        mo1249f(i2, c7315Aa1, true);
        long jMin = j - c7315Aa1.f260e;
        long j3 = c7315Aa1.f259d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c7315Aa1.f257b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* renamed from: k */
    public int mo1254k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo1244a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo1244a(z) ? mo1246c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public abstract Object mo1255l(int i);

    /* renamed from: m */
    public abstract C7367Ba1 mo1256m(int i, C7367Ba1 c7367Ba1, long j);

    /* renamed from: n */
    public final void m1257n(int i, C7367Ba1 c7367Ba1) {
        mo1256m(i, c7367Ba1, 0L);
    }

    /* renamed from: o */
    public abstract int mo1258o();

    /* renamed from: p */
    public final boolean m1259p() {
        return mo1258o() == 0;
    }
}
