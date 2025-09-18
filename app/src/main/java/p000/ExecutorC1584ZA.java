package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: ZA */
/* loaded from: classes.dex */
public final class ExecutorC1584ZA implements Executor {

    /* renamed from: a */
    public final ExecutorService f14763a;

    /* renamed from: b */
    public final Object f14764b = new Object();

    /* renamed from: c */
    public C9450g32 f14765c = AbstractC9376fU1.m18244e(null);

    public ExecutorC1584ZA(ExecutorService executorService) {
        this.f14763a = executorService;
    }

    /* renamed from: a */
    public final C9450g32 m9502a(Runnable runnable) {
        C9450g32 c9450g32Mo11140g;
        synchronized (this.f14764b) {
            c9450g32Mo11140g = this.f14765c.mo11140g(this.f14763a, new C0071B7(27, runnable));
            this.f14765c = c9450g32Mo11140g;
        }
        return c9450g32Mo11140g;
    }

    /* renamed from: b */
    public final C9450g32 m9503b(CallableC6283kA callableC6283kA) {
        C9450g32 c9450g32Mo11140g;
        synchronized (this.f14764b) {
            c9450g32Mo11140g = this.f14765c.mo11140g(this.f14763a, new C0071B7(26, callableC6283kA));
            this.f14765c = c9450g32Mo11140g;
        }
        return c9450g32Mo11140g;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14763a.execute(runnable);
    }
}
