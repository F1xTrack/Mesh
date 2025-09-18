package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ds0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9167ds0 extends AbstractExecutorServiceC10104lA1 {

    /* renamed from: b */
    public static final ThreadLocal f26346b = new ThreadLocal();

    /* renamed from: a */
    public final ThreadPoolExecutor f26347a;

    public C9167ds0() {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC11779yH1(1, threadFactoryDefaultThreadFactory));
        this.f26347a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f26346b.get();
        if (deque == null || deque.size() > 1) {
            this.f26347a.execute(new RunnableC6987v2(runnable, 4));
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
