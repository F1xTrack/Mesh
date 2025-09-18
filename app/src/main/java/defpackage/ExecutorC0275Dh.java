package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: Dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0275Dh implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public ExecutorC0275Dh(Handler handler) {
        this.a = 1;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC0275Dh() {
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
    }
}
