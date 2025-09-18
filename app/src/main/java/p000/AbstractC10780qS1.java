package p000;

/* renamed from: qS1 */
/* loaded from: classes.dex */
public abstract class AbstractC10780qS1 {
    /* renamed from: a */
    public static void m24002a(long j, C9591hA0 c9591hA0, InterfaceC8357Ub1[] interfaceC8357Ub1Arr) {
        int i;
        while (true) {
            if (c9591hA0.m18743a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c9591hA0.m18743a() == 0) {
                    i = -1;
                    break;
                }
                int iM18763u = c9591hA0.m18763u();
                i2 += iM18763u;
                if (iM18763u != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (c9591hA0.m18743a() == 0) {
                    i3 = -1;
                    break;
                }
                int iM18763u2 = c9591hA0.m18763u();
                i3 += iM18763u2;
                if (iM18763u2 != 255) {
                    break;
                }
            }
            int i4 = c9591hA0.f28294b + i3;
            if (i3 == -1 || i3 > c9591hA0.m18743a()) {
                AbstractC10872rA1.m24175h("Skipping remainder of malformed SEI NAL unit.");
                i4 = c9591hA0.f28295c;
            } else if (i == 4 && i3 >= 8) {
                int iM18763u3 = c9591hA0.m18763u();
                int iM18735A = c9591hA0.m18735A();
                int iM18749g = iM18735A == 49 ? c9591hA0.m18749g() : 0;
                int iM18763u4 = c9591hA0.m18763u();
                if (iM18735A == 47) {
                    c9591hA0.m18742H(1);
                }
                boolean z = iM18763u3 == 181 && (iM18735A == 49 || iM18735A == 47) && iM18763u4 == 3;
                if (iM18735A == 49) {
                    z &= iM18749g == 1195456820;
                }
                if (z) {
                    m24003b(j, c9591hA0, interfaceC8357Ub1Arr);
                }
            }
            c9591hA0.m18741G(i4);
        }
    }

    /* renamed from: b */
    public static void m24003b(long j, C9591hA0 c9591hA0, InterfaceC8357Ub1[] interfaceC8357Ub1Arr) {
        int iM18763u = c9591hA0.m18763u();
        if ((iM18763u & 64) != 0) {
            c9591hA0.m18742H(1);
            int i = (iM18763u & 31) * 3;
            int i2 = c9591hA0.f28294b;
            for (InterfaceC8357Ub1 interfaceC8357Ub1 : interfaceC8357Ub1Arr) {
                c9591hA0.m18741G(i2);
                interfaceC8357Ub1.mo963d(i, c9591hA0);
                YN1.m9281f(j != -9223372036854775807L);
                interfaceC8357Ub1.mo960a(j, 1, i, 0, null);
            }
        }
    }

    /* renamed from: c */
    public static final C9571h11 m24004c(AbstractC8926c11 abstractC8926c11, InterfaceC0021AK interfaceC0021AK) {
        O90.m5968f(interfaceC0021AK, "dispatcher");
        return new C9571h11(abstractC8926c11, interfaceC0021AK);
    }
}
