package defpackage;

/* renamed from: lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5723lb implements InterfaceC1802Ww0 {
    public static final C5723lb a = new C5723lb();
    public static final C2520cT b = C2520cT.c("networkType");
    public static final C2520cT c = C2520cT.c("mobileSubtype");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C2363be c2363be = (C2363be) ((AbstractC1406Ru0) obj);
        interfaceC1880Xw0.a(b, c2363be.a);
        interfaceC1880Xw0.a(c, c2363be.b);
    }
}
