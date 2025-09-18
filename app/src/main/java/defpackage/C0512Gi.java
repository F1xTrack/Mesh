package defpackage;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: Gi */
/* loaded from: classes.dex */
public final class C0512Gi {
    public static final C0512Gi d = new C0512Gi();
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public final ExecutorC3799fa0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.concurrent.ExecutorService] */
    public C0512Gi() {
        ThreadPoolExecutor threadPoolExecutorNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains(ConstantDeviceInfo.APP_PLATFORM)) {
            C6197o4 c6197o4 = C6197o4.b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C6197o4.c, C6197o4.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutorNewCachedThreadPool = threadPoolExecutor;
        } else {
            threadPoolExecutorNewCachedThreadPool = Executors.newCachedThreadPool();
        }
        this.a = threadPoolExecutorNewCachedThreadPool;
        this.b = Executors.newSingleThreadScheduledExecutor();
        ExecutorC3799fa0 executorC3799fa0 = new ExecutorC3799fa0(1);
        executorC3799fa0.b = new ThreadLocal();
        this.c = executorC3799fa0;
    }
}
