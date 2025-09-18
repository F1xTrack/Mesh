package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: tq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11211tq0 {

    /* renamed from: f */
    public static final C6989v4 f43356f = C6989v4.m25319d();

    /* renamed from: a */
    public final ScheduledExecutorService f43357a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue f43358b;

    /* renamed from: c */
    public final Runtime f43359c;

    /* renamed from: d */
    public ScheduledFuture f43360d;

    /* renamed from: e */
    public long f43361e;

    public C11211tq0() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f43360d = null;
        this.f43361e = -1L;
        this.f43357a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f43358b = new ConcurrentLinkedQueue();
        this.f43359c = runtime;
    }

    /* renamed from: a */
    public final void m24996a(C7731Ia1 c7731Ia1) {
        synchronized (this) {
            try {
                this.f43357a.schedule(new RunnableC11083sq0(this, c7731Ia1, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C6989v4 c6989v4 = f43356f;
                e.getMessage();
                c6989v4.m25324f();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m24997b(long j, C7731Ia1 c7731Ia1) {
        this.f43361e = j;
        try {
            this.f43360d = this.f43357a.scheduleAtFixedRate(new RunnableC11083sq0(this, c7731Ia1, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6989v4 c6989v4 = f43356f;
            e.getMessage();
            c6989v4.m25324f();
        }
    }

    /* renamed from: c */
    public final C7115x4 m24998c(C7731Ia1 c7731Ia1) {
        if (c7731Ia1 == null) {
            return null;
        }
        long jM3946a = c7731Ia1.m3946a() + c7731Ia1.f5021a;
        C7052w4 c7052w4M25755w = C7115x4.m25755w();
        c7052w4M25755w.m23922n();
        C7115x4.m25753u((C7115x4) c7052w4M25755w.f40483b, jM3946a);
        Runtime runtime = this.f43359c;
        int iM18380d = AbstractC9441g02.m18380d((AbstractC11153tN0.m24905q(5) * (runtime.totalMemory() - runtime.freeMemory())) / 1024);
        c7052w4M25755w.m23922n();
        C7115x4.m25754v((C7115x4) c7052w4M25755w.f40483b, iM18380d);
        return (C7115x4) c7052w4M25755w.m23920l();
    }
}
