package defpackage;

import io.sentry.android.replay.capture.c;

/* renamed from: Ht0 */
/* loaded from: classes2.dex */
public final class C0624Ht0 extends IE0 implements InterfaceC0189Ce0, InterfaceC0579He0 {
    public C0624Ht0(InterfaceC1667Vd0 interfaceC1667Vd0, String str, String str2) {
        super(AbstractC8422zl.NO_RECEIVER, ((InterfaceC6538ps) interfaceC1667Vd0).b(), str, str2, !(interfaceC1667Vd0 instanceof InterfaceC1667Vd0) ? 1 : 0);
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC1277Qd0 computeReflected() {
        return BP0.a.d(this);
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
        return ((InterfaceC0189Ce0) getReflected()).c();
    }

    @Override // defpackage.InterfaceC0579He0
    public final InterfaceC0111Be0 d() {
        return ((InterfaceC0189Ce0) getReflected()).d();
    }

    public C0624Ht0(String str, String str2) {
        super(AbstractC8422zl.NO_RECEIVER, c.class, str, str2, 0);
    }
}
