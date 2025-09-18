package defpackage;

/* renamed from: Fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413Fb implements InterfaceC1802Ww0 {
    public static final C0413Fb a = new C0413Fb();
    public static final C2520cT b = C2520cT.c("batteryLevel");
    public static final C2520cT c = C2520cT.c("batteryVelocity");
    public static final C2520cT d = C2520cT.c("proximityOn");
    public static final C2520cT e = C2520cT.c("orientation");
    public static final C2520cT f = C2520cT.c("ramUsed");
    public static final C2520cT g = C2520cT.c("diskUsed");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C5538kd c5538kd = (C5538kd) ((KA) obj);
        interfaceC1880Xw0.a(b, c5538kd.a);
        interfaceC1880Xw0.d(c, c5538kd.b);
        interfaceC1880Xw0.c(d, c5538kd.c);
        interfaceC1880Xw0.d(e, c5538kd.d);
        interfaceC1880Xw0.f(f, c5538kd.e);
        interfaceC1880Xw0.f(g, c5538kd.f);
    }
}
