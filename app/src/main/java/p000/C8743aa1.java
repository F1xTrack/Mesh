package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: aa1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8743aa1 extends AbstractC8356Ub0 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15568g = AtomicIntegerFieldUpdater.newUpdater(C8743aa1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e */
    public final Thread f15569e = Thread.currentThread();

    /* renamed from: f */
    public InterfaceC0776MK f15570f;

    /* renamed from: m */
    public static void m9765m(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: j */
    public final boolean mo2434j() {
        return true;
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: k */
    public final void mo2435k(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f15568g;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m9765m(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f15569e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: l */
    public final void m9766l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15568g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m9765m(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                InterfaceC0776MK interfaceC0776MK = this.f15570f;
                if (interfaceC0776MK != null) {
                    interfaceC0776MK.mo3407a();
                    return;
                }
                return;
            }
        }
    }
}
