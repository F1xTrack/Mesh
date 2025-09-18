package p000;

import java.lang.reflect.Constructor;

/* renamed from: cP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8976cP0 extends AbstractC0288EZ implements InterfaceC6497nZ {

    /* renamed from: a */
    public static final C8976cP0 f17467a = new C8976cP0(1);

    @Override // p000.AbstractC7284zl, p000.InterfaceC8152Qd0
    public final String getName() {
        return "<init>";
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC10163le0 getOwner() {
        return BP0.f799a.mo3846b(C9877jP0.class);
    }

    @Override // p000.AbstractC7284zl
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        O90.m5968f(constructor, "p0");
        return new C9877jP0(constructor);
    }
}
