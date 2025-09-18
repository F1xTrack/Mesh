package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class X81 {
    public static final X81 c = new X81();
    public final ThreadPoolExecutor a;
    public final TJ b;

    public X81() {
        C1395Rq1 c1395Rq1 = C1395Rq1.b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C1395Rq1.c, C1395Rq1.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = threadPoolExecutor;
        this.b = C1395Rq1.b.a;
    }
}
