package androidx.work;

/* renamed from: androidx.work.a */
/* loaded from: classes.dex */
public final class RunnableC1744a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Worker f16576a;

    public RunnableC1744a(Worker worker) {
        this.f16576a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f16576a;
        try {
            worker.mFuture.m25921j(worker.doWork());
        } catch (Throwable th) {
            worker.mFuture.m25922k(th);
        }
    }
}
