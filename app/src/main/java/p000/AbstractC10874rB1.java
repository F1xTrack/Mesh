package p000;

/* renamed from: rB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10874rB1 {

    /* renamed from: a */
    public static final BL0 f41370a = new C9773ib0();

    /* renamed from: a */
    public static int m24210a(C0683Kq c0683Kq, int i, int i2, int i3) {
        YN1.m9278c(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        AbstractC10215m22.m22643a(AbstractC10215m22.m22643a(i4, i5), 1 << i3);
        if (c0683Kq.m4743c() < i) {
            return -1;
        }
        int iM4752l = c0683Kq.m4752l(i);
        if (iM4752l != i4) {
            return iM4752l;
        }
        if (c0683Kq.m4743c() < i2) {
            return -1;
        }
        int iM4752l2 = c0683Kq.m4752l(i2);
        int i6 = iM4752l + iM4752l2;
        if (iM4752l2 != i5) {
            return i6;
        }
        if (c0683Kq.m4743c() < i3) {
            return -1;
        }
        return i6 + c0683Kq.m4752l(i3);
    }

    /* renamed from: b */
    public static final boolean m24211b() {
        return ((C9773ib0) f41370a).setAndroidLayoutDirection();
    }

    /* renamed from: c */
    public static void m24212c(C0683Kq c0683Kq) {
        c0683Kq.m4763w(3);
        c0683Kq.m4763w(8);
        boolean zM4751k = c0683Kq.m4751k();
        boolean zM4751k2 = c0683Kq.m4751k();
        if (zM4751k) {
            c0683Kq.m4763w(5);
        }
        if (zM4751k2) {
            c0683Kq.m4763w(6);
        }
    }

    /* renamed from: d */
    public static void m24213d(C0683Kq c0683Kq) {
        int iM4752l;
        int iM4752l2 = c0683Kq.m4752l(2);
        if (iM4752l2 == 0) {
            c0683Kq.m4763w(6);
            return;
        }
        int iM24210a = m24210a(c0683Kq, 5, 8, 16) + 1;
        if (iM4752l2 == 1) {
            c0683Kq.m4763w(iM24210a * 7);
            return;
        }
        if (iM4752l2 == 2) {
            boolean zM4751k = c0683Kq.m4751k();
            int i = zM4751k ? 1 : 5;
            int i2 = zM4751k ? 7 : 5;
            int i3 = zM4751k ? 8 : 6;
            int i4 = 0;
            while (i4 < iM24210a) {
                if (c0683Kq.m4751k()) {
                    c0683Kq.m4763w(7);
                    iM4752l = 0;
                } else {
                    if (c0683Kq.m4752l(2) == 3 && c0683Kq.m4752l(i2) * i != 0) {
                        c0683Kq.m4762v();
                    }
                    iM4752l = c0683Kq.m4752l(i3) * i;
                    if (iM4752l != 0 && iM4752l != 180) {
                        c0683Kq.m4762v();
                    }
                    c0683Kq.m4762v();
                }
                if (iM4752l != 0 && iM4752l != 180 && c0683Kq.m4751k()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
