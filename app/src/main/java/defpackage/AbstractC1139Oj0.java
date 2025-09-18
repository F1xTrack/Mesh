package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: Oj0 */
/* loaded from: classes.dex */
public abstract class AbstractC1139Oj0 {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public AbstractC1139Oj0(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public InterfaceFutureC0750Jj0 getForegroundInfoAsync() {
        C8007xZ0 c8007xZ0 = new C8007xZ0();
        c8007xZ0.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c8007xZ0;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final C8317zC getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public U81 getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    public AbstractC3273cp1 getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final InterfaceFutureC0750Jj0 setForegroundAsync(C6093nX c6093nX) {
        C0298Do1 c0298Do1 = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        c0298Do1.getClass();
        C8007xZ0 c8007xZ0 = new C8007xZ0();
        c0298Do1.a.x(new RunnableC0220Co1(c0298Do1, c8007xZ0, id, c6093nX, applicationContext, 0));
        return c8007xZ0;
    }

    public InterfaceFutureC0750Jj0 setProgressAsync(C8317zC c8317zC) {
        C1233Po1 c1233Po1 = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        c1233Po1.getClass();
        C8007xZ0 c8007xZ0 = new C8007xZ0();
        c1233Po1.b.x(new RunnableC6720qp(c1233Po1, id, c8317zC, c8007xZ0, 5, false));
        return c8007xZ0;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC0750Jj0 startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
