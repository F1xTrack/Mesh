package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: Nh */
/* loaded from: classes.dex */
public final class ExecutorC0862Nh implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f7956a;

    /* renamed from: b */
    public final Handler f7957b;

    public ExecutorC0862Nh(int i) {
        this.f7956a = i;
        switch (i) {
            case 1:
                HandlerC11145tJ0 handlerC11145tJ0 = new HandlerC11145tJ0(Looper.getMainLooper(), 1);
                Looper.getMainLooper();
                this.f7957b = handlerC11145tJ0;
                break;
            default:
                this.f7957b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7956a) {
            case 0:
                this.f7957b.post(runnable);
                break;
            default:
                ((HandlerC11145tJ0) this.f7957b).post(runnable);
                break;
        }
    }
}
