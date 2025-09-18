package p000;

/* renamed from: tM1 */
/* loaded from: classes.dex */
public abstract class AbstractC11152tM1 {
    /* renamed from: a */
    public static final int m24880a(int i, int i2, int i3) {
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

    /* renamed from: b */
    public static boolean m24881b(InterfaceC0810Ms interfaceC0810Ms, Z01 z01, Z01 z012) {
        if (interfaceC0810Ms.mo1054a(z01) == interfaceC0810Ms.mo1054a(z012) && interfaceC0810Ms.mo1090m0(z01) == interfaceC0810Ms.mo1090m0(z012)) {
            if ((interfaceC0810Ms.mo1020G0(z01) == null) == (interfaceC0810Ms.mo1020G0(z012) == null) && interfaceC0810Ms.mo1075h0(interfaceC0810Ms.mo1047W(z01), interfaceC0810Ms.mo1047W(z012))) {
                if (interfaceC0810Ms.mo1078i0(z01, z012)) {
                    return true;
                }
                int iMo1054a = interfaceC0810Ms.mo1054a(z01);
                for (int i = 0; i < iMo1054a; i++) {
                    AbstractC10804qe1 abstractC10804qe1Mo1009A0 = interfaceC0810Ms.mo1009A0(z01, i);
                    AbstractC10804qe1 abstractC10804qe1Mo1009A02 = interfaceC0810Ms.mo1009A0(z012, i);
                    if (interfaceC0810Ms.mo1096o0(abstractC10804qe1Mo1009A0) != interfaceC0810Ms.mo1096o0(abstractC10804qe1Mo1009A02)) {
                        return false;
                    }
                    if (!interfaceC0810Ms.mo1096o0(abstractC10804qe1Mo1009A0) && (interfaceC0810Ms.mo1028M(abstractC10804qe1Mo1009A0) != interfaceC0810Ms.mo1028M(abstractC10804qe1Mo1009A02) || !m24882c(interfaceC0810Ms, interfaceC0810Ms.mo1038R(abstractC10804qe1Mo1009A0), interfaceC0810Ms.mo1038R(abstractC10804qe1Mo1009A02)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m24882c(InterfaceC0810Ms interfaceC0810Ms, InterfaceC7950Mg0 interfaceC7950Mg0, InterfaceC7950Mg0 interfaceC7950Mg02) {
        if (interfaceC7950Mg0 == interfaceC7950Mg02) {
            return true;
        }
        X01 x01Mo1102r = interfaceC0810Ms.mo1102r(interfaceC7950Mg0);
        X01 x01Mo1102r2 = interfaceC0810Ms.mo1102r(interfaceC7950Mg02);
        if (x01Mo1102r != null && x01Mo1102r2 != null) {
            return m24881b(interfaceC0810Ms, x01Mo1102r, x01Mo1102r2);
        }
        AbstractC3933dW abstractC3933dWMo1099p0 = interfaceC0810Ms.mo1099p0(interfaceC7950Mg0);
        AbstractC3933dW abstractC3933dWMo1099p02 = interfaceC0810Ms.mo1099p0(interfaceC7950Mg02);
        if (abstractC3933dWMo1099p0 == null || abstractC3933dWMo1099p02 == null) {
            return false;
        }
        return m24881b(interfaceC0810Ms, interfaceC0810Ms.mo1010B(abstractC3933dWMo1099p0), interfaceC0810Ms.mo1010B(abstractC3933dWMo1099p02)) && m24881b(interfaceC0810Ms, interfaceC0810Ms.mo1111w(abstractC3933dWMo1099p0), interfaceC0810Ms.mo1111w(abstractC3933dWMo1099p02));
    }
}
