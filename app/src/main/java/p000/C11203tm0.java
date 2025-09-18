package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: tm0 */
/* loaded from: classes.dex */
public final class C11203tm0 extends FutureTask {

    /* renamed from: a */
    public final /* synthetic */ int f43247a = 0;

    /* renamed from: b */
    public Object f43248b;

    public /* synthetic */ C11203tm0(Callable callable) {
        super(callable);
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.f43247a) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((C11331um0) this.f43248b).m25237f((C11075sm0) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((C11331um0) this.f43248b).m25237f(new C11075sm0(e));
                        }
                    }
                    return;
                } finally {
                    this.f43248b = null;
                }
            default:
                RunnableC6662q9 runnableC6662q9 = (RunnableC6662q9) this.f43248b;
                try {
                    Object obj = get();
                    if (runnableC6662q9.f40633d.get()) {
                        return;
                    }
                    runnableC6662q9.m23935a(obj);
                    return;
                } catch (InterruptedException unused) {
                    return;
                } catch (CancellationException unused2) {
                    if (runnableC6662q9.f40633d.get()) {
                        return;
                    }
                    runnableC6662q9.m23935a(null);
                    return;
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11203tm0(RunnableC6662q9 runnableC6662q9, CallableC6230jK callableC6230jK) {
        super(callableC6230jK);
        this.f43248b = runnableC6662q9;
    }
}
