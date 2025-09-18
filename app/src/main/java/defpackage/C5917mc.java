package defpackage;

/* renamed from: mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5917mc implements InterfaceC1802Ww0 {
    public static final C5917mc a = new C5917mc();
    public static final C2520cT b = C2520cT.c("eventType");
    public static final C2520cT c = C2520cT.c("sessionData");
    public static final C2520cT d = C2520cT.c("applicationInfo");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        OY0 oy0 = (OY0) obj;
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        oy0.getClass();
        interfaceC1880Xw0.a(b, RP.SESSION_START);
        interfaceC1880Xw0.a(c, oy0.a);
        interfaceC1880Xw0.a(d, oy0.b);
    }
}
