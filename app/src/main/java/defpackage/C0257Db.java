package defpackage;

import com.huawei.hms.rn.push.constants.NotificationConstants;

/* renamed from: Db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257Db implements InterfaceC1802Ww0 {
    public static final C0257Db a = new C0257Db();
    public static final C2520cT b = C2520cT.c("pc");
    public static final C2520cT c = C2520cT.c("symbol");
    public static final C2520cT d = C2520cT.c("file");
    public static final C2520cT e = C2520cT.c("offset");
    public static final C2520cT f = C2520cT.c(NotificationConstants.IMPORTANCE);

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C3998gd c3998gd = (C3998gd) ((FA) obj);
        interfaceC1880Xw0.f(b, c3998gd.a);
        interfaceC1880Xw0.a(c, c3998gd.b);
        interfaceC1880Xw0.a(d, c3998gd.c);
        interfaceC1880Xw0.f(e, c3998gd.d);
        interfaceC1880Xw0.d(f, c3998gd.e);
    }
}
