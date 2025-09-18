package p000;

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
public abstract class AbstractC8060Oj0 {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public AbstractC8060Oj0(Context context, WorkerParameters workerParameters) {
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
        return this.mWorkerParams.f16571f;
    }

    public InterfaceFutureC7800Jj0 getForegroundInfoAsync() {
        C11687xZ0 c11687xZ0 = new C11687xZ0();
        c11687xZ0.m25922k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c11687xZ0;
    }

    public final UUID getId() {
        return this.mWorkerParams.f16566a;
    }

    public final C7249zC getInputData() {
        return this.mWorkerParams.f16567b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f16569d.f41680d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f16570e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f16568c;
    }

    public U81 getTaskExecutor() {
        return this.mWorkerParams.f16572g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f16569d.f41678b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f16569d.f41679c;
    }

    public AbstractC9034cp1 getWorkerFactory() {
        return this.mWorkerParams.f16573h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final InterfaceFutureC7800Jj0 setForegroundAsync(C6495nX c6495nX) {
        C7499Do1 c7499Do1 = this.mWorkerParams.f16575j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        c7499Do1.getClass();
        C11687xZ0 c11687xZ0 = new C11687xZ0();
        c7499Do1.f2256a.m9154x(new RunnableC7447Co1(c7499Do1, c11687xZ0, id, c6495nX, applicationContext, 0));
        return c11687xZ0;
    }

    public InterfaceFutureC7800Jj0 setProgressAsync(C7249zC c7249zC) {
        C8123Po1 c8123Po1 = this.mWorkerParams.f16574i;
        getApplicationContext();
        UUID id = getId();
        c8123Po1.getClass();
        C11687xZ0 c11687xZ0 = new C11687xZ0();
        c8123Po1.f9286b.m9154x(new RunnableC6704qp(c8123Po1, id, c7249zC, c11687xZ0, 5, false));
        return c11687xZ0;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC7800Jj0 startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
