package defpackage;

/* renamed from: bB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2278bB1 {
    public static final boolean[] a = new boolean[3];

    public static final String a(InterfaceC7492us interfaceC7492us, String str) {
        String strB;
        O90.f(interfaceC7492us, "classDescriptor");
        String str2 = C7442ub0.a;
        MX mxI = AbstractC7384uI.g(interfaceC7492us).i();
        O90.e(mxI, "toUnsafe(...)");
        C0074As c0074AsF = C7442ub0.f(mxI);
        if (c0074AsF != null) {
            strB = C3427dd0.b(c0074AsF).e();
            O90.e(strB, "getInternalName(...)");
        } else {
            strB = CZ1.b(interfaceC7492us, C5806m12.f);
        }
        O90.f(strB, "internalName");
        return strB + '.' + str;
    }
}
