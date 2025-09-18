package defpackage;

/* renamed from: rB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6792rB1 {
    public static final BL0 a = new C4375ib0();

    public static int a(C0848Kq c0848Kq, int i, int i2, int i3) {
        YN1.c(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        AbstractC5810m22.a(AbstractC5810m22.a(i4, i5), 1 << i3);
        if (c0848Kq.c() < i) {
            return -1;
        }
        int iL = c0848Kq.l(i);
        if (iL != i4) {
            return iL;
        }
        if (c0848Kq.c() < i2) {
            return -1;
        }
        int iL2 = c0848Kq.l(i2);
        int i6 = iL + iL2;
        if (iL2 != i5) {
            return i6;
        }
        if (c0848Kq.c() < i3) {
            return -1;
        }
        return i6 + c0848Kq.l(i3);
    }

    public static final boolean b() {
        return ((C4375ib0) a).setAndroidLayoutDirection();
    }

    public static void c(C0848Kq c0848Kq) {
        c0848Kq.w(3);
        c0848Kq.w(8);
        boolean zK = c0848Kq.k();
        boolean zK2 = c0848Kq.k();
        if (zK) {
            c0848Kq.w(5);
        }
        if (zK2) {
            c0848Kq.w(6);
        }
    }

    public static void d(C0848Kq c0848Kq) {
        int iL;
        int iL2 = c0848Kq.l(2);
        if (iL2 == 0) {
            c0848Kq.w(6);
            return;
        }
        int iA = a(c0848Kq, 5, 8, 16) + 1;
        if (iL2 == 1) {
            c0848Kq.w(iA * 7);
            return;
        }
        if (iL2 == 2) {
            boolean zK = c0848Kq.k();
            int i = zK ? 1 : 5;
            int i2 = zK ? 7 : 5;
            int i3 = zK ? 8 : 6;
            int i4 = 0;
            while (i4 < iA) {
                if (c0848Kq.k()) {
                    c0848Kq.w(7);
                    iL = 0;
                } else {
                    if (c0848Kq.l(2) == 3 && c0848Kq.l(i2) * i != 0) {
                        c0848Kq.v();
                    }
                    iL = c0848Kq.l(i3) * i;
                    if (iL != 0 && iL != 180) {
                        c0848Kq.v();
                    }
                    c0848Kq.v();
                }
                if (iL != 0 && iL != 180 && c0848Kq.k()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
