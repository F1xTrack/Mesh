package defpackage;


/* renamed from: zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8392zb implements InterfaceC1802Ww0 {
    public static final C8392zb a = new C8392zb();
    public static final C2520cT b = C2520cT.c("threads");
    public static final C2520cT c = C2520cT.c(Core.Event.Result.EXCEPTION);
    public static final C2520cT d = C2520cT.c("appExitInfo");
    public static final C2520cT e = C2520cT.c("signal");
    public static final C2520cT f = C2520cT.c("binaries");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C2169ad c2169ad = (C2169ad) ((HA) obj);
        interfaceC1880Xw0.a(b, c2169ad.a);
        interfaceC1880Xw0.a(c, c2169ad.b);
        interfaceC1880Xw0.a(d, c2169ad.c);
        interfaceC1880Xw0.a(e, c2169ad.d);
        interfaceC1880Xw0.a(f, c2169ad.e);
    }
}
