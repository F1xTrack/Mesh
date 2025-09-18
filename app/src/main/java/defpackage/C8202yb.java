package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8202yb implements InterfaceC1802Ww0 {
    public static final C8202yb a = new C8202yb();
    public static final C2520cT b = C2520cT.c("baseAddress");
    public static final C2520cT c = C2520cT.c("size");
    public static final C2520cT d = C2520cT.c("name");
    public static final C2520cT e = C2520cT.c(CommonUrlParts.UUID);

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C2360bd c2360bd = (C2360bd) ((CA) obj);
        interfaceC1880Xw0.f(b, c2360bd.a);
        interfaceC1880Xw0.f(c, c2360bd.b);
        interfaceC1880Xw0.a(d, c2360bd.c);
        String str = c2360bd.d;
        interfaceC1880Xw0.a(e, str != null ? str.getBytes(TA.a) : null);
    }
}
