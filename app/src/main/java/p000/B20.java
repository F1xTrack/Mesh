package p000;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class B20 implements RunnableScheduledFuture {

    /* renamed from: a */
    public final AtomicReference f522a = new AtomicReference(null);

    /* renamed from: b */
    public final long f523b;

    /* renamed from: c */
    public final Callable f524c;

    /* renamed from: d */
    public final C0489Hl f525d;

    public B20(Handler handler, long j, Callable callable) {
        this.f523b = j;
        this.f524c = callable;
        this.f525d = AbstractC11797yQ1.m26149b(new C8539Xo1(this, handler, callable, 13));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f525d.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f525d.f4484b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f523b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f525d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f525d.f4484b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C0300El c0300El = (C0300El) this.f522a.getAndSet(null);
        if (c0300El != null) {
            try {
                c0300El.m2375b(this.f524c.call());
            } catch (Exception e) {
                c0300El.m2377d(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f525d.f4484b.get(j, timeUnit);
    }
}
