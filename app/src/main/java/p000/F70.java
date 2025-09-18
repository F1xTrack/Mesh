package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class F70 implements InterfaceFutureC7800Jj0 {

    /* renamed from: c */
    public static final F70 f3069c = new F70(0, null);

    /* renamed from: a */
    public final /* synthetic */ int f3070a;

    /* renamed from: b */
    public final Object f3071b;

    public /* synthetic */ F70(int i, Object obj) {
        this.f3070a = i;
        this.f3071b = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // p000.InterfaceFutureC7800Jj0
    /* renamed from: d */
    public final void mo2494d(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
            AbstractC7806Jm0.m4412f("ImmediateFuture");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.f3070a) {
            case 0:
                return this.f3071b;
            default:
                throw new ExecutionException((Throwable) this.f3071b);
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
        switch (this.f3070a) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.f3071b + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f3071b) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
