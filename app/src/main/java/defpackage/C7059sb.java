package defpackage;

import com.huawei.hms.rn.push.constants.RemoteMessageAttributes;

/* renamed from: sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7059sb implements InterfaceC1802Ww0 {
    public static final C7059sb a = new C7059sb();
    public static final C2520cT b = C2520cT.c("filename");
    public static final C2520cT c = C2520cT.c(RemoteMessageAttributes.CONTENTS);

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C1273Qc c1273Qc = (C1273Qc) ((AbstractC7931xA) obj);
        interfaceC1880Xw0.a(b, c1273Qc.a);
        interfaceC1880Xw0.a(c, c1273Qc.b);
    }
}
