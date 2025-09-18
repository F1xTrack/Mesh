package defpackage;

/* renamed from: Gb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491Gb implements InterfaceC1802Ww0 {
    public static final C0491Gb a = new C0491Gb();
    public static final C2520cT b = C2520cT.c("timestamp");
    public static final C2520cT c = C2520cT.c("type");
    public static final C2520cT d = C2520cT.c("app");
    public static final C2520cT e = C2520cT.c("device");
    public static final C2520cT f = C2520cT.c("log");
    public static final C2520cT g = C2520cT.c("rollouts");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C1897Yc c1897Yc = (C1897Yc) ((PA) obj);
        interfaceC1880Xw0.f(b, c1897Yc.a);
        interfaceC1880Xw0.a(c, c1897Yc.b);
        interfaceC1880Xw0.a(d, c1897Yc.c);
        interfaceC1880Xw0.a(e, c1897Yc.d);
        interfaceC1880Xw0.a(f, c1897Yc.e);
        interfaceC1880Xw0.a(g, c1897Yc.f);
    }
}
