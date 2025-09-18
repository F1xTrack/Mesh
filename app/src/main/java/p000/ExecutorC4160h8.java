package p000;

import java.util.concurrent.Executor;

/* renamed from: h8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4160h8 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f28269a;

    /* renamed from: a */
    private final void m18725a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f28269a) {
            case 0:
                C4223i8.m18971c().f28832a.f6582b.execute(runnable);
                break;
            case 1:
                break;
            default:
                runnable.run();
                break;
        }
    }
}
