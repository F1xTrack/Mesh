package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class YP {
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public YP(PT pt, C6575q3 c6575q3, DN0 dn0) {
        O90.f(pt, "connectionPool");
        O90.f(dn0, "call");
        this.d = pt;
        this.e = c6575q3;
        this.f = dn0;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.FN0 a(int r13, boolean r14, boolean r15, int r16, int r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YP.a(int, boolean, boolean, int, int):FN0");
    }

    public boolean b(D40 d40) {
        O90.f(d40, "url");
        D40 d402 = ((C6575q3) this.e).i;
        return d40.e == d402.e && O90.a(d40.d, d402.d);
    }

    public void c(IOException iOException) {
        O90.f(iOException, "e");
        this.i = null;
        if ((iOException instanceof C4280i51) && ((C4280i51) iOException).a == 8) {
            this.a++;
        } else if (iOException instanceof C6362ox) {
            this.b++;
        } else {
            this.c++;
        }
    }

    public YP(C3692f11 c3692f11) {
        this.a = 0;
        this.b = 0;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.c = 0;
        this.d = c3692f11;
    }
}
