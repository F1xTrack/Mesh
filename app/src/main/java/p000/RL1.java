package p000;

/* loaded from: classes.dex */
public abstract class RL1 {
    /* renamed from: a */
    public static void m7000a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: b */
    public static final C10315mq0 m7001b(C10753qF0 c10753qF0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, boolean z, boolean z2, boolean z3) {
        O90.m5968f(c10753qF0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        C11741y00 c11741y00 = AbstractC7736Id0.f5052d;
        O90.m5967e(c11741y00, "propertySignature");
        C7424Cd0 c7424Cd0 = (C7424Cd0) XM1.m8993a(c10753qF0, c11741y00);
        if (c7424Cd0 == null) {
            return null;
        }
        if (z) {
            C0217DR c0217dr = C7788Jd0.f5651a;
            C10161ld0 c10161ld0M4371b = C7788Jd0.m4371b(c10753qF0, interfaceC8392Ut0, c10226m71, z3);
            if (c10161ld0M4371b == null) {
                return null;
            }
            return MA1.m5280a(c10161ld0M4371b);
        }
        if (!z2 || (c7424Cd0.f1496b & 2) != 2) {
            return null;
        }
        C7320Ad0 c7320Ad0 = c7424Cd0.f1498d;
        O90.m5967e(c7320Ad0, "getSyntheticMethod(...)");
        return new C10315mq0(interfaceC8392Ut0.getString(c7320Ad0.f293c).concat(interfaceC8392Ut0.getString(c7320Ad0.f294d)));
    }
}
