package defpackage;

/* renamed from: kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5532kb implements InterfaceC1802Ww0 {
    public static final C5532kb a = new C5532kb();
    public static final C2520cT b = C2520cT.c("requestTimeMs");
    public static final C2520cT c = C2520cT.c("requestUptimeMs");
    public static final C2520cT d = C2520cT.c("clientInfo");
    public static final C2520cT e = C2520cT.c("logSource");
    public static final C2520cT f = C2520cT.c("logSourceName");
    public static final C2520cT g = C2520cT.c("logEvent");
    public static final C2520cT h = C2520cT.c("qosTier");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C1822Xd c1822Xd = (C1822Xd) ((AbstractC5754ll0) obj);
        interfaceC1880Xw0.f(b, c1822Xd.a);
        interfaceC1880Xw0.f(c, c1822Xd.b);
        interfaceC1880Xw0.a(d, c1822Xd.c);
        interfaceC1880Xw0.a(e, c1822Xd.d);
        interfaceC1880Xw0.a(f, c1822Xd.e);
        interfaceC1880Xw0.a(g, c1822Xd.f);
        interfaceC1880Xw0.a(h, EnumC6616qG0.a);
    }
}
