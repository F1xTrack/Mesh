package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: Dh */
/* loaded from: classes.dex */
public final class ExecutorC0233Dh implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f2156a;

    /* renamed from: b */
    public final Handler f2157b;

    public ExecutorC0233Dh(Handler handler) {
        this.f2156a = 1;
        this.f2157b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2156a) {
            case 0:
                this.f2157b.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f2157b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC0233Dh() {
        this.f2156a = 0;
        this.f2157b = new Handler(Looper.getMainLooper());
    }
}
