package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2196am extends AbstractExecutorService {
    public static final C2196am a = new C2196am();

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
