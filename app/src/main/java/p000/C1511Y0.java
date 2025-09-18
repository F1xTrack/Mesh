package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Y0 */
/* loaded from: classes.dex */
public final class C1511Y0 extends AbstractC11024sM1 {

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f14085b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f14086c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f14087d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f14088e;

    /* renamed from: f */
    public final AtomicReferenceFieldUpdater f14089f;

    public C1511Y0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f14085b = atomicReferenceFieldUpdater;
        this.f14086c = atomicReferenceFieldUpdater2;
        this.f14087d = atomicReferenceFieldUpdater3;
        this.f14088e = atomicReferenceFieldUpdater4;
        this.f14089f = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC11024sM1
    /* renamed from: a */
    public final boolean mo9197a(AbstractC1759b1 abstractC1759b1, C1448X0 c1448x0, C1448X0 c1448x02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14088e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1759b1, c1448x0, c1448x02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1759b1) == c1448x0);
        return false;
    }

    @Override // p000.AbstractC11024sM1
    /* renamed from: b */
    public final boolean mo9198b(AbstractC1759b1 abstractC1759b1, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14089f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1759b1, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1759b1) == obj);
        return false;
    }

    @Override // p000.AbstractC11024sM1
    /* renamed from: c */
    public final boolean mo9199c(AbstractC1759b1 abstractC1759b1, C1638a1 c1638a1, C1638a1 c1638a12) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14087d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1759b1, c1638a1, c1638a12)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1759b1) == c1638a1);
        return false;
    }

    @Override // p000.AbstractC11024sM1
    /* renamed from: e */
    public final void mo9200e(C1638a1 c1638a1, C1638a1 c1638a12) {
        this.f14086c.lazySet(c1638a1, c1638a12);
    }

    @Override // p000.AbstractC11024sM1
    /* renamed from: f */
    public final void mo9201f(C1638a1 c1638a1, Thread thread) {
        this.f14085b.lazySet(c1638a1, thread);
    }
}
