package defpackage;


/* renamed from: ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6296ob implements InterfaceC1802Ww0 {
    public static final C6296ob a = new C6296ob();
    public static final C2520cT b = C2520cT.c("pid");
    public static final C2520cT c = C2520cT.c("processName");
    public static final C2520cT d = C2520cT.c("reasonCode");
    public static final C2520cT e = C2520cT.c(NotificationConstants.IMPORTANCE);
    public static final C2520cT f = C2520cT.c("pss");
    public static final C2520cT g = C2520cT.c("rss");
    public static final C2520cT h = C2520cT.c("timestamp");
    public static final C2520cT i = C2520cT.c("traceFile");
    public static final C2520cT j = C2520cT.c("buildIdMappingForArch");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C0961Mc c0961Mc = (C0961Mc) ((AbstractC7551vA) obj);
        interfaceC1880Xw0.d(b, c0961Mc.a);
        interfaceC1880Xw0.a(c, c0961Mc.b);
        interfaceC1880Xw0.d(d, c0961Mc.c);
        interfaceC1880Xw0.d(e, c0961Mc.d);
        interfaceC1880Xw0.f(f, c0961Mc.e);
        interfaceC1880Xw0.f(g, c0961Mc.f);
        interfaceC1880Xw0.f(h, c0961Mc.g);
        interfaceC1880Xw0.a(i, c0961Mc.h);
        interfaceC1880Xw0.a(j, c0961Mc.i);
    }
}
