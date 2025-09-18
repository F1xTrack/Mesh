package p000;

import io.sentry.android.replay.capture.AbstractC5929c;

/* renamed from: Ht0 */
/* loaded from: classes2.dex */
public final class C7716Ht0 extends IE0 implements InterfaceC7426Ce0, InterfaceC7686He0 {
    public C7716Ht0(InterfaceC8412Vd0 interfaceC8412Vd0, String str, String str2) {
        super(AbstractC7284zl.NO_RECEIVER, ((InterfaceC6644ps) interfaceC8412Vd0).mo2807b(), str, str2, !(interfaceC8412Vd0 instanceof InterfaceC8412Vd0) ? 1 : 0);
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC8152Qd0 computeReflected() {
        return BP0.f799a.mo3848d(this);
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
        return ((InterfaceC7426Ce0) getReflected()).mo3001c();
    }

    @Override // p000.InterfaceC7686He0
    /* renamed from: d */
    public final InterfaceC7374Be0 mo247d() {
        return ((InterfaceC7426Ce0) getReflected()).mo247d();
    }

    public C7716Ht0(String str, String str2) {
        super(AbstractC7284zl.NO_RECEIVER, AbstractC5929c.class, str, str2, 0);
    }
}
