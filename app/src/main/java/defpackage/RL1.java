package defpackage;

/* loaded from: classes.dex */
public abstract class RL1 {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final C5960mq0 b(C6613qF0 c6613qF0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, boolean z, boolean z2, boolean z3) {
        O90.f(c6613qF0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        C8089y00 c8089y00 = AbstractC0654Id0.d;
        O90.e(c8089y00, "propertySignature");
        C0186Cd0 c0186Cd0 = (C0186Cd0) XM1.a(c6613qF0, c8089y00);
        if (c0186Cd0 == null) {
            return null;
        }
        if (z) {
            DR dr = C0732Jd0.a;
            C5730ld0 c5730ld0B = C0732Jd0.b(c6613qF0, interfaceC1637Ut0, c5826m71, z3);
            if (c5730ld0B == null) {
                return null;
            }
            return MA1.a(c5730ld0B);
        }
        if (!z2 || (c0186Cd0.b & 2) != 2) {
            return null;
        }
        C0030Ad0 c0030Ad0 = c0186Cd0.d;
        O90.e(c0030Ad0, "getSyntheticMethod(...)");
        return new C5960mq0(interfaceC1637Ut0.getString(c0030Ad0.c).concat(interfaceC1637Ut0.getString(c0030Ad0.d)));
    }
}
