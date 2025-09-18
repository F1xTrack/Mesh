package defpackage;

/* renamed from: tI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C7193tI extends EZ implements InterfaceC6099nZ {
    public static final C7193tI a = new C7193tI(1);

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        return BP0.a.b(C1758Wh1.class);
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        C1758Wh1 c1758Wh1 = (C1758Wh1) obj;
        O90.f(c1758Wh1, "p0");
        return Boolean.valueOf(c1758Wh1.z1());
    }
}
