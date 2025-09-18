package defpackage;

/* renamed from: nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6108nc implements InterfaceC1802Ww0 {
    public static final C6108nc a = new C6108nc();
    public static final C2520cT b = C2520cT.c("sessionId");
    public static final C2520cT c = C2520cT.c("firstSessionId");
    public static final C2520cT d = C2520cT.c("sessionIndex");
    public static final C2520cT e = C2520cT.c("eventTimestampUs");
    public static final C2520cT f = C2520cT.c("dataCollectionStatus");
    public static final C2520cT g = C2520cT.c("firebaseInstallationId");
    public static final C2520cT h = C2520cT.c("firebaseAuthenticationToken");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        WY0 wy0 = (WY0) obj;
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        interfaceC1880Xw0.a(b, wy0.a);
        interfaceC1880Xw0.a(c, wy0.b);
        interfaceC1880Xw0.d(d, wy0.c);
        interfaceC1880Xw0.f(e, wy0.d);
        interfaceC1880Xw0.a(f, wy0.e);
        interfaceC1880Xw0.a(g, wy0.f);
        interfaceC1880Xw0.a(h, wy0.g);
    }
}
