package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes2.dex */
public abstract class BV0 extends AbstractC4052fQ {

    /* renamed from: c */
    public final ExecutorC0692Kz f846c;

    public BV0(long j, String str, int i, int i2) {
        this.f846c = new ExecutorC0692Kz(j, str, i, i2);
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: l */
    public final void mo732l(InterfaceC0125Bz interfaceC0125Bz, Runnable runnable) {
        ExecutorC0692Kz executorC0692Kz = this.f846c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0692Kz.f6405h;
        executorC0692Kz.m4799n(runnable, false, false);
    }

    @Override // p000.AbstractC4052fQ
    /* renamed from: p */
    public final Executor mo733p() {
        return this.f846c;
    }
}
