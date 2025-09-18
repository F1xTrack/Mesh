package p000;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: Gh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7641Gh1 {

    /* renamed from: a */
    public static final ExecutorService f3852a;

    static {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC11779yH1(2, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new C6236jQ(executorServiceUnconfigurableExecutorService, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f3852a = executorServiceUnconfigurableExecutorService;
    }

    /* renamed from: a */
    public static void m3125a(C9450g32 c9450g32) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c9450g32.mo11139f(f3852a, new F81(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (c9450g32.mo11144k()) {
            c9450g32.mo11142i();
        } else {
            if (c9450g32.f27546d) {
                throw new CancellationException("Task is already canceled");
            }
            if (!c9450g32.mo11143j()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(c9450g32.mo11141h());
        }
    }
}
