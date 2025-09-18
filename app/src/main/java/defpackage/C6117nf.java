package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6117nf extends AbstractC1583Ub0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C6117nf.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final C0767Jp e;
    public MK f;
    public final /* synthetic */ C6499pf g;

    public C6117nf(C6499pf c6499pf, C0767Jp c0767Jp) {
        this.g = c6499pf;
        this.e = c0767Jp;
    }

    @Override // defpackage.AbstractC1583Ub0
    public final boolean j() {
        return false;
    }

    @Override // defpackage.AbstractC1583Ub0
    public final void k(Throwable th) {
        C0767Jp c0767Jp = this.e;
        if (th != null) {
            c0767Jp.getClass();
            C8139yG c8139yGE = c0767Jp.E(new C6165nv(th, false), null);
            if (c8139yGE != null) {
                c0767Jp.i(c8139yGE);
                C6308of c6308of = (C6308of) h.get(this);
                if (c6308of != null) {
                    c6308of.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6499pf.b;
        C6499pf c6499pf = this.g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c6499pf) == 0) {
            InterfaceC5472kH[] interfaceC5472kHArr = c6499pf.a;
            ArrayList arrayList = new ArrayList(interfaceC5472kHArr.length);
            for (InterfaceC5472kH interfaceC5472kH : interfaceC5472kHArr) {
                arrayList.add(interfaceC5472kH.m());
            }
            c0767Jp.resumeWith(arrayList);
        }
    }
}
