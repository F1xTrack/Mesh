package io.sentry.android.replay;

import android.view.View;
import defpackage.AbstractC0314Du;
import defpackage.AbstractC8069xu;
import defpackage.F71;
import defpackage.LB;
import defpackage.N61;
import defpackage.O90;
import defpackage.O91;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class z implements Closeable, f {
    public final D1 a;
    public final ReplayIntegration b;
    public final com.yandex.metrica.e c;
    public final ScheduledExecutorService d;
    public final AtomicBoolean e;
    public final ArrayList f;
    public final Object g;
    public t h;
    public ScheduledFuture i;
    public final F71 j;

    public z(D1 d1, ReplayIntegration replayIntegration, com.yandex.metrica.e eVar, ScheduledExecutorService scheduledExecutorService) {
        O90.f(eVar, "mainLooperHandler");
        this.a = d1;
        this.b = replayIntegration;
        this.c = eVar;
        this.d = scheduledExecutorService;
        this.e = new AtomicBoolean(false);
        this.f = new ArrayList();
        this.g = new Object();
        this.j = LB.b(C5109a.o);
    }

    @Override // io.sentry.android.replay.f
    public final void a(View view, boolean z) {
        t tVar;
        O90.f(view, "root");
        synchronized (this.g) {
            try {
                if (z) {
                    this.f.add(new WeakReference(view));
                    t tVar2 = this.h;
                    if (tVar2 != null) {
                        tVar2.a(view);
                    }
                } else {
                    t tVar3 = this.h;
                    if (tVar3 != null) {
                        tVar3.b(view);
                    }
                    AbstractC0314Du.q(this.f, new y(0, view));
                    WeakReference weakReference = (WeakReference) AbstractC8069xu.K(this.f);
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && !view.equals(view2) && (tVar = this.h) != null) {
                        tVar.a(view2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(u uVar) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        if (this.e.getAndSet(true)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.d;
        ReplayIntegration replayIntegration = this.b;
        D1 d1 = this.a;
        this.h = new t(uVar, d1, this.c, scheduledExecutorService, replayIntegration);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.j.getValue();
        O90.e(scheduledExecutorService2, "capturer");
        long j = 1000 / uVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        N61 n61 = new N61(21, this);
        O90.f(timeUnit, "unit");
        try {
            scheduledFutureScheduleAtFixedRate = scheduledExecutorService2.scheduleAtFixedRate(new O91(n61, 28, d1), 100L, j, timeUnit);
        } catch (Throwable th) {
            d1.getLogger().d(EnumC5148n1.ERROR, "Failed to submit task WindowRecorder.capture to executor", th);
            scheduledFutureScheduleAtFixedRate = null;
        }
        this.i = scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.j.getValue();
        O90.e(scheduledExecutorService, "capturer");
        io.sentry.config.a.t(scheduledExecutorService, this.a);
    }

    public final void m() {
        synchronized (this.g) {
            try {
                for (WeakReference weakReference : this.f) {
                    t tVar = this.h;
                    if (tVar != null) {
                        tVar.b((View) weakReference.get());
                    }
                }
                this.f.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        t tVar2 = this.h;
        if (tVar2 != null) {
            WeakReference weakReference2 = tVar2.f;
            tVar2.b(weakReference2 != null ? (View) weakReference2.get() : null);
            WeakReference weakReference3 = tVar2.f;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            tVar2.i.recycle();
            tVar2.m.set(false);
        }
        this.h = null;
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.i = null;
        this.e.set(false);
    }
}
