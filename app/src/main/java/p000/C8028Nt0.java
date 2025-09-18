package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Nt0 */
/* loaded from: classes2.dex */
public final class C8028Nt0 extends XX0 implements InterfaceC7924Lt0 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8115g = AtomicReferenceFieldUpdater.newUpdater(C8028Nt0.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C8028Nt0(boolean z) {
        super(z ? 1 : 0);
        this.owner$volatile = z ? null : SA1.f10607a;
    }

    /* renamed from: c */
    public final boolean m5898c() {
        return Math.max(XX0.f13838f.get(this), 0) == 0;
    }

    /* renamed from: d */
    public final Object m5899d(AbstractC1571Yy abstractC1571Yy) {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = XX0.f13838f;
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
                    f8115g.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        if (c == 0) {
            return c8313Tf1;
        }
        if (c != 1) {
            if (c != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        C0619Jp c0619JpM25451b = AbstractC11433vZ0.m25451b(AbstractC10599p22.m23595b(abstractC1571Yy));
        try {
            m9070a(new C7976Mt0(this, c0619JpM25451b));
            Object objM4438r = c0619JpM25451b.m4438r();
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (objM4438r != enumC0817Mz) {
                objM4438r = c8313Tf1;
            }
            return objM4438r == enumC0817Mz ? objM4438r : c8313Tf1;
        } catch (Throwable th) {
            c0619JpM25451b.m4421A();
            throw th;
        }
    }

    /* renamed from: e */
    public final void m5900e(Object obj) {
        while (m5898c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8115g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C7190yG c7190yG = SA1.f10607a;
            if (obj2 != c7190yG) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c7190yG)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    m9071b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC7187yD.m26097c(this) + "[isLocked=" + m5898c() + ",owner=" + f8115g.get(this) + ']';
    }
}
