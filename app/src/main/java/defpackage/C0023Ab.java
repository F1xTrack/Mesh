package defpackage;

/* renamed from: Ab, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023Ab implements InterfaceC1802Ww0 {
    public static final C0023Ab a = new C0023Ab();
    public static final C2520cT b = C2520cT.c("type");
    public static final C2520cT c = C2520cT.c("reason");
    public static final C2520cT d = C2520cT.c("frames");
    public static final C2520cT e = C2520cT.c("causedBy");
    public static final C2520cT f = C2520cT.c("overflowCount");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C2550cd c2550cd = (C2550cd) ((DA) obj);
        interfaceC1880Xw0.a(b, c2550cd.a);
        interfaceC1880Xw0.a(c, c2550cd.b);
        interfaceC1880Xw0.a(d, c2550cd.c);
        interfaceC1880Xw0.a(e, c2550cd.d);
        interfaceC1880Xw0.d(f, c2550cd.e);
    }
}
