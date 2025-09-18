package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: aa1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2162aa1 extends AbstractC1583Ub0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(C2162aa1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public MK f;

    public static void m(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.AbstractC1583Ub0
    public final boolean j() {
        return true;
    }

    @Override // defpackage.AbstractC1583Ub0
    public final void k(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = g;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                MK mk = this.f;
                if (mk != null) {
                    mk.a();
                    return;
                }
                return;
            }
        }
    }
}
