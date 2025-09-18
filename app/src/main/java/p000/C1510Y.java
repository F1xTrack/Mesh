package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Y */
/* loaded from: classes.dex */
public final class C1510Y extends AbstractC8971cM1 {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f14080a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f14081b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f14082c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f14083d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f14084e;

    public C1510Y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f14080a = atomicReferenceFieldUpdater;
        this.f14081b = atomicReferenceFieldUpdater2;
        this.f14082c = atomicReferenceFieldUpdater3;
        this.f14083d = atomicReferenceFieldUpdater4;
        this.f14084e = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: a */
    public final boolean mo9190a(AbstractC6336l0 abstractC6336l0, C1384W c1384w, C1384W c1384w2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14083d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC6336l0, c1384w, c1384w2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC6336l0) == c1384w);
        return false;
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: b */
    public final boolean mo9191b(AbstractC6336l0 abstractC6336l0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14084e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC6336l0, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC6336l0) == obj);
        return false;
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: c */
    public final boolean mo9192c(AbstractC6336l0 abstractC6336l0, C6210j0 c6210j0, C6210j0 c6210j02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14082c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC6336l0, c6210j0, c6210j02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC6336l0) == c6210j0);
        return false;
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: e */
    public final C1384W mo9193e(AbstractC6336l0 abstractC6336l0) {
        return (C1384W) this.f14083d.getAndSet(abstractC6336l0, C1384W.f12911d);
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: f */
    public final C6210j0 mo9194f(AbstractC6336l0 abstractC6336l0) {
        return (C6210j0) this.f14082c.getAndSet(abstractC6336l0, C6210j0.f34836c);
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: g */
    public final void mo9195g(C6210j0 c6210j0, C6210j0 c6210j02) {
        this.f14081b.lazySet(c6210j0, c6210j02);
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: h */
    public final void mo9196h(C6210j0 c6210j0, Thread thread) {
        this.f14080a.lazySet(c6210j0, thread);
    }
}
