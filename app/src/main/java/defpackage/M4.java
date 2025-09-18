package defpackage;

import java.io.EOFException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class M4 {
    public static final VH a = VH.A("k", "x", "y");

    public static C1016Mu0 a(C0573Hc0 c0573Hc0, C1847Xl0 c1847Xl0) throws C6353ou, EOFException {
        ArrayList arrayList = new ArrayList();
        if (c0573Hc0.U() == 1) {
            c0573Hc0.m();
            while (c0573Hc0.x()) {
                arrayList.add(new C6979sA0(c1847Xl0, AbstractC6694qg0.b(c0573Hc0, c1847Xl0, AbstractC0667Ih1.c(), C0474Fv0.f, c0573Hc0.U() == 3, false)));
            }
            c0573Hc0.o();
            AbstractC6884rg0.b(arrayList);
        } else {
            arrayList.add(new C6312og0(AbstractC0651Ic0.b(c0573Hc0, AbstractC0667Ih1.c())));
        }
        return new C1016Mu0(3, arrayList);
    }

    public static R4 b(C0573Hc0 c0573Hc0, C1847Xl0 c1847Xl0) {
        c0573Hc0.n();
        C1016Mu0 c1016Mu0A = null;
        L4 l4D = null;
        boolean z = false;
        L4 l4D2 = null;
        while (c0573Hc0.U() != 4) {
            int iX = c0573Hc0.X(a);
            if (iX == 0) {
                c1016Mu0A = a(c0573Hc0, c1847Xl0);
            } else if (iX != 1) {
                if (iX != 2) {
                    c0573Hc0.b0();
                    c0573Hc0.d0();
                } else if (c0573Hc0.U() == 6) {
                    c0573Hc0.d0();
                    z = true;
                } else {
                    l4D = YM1.d(c0573Hc0, c1847Xl0, true);
                }
            } else if (c0573Hc0.U() == 6) {
                c0573Hc0.d0();
                z = true;
            } else {
                l4D2 = YM1.d(c0573Hc0, c1847Xl0, true);
            }
        }
        c0573Hc0.p();
        if (z) {
            c1847Xl0.a("Lottie doesn't support expressions.");
        }
        return c1016Mu0A != null ? c1016Mu0A : new N4(l4D2, l4D);
    }
}
