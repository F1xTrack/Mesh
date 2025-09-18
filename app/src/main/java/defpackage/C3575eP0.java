package defpackage;

import java.lang.reflect.Field;

/* renamed from: eP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3575eP0 extends EZ implements InterfaceC6099nZ {
    public static final C3575eP0 a = new C3575eP0(1);

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        return BP0.a.b(C5879mP0.class);
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        Field field = (Field) obj;
        O90.f(field, "p0");
        return new C5879mP0(field);
    }
}
