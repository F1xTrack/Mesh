package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: Nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1054Nh implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public ExecutorC1054Nh(int i) {
        this.a = i;
        switch (i) {
            case 1:
                HandlerC7197tJ0 handlerC7197tJ0 = new HandlerC7197tJ0(Looper.getMainLooper(), 1);
                Looper.getMainLooper();
                this.b = handlerC7197tJ0;
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                break;
            default:
                ((HandlerC7197tJ0) this.b).post(runnable);
                break;
        }
    }
}
