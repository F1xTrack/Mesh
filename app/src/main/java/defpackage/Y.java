package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y extends AbstractC2501cM1 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public Y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC2501cM1
    public final boolean a(AbstractC5608l0 abstractC5608l0, W w, W w2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC5608l0, w, w2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5608l0) == w);
        return false;
    }

    @Override // defpackage.AbstractC2501cM1
    public final boolean b(AbstractC5608l0 abstractC5608l0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC5608l0, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5608l0) == obj);
        return false;
    }

    @Override // defpackage.AbstractC2501cM1
    public final boolean c(AbstractC5608l0 abstractC5608l0, C5226j0 c5226j0, C5226j0 c5226j02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC5608l0, c5226j0, c5226j02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5608l0) == c5226j0);
        return false;
    }

    @Override // defpackage.AbstractC2501cM1
    public final W e(AbstractC5608l0 abstractC5608l0) {
        return (W) this.d.getAndSet(abstractC5608l0, W.d);
    }

    @Override // defpackage.AbstractC2501cM1
    public final C5226j0 f(AbstractC5608l0 abstractC5608l0) {
        return (C5226j0) this.c.getAndSet(abstractC5608l0, C5226j0.c);
    }

    @Override // defpackage.AbstractC2501cM1
    public final void g(C5226j0 c5226j0, C5226j0 c5226j02) {
        this.b.lazySet(c5226j0, c5226j02);
    }

    @Override // defpackage.AbstractC2501cM1
    public final void h(C5226j0 c5226j0, Thread thread) {
        this.a.lazySet(c5226j0, thread);
    }
}
