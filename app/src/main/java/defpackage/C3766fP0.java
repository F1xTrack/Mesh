package defpackage;

import java.lang.reflect.Method;

/* renamed from: fP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3766fP0 extends EZ implements InterfaceC6099nZ {
    public static final C3766fP0 a = new C3766fP0(1);

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        return BP0.a.b(C6452pP0.class);
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        O90.f(method, "p0");
        return new C6452pP0(method);
    }
}
