package defpackage;

/* renamed from: w40 */
/* loaded from: classes2.dex */
public abstract class AbstractC7724w40 {
    static {
        C0674Ik c0674Ik = C0674Ik.d;
        TE.D("\"\\");
        TE.D("\t ,=");
    }

    public static final boolean a(HS0 hs0) {
        if (O90.a(hs0.a.b, "HEAD")) {
            return false;
        }
        int i = hs0.d;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && AbstractC0199Ch1.l(hs0) == -1) {
            String strB = hs0.f.b("Transfer-Encoding");
            if (strB == null) {
                strB = null;
            }
            if (!"chunked".equalsIgnoreCase(strB)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0203 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.InterfaceC4255hz r35, defpackage.D40 r36, defpackage.K20 r37) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7724w40.b(hz, D40, K20):void");
    }
}
