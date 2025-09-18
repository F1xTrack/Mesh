package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7632vb implements InterfaceC1802Ww0 {
    public static final C7632vb a = new C7632vb();
    public static final C2520cT b = C2520cT.c("arch");
    public static final C2520cT c = C2520cT.c(CommonUrlParts.MODEL);
    public static final C2520cT d = C2520cT.c("cores");
    public static final C2520cT e = C2520cT.c("ram");
    public static final C2520cT f = C2520cT.c("diskSpace");
    public static final C2520cT g = C2520cT.c("simulator");
    public static final C2520cT h = C2520cT.c("state");
    public static final C2520cT i = C2520cT.c("manufacturer");
    public static final C2520cT j = C2520cT.c("modelClass");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C1741Wc c1741Wc = (C1741Wc) ((BA) obj);
        interfaceC1880Xw0.d(b, c1741Wc.a);
        interfaceC1880Xw0.a(c, c1741Wc.b);
        interfaceC1880Xw0.d(d, c1741Wc.c);
        interfaceC1880Xw0.f(e, c1741Wc.d);
        interfaceC1880Xw0.f(f, c1741Wc.e);
        interfaceC1880Xw0.c(g, c1741Wc.f);
        interfaceC1880Xw0.d(h, c1741Wc.g);
        interfaceC1880Xw0.a(i, c1741Wc.h);
        interfaceC1880Xw0.a(j, c1741Wc.i);
    }
}
