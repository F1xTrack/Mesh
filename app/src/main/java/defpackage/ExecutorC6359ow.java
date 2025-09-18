package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: ow, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC6359ow implements Executor {
    public final /* synthetic */ Handler a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
