package defpackage;

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
public abstract class AbstractC0511Gh1 {
    public static final ExecutorService a;

    static {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8144yH1(2, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new C5308jQ(executorServiceUnconfigurableExecutorService, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        a = executorServiceUnconfigurableExecutorService;
    }

    public static void a(C3892g32 c3892g32) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c3892g32.f(a, new F81(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (c3892g32.k()) {
            c3892g32.i();
        } else {
            if (c3892g32.d) {
                throw new CancellationException("Task is already canceled");
            }
            if (!c3892g32.j()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(c3892g32.h());
        }
    }
}
