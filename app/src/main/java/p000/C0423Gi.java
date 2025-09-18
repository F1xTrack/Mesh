package p000;

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
public final class C0423Gi {

    /* renamed from: d */
    public static final C0423Gi f3853d = new C0423Gi();

    /* renamed from: a */
    public final ExecutorService f3854a;

    /* renamed from: b */
    public final ScheduledExecutorService f3855b;

    /* renamed from: c */
    public final ExecutorC9387fa0 f3856c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.concurrent.ExecutorService] */
    public C0423Gi() {
        ThreadPoolExecutor threadPoolExecutorNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains(ConstantDeviceInfo.APP_PLATFORM)) {
            C6529o4 c6529o4 = C6529o4.f38752b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C6529o4.f38753c, C6529o4.f38754d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutorNewCachedThreadPool = threadPoolExecutor;
        } else {
            threadPoolExecutorNewCachedThreadPool = Executors.newCachedThreadPool();
        }
        this.f3854a = threadPoolExecutorNewCachedThreadPool;
        this.f3855b = Executors.newSingleThreadScheduledExecutor();
        ExecutorC9387fa0 executorC9387fa0 = new ExecutorC9387fa0(1);
        executorC9387fa0.f27242b = new ThreadLocal();
        this.f3856c = executorC9387fa0;
    }
}
