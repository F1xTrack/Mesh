package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: Ne0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C7998Ne0 extends AbstractC0288EZ implements Function2 {

    /* renamed from: a */
    public static final C7998Ne0 f7934a = new C7998Ne0(2);

    @Override // p000.AbstractC7284zl, p000.InterfaceC8152Qd0
    public final String getName() {
        return "loadProperty";
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC10163le0 getOwner() {
        return BP0.f799a.mo3846b(C9547gq0.class);
    }

    @Override // p000.AbstractC7284zl
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C9547gq0 c9547gq0 = (C9547gq0) obj;
        C10753qF0 c10753qF0 = (C10753qF0) obj2;
        O90.m5968f(c9547gq0, "p0");
        O90.m5968f(c10753qF0, "p1");
        return c9547gq0.m18667f(c10753qF0);
    }
}
