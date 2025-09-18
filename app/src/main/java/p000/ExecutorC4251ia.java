package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: ia */
/* loaded from: classes.dex */
public final class ExecutorC4251ia implements Executor {

    /* renamed from: c */
    public static volatile ExecutorC4251ia f29323c;

    /* renamed from: a */
    public final /* synthetic */ int f29324a;

    /* renamed from: b */
    public final Object f29325b;

    public ExecutorC4251ia(FR1 fr1) {
        this.f29324a = 1;
        this.f29325b = fr1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f29324a) {
            case 0:
                ((ExecutorService) this.f29325b).execute(runnable);
                break;
            default:
                ((FR1) this.f29325b).mo6071p0().m25412E1(runnable);
                break;
        }
    }

    public ExecutorC4251ia() {
        this.f29324a = 0;
        this.f29325b = Executors.newFixedThreadPool(2, new ThreadFactoryC4188ha(0));
    }
}
