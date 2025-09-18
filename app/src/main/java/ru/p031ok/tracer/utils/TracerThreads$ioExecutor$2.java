package ru.p031ok.tracer.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;
import p000.O90;
import ru.p031ok.tracer.CoreTracerConfiguration;

@Metadata(m22266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m22267d2 = {"<anonymous>", "Ljava/util/concurrent/Executor;", "invoke"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerThreads$ioExecutor$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    public static final TracerThreads$ioExecutor$2 INSTANCE = new TracerThreads$ioExecutor$2();

    public TracerThreads$ioExecutor$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$0(AtomicInteger atomicInteger, Runnable runnable) {
        O90.m5968f(atomicInteger, "$tid");
        return new Thread(runnable, "tracer-io-" + atomicInteger.getAndIncrement());
    }

    @Override // p000.InterfaceC6434mZ
    public final Executor invoke() {
        Executor ioExecutor = CoreTracerConfiguration.INSTANCE.get().getIoExecutor();
        if (ioExecutor != null) {
            return ioExecutor;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new ThreadFactory() { // from class: ru.ok.tracer.utils.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return TracerThreads$ioExecutor$2.invoke$lambda$0(atomicInteger, runnable);
            }
        });
        O90.m5967e(executorServiceNewCachedThreadPool, "newCachedThreadPool {\n  …AndIncrement())\n        }");
        return executorServiceNewCachedThreadPool;
    }
}
