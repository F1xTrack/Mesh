package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Nt0 */
/* loaded from: classes2.dex */
public final class C1091Nt0 extends XX0 implements InterfaceC0935Lt0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(C1091Nt0.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C1091Nt0(boolean z) {
        super(z ? 1 : 0);
        this.owner$volatile = z ? null : SA1.a;
    }

    public final boolean c() {
        return Math.max(XX0.f.get(this), 0) == 0;
    }

    public final Object d(AbstractC1963Yy abstractC1963Yy) {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = XX0.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    g.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        if (c == 0) {
            return c1518Tf1;
        }
        if (c != 1) {
            if (c != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        C0767Jp c0767JpB = AbstractC7627vZ0.b(AbstractC6383p22.b(abstractC1963Yy));
        try {
            a(new C1013Mt0(this, c0767JpB));
            Object objR = c0767JpB.r();
            EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
            if (objR != enumC1030Mz) {
                objR = c1518Tf1;
            }
            return objR == enumC1030Mz ? objR : c1518Tf1;
        } catch (Throwable th) {
            c0767JpB.A();
            throw th;
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C8139yG c8139yG = SA1.a;
            if (obj2 != c8139yG) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c8139yG)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC8130yD.c(this) + "[isLocked=" + c() + ",owner=" + g.get(this) + ']';
    }
}
