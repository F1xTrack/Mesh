package defpackage;

/* renamed from: ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4377ic implements InterfaceC1802Ww0 {
    public static final C4377ic a = new C4377ic();
    public static final C2520cT b = C2520cT.c("packageName");
    public static final C2520cT c = C2520cT.c("versionName");
    public static final C2520cT d = C2520cT.c("appBuildVersion");
    public static final C2520cT e = C2520cT.c("deviceManufacturer");
    public static final C2520cT f = C2520cT.c("currentProcessDetails");
    public static final C2520cT g = C2520cT.c("appProcessDetails");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        C3702f4 c3702f4 = (C3702f4) obj;
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        interfaceC1880Xw0.a(b, c3702f4.a);
        interfaceC1880Xw0.a(c, c3702f4.b);
        interfaceC1880Xw0.a(d, c3702f4.c);
        interfaceC1880Xw0.a(e, c3702f4.d);
        interfaceC1880Xw0.a(f, c3702f4.e);
        interfaceC1880Xw0.a(g, c3702f4.f);
    }
}
