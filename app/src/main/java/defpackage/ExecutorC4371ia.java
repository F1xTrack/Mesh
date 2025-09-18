package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC4371ia implements Executor {
    public static volatile ExecutorC4371ia c;
    public final /* synthetic */ int a;
    public final Object b;

    public ExecutorC4371ia(FR1 fr1) {
        this.a = 1;
        this.b = fr1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                break;
            default:
                ((FR1) this.b).p0().E1(runnable);
                break;
        }
    }

    public ExecutorC4371ia() {
        this.a = 0;
        this.b = Executors.newFixedThreadPool(2, new ThreadFactoryC4180ha(0));
    }
}
