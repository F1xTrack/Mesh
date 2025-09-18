package p000;

import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: no */
/* loaded from: classes.dex */
public final class ExecutorC6512no implements Executor {

    /* renamed from: c */
    public static final ThreadFactoryC4188ha f38512c = new ThreadFactoryC4188ha(1);

    /* renamed from: a */
    public final Object f38513a = new Object();

    /* renamed from: b */
    public ThreadPoolExecutor f38514b;

    public ExecutorC6512no() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f38512c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC6449mo());
        this.f38514b = threadPoolExecutor;
    }

    /* renamed from: a */
    public final void m23229a(C6638pm c6638pm) {
        ThreadPoolExecutor threadPoolExecutor;
        c6638pm.getClass();
        synchronized (this.f38513a) {
            try {
                if (this.f38514b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f38512c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC6449mo());
                    this.f38514b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f38514b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, new LinkedHashSet(c6638pm.f40382f).size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f38513a) {
            this.f38514b.execute(runnable);
        }
    }
}
