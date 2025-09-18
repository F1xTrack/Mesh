package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: zP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C11921zP0 extends AbstractC0288EZ implements Function2 {

    /* renamed from: a */
    public static final C11921zP0 f46828a = new C11921zP0(2);

    @Override // p000.AbstractC7284zl, p000.InterfaceC8152Qd0
    public final String getName() {
        return "loadFunction";
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC10163le0 getOwner() {
        return BP0.f799a.mo3846b(C9547gq0.class);
    }

    @Override // p000.AbstractC7284zl
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C9547gq0 c9547gq0 = (C9547gq0) obj;
        C9729iF0 c9729iF0 = (C9729iF0) obj2;
        O90.m5968f(c9547gq0, "p0");
        O90.m5968f(c9729iF0, "p1");
        return c9547gq0.m18666e(c9729iF0);
    }
}
