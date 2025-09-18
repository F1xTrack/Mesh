package io.sentry.android.replay;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yandex.metrica.C2460e;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.AbstractC5802S0;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.C5771H1;
import io.sentry.C6059l1;
import io.sentry.C6180v0;
import io.sentry.EnumC5763F;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5766G;
import io.sentry.InterfaceC5767G0;
import io.sentry.InterfaceC5770H0;
import io.sentry.InterfaceC5796Q;
import io.sentry.InterfaceC5819Y;
import io.sentry.android.replay.capture.AbstractC5929c;
import io.sentry.android.replay.capture.C5932f;
import io.sentry.android.replay.capture.C5941o;
import io.sentry.android.replay.capture.InterfaceC5938l;
import io.sentry.android.replay.gestures.C5947b;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6104t;
import io.sentry.transport.C6152d;
import io.sentry.transport.C6161m;
import io.sentry.util.C6173f;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p000.AbstractC0705LB;
import p000.AbstractC11374v51;
import p000.C10115lG0;
import p000.D51;
import p000.F71;
import p000.N61;
import p000.O90;
import p000.O91;
import p000.TO0;

@StabilityInferred(parameters = 0)
@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0007\b¨\u0006\t"}, m22267d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/Y;", "Ljava/io/Closeable;", "", "Lio/sentry/H0;", "Landroid/content/ComponentCallbacks;", "Lio/sentry/G;", "io/sentry/android/replay/m", "io/sentry/A", "sentry-android-replay_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ReplayIntegration implements InterfaceC5819Y, Closeable, InterfaceC5770H0, ComponentCallbacks, InterfaceC5766G {

    /* renamed from: a */
    public final Context f33878a;

    /* renamed from: b */
    public final C6152d f33879b;

    /* renamed from: c */
    public C5759D1 f33880c;

    /* renamed from: d */
    public C5760E f33881d;

    /* renamed from: e */
    public C5978z f33882e;

    /* renamed from: f */
    public C5947b f33883f;

    /* renamed from: g */
    public final F71 f33884g;

    /* renamed from: h */
    public final F71 f33885h;

    /* renamed from: i */
    public final F71 f33886i;

    /* renamed from: j */
    public final AtomicBoolean f33887j;

    /* renamed from: k */
    public final AtomicBoolean f33888k;

    /* renamed from: l */
    public InterfaceC5938l f33889l;

    /* renamed from: m */
    public InterfaceC5767G0 f33890m;

    /* renamed from: n */
    public final C2460e f33891n;

    public ReplayIntegration(Context context) {
        C6152d c6152d = C6152d.f34633a;
        O90.m5968f(context, "context");
        Context applicationContext = context.getApplicationContext();
        this.f33878a = applicationContext != null ? applicationContext : context;
        this.f33879b = c6152d;
        this.f33884g = AbstractC0705LB.m4915b(C5924a.f33893g);
        this.f33885h = AbstractC0705LB.m4915b(C5924a.f33895i);
        this.f33886i = AbstractC0705LB.m4915b(C5924a.f33894h);
        this.f33887j = new AtomicBoolean(false);
        this.f33888k = new AtomicBoolean(false);
        this.f33890m = C6180v0.f34672b;
        this.f33891n = new C2460e(7, false);
    }

    @Override // io.sentry.InterfaceC5770H0
    /* renamed from: a */
    public final void mo21392a(Boolean bool) {
        if (this.f33887j.get() && this.f33888k.get()) {
            C6104t c6104t = C6104t.f34442b;
            InterfaceC5938l interfaceC5938l = this.f33889l;
            if (c6104t.equals(interfaceC5938l != null ? ((AbstractC5929c) interfaceC5938l).m21654i() : null)) {
                C5759D1 c5759d1 = this.f33880c;
                if (c5759d1 != null) {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    O90.m5977o("options");
                    throw null;
                }
            }
            InterfaceC5938l interfaceC5938l2 = this.f33889l;
            if (interfaceC5938l2 != null) {
                interfaceC5938l2.mo21662e(bool.equals(Boolean.TRUE), new C10115lG0(20, this));
            }
            InterfaceC5938l interfaceC5938l3 = this.f33889l;
            this.f33889l = interfaceC5938l3 != null ? interfaceC5938l3.mo21661d() : null;
        }
    }

    @Override // io.sentry.InterfaceC5766G
    /* renamed from: c */
    public final void mo21386c(EnumC5763F enumC5763F) {
        O90.m5968f(enumC5763F, "status");
        if (this.f33889l instanceof C5941o) {
            if (enumC5763F == EnumC5763F.DISCONNECTED) {
                pause();
            } else {
                resume();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C6161m c6161mMo21372q;
        if (this.f33887j.get()) {
            C5759D1 c5759d1 = this.f33880c;
            if (c5759d1 == null) {
                O90.m5977o("options");
                throw null;
            }
            c5759d1.getConnectionStatusProvider().mo21391d(this);
            C5760E c5760e = this.f33881d;
            if (c5760e != null && (c6161mMo21372q = c5760e.mo21372q()) != null) {
                c6161mMo21372q.f34652d.remove(this);
            }
            C5759D1 c5759d12 = this.f33880c;
            if (c5759d12 == null) {
                O90.m5977o("options");
                throw null;
            }
            if (c5759d12.getSessionReplay().f33294l) {
                try {
                    this.f33878a.unregisterComponentCallbacks(this);
                } catch (Throwable unused) {
                }
            }
            stop();
            C5978z c5978z = this.f33882e;
            if (c5978z != null) {
                c5978z.close();
            }
            this.f33882e = null;
            ((C5957q) this.f33885h.getValue()).close();
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f33886i.getValue();
            O90.m5967e(scheduledExecutorService, "replayExecutor");
            C5759D1 c5759d13 = this.f33880c;
            if (c5759d13 != null) {
                AbstractC6003a.m21760t(scheduledExecutorService, c5759d13);
            } else {
                O90.m5977o("options");
                throw null;
            }
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        Double d;
        C5760E c5760e = C5760E.f33234a;
        this.f33880c = c5759d1;
        if (Build.VERSION.SDK_INT < 26) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        Double d2 = c5759d1.getSessionReplay().f33283a;
        if ((d2 == null || d2.doubleValue() <= ConfigValue.DOUBLE_DEFAULT_VALUE) && ((d = c5759d1.getSessionReplay().f33284b) == null || d.doubleValue() <= ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.f33881d = c5760e;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f33886i.getValue();
        O90.m5967e(scheduledExecutorService, "replayExecutor");
        this.f33882e = new C5978z(c5759d1, this, this.f33891n, scheduledExecutorService);
        this.f33883f = new C5947b(c5759d1, this);
        this.f33887j.set(true);
        c5759d1.getConnectionStatusProvider().mo21390c(this);
        C6161m c6161mMo21372q = c5760e.mo21372q();
        if (c6161mMo21372q != null) {
            c6161mMo21372q.f34652d.add(this);
        }
        if (c5759d1.getSessionReplay().f33294l) {
            try {
                this.f33878a.registerComponentCallbacks(this);
            } catch (Throwable th) {
                c5759d1.getLogger().mo21406d(EnumC6069n1.INFO, "ComponentCallbacks is not available, orientation changes won't be handled by Session replay", th);
            }
        }
        AbstractC6003a.m21742a("Replay");
        C6059l1.m21830v().m21832o("maven:io.sentry:sentry-android-replay", "7.20.1");
        C5759D1 c5759d12 = this.f33880c;
        if (c5759d12 == null) {
            O90.m5977o("options");
            throw null;
        }
        InterfaceC5796Q executorService = c5759d12.getExecutorService();
        O90.m5967e(executorService, "options.executorService");
        C5759D1 c5759d13 = this.f33880c;
        if (c5759d13 == null) {
            O90.m5977o("options");
            throw null;
        }
        try {
            executorService.submit(new O91(new N61(19, this), 29, c5759d13));
        } catch (Throwable th2) {
            c5759d13.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th2);
        }
    }

    /* renamed from: f */
    public final void m21648f(String str) {
        File[] fileArrListFiles;
        C6104t c6104tM21654i;
        C5759D1 c5759d1 = this.f33880c;
        if (c5759d1 == null) {
            O90.m5977o("options");
            throw null;
        }
        String cacheDirPath = c5759d1.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            O90.m5967e(name, "name");
            if (D51.m1556o(name, "replay_", false)) {
                InterfaceC5938l interfaceC5938l = this.f33889l;
                if (interfaceC5938l == null || (c6104tM21654i = ((AbstractC5929c) interfaceC5938l).m21654i()) == null) {
                    c6104tM21654i = C6104t.f34442b;
                    O90.m5967e(c6104tM21654i, "EMPTY_ID");
                }
                String string = c6104tM21654i.toString();
                O90.m5967e(string, "replayId.toString()");
                if (!AbstractC11374v51.m25351p(name, string, false) && (AbstractC11374v51.m25328C(str) || !AbstractC11374v51.m25351p(name, str, false))) {
                    AbstractC6003a.m21744c(file);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m21649g(Bitmap bitmap) {
        O90.m5968f(bitmap, "bitmap");
        TO0 to0 = new TO0();
        if (this.f33881d != null) {
            AbstractC5802S0.m21464b(new C5952l(to0, 0));
        }
        InterfaceC5938l interfaceC5938l = this.f33889l;
        if (interfaceC5938l != null) {
            interfaceC5938l.mo21663f(new C5954n(bitmap, to0, this));
        }
    }

    @Override // io.sentry.InterfaceC5770H0
    /* renamed from: o */
    public final void mo21393o(InterfaceC5767G0 interfaceC5767G0) {
        this.f33890m = interfaceC5767G0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        O90.m5968f(configuration, "newConfig");
        if (this.f33887j.get() && this.f33888k.get()) {
            C5978z c5978z = this.f33882e;
            if (c5978z != null) {
                c5978z.m21693m();
            }
            C5759D1 c5759d1 = this.f33880c;
            if (c5759d1 == null) {
                O90.m5977o("options");
                throw null;
            }
            C5771H1 sessionReplay = c5759d1.getSessionReplay();
            O90.m5967e(sessionReplay, "options.sessionReplay");
            C5961u c5961uM21749h = AbstractC6003a.m21749h(this.f33878a, sessionReplay);
            InterfaceC5938l interfaceC5938l = this.f33889l;
            if (interfaceC5938l != null) {
                interfaceC5938l.mo21660b(c5961uM21749h);
            }
            C5978z c5978z2 = this.f33882e;
            if (c5978z2 != null) {
                c5978z2.m21692c(c5961uM21749h);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // io.sentry.InterfaceC5770H0
    /* renamed from: p, reason: from getter */
    public final InterfaceC5767G0 getF33890m() {
        return this.f33890m;
    }

    @Override // io.sentry.InterfaceC5770H0
    public final void pause() {
        ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t;
        if (this.f33887j.get() && this.f33888k.get()) {
            C5978z c5978z = this.f33882e;
            if (c5978z != null && (viewTreeObserverOnDrawListenerC5960t = c5978z.f34079h) != null) {
                viewTreeObserverOnDrawListenerC5960t.f34029m.set(false);
                WeakReference weakReference = viewTreeObserverOnDrawListenerC5960t.f34022f;
                viewTreeObserverOnDrawListenerC5960t.m21676b(weakReference != null ? (View) weakReference.get() : null);
            }
            InterfaceC5938l interfaceC5938l = this.f33889l;
            if (interfaceC5938l != null) {
                interfaceC5938l.pause();
            }
        }
    }

    @Override // io.sentry.InterfaceC5770H0
    public final void resume() {
        ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t;
        View view;
        if (this.f33887j.get() && this.f33888k.get()) {
            InterfaceC5938l interfaceC5938l = this.f33889l;
            if (interfaceC5938l != null) {
                ((AbstractC5929c) interfaceC5938l).m21659n(AbstractC6003a.m21752k());
            }
            C5978z c5978z = this.f33882e;
            if (c5978z == null || (viewTreeObserverOnDrawListenerC5960t = c5978z.f34079h) == null) {
                return;
            }
            WeakReference weakReference = viewTreeObserverOnDrawListenerC5960t.f34022f;
            if (weakReference != null && (view = (View) weakReference.get()) != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC5960t);
            }
            viewTreeObserverOnDrawListenerC5960t.f34029m.set(true);
        }
    }

    @Override // io.sentry.InterfaceC5770H0
    public final void start() {
        InterfaceC5938l c5932f;
        if (this.f33887j.get()) {
            if (this.f33888k.getAndSet(true)) {
                C5759D1 c5759d1 = this.f33880c;
                if (c5759d1 != null) {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                    return;
                } else {
                    O90.m5977o("options");
                    throw null;
                }
            }
            F71 f71 = this.f33884g;
            C6173f c6173f = (C6173f) f71.getValue();
            C5759D1 c5759d12 = this.f33880c;
            if (c5759d12 == null) {
                O90.m5977o("options");
                throw null;
            }
            Double d = c5759d12.getSessionReplay().f33283a;
            O90.m5968f(c6173f, "<this>");
            boolean z = d != null && d.doubleValue() >= c6173f.m21882b();
            if (!z) {
                C5759D1 c5759d13 = this.f33880c;
                if (c5759d13 == null) {
                    O90.m5977o("options");
                    throw null;
                }
                Double d2 = c5759d13.getSessionReplay().f33284b;
                if (d2 == null || d2.doubleValue() <= ConfigValue.DOUBLE_DEFAULT_VALUE) {
                    C5759D1 c5759d14 = this.f33880c;
                    if (c5759d14 != null) {
                        c5759d14.getLogger().mo21407k(EnumC6069n1.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                        return;
                    } else {
                        O90.m5977o("options");
                        throw null;
                    }
                }
            }
            C5759D1 c5759d15 = this.f33880c;
            if (c5759d15 == null) {
                O90.m5977o("options");
                throw null;
            }
            C5771H1 sessionReplay = c5759d15.getSessionReplay();
            O90.m5967e(sessionReplay, "options.sessionReplay");
            C5961u c5961uM21749h = AbstractC6003a.m21749h(this.f33878a, sessionReplay);
            F71 f712 = this.f33886i;
            if (z) {
                C5759D1 c5759d16 = this.f33880c;
                if (c5759d16 == null) {
                    O90.m5977o("options");
                    throw null;
                }
                C5760E c5760e = this.f33881d;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f712.getValue();
                O90.m5967e(scheduledExecutorService, "replayExecutor");
                c5932f = new C5941o(c5759d16, c5760e, this.f33879b, scheduledExecutorService, null);
            } else {
                C5759D1 c5759d17 = this.f33880c;
                if (c5759d17 == null) {
                    O90.m5977o("options");
                    throw null;
                }
                C5760E c5760e2 = this.f33881d;
                C6173f c6173f2 = (C6173f) f71.getValue();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) f712.getValue();
                O90.m5967e(scheduledExecutorService2, "replayExecutor");
                c5932f = new C5932f(c5759d17, c5760e2, this.f33879b, c6173f2, scheduledExecutorService2);
            }
            this.f33889l = c5932f;
            c5932f.mo21653c(c5961uM21749h, 0, new C6104t((UUID) null), null);
            C5978z c5978z = this.f33882e;
            if (c5978z != null) {
                c5978z.m21692c(c5961uM21749h);
            }
            boolean z2 = this.f33882e instanceof InterfaceC5944f;
            F71 f713 = this.f33885h;
            if (z2) {
                C5956p c5956p = ((C5957q) f713.getValue()).f34009c;
                C5978z c5978z2 = this.f33882e;
                O90.m5966d(c5978z2, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                c5956p.add(c5978z2);
            }
            ((C5957q) f713.getValue()).f34009c.add(this.f33883f);
        }
    }

    @Override // io.sentry.InterfaceC5770H0
    public final void stop() {
        if (this.f33887j.get() && this.f33888k.get()) {
            if (this.f33882e instanceof InterfaceC5944f) {
                C5956p c5956p = ((C5957q) this.f33885h.getValue()).f34009c;
                C5978z c5978z = this.f33882e;
                O90.m5966d(c5978z, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                c5956p.remove(c5978z);
            }
            ((C5957q) this.f33885h.getValue()).f34009c.remove(this.f33883f);
            C5978z c5978z2 = this.f33882e;
            if (c5978z2 != null) {
                c5978z2.m21693m();
            }
            C5947b c5947b = this.f33883f;
            if (c5947b != null) {
                synchronized (c5947b.f33981d) {
                    try {
                        Iterator it = c5947b.f33980c.iterator();
                        while (it.hasNext()) {
                            View view = (View) ((WeakReference) it.next()).get();
                            if (view != null) {
                                c5947b.m21670b(view);
                            }
                        }
                        c5947b.f33980c.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            InterfaceC5938l interfaceC5938l = this.f33889l;
            if (interfaceC5938l != null) {
                interfaceC5938l.stop();
            }
            this.f33888k.set(false);
            this.f33889l = null;
        }
    }
}
