package defpackage;

/* renamed from: jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5344jc implements InterfaceC1802Ww0 {
    public static final C5344jc a = new C5344jc();
    public static final C2520cT b = C2520cT.c("appId");
    public static final C2520cT c = C2520cT.c("deviceModel");
    public static final C2520cT d = C2520cT.c("sessionSdkVersion");
    public static final C2520cT e = C2520cT.c("osVersion");
    public static final C2520cT f = C2520cT.c("logEnvironment");
    public static final C2520cT g = C2520cT.c("androidAppInfo");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        C2267b8 c2267b8 = (C2267b8) obj;
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        interfaceC1880Xw0.a(b, c2267b8.a);
        interfaceC1880Xw0.a(c, c2267b8.b);
        interfaceC1880Xw0.a(d, "2.0.8");
        interfaceC1880Xw0.a(e, c2267b8.c);
        interfaceC1880Xw0.a(f, EnumC4214hl0.LOG_ENVIRONMENT_PROD);
        interfaceC1880Xw0.a(g, c2267b8.d);
    }
}
