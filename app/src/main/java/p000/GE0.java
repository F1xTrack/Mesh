package p000;

import ru.p031ok.tracer.CoreTracerConfiguration;

/* loaded from: classes2.dex */
public final class GE0 extends IE0 implements InterfaceC9141df0 {
    public GE0(InterfaceC10163le0 interfaceC10163le0, String str, String str2) {
        super(AbstractC7284zl.NO_RECEIVER, ((InterfaceC6644ps) interfaceC10163le0).mo2807b(), str, str2, !(interfaceC10163le0 instanceof InterfaceC8412Vd0) ? 1 : 0);
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC8152Qd0 computeReflected() {
        return BP0.f799a.mo3850f(this);
    }

    @Override // p000.InterfaceC9141df0
    public final Object get(Object obj) {
        return ((AbstractC8360Ud0) mo3001c()).call(obj);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p000.InterfaceC10293mf0
    /* renamed from: c */
    public final InterfaceC9008cf0 mo3001c() {
        return ((InterfaceC9141df0) getReflected()).mo3001c();
    }

    public GE0(String str, String str2) {
        super(AbstractC7284zl.NO_RECEIVER, CoreTracerConfiguration.class, str, str2, 0);
    }
}
