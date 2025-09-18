package defpackage;

/* renamed from: tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7250tb implements InterfaceC1802Ww0 {
    public static final C7250tb a = new C7250tb();
    public static final C2520cT b = C2520cT.c("identifier");
    public static final C2520cT c = C2520cT.c("version");
    public static final C2520cT d = C2520cT.c("displayVersion");
    public static final C2520cT e = C2520cT.c("organization");
    public static final C2520cT f = C2520cT.c("installationUuid");
    public static final C2520cT g = C2520cT.c("developmentPlatform");
    public static final C2520cT h = C2520cT.c("developmentPlatformVersion");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C1507Tc c1507Tc = (C1507Tc) ((AA) obj);
        interfaceC1880Xw0.a(b, c1507Tc.a);
        interfaceC1880Xw0.a(c, c1507Tc.b);
        interfaceC1880Xw0.a(d, c1507Tc.c);
        interfaceC1880Xw0.a(e, null);
        interfaceC1880Xw0.a(f, c1507Tc.d);
        interfaceC1880Xw0.a(g, c1507Tc.e);
        interfaceC1880Xw0.a(h, c1507Tc.f);
    }
}
