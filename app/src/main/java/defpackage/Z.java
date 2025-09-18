package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Z extends AbstractC3377dM1 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public Z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC3377dM1
    public final boolean a(AbstractC5799m0 abstractC5799m0, X x, X x2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC5799m0, x, x2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5799m0) == x);
        return false;
    }

    @Override // defpackage.AbstractC3377dM1
    public final boolean b(AbstractC5799m0 abstractC5799m0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC5799m0, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5799m0) == obj);
        return false;
    }

    @Override // defpackage.AbstractC3377dM1
    public final boolean c(AbstractC5799m0 abstractC5799m0, C5417k0 c5417k0, C5417k0 c5417k02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC5799m0, c5417k0, c5417k02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5799m0) == c5417k0);
        return false;
    }

    @Override // defpackage.AbstractC3377dM1
    public final void j(C5417k0 c5417k0, C5417k0 c5417k02) {
        this.b.lazySet(c5417k0, c5417k02);
    }

    @Override // defpackage.AbstractC3377dM1
    public final void k(C5417k0 c5417k0, Thread thread) {
        this.a.lazySet(c5417k0, thread);
    }
}
