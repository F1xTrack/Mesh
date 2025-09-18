package p000;

import java.util.concurrent.Executor;

/* renamed from: BK */
/* loaded from: classes2.dex */
public final class ExecutorC0084BK implements Executor {

    /* renamed from: a */
    public final AbstractC0377Fz f716a;

    public ExecutorC0084BK(AbstractC0377Fz abstractC0377Fz) {
        this.f716a = abstractC0377Fz;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C0591JN c0591jn = C0591JN.f5499a;
        AbstractC0377Fz abstractC0377Fz = this.f716a;
        if (abstractC0377Fz.mo2868n(c0591jn)) {
            abstractC0377Fz.mo732l(c0591jn, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f716a.toString();
    }
}
