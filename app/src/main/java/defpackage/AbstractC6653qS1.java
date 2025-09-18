package defpackage;

/* renamed from: qS1 */
/* loaded from: classes.dex */
public abstract class AbstractC6653qS1 {
    public static void a(long j, C4103hA0 c4103hA0, InterfaceC1584Ub1[] interfaceC1584Ub1Arr) {
        int i;
        while (true) {
            if (c4103hA0.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c4103hA0.a() == 0) {
                    i = -1;
                    break;
                }
                int iU = c4103hA0.u();
                i2 += iU;
                if (iU != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (c4103hA0.a() == 0) {
                    i3 = -1;
                    break;
                }
                int iU2 = c4103hA0.u();
                i3 += iU2;
                if (iU2 != 255) {
                    break;
                }
            }
            int i4 = c4103hA0.b + i3;
            if (i3 == -1 || i3 > c4103hA0.a()) {
                AbstractC6789rA1.h("Skipping remainder of malformed SEI NAL unit.");
                i4 = c4103hA0.c;
            } else if (i == 4 && i3 >= 8) {
                int iU3 = c4103hA0.u();
                int iA = c4103hA0.A();
                int iG = iA == 49 ? c4103hA0.g() : 0;
                int iU4 = c4103hA0.u();
                if (iA == 47) {
                    c4103hA0.H(1);
                }
                boolean z = iU3 == 181 && (iA == 49 || iA == 47) && iU4 == 3;
                if (iA == 49) {
                    z &= iG == 1195456820;
                }
                if (z) {
                    b(j, c4103hA0, interfaceC1584Ub1Arr);
                }
            }
            c4103hA0.G(i4);
        }
    }

    public static void b(long j, C4103hA0 c4103hA0, InterfaceC1584Ub1[] interfaceC1584Ub1Arr) {
        int iU = c4103hA0.u();
        if ((iU & 64) != 0) {
            c4103hA0.H(1);
            int i = (iU & 31) * 3;
            int i2 = c4103hA0.b;
            for (InterfaceC1584Ub1 interfaceC1584Ub1 : interfaceC1584Ub1Arr) {
                c4103hA0.G(i2);
                interfaceC1584Ub1.d(i, c4103hA0);
                YN1.f(j != -9223372036854775807L);
                interfaceC1584Ub1.a(j, 1, i, 0, null);
            }
        }
    }

    public static final C4074h11 c(AbstractC2435c11 abstractC2435c11, AK ak) {
        O90.f(ak, "dispatcher");
        return new C4074h11(abstractC2435c11, ak);
    }
}
