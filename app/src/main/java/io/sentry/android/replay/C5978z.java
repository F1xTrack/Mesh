package io.sentry.android.replay;

import android.view.View;
import com.yandex.metrica.C2460e;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0246Du;
import p000.AbstractC0705LB;
import p000.AbstractC7167xu;
import p000.F71;
import p000.N61;
import p000.O90;
import p000.O91;

/* renamed from: io.sentry.android.replay.z */
/* loaded from: classes2.dex */
public final class C5978z implements Closeable, InterfaceC5944f {

    /* renamed from: a */
    public final C5759D1 f34072a;

    /* renamed from: b */
    public final ReplayIntegration f34073b;

    /* renamed from: c */
    public final C2460e f34074c;

    /* renamed from: d */
    public final ScheduledExecutorService f34075d;

    /* renamed from: e */
    public final AtomicBoolean f34076e;

    /* renamed from: f */
    public final ArrayList f34077f;

    /* renamed from: g */
    public final Object f34078g;

    /* renamed from: h */
    public ViewTreeObserverOnDrawListenerC5960t f34079h;

    /* renamed from: i */
    public ScheduledFuture f34080i;

    /* renamed from: j */
    public final F71 f34081j;

    public C5978z(C5759D1 c5759d1, ReplayIntegration replayIntegration, C2460e c2460e, ScheduledExecutorService scheduledExecutorService) {
        O90.m5968f(c2460e, "mainLooperHandler");
        this.f34072a = c5759d1;
        this.f34073b = replayIntegration;
        this.f34074c = c2460e;
        this.f34075d = scheduledExecutorService;
        this.f34076e = new AtomicBoolean(false);
        this.f34077f = new ArrayList();
        this.f34078g = new Object();
        this.f34081j = AbstractC0705LB.m4915b(C5924a.f33901o);
    }

    @Override // io.sentry.android.replay.InterfaceC5944f
    /* renamed from: a */
    public final void mo21668a(View view, boolean z) {
        ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t;
        O90.m5968f(view, "root");
        synchronized (this.f34078g) {
            try {
                if (z) {
                    this.f34077f.add(new WeakReference(view));
                    ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t2 = this.f34079h;
                    if (viewTreeObserverOnDrawListenerC5960t2 != null) {
                        viewTreeObserverOnDrawListenerC5960t2.m21675a(view);
                    }
                } else {
                    ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t3 = this.f34079h;
                    if (viewTreeObserverOnDrawListenerC5960t3 != null) {
                        viewTreeObserverOnDrawListenerC5960t3.m21676b(view);
                    }
                    AbstractC0246Du.m1924q(this.f34077f, new C5977y(0, view));
                    WeakReference weakReference = (WeakReference) AbstractC7167xu.m25965K(this.f34077f);
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && !view.equals(view2) && (viewTreeObserverOnDrawListenerC5960t = this.f34079h) != null) {
                        viewTreeObserverOnDrawListenerC5960t.m21675a(view2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m21692c(C5961u c5961u) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        if (this.f34076e.getAndSet(true)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.f34075d;
        ReplayIntegration replayIntegration = this.f34073b;
        C5759D1 c5759d1 = this.f34072a;
        this.f34079h = new ViewTreeObserverOnDrawListenerC5960t(c5961u, c5759d1, this.f34074c, scheduledExecutorService, replayIntegration);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f34081j.getValue();
        O90.m5967e(scheduledExecutorService2, "capturer");
        long j = 1000 / c5961u.f34035e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        N61 n61 = new N61(21, this);
        O90.m5968f(timeUnit, "unit");
        try {
            scheduledFutureScheduleAtFixedRate = scheduledExecutorService2.scheduleAtFixedRate(new O91(n61, 28, c5759d1), 100L, j, timeUnit);
        } catch (Throwable th) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to submit task WindowRecorder.capture to executor", th);
            scheduledFutureScheduleAtFixedRate = null;
        }
        this.f34080i = scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m21693m();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f34081j.getValue();
        O90.m5967e(scheduledExecutorService, "capturer");
        AbstractC6003a.m21760t(scheduledExecutorService, this.f34072a);
    }

    /* renamed from: m */
    public final void m21693m() {
        synchronized (this.f34078g) {
            try {
                for (WeakReference weakReference : this.f34077f) {
                    ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t = this.f34079h;
                    if (viewTreeObserverOnDrawListenerC5960t != null) {
                        viewTreeObserverOnDrawListenerC5960t.m21676b((View) weakReference.get());
                    }
                }
                this.f34077f.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t2 = this.f34079h;
        if (viewTreeObserverOnDrawListenerC5960t2 != null) {
            WeakReference weakReference2 = viewTreeObserverOnDrawListenerC5960t2.f34022f;
            viewTreeObserverOnDrawListenerC5960t2.m21676b(weakReference2 != null ? (View) weakReference2.get() : null);
            WeakReference weakReference3 = viewTreeObserverOnDrawListenerC5960t2.f34022f;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            viewTreeObserverOnDrawListenerC5960t2.f34025i.recycle();
            viewTreeObserverOnDrawListenerC5960t2.f34029m.set(false);
        }
        this.f34079h = null;
        ScheduledFuture scheduledFuture = this.f34080i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f34080i = null;
        this.f34076e.set(false);
    }
}
