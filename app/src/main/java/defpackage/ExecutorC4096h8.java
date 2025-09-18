package defpackage;

import java.util.concurrent.Executor;

/* renamed from: h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4096h8 implements Executor {
    public final /* synthetic */ int a;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                C4287i8.c().a.b.execute(runnable);
                break;
            case 1:
                break;
            default:
                runnable.run();
                break;
        }
    }
}
