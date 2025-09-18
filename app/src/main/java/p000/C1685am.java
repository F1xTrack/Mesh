package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: am */
/* loaded from: classes.dex */
public final class C1685am extends AbstractExecutorService {

    /* renamed from: a */
    public static final C1685am f15687a = new C1685am();

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return Collections.emptyList();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
    }
}
