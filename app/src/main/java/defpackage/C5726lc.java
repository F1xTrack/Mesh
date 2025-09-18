package defpackage;

import com.huawei.hms.rn.push.constants.NotificationConstants;

/* renamed from: lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5726lc implements InterfaceC1802Ww0 {
    public static final C5726lc a = new C5726lc();
    public static final C2520cT b = C2520cT.c("processName");
    public static final C2520cT c = C2520cT.c("pid");
    public static final C2520cT d = C2520cT.c(NotificationConstants.IMPORTANCE);
    public static final C2520cT e = C2520cT.c("defaultProcess");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        DD0 dd0 = (DD0) obj;
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        interfaceC1880Xw0.a(b, dd0.a);
        interfaceC1880Xw0.d(c, dd0.b);
        interfaceC1880Xw0.d(d, dd0.c);
        interfaceC1880Xw0.c(e, dd0.d);
    }
}
