package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: c30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC2442c30 implements Executor {
    public static volatile ExecutorC2442c30 c;
    public final /* synthetic */ int a;
    public final ExecutorService b;

    public ExecutorC2442c30(ExecutorService executorService) {
        this.a = 1;
        this.b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.execute(runnable);
                break;
            default:
                this.b.execute(new RunnableC7525v2(runnable, 1));
                break;
        }
    }

    public ExecutorC2442c30() {
        this.a = 0;
        this.b = Executors.newSingleThreadExecutor(new ThreadFactoryC7716w2(2));
    }
}
