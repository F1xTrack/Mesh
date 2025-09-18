package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Mt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7976Mt0 implements InterfaceC0493Hp, InterfaceC10564om1 {

    /* renamed from: a */
    public final C0619Jp f7381a;

    /* renamed from: b */
    public final /* synthetic */ C8028Nt0 f7382b;

    public C7976Mt0(C8028Nt0 c8028Nt0, C0619Jp c0619Jp) {
        this.f7382b = c8028Nt0;
        this.f7381a = c0619Jp;
    }

    @Override // p000.InterfaceC0493Hp
    /* renamed from: a */
    public final C7190yG mo3596a(Object obj, InterfaceC6625pZ interfaceC6625pZ) {
        C8028Nt0 c8028Nt0 = this.f7382b;
        C7219yj c7219yj = new C7219yj(c8028Nt0, 1, this);
        C7190yG c7190yGM4424E = this.f7381a.m4424E((C8313Tf1) obj, c7219yj);
        if (c7190yGM4424E != null) {
            C8028Nt0.f8115g.set(c8028Nt0, null);
        }
        return c7190yGM4424E;
    }

    @Override // p000.InterfaceC10564om1
    /* renamed from: b */
    public final void mo4425b(KX0 kx0, int i) {
        this.f7381a.mo4425b(kx0, i);
    }

    @Override // p000.InterfaceC0493Hp
    /* renamed from: e */
    public final void mo3597e(Object obj, InterfaceC6625pZ interfaceC6625pZ) {
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8028Nt0.f8115g;
        C8028Nt0 c8028Nt0 = this.f7382b;
        atomicReferenceFieldUpdater.set(c8028Nt0, null);
        C11620x20 c11620x20 = new C11620x20(c8028Nt0, 1, this);
        C0619Jp c0619Jp = this.f7381a;
        c0619Jp.m4422B(c8313Tf1, c0619Jp.f46791c, new C0556Ip(0, c11620x20));
    }

    @Override // p000.InterfaceC1382Vy
    public final InterfaceC0125Bz getContext() {
        return this.f7381a.f5712e;
    }

    @Override // p000.InterfaceC0493Hp
    /* renamed from: i */
    public final void mo3598i(Object obj) {
        this.f7381a.mo3598i(obj);
    }

    @Override // p000.InterfaceC0493Hp
    public final boolean isActive() {
        return this.f7381a.isActive();
    }

    @Override // p000.InterfaceC1382Vy
    public final void resumeWith(Object obj) {
        this.f7381a.resumeWith(obj);
    }
}
