package p000;

import java.util.concurrent.Executor;

/* renamed from: QF */
/* loaded from: classes2.dex */
public final class ExecutorC1023QF extends AbstractC4052fQ implements Executor {

    /* renamed from: c */
    public static final ExecutorC1023QF f9548c = new ExecutorC1023QF();

    /* renamed from: d */
    public static final AbstractC0377Fz f9549d;

    static {
        C10040kg1 c10040kg1 = C10040kg1.f36606c;
        int i = Z71.f14753a;
        if (64 >= i) {
            i = 64;
        }
        f9549d = c10040kg1.mo2869o(KT1.m4651c(i, 0, 0, 12, "kotlinx.coroutines.io.parallelism"), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo732l(C0591JN.f5499a, runnable);
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: l */
    public final void mo732l(InterfaceC0125Bz interfaceC0125Bz, Runnable runnable) {
        f9549d.mo732l(interfaceC0125Bz, runnable);
    }

    @Override // p000.AbstractC0377Fz
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p000.AbstractC4052fQ
    /* renamed from: p */
    public final Executor mo733p() {
        return this;
    }
}
