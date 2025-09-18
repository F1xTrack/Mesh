package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Mt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1013Mt0 implements InterfaceC0611Hp, InterfaceC6331om1 {
    public final C0767Jp a;
    public final /* synthetic */ C1091Nt0 b;

    public C1013Mt0(C1091Nt0 c1091Nt0, C0767Jp c0767Jp) {
        this.b = c1091Nt0;
        this.a = c0767Jp;
    }

    @Override // defpackage.InterfaceC0611Hp
    public final C8139yG a(Object obj, InterfaceC6481pZ interfaceC6481pZ) {
        C1091Nt0 c1091Nt0 = this.b;
        C8226yj c8226yj = new C8226yj(c1091Nt0, 1, this);
        C8139yG c8139yGE = this.a.E((C1518Tf1) obj, c8226yj);
        if (c8139yGE != null) {
            C1091Nt0.g.set(c1091Nt0, null);
        }
        return c8139yGE;
    }

    @Override // defpackage.InterfaceC6331om1
    public final void b(KX0 kx0, int i) {
        this.a.b(kx0, i);
    }

    @Override // defpackage.InterfaceC0611Hp
    public final void e(Object obj, InterfaceC6481pZ interfaceC6481pZ) {
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1091Nt0.g;
        C1091Nt0 c1091Nt0 = this.b;
        atomicReferenceFieldUpdater.set(c1091Nt0, null);
        C7907x20 c7907x20 = new C7907x20(c1091Nt0, 1, this);
        C0767Jp c0767Jp = this.a;
        c0767Jp.B(c1518Tf1, c0767Jp.c, new C0689Ip(0, c7907x20));
    }

    @Override // defpackage.InterfaceC1729Vy
    public final InterfaceC0173Bz getContext() {
        return this.a.e;
    }

    @Override // defpackage.InterfaceC0611Hp
    public final void i(Object obj) {
        this.a.i(obj);
    }

    @Override // defpackage.InterfaceC0611Hp
    public final boolean isActive() {
        return this.a.isActive();
    }

    @Override // defpackage.InterfaceC1729Vy
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
