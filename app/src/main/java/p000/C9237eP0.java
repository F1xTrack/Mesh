package p000;

import java.lang.reflect.Field;

/* renamed from: eP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9237eP0 extends AbstractC0288EZ implements InterfaceC6497nZ {

    /* renamed from: a */
    public static final C9237eP0 f26695a = new C9237eP0(1);

    @Override // p000.AbstractC7284zl, p000.InterfaceC8152Qd0
    public final String getName() {
        return "<init>";
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC10163le0 getOwner() {
        return BP0.f799a.mo3846b(C10261mP0.class);
    }

    @Override // p000.AbstractC7284zl
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        Field field = (Field) obj;
        O90.m5968f(field, "p0");
        return new C10261mP0(field);
    }
}
