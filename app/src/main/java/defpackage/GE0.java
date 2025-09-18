package defpackage;

import ru.ok.tracer.CoreTracerConfiguration;

/* loaded from: classes2.dex */
public final class GE0 extends IE0 implements InterfaceC3433df0 {
    public GE0(InterfaceC5733le0 interfaceC5733le0, String str, String str2) {
        super(AbstractC8422zl.NO_RECEIVER, ((InterfaceC6538ps) interfaceC5733le0).b(), str, str2, !(interfaceC5733le0 instanceof InterfaceC1667Vd0) ? 1 : 0);
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC1277Qd0 computeReflected() {
        return BP0.a.f(this);
    }

    @Override // defpackage.InterfaceC3433df0
    public final Object get(Object obj) {
        return ((AbstractC1589Ud0) c()).call(obj);
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.InterfaceC5927mf0
    public final InterfaceC2557cf0 c() {
        return ((InterfaceC3433df0) getReflected()).c();
    }

    public GE0(String str, String str2) {
        super(AbstractC8422zl.NO_RECEIVER, CoreTracerConfiguration.class, str, str2, 0);
    }
}
