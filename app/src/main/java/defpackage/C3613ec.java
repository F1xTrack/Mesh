package defpackage;

/* renamed from: ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3613ec implements InterfaceC1802Ww0 {
    public static final C3613ec a = new C3613ec();
    public static final C2520cT b = C2520cT.c("rolloutId");
    public static final C2520cT c = C2520cT.c("variantId");
    public static final C2520cT d = C2520cT.c("parameterKey");
    public static final C2520cT e = C2520cT.c("parameterValue");
    public static final C2520cT f = C2520cT.c("templateVersion");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C7259te c7259te = (C7259te) ((AbstractC5318jT0) obj);
        interfaceC1880Xw0.a(b, c7259te.b);
        interfaceC1880Xw0.a(c, c7259te.c);
        interfaceC1880Xw0.a(d, c7259te.d);
        interfaceC1880Xw0.a(e, c7259te.e);
        interfaceC1880Xw0.f(f, c7259te.f);
    }
}
