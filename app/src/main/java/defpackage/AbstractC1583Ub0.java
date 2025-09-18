package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Ub0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1583Ub0 extends C2194al0 implements MK, InterfaceC2268b80 {
    public C2548cc0 d;

    @Override // defpackage.MK
    public final void a() {
        C2548cc0 c2548cc0I = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2548cc0.a;
            Object obj = atomicReferenceFieldUpdater.get(c2548cc0I);
            if (obj instanceof AbstractC1583Ub0) {
                if (obj != this) {
                    return;
                }
                EN en = AbstractC4295iA1.g;
                while (!atomicReferenceFieldUpdater.compareAndSet(c2548cc0I, obj, en)) {
                    if (atomicReferenceFieldUpdater.get(c2548cc0I) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC2268b80) || ((InterfaceC2268b80) obj).c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2194al0.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof WQ0) {
                    C2194al0 c2194al0 = ((WQ0) obj2).a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                O90.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C2194al0 c2194al02 = (C2194al0) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2194al0.c;
                WQ0 wq0 = (WQ0) atomicReferenceFieldUpdater3.get(c2194al02);
                if (wq0 == null) {
                    wq0 = new WQ0(c2194al02);
                    atomicReferenceFieldUpdater3.set(c2194al02, wq0);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, wq0)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c2194al02.e();
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC2268b80
    public final C0786Jv0 c() {
        return null;
    }

    public InterfaceC1115Ob0 getParent() {
        return i();
    }

    public final C2548cc0 i() {
        C2548cc0 c2548cc0 = this.d;
        if (c2548cc0 != null) {
            return c2548cc0;
        }
        O90.o("job");
        throw null;
    }

    @Override // defpackage.InterfaceC2268b80
    public final boolean isActive() {
        return true;
    }

    public abstract boolean j();

    public abstract void k(Throwable th);

    @Override // defpackage.C2194al0
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC8130yD.c(this) + "[job@" + AbstractC8130yD.c(i()) + ']';
    }
}
