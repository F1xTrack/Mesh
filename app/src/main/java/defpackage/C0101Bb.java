package defpackage;

/* renamed from: Bb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101Bb implements InterfaceC1802Ww0 {
    public static final C0101Bb a = new C0101Bb();
    public static final C2520cT b = C2520cT.c("name");
    public static final C2520cT c = C2520cT.c("code");
    public static final C2520cT d = C2520cT.c("address");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C3426dd c3426dd = (C3426dd) ((EA) obj);
        interfaceC1880Xw0.a(b, c3426dd.a);
        interfaceC1880Xw0.a(c, c3426dd.b);
        interfaceC1880Xw0.f(d, c3426dd.c);
    }
}
