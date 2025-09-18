package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: tq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7296tq0 {
    public static final C7533v4 f = C7533v4.d();
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;

    public C7296tq0() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue();
        this.c = runtime;
    }

    public final void a(C0646Ia1 c0646Ia1) {
        synchronized (this) {
            try {
                this.a.schedule(new RunnableC7105sq0(this, c0646Ia1, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C7533v4 c7533v4 = f;
                e.getMessage();
                c7533v4.f();
            }
        }
    }

    public final synchronized void b(long j, C0646Ia1 c0646Ia1) {
        this.e = j;
        try {
            this.d = this.a.scheduleAtFixedRate(new RunnableC7105sq0(this, c0646Ia1, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C7533v4 c7533v4 = f;
            e.getMessage();
            c7533v4.f();
        }
    }

    public final C7913x4 c(C0646Ia1 c0646Ia1) {
        if (c0646Ia1 == null) {
            return null;
        }
        long jA = c0646Ia1.a() + c0646Ia1.a;
        C7723w4 c7723w4W = C7913x4.w();
        c7723w4W.n();
        C7913x4.u((C7913x4) c7723w4W.b, jA);
        Runtime runtime = this.c;
        int iD = AbstractC3880g02.d((AbstractC7209tN0.q(5) * (runtime.totalMemory() - runtime.freeMemory())) / 1024);
        c7723w4W.n();
        C7913x4.v((C7913x4) c7723w4W.b, iD);
        return (C7913x4) c7723w4W.l();
    }
}
