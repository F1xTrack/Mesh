package defpackage;

/* renamed from: wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7822wb implements InterfaceC1802Ww0 {
    public static final C7822wb a = new C7822wb();
    public static final C2520cT b = C2520cT.c("generator");
    public static final C2520cT c = C2520cT.c("identifier");
    public static final C2520cT d = C2520cT.c("appQualitySessionId");
    public static final C2520cT e = C2520cT.c("startedAt");
    public static final C2520cT f = C2520cT.c("endedAt");
    public static final C2520cT g = C2520cT.c("crashed");
    public static final C2520cT h = C2520cT.c("app");
    public static final C2520cT i = C2520cT.c("user");
    public static final C2520cT j = C2520cT.c("os");
    public static final C2520cT k = C2520cT.c("device");
    public static final C2520cT l = C2520cT.c("events");
    public static final C2520cT m = C2520cT.c("generatorType");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C1429Sc c1429Sc = (C1429Sc) ((SA) obj);
        interfaceC1880Xw0.a(b, c1429Sc.a);
        interfaceC1880Xw0.a(c, c1429Sc.b.getBytes(TA.a));
        interfaceC1880Xw0.a(d, c1429Sc.c);
        interfaceC1880Xw0.f(e, c1429Sc.d);
        interfaceC1880Xw0.a(f, c1429Sc.e);
        interfaceC1880Xw0.c(g, c1429Sc.f);
        interfaceC1880Xw0.a(h, c1429Sc.g);
        interfaceC1880Xw0.a(i, c1429Sc.h);
        interfaceC1880Xw0.a(j, c1429Sc.i);
        interfaceC1880Xw0.a(k, c1429Sc.j);
        interfaceC1880Xw0.a(l, c1429Sc.k);
        interfaceC1880Xw0.d(m, c1429Sc.l);
    }
}
