package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ds0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3471ds0 extends AbstractExecutorServiceC5644lA1 {
    public static final ThreadLocal b = new ThreadLocal();
    public final ThreadPoolExecutor a;

    public C3471ds0() {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8144yH1(1, threadFactoryDefaultThreadFactory));
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) b.get();
        if (deque == null || deque.size() > 1) {
            this.a.execute(new RunnableC7525v2(runnable, 4));
            return;
        }
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }
}
