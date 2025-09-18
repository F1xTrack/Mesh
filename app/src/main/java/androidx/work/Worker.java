package androidx.work;

import android.content.Context;
import p000.AbstractC8008Nj0;
import p000.AbstractC8060Oj0;
import p000.C11687xZ0;
import p000.C6495nX;
import p000.InterfaceFutureC7800Jj0;
import p000.RunnableC1420WZ;

/* loaded from: classes.dex */
public abstract class Worker extends AbstractC8060Oj0 {
    C11687xZ0 mFuture;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract AbstractC8008Nj0 doWork();

    public C6495nX getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // p000.AbstractC8060Oj0
    public InterfaceFutureC7800Jj0 getForegroundInfoAsync() {
        C11687xZ0 c11687xZ0 = new C11687xZ0();
        getBackgroundExecutor().execute(new RunnableC1420WZ(this, c11687xZ0, false, 19));
        return c11687xZ0;
    }

    @Override // p000.AbstractC8060Oj0
    public final InterfaceFutureC7800Jj0 startWork() {
        this.mFuture = new C11687xZ0();
        getBackgroundExecutor().execute(new RunnableC1744a(this));
        return this.mFuture;
    }
}
