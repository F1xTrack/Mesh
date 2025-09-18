package p000;

import java.lang.reflect.Method;

/* renamed from: fP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9365fP0 extends AbstractC0288EZ implements InterfaceC6497nZ {

    /* renamed from: a */
    public static final C9365fP0 f27183a = new C9365fP0(1);

    @Override // p000.AbstractC7284zl, p000.InterfaceC8152Qd0
    public final String getName() {
        return "<init>";
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC10163le0 getOwner() {
        return BP0.f799a.mo3846b(C10645pP0.class);
    }

    @Override // p000.AbstractC7284zl
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        O90.m5968f(method, "p0");
        return new C10645pP0(method);
    }
}
