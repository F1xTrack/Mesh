package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Ub0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8356Ub0 extends C8764al0 implements InterfaceC0776MK, InterfaceC8814b80 {

    /* renamed from: d */
    public C9002cc0 f11927d;

    @Override // p000.InterfaceC0776MK
    /* renamed from: a */
    public final void mo3407a() {
        C9002cc0 c9002cc0M8084i = m8084i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C9002cc0.f17647a;
            Object obj = atomicReferenceFieldUpdater.get(c9002cc0M8084i);
            if (obj instanceof AbstractC8356Ub0) {
                if (obj != this) {
                    return;
                }
                C0276EN c0276en = AbstractC9720iA1.f28871g;
                while (!atomicReferenceFieldUpdater.compareAndSet(c9002cc0M8084i, obj, c0276en)) {
                    if (atomicReferenceFieldUpdater.get(c9002cc0M8084i) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC8814b80) || ((InterfaceC8814b80) obj).mo2199c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C8764al0.f15682a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof WQ0) {
                    C8764al0 c8764al0 = ((WQ0) obj2).f13178a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                O90.m5966d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C8764al0 c8764al02 = (C8764al0) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C8764al0.f15684c;
                WQ0 wq0 = (WQ0) atomicReferenceFieldUpdater3.get(c8764al02);
                if (wq0 == null) {
                    wq0 = new WQ0(c8764al02);
                    atomicReferenceFieldUpdater3.set(c8764al02, wq0);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, wq0)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c8764al02.m9807e();
                return;
            }
        }
    }

    @Override // p000.InterfaceC8814b80
    /* renamed from: c */
    public final C7824Jv0 mo2199c() {
        return null;
    }

    public InterfaceC8044Ob0 getParent() {
        return m8084i();
    }

    /* renamed from: i */
    public final C9002cc0 m8084i() {
        C9002cc0 c9002cc0 = this.f11927d;
        if (c9002cc0 != null) {
            return c9002cc0;
        }
        O90.m5977o("job");
        throw null;
    }

    @Override // p000.InterfaceC8814b80
    public final boolean isActive() {
        return true;
    }

    /* renamed from: j */
    public abstract boolean mo2434j();

    /* renamed from: k */
    public abstract void mo2435k(Throwable th);

    @Override // p000.C8764al0
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC7187yD.m26097c(this) + "[job@" + AbstractC7187yD.m26097c(m8084i()) + ']';
    }
}
