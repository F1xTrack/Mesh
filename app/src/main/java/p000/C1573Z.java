package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Z */
/* loaded from: classes.dex */
public final class C1573Z extends AbstractC9104dM1 {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f14633a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f14634b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f14635c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f14636d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f14637e;

    public C1573Z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f14633a = atomicReferenceFieldUpdater;
        this.f14634b = atomicReferenceFieldUpdater2;
        this.f14635c = atomicReferenceFieldUpdater3;
        this.f14636d = atomicReferenceFieldUpdater4;
        this.f14637e = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC9104dM1
    /* renamed from: a */
    public final boolean mo9444a(AbstractC6399m0 abstractC6399m0, C1447X c1447x, C1447X c1447x2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14636d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC6399m0, c1447x, c1447x2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC6399m0) == c1447x);
        return false;
    }

    @Override // p000.AbstractC9104dM1
    /* renamed from: b */
    public final boolean mo9445b(AbstractC6399m0 abstractC6399m0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14637e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC6399m0, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC6399m0) == obj);
        return false;
    }

    @Override // p000.AbstractC9104dM1
    /* renamed from: c */
    public final boolean mo9446c(AbstractC6399m0 abstractC6399m0, C6273k0 c6273k0, C6273k0 c6273k02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14635c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC6399m0, c6273k0, c6273k02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC6399m0) == c6273k0);
        return false;
    }

    @Override // p000.AbstractC9104dM1
    /* renamed from: j */
    public final void mo9447j(C6273k0 c6273k0, C6273k0 c6273k02) {
        this.f14634b.lazySet(c6273k0, c6273k02);
    }

    @Override // p000.AbstractC9104dM1
    /* renamed from: k */
    public final void mo9448k(C6273k0 c6273k0, Thread thread) {
        this.f14633a.lazySet(c6273k0, thread);
    }
}
