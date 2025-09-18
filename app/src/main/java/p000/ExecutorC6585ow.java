package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: ow */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC6585ow implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f39363a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f39363a.post(runnable);
    }
}
