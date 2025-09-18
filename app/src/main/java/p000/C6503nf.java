package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: nf */
/* loaded from: classes2.dex */
public final class C6503nf extends AbstractC8356Ub0 {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38433h = AtomicReferenceFieldUpdater.newUpdater(C6503nf.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: e */
    public final C0619Jp f38434e;

    /* renamed from: f */
    public InterfaceC0776MK f38435f;

    /* renamed from: g */
    public final /* synthetic */ C6631pf f38436g;

    public C6503nf(C6631pf c6631pf, C0619Jp c0619Jp) {
        this.f38436g = c6631pf;
        this.f38434e = c0619Jp;
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: j */
    public final boolean mo2434j() {
        return false;
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: k */
    public final void mo2435k(Throwable th) {
        C0619Jp c0619Jp = this.f38434e;
        if (th != null) {
            c0619Jp.getClass();
            C7190yG c7190yGM4424E = c0619Jp.m4424E(new C6519nv(th, false), null);
            if (c7190yGM4424E != null) {
                c0619Jp.mo3598i(c7190yGM4424E);
                C6566of c6566of = (C6566of) f38433h.get(this);
                if (c6566of != null) {
                    c6566of.m23516b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6631pf.f40263b;
        C6631pf c6631pf = this.f38436g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c6631pf) == 0) {
            InterfaceC6290kH[] interfaceC6290kHArr = c6631pf.f40264a;
            ArrayList arrayList = new ArrayList(interfaceC6290kHArr.length);
            for (InterfaceC6290kH interfaceC6290kH : interfaceC6290kHArr) {
                arrayList.add(interfaceC6290kH.m22185m());
            }
            c0619Jp.resumeWith(arrayList);
        }
    }
}
