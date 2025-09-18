package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class BK implements Executor {
    public final AbstractC0485Fz a;

    public BK(AbstractC0485Fz abstractC0485Fz) {
        this.a = abstractC0485Fz;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        JN jn = JN.a;
        AbstractC0485Fz abstractC0485Fz = this.a;
        if (abstractC0485Fz.n(jn)) {
            abstractC0485Fz.l(jn, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
