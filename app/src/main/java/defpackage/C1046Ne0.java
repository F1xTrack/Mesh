package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: Ne0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1046Ne0 extends EZ implements Function2 {
    public static final C1046Ne0 a = new C1046Ne0(2);

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        return "loadProperty";
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        return BP0.a.b(C4038gq0.class);
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4038gq0 c4038gq0 = (C4038gq0) obj;
        C6613qF0 c6613qF0 = (C6613qF0) obj2;
        O90.f(c4038gq0, "p0");
        O90.f(c6613qF0, "p1");
        return c4038gq0.f(c6613qF0);
    }
}
