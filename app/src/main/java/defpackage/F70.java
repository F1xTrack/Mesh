package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class F70 implements InterfaceFutureC0750Jj0 {
    public static final F70 c = new F70(0, null);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ F70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // defpackage.InterfaceFutureC0750Jj0
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
            AbstractC0759Jm0.f("ImmediateFuture");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                throw new ExecutionException((Throwable) this.b);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.b + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.b) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
