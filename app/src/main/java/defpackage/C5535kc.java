package defpackage;

/* renamed from: kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5535kc implements InterfaceC1802Ww0 {
    public static final C5535kc a = new C5535kc();
    public static final C2520cT b = C2520cT.c("performance");
    public static final C2520cT c = C2520cT.c("crashlytics");
    public static final C2520cT d = C2520cT.c("sessionSamplingRate");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        HC hc = (HC) obj;
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        interfaceC1880Xw0.a(b, hc.a);
        interfaceC1880Xw0.a(c, hc.b);
        interfaceC1880Xw0.e(d, hc.c);
    }
}
