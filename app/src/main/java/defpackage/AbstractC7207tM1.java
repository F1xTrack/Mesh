package defpackage;

/* renamed from: tM1 */
/* loaded from: classes.dex */
public abstract class AbstractC7207tM1 {
    public static final int a(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i7 = -i3;
        int i8 = i % i7;
        if (i8 < 0) {
            i8 += i7;
        }
        int i9 = i2 % i7;
        if (i9 < 0) {
            i9 += i7;
        }
        int i10 = (i8 - i9) % i7;
        if (i10 < 0) {
            i10 += i7;
        }
        return i2 + i10;
    }

    public static boolean b(InterfaceC1009Ms interfaceC1009Ms, Z01 z01, Z01 z012) {
        if (interfaceC1009Ms.a(z01) == interfaceC1009Ms.a(z012) && interfaceC1009Ms.m0(z01) == interfaceC1009Ms.m0(z012)) {
            if ((interfaceC1009Ms.G0(z01) == null) == (interfaceC1009Ms.G0(z012) == null) && interfaceC1009Ms.h0(interfaceC1009Ms.W(z01), interfaceC1009Ms.W(z012))) {
                if (interfaceC1009Ms.i0(z01, z012)) {
                    return true;
                }
                int iA = interfaceC1009Ms.a(z01);
                for (int i = 0; i < iA; i++) {
                    AbstractC6689qe1 abstractC6689qe1A0 = interfaceC1009Ms.A0(z01, i);
                    AbstractC6689qe1 abstractC6689qe1A02 = interfaceC1009Ms.A0(z012, i);
                    if (interfaceC1009Ms.o0(abstractC6689qe1A0) != interfaceC1009Ms.o0(abstractC6689qe1A02)) {
                        return false;
                    }
                    if (!interfaceC1009Ms.o0(abstractC6689qe1A0) && (interfaceC1009Ms.M(abstractC6689qe1A0) != interfaceC1009Ms.M(abstractC6689qe1A02) || !c(interfaceC1009Ms, interfaceC1009Ms.R(abstractC6689qe1A0), interfaceC1009Ms.R(abstractC6689qe1A02)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean c(InterfaceC1009Ms interfaceC1009Ms, InterfaceC0974Mg0 interfaceC0974Mg0, InterfaceC0974Mg0 interfaceC0974Mg02) {
        if (interfaceC0974Mg0 == interfaceC0974Mg02) {
            return true;
        }
        X01 x01R = interfaceC1009Ms.r(interfaceC0974Mg0);
        X01 x01R2 = interfaceC1009Ms.r(interfaceC0974Mg02);
        if (x01R != null && x01R2 != null) {
            return b(interfaceC1009Ms, x01R, x01R2);
        }
        AbstractC3405dW abstractC3405dWP0 = interfaceC1009Ms.p0(interfaceC0974Mg0);
        AbstractC3405dW abstractC3405dWP02 = interfaceC1009Ms.p0(interfaceC0974Mg02);
        if (abstractC3405dWP0 == null || abstractC3405dWP02 == null) {
            return false;
        }
        return b(interfaceC1009Ms, interfaceC1009Ms.B(abstractC3405dWP0), interfaceC1009Ms.B(abstractC3405dWP02)) && b(interfaceC1009Ms, interfaceC1009Ms.w(abstractC3405dWP0), interfaceC1009Ms.w(abstractC3405dWP02));
    }
}
