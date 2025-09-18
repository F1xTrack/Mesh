package defpackage;

/* renamed from: cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2547cc implements InterfaceC1802Ww0 {
    public static final C2547cc a = new C2547cc();
    public static final C2520cT b = new C2520cT("currentCacheSizeBytes", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(1))));
    public static final C2520cT c = new C2520cT("maxCacheSizeBytes", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(2))));

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        C2069a51 c2069a51 = (C2069a51) obj;
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        interfaceC1880Xw0.f(b, c2069a51.a);
        interfaceC1880Xw0.f(c, c2069a51.b);
    }
}
