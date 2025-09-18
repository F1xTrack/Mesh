package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ZA implements Executor {
    public final ExecutorService a;
    public final Object b = new Object();
    public C3892g32 c = AbstractC3782fU1.e(null);

    public ZA(ExecutorService executorService) {
        this.a = executorService;
    }

    public final C3892g32 a(Runnable runnable) {
        C3892g32 c3892g32G;
        synchronized (this.b) {
            c3892g32G = this.c.g(this.a, new B7(27, runnable));
            this.c = c3892g32G;
        }
        return c3892g32G;
    }

    public final C3892g32 b(CallableC5451kA callableC5451kA) {
        C3892g32 c3892g32G;
        synchronized (this.b) {
            c3892g32G = this.c.g(this.a, new B7(26, callableC5451kA));
            this.c = c3892g32G;
        }
        return c3892g32G;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
