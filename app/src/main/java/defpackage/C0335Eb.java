package defpackage;

import com.huawei.hms.rn.push.constants.NotificationConstants;

/* renamed from: Eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335Eb implements InterfaceC1802Ww0 {
    public static final C0335Eb a = new C0335Eb();
    public static final C2520cT b = C2520cT.c("processName");
    public static final C2520cT c = C2520cT.c("pid");
    public static final C2520cT d = C2520cT.c(NotificationConstants.IMPORTANCE);
    public static final C2520cT e = C2520cT.c("defaultProcess");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C4380id c4380id = (C4380id) ((IA) obj);
        interfaceC1880Xw0.a(b, c4380id.a);
        interfaceC1880Xw0.d(c, c4380id.b);
        interfaceC1880Xw0.d(d, c4380id.c);
        interfaceC1880Xw0.c(e, c4380id.d);
    }
}
