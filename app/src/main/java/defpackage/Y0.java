package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y0 extends AbstractC7016sM1 {
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;

    public Y0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.b = atomicReferenceFieldUpdater;
        this.c = atomicReferenceFieldUpdater2;
        this.d = atomicReferenceFieldUpdater3;
        this.e = atomicReferenceFieldUpdater4;
        this.f = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC7016sM1
    public final boolean a(AbstractC2243b1 abstractC2243b1, X0 x0, X0 x02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2243b1, x0, x02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2243b1) == x0);
        return false;
    }

    @Override // defpackage.AbstractC7016sM1
    public final boolean b(AbstractC2243b1 abstractC2243b1, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2243b1, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2243b1) == obj);
        return false;
    }

    @Override // defpackage.AbstractC7016sM1
    public final boolean c(AbstractC2243b1 abstractC2243b1, C2052a1 c2052a1, C2052a1 c2052a12) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2243b1, c2052a1, c2052a12)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2243b1) == c2052a1);
        return false;
    }

    @Override // defpackage.AbstractC7016sM1
    public final void e(C2052a1 c2052a1, C2052a1 c2052a12) {
        this.c.lazySet(c2052a1, c2052a12);
    }

    @Override // defpackage.AbstractC7016sM1
    public final void f(C2052a1 c2052a1, Thread thread) {
        this.b.lazySet(c2052a1, thread);
    }
}
