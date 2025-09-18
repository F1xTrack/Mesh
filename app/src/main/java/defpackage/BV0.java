package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes2.dex */
public abstract class BV0 extends AbstractC3768fQ {
    public final ExecutorC0875Kz c;

    public BV0(long j, String str, int i, int i2) {
        this.c = new ExecutorC0875Kz(j, str, i, i2);
    }

    @Override // defpackage.AbstractC0485Fz
    public final void l(InterfaceC0173Bz interfaceC0173Bz, Runnable runnable) {
        ExecutorC0875Kz executorC0875Kz = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0875Kz.h;
        executorC0875Kz.n(runnable, false, false);
    }

    @Override // defpackage.AbstractC3768fQ
    public final Executor p() {
        return this.c;
    }
}
