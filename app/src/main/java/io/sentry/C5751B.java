package io.sentry;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.CallableC0361Fj;

/* renamed from: io.sentry.B */
/* loaded from: classes2.dex */
public final class C5751B {

    /* renamed from: g */
    public static final long f33209g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h */
    public static final long f33210h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: i */
    public static C5751B f33211i;

    /* renamed from: a */
    public final long f33212a;

    /* renamed from: b */
    public volatile String f33213b;

    /* renamed from: c */
    public volatile long f33214c;

    /* renamed from: d */
    public final AtomicBoolean f33215d;

    /* renamed from: e */
    public final CallableC6196z f33216e;

    /* renamed from: f */
    public final ExecutorService f33217f;

    public C5751B() throws ExecutionException, InterruptedException, TimeoutException {
        CallableC6196z callableC6196z = new CallableC6196z(0);
        this.f33215d = new AtomicBoolean(false);
        this.f33217f = Executors.newSingleThreadExecutor(new ThreadFactoryC5748A(0));
        this.f33212a = f33209g;
        this.f33216e = callableC6196z;
        m21357a();
    }

    /* renamed from: a */
    public final void m21357a() throws ExecutionException, InterruptedException, TimeoutException {
        try {
            this.f33217f.submit(new CallableC0361Fj(10, this)).get(f33210h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f33214c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.f33214c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
