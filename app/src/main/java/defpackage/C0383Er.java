package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Er, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0383Er extends AbstractC1583Ub0 {
    public final /* synthetic */ int e;
    public final C0767Jp f;

    public /* synthetic */ C0383Er(C0767Jp c0767Jp, int i) {
        this.e = i;
        this.f = c0767Jp;
    }

    @Override // defpackage.AbstractC1583Ub0
    public final boolean j() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.AbstractC1583Ub0
    public final void k(Throwable th) {
        switch (this.e) {
            case 0:
                C2548cc0 c2548cc0I = i();
                C0767Jp c0767Jp = this.f;
                Throwable thQ = c0767Jp.q(c2548cc0I);
                if (c0767Jp.x()) {
                    C7961xK c7961xK = (C7961xK) c0767Jp.d;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7961xK.h;
                        Object obj = atomicReferenceFieldUpdater.get(c7961xK);
                        C8139yG c8139yG = EU0.b;
                        if (O90.a(obj, c8139yG)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c7961xK, c8139yG, thQ)) {
                                if (atomicReferenceFieldUpdater.get(c7961xK) != c8139yG) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c7961xK, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c7961xK) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0767Jp.n(thQ);
                if (!c0767Jp.x()) {
                    c0767Jp.o();
                    break;
                }
                break;
            default:
                this.f.resumeWith(C1518Tf1.a);
                break;
        }
    }
}
