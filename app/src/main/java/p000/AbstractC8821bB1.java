package p000;

/* renamed from: bB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8821bB1 {

    /* renamed from: a */
    public static final boolean[] f16857a = new boolean[3];

    /* renamed from: a */
    public static final String m10433a(InterfaceC6976us interfaceC6976us, String str) {
        String strM1226b;
        O90.m5968f(interfaceC6976us, "classDescriptor");
        String str2 = C11309ub0.f43758a;
        C0789MX c0789mxM4661i = AbstractC6940uI.m25154g(interfaceC6976us).m4661i();
        O90.m5967e(c0789mxM4661i, "toUnsafe(...)");
        C0055As c0055AsM25217f = C11309ub0.m25217f(c0789mxM4661i);
        if (c0055AsM25217f != null) {
            strM1226b = C9137dd0.m17715b(c0055AsM25217f).m17718e();
            O90.m5967e(strM1226b, "getInternalName(...)");
        } else {
            strM1226b = CZ1.m1226b(interfaceC6976us, C10212m12.f37416f);
        }
        O90.m5968f(strM1226b, "internalName");
        return strM1226b + '.' + str;
    }
}
