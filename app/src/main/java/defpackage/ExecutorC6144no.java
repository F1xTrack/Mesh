package defpackage;

import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: no, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC6144no implements Executor {
    public static final ThreadFactoryC4180ha c = new ThreadFactoryC4180ha(1);
    public final Object a = new Object();
    public ThreadPoolExecutor b;

    public ExecutorC6144no() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC5953mo());
        this.b = threadPoolExecutor;
    }

    public final void a(C6520pm c6520pm) {
        ThreadPoolExecutor threadPoolExecutor;
        c6520pm.getClass();
        synchronized (this.a) {
            try {
                if (this.b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC5953mo());
                    this.b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, new LinkedHashSet(c6520pm.f).size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            this.b.execute(runnable);
        }
    }
}
