package defpackage;

import android.util.Pair;

/* renamed from: Ca1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0178Ca1 {
    public static final C8391za1 a = new C8391za1();

    static {
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, C0022Aa1 c0022Aa1, C0100Ba1 c0100Ba1, int i2, boolean z) {
        int i3 = f(i, c0022Aa1, false).c;
        if (m(i3, c0100Ba1, 0L).o != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, c0100Ba1, 0L).n;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0178Ca1)) {
            return false;
        }
        AbstractC0178Ca1 abstractC0178Ca1 = (AbstractC0178Ca1) obj;
        if (abstractC0178Ca1.o() != o() || abstractC0178Ca1.h() != h()) {
            return false;
        }
        C0100Ba1 c0100Ba1 = new C0100Ba1();
        C0022Aa1 c0022Aa1 = new C0022Aa1();
        C0100Ba1 c0100Ba12 = new C0100Ba1();
        C0022Aa1 c0022Aa12 = new C0022Aa1();
        for (int i = 0; i < o(); i++) {
            if (!m(i, c0100Ba1, 0L).equals(abstractC0178Ca1.m(i, c0100Ba12, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < h(); i2++) {
            if (!f(i2, c0022Aa1, true).equals(abstractC0178Ca1.f(i2, c0022Aa12, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != abstractC0178Ca1.a(true) || (iC = c(true)) != abstractC0178Ca1.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != abstractC0178Ca1.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public abstract C0022Aa1 f(int i, C0022Aa1 c0022Aa1, boolean z);

    public C0022Aa1 g(Object obj, C0022Aa1 c0022Aa1) {
        return f(b(obj), c0022Aa1, true);
    }

    public abstract int h();

    public final int hashCode() {
        C0100Ba1 c0100Ba1 = new C0100Ba1();
        C0022Aa1 c0022Aa1 = new C0022Aa1();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, c0100Ba1, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, c0022Aa1, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(C0100Ba1 c0100Ba1, C0022Aa1 c0022Aa1, int i, long j) {
        Pair pairJ = j(c0100Ba1, c0022Aa1, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(C0100Ba1 c0100Ba1, C0022Aa1 c0022Aa1, int i, long j, long j2) {
        YN1.d(i, o());
        m(i, c0100Ba1, j2);
        if (j == -9223372036854775807L) {
            j = c0100Ba1.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c0100Ba1.n;
        f(i2, c0022Aa1, false);
        while (i2 < c0100Ba1.o && c0022Aa1.e != j) {
            int i3 = i2 + 1;
            if (f(i3, c0022Aa1, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, c0022Aa1, true);
        long jMin = j - c0022Aa1.e;
        long j3 = c0022Aa1.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c0022Aa1.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i);

    public abstract C0100Ba1 m(int i, C0100Ba1 c0100Ba1, long j);

    public final void n(int i, C0100Ba1 c0100Ba1) {
        m(i, c0100Ba1, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
