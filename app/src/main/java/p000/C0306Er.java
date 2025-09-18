package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Er */
/* loaded from: classes2.dex */
public final class C0306Er extends AbstractC8356Ub0 {

    /* renamed from: e */
    public final /* synthetic */ int f2926e;

    /* renamed from: f */
    public final C0619Jp f2927f;

    public /* synthetic */ C0306Er(C0619Jp c0619Jp, int i) {
        this.f2926e = i;
        this.f2927f = c0619Jp;
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: j */
    public final boolean mo2434j() {
        switch (this.f2926e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: k */
    public final void mo2435k(Throwable th) {
        switch (this.f2926e) {
            case 0:
                C9002cc0 c9002cc0M8084i = m8084i();
                C0619Jp c0619Jp = this.f2927f;
                Throwable thMo4437q = c0619Jp.mo4437q(c9002cc0M8084i);
                if (c0619Jp.m4444x()) {
                    C7131xK c7131xK = (C7131xK) c0619Jp.f5711d;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7131xK.f45546h;
                        Object obj = atomicReferenceFieldUpdater.get(c7131xK);
                        C7190yG c7190yG = EU0.f2720b;
                        if (O90.m5963a(obj, c7190yG)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c7131xK, c7190yG, thMo4437q)) {
                                if (atomicReferenceFieldUpdater.get(c7131xK) != c7190yG) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c7131xK, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c7131xK) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0619Jp.m4434n(thMo4437q);
                if (!c0619Jp.m4444x()) {
                    c0619Jp.m4435o();
                    break;
                }
                break;
            default:
                this.f2927f.resumeWith(C8313Tf1.f11463a);
                break;
        }
    }
}
