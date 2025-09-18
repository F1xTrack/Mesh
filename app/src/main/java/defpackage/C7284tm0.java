package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: tm0 */
/* loaded from: classes.dex */
public final class C7284tm0 extends FutureTask {
    public final /* synthetic */ int a = 0;
    public Object b;

    public /* synthetic */ C7284tm0(Callable callable) {
        super(callable);
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.a) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((C7475um0) this.b).f((C7093sm0) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((C7475um0) this.b).f(new C7093sm0(e));
                        }
                    }
                    return;
                } finally {
                    this.b = null;
                }
            default:
                RunnableC6594q9 runnableC6594q9 = (RunnableC6594q9) this.b;
                try {
                    Object obj = get();
                    if (runnableC6594q9.d.get()) {
                        return;
                    }
                    runnableC6594q9.a(obj);
                    return;
                } catch (InterruptedException unused) {
                    return;
                } catch (CancellationException unused2) {
                    if (runnableC6594q9.d.get()) {
                        return;
                    }
                    runnableC6594q9.a(null);
                    return;
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7284tm0(RunnableC6594q9 runnableC6594q9, CallableC5290jK callableC5290jK) {
        super(callableC5290jK);
        this.b = runnableC6594q9;
    }
}
