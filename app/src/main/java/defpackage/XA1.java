package defpackage;

/* loaded from: classes.dex */
public abstract class XA1 {
    public static final C8139yG a = new C8139yG("NULL");

    public static C6596q91 a(int i, C4103hA0 c4103hA0, String str) {
        int iG = c4103hA0.g();
        if (c4103hA0.g() == 1684108385 && iG >= 22) {
            c4103hA0.H(10);
            int iA = c4103hA0.A();
            if (iA > 0) {
                String strU = AbstractC7209tN0.u(iA, "");
                int iA2 = c4103hA0.A();
                if (iA2 > 0) {
                    strU = strU + "/" + iA2;
                }
                return new C6596q91(str, null, P70.B(strU));
            }
        }
        AbstractC6789rA1.h("Failed to parse index/count attribute: " + F9.e(i));
        return null;
    }

    public static int b(C4103hA0 c4103hA0) {
        int iG = c4103hA0.g();
        if (c4103hA0.g() == 1684108385) {
            c4103hA0.H(8);
            int i = iG - 16;
            if (i == 1) {
                return c4103hA0.u();
            }
            if (i == 2) {
                return c4103hA0.A();
            }
            if (i == 3) {
                return c4103hA0.x();
            }
            if (i == 4 && (c4103hA0.a[c4103hA0.b] & 128) == 0) {
                return c4103hA0.y();
            }
        }
        AbstractC6789rA1.h("Failed to parse data atom to int");
        return -1;
    }

    public static V50 c(int i, String str, C4103hA0 c4103hA0, boolean z, boolean z2) {
        int iB = b(c4103hA0);
        if (z2) {
            iB = Math.min(1, iB);
        }
        if (iB >= 0) {
            return z ? new C6596q91(str, null, P70.B(Integer.toString(iB))) : new C1171Ou("und", str, Integer.toString(iB));
        }
        AbstractC6789rA1.h("Failed to parse uint8 attribute: " + F9.e(i));
        return null;
    }

    public static C6596q91 d(int i, C4103hA0 c4103hA0, String str) {
        int iG = c4103hA0.g();
        if (c4103hA0.g() == 1684108385) {
            c4103hA0.H(8);
            return new C6596q91(str, null, P70.B(c4103hA0.q(iG - 16)));
        }
        AbstractC6789rA1.h("Failed to parse text attribute: " + F9.e(i));
        return null;
    }
}
