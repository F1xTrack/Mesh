package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: da0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3418da0 extends AbstractC1583Ub0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C3418da0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final C1427Sb0 e;

    public C3418da0(C1427Sb0 c1427Sb0) {
        this.e = c1427Sb0;
    }

    @Override // defpackage.AbstractC1583Ub0
    public final boolean j() {
        return true;
    }

    @Override // defpackage.AbstractC1583Ub0
    public final void k(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
