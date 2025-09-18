package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class QF extends AbstractC3768fQ implements Executor {
    public static final QF c = new QF();
    public static final AbstractC0485Fz d;

    static {
        C5549kg1 c5549kg1 = C5549kg1.c;
        int i = Z71.a;
        if (64 >= i) {
            i = 64;
        }
        d = c5549kg1.o(KT1.c(i, 0, 0, 12, "kotlinx.coroutines.io.parallelism"), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l(JN.a, runnable);
    }

    @Override // defpackage.AbstractC0485Fz
    public final void l(InterfaceC0173Bz interfaceC0173Bz, Runnable runnable) {
        d.l(interfaceC0173Bz, runnable);
    }

    @Override // defpackage.AbstractC0485Fz
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.AbstractC3768fQ
    public final Executor p() {
        return this;
    }
}
