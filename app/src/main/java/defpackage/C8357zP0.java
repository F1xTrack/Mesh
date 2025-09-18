package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: zP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8357zP0 extends EZ implements Function2 {
    public static final C8357zP0 a = new C8357zP0(2);

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        return "loadFunction";
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        return BP0.a.b(C4038gq0.class);
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4038gq0 c4038gq0 = (C4038gq0) obj;
        C4309iF0 c4309iF0 = (C4309iF0) obj2;
        O90.f(c4038gq0, "p0");
        O90.f(c4309iF0, "p1");
        return c4038gq0.e(c4309iF0);
    }
}
