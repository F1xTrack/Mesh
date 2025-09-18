package p000;

/* loaded from: classes.dex */
public abstract class XA1 {

    /* renamed from: a */
    public static final C7190yG f13602a = new C7190yG("NULL");

    /* renamed from: a */
    public static C10742q91 m8945a(int i, C9591hA0 c9591hA0, String str) {
        int iM18749g = c9591hA0.m18749g();
        if (c9591hA0.m18749g() == 1684108385 && iM18749g >= 22) {
            c9591hA0.m18742H(10);
            int iM18735A = c9591hA0.m18735A();
            if (iM18735A > 0) {
                String strM24909u = AbstractC11153tN0.m24909u(iM18735A, "");
                int iM18735A2 = c9591hA0.m18735A();
                if (iM18735A2 > 0) {
                    strM24909u = strM24909u + "/" + iM18735A2;
                }
                return new C10742q91(str, null, P70.m6229B(strM24909u));
            }
        }
        AbstractC10872rA1.m24175h("Failed to parse index/count attribute: " + AbstractC0325F9.m2496e(i));
        return null;
    }

    /* renamed from: b */
    public static int m8946b(C9591hA0 c9591hA0) {
        int iM18749g = c9591hA0.m18749g();
        if (c9591hA0.m18749g() == 1684108385) {
            c9591hA0.m18742H(8);
            int i = iM18749g - 16;
            if (i == 1) {
                return c9591hA0.m18763u();
            }
            if (i == 2) {
                return c9591hA0.m18735A();
            }
            if (i == 3) {
                return c9591hA0.m18766x();
            }
            if (i == 4 && (c9591hA0.f28293a[c9591hA0.f28294b] & 128) == 0) {
                return c9591hA0.m18767y();
            }
        }
        AbstractC10872rA1.m24175h("Failed to parse data atom to int");
        return -1;
    }

    /* renamed from: c */
    public static V50 m8947c(int i, String str, C9591hA0 c9591hA0, boolean z, boolean z2) {
        int iM8946b = m8946b(c9591hA0);
        if (z2) {
            iM8946b = Math.min(1, iM8946b);
        }
        if (iM8946b >= 0) {
            return z ? new C10742q91(str, null, P70.m6229B(Integer.toString(iM8946b))) : new C0938Ou("und", str, Integer.toString(iM8946b));
        }
        AbstractC10872rA1.m24175h("Failed to parse uint8 attribute: " + AbstractC0325F9.m2496e(i));
        return null;
    }

    /* renamed from: d */
    public static C10742q91 m8948d(int i, C9591hA0 c9591hA0, String str) {
        int iM18749g = c9591hA0.m18749g();
        if (c9591hA0.m18749g() == 1684108385) {
            c9591hA0.m18742H(8);
            return new C10742q91(str, null, P70.m6229B(c9591hA0.m18759q(iM18749g - 16)));
        }
        AbstractC10872rA1.m24175h("Failed to parse text attribute: " + AbstractC0325F9.m2496e(i));
        return null;
    }
}
