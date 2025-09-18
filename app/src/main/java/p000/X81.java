package p000;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class X81 {

    /* renamed from: c */
    public static final X81 f13575c = new X81();

    /* renamed from: a */
    public final ThreadPoolExecutor f13576a;

    /* renamed from: b */
    public final ExecutorC1215TJ f13577b;

    public X81() {
        C8231Rq1 c8231Rq1 = C8231Rq1.f10456b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C8231Rq1.f10457c, C8231Rq1.f10458d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13576a = threadPoolExecutor;
        this.f13577b = C8231Rq1.f10456b.f10459a;
    }
}
