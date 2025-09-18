package ru.ok.tracer.lite.utils;

import defpackage.O90;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.utils.TracerExecutorsHolder;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ok/tracer/lite/utils/TracerExecutorsHolder;", "", "configIoExecutor", "Ljava/util/concurrent/Executor;", "libraryPackageName", "", "(Ljava/util/concurrent/Executor;Ljava/lang/String;)V", "ioExecutor", "getIoExecutor", "()Ljava/util/concurrent/Executor;", "Companion", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerExecutorsHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Executor ioExecutor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lru/ok/tracer/lite/utils/TracerExecutorsHolder$Companion;", "", "()V", "createIoExecutor", "Ljava/util/concurrent/Executor;", "libraryPackageName", "", "get", "Lru/ok/tracer/lite/utils/TracerExecutorsHolder;", "tracer", "Lru/ok/tracer/lite/TracerLite;", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Executor createIoExecutor(final String libraryPackageName) {
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new ThreadFactory() { // from class: Jb1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return TracerExecutorsHolder.Companion.createIoExecutor$lambda$0(atomicInteger, libraryPackageName, runnable);
                }
            });
            O90.e(executorServiceNewCachedThreadPool, "newCachedThreadPool {\n  …Name-$tid\")\n            }");
            return executorServiceNewCachedThreadPool;
        }

        public static final Thread createIoExecutor$lambda$0(AtomicInteger atomicInteger, String str, Runnable runnable) {
            O90.f(atomicInteger, "$atomicTid");
            O90.f(str, "$libraryPackageName");
            return new Thread(runnable, "tracer-io-" + str + '-' + atomicInteger.getAndIncrement());
        }

        public final TracerExecutorsHolder get(TracerLite tracer) {
            O90.f(tracer, "tracer");
            return tracer.getExecutorHolder();
        }

        private Companion() {
        }
    }

    public TracerExecutorsHolder(Executor executor, String str) {
        O90.f(str, "libraryPackageName");
        this.ioExecutor = executor == null ? INSTANCE.createIoExecutor(str) : executor;
    }

    public final Executor getIoExecutor() {
        return this.ioExecutor;
    }
}
