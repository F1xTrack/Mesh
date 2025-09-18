package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: c30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC8931c30 implements Executor {

    /* renamed from: c */
    public static volatile ExecutorC8931c30 f17270c;

    /* renamed from: a */
    public final /* synthetic */ int f17271a;

    /* renamed from: b */
    public final ExecutorService f17272b;

    public ExecutorC8931c30(ExecutorService executorService) {
        this.f17271a = 1;
        this.f17272b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f17271a) {
            case 0:
                this.f17272b.execute(runnable);
                break;
            default:
                this.f17272b.execute(new RunnableC6987v2(runnable, 1));
                break;
        }
    }

    public ExecutorC8931c30() {
        this.f17271a = 0;
        this.f17272b = Executors.newSingleThreadExecutor(new ThreadFactoryC7050w2(2));
    }
}
