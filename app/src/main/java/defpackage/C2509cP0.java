package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: cP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2509cP0 extends EZ implements InterfaceC6099nZ {
    public static final C2509cP0 a = new C2509cP0(1);

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        return BP0.a.b(C5306jP0.class);
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        O90.f(constructor, "p0");
        return new C5306jP0(constructor);
    }
}
