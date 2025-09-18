package defpackage;

/* renamed from: sG */
/* loaded from: classes.dex */
public final class C6996sG {
    public final String a;
    public int b;
    public long c;
    public final C0456Fp0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ C7187tG g;

    public C6996sG(C7187tG c7187tG, String str, int i, C0456Fp0 c0456Fp0) {
        this.g = c7187tG;
        this.a = str;
        this.b = i;
        this.c = c0456Fp0 == null ? -1L : c0456Fp0.d;
        if (c0456Fp0 == null || !c0456Fp0.b()) {
            return;
        }
        this.d = c0456Fp0;
    }

    public final boolean a(Y3 y3) {
        C0456Fp0 c0456Fp0 = y3.d;
        if (c0456Fp0 == null) {
            return this.b != y3.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (c0456Fp0.d > j) {
            return true;
        }
        C0456Fp0 c0456Fp02 = this.d;
        if (c0456Fp02 == null) {
            return false;
        }
        AbstractC0178Ca1 abstractC0178Ca1 = y3.b;
        int iB = abstractC0178Ca1.b(c0456Fp0.a);
        int iB2 = abstractC0178Ca1.b(c0456Fp02.a);
        if (c0456Fp0.d < c0456Fp02.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zB = c0456Fp0.b();
        int i = c0456Fp02.b;
        if (!zB) {
            int i2 = c0456Fp0.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = c0456Fp0.b;
        if (i3 > i) {
            return true;
        }
        if (i3 == i) {
            if (c0456Fp0.c > c0456Fp02.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(AbstractC0178Ca1 abstractC0178Ca1, AbstractC0178Ca1 abstractC0178Ca12) {
        int i = this.b;
        if (i < abstractC0178Ca1.o()) {
            C7187tG c7187tG = this.g;
            abstractC0178Ca1.n(i, c7187tG.a);
            C0100Ba1 c0100Ba1 = c7187tG.a;
            for (int i2 = c0100Ba1.n; i2 <= c0100Ba1.o; i2++) {
                int iB = abstractC0178Ca12.b(abstractC0178Ca1.l(i2));
                if (iB != -1) {
                    i = abstractC0178Ca12.f(iB, c7187tG.b, false).c;
                    break;
                }
            }
            i = -1;
        } else if (i >= abstractC0178Ca12.o()) {
            i = -1;
        }
        this.b = i;
        if (i == -1) {
            return false;
        }
        C0456Fp0 c0456Fp0 = this.d;
        return c0456Fp0 == null || abstractC0178Ca12.b(c0456Fp0.a) != -1;
    }
}
