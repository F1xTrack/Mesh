package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.AbstractC5802S0;
import io.sentry.AbstractC5827a1;
import io.sentry.C5754C;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.C5820Y0;
import io.sentry.C5824Z1;
import io.sentry.C5828a2;
import io.sentry.C6075p1;
import io.sentry.C6113q1;
import io.sentry.C6190x;
import io.sentry.C6194y0;
import io.sentry.EnumC5809U1;
import io.sentry.EnumC5816X;
import io.sentry.EnumC6069n1;
import io.sentry.EnumC6071o0;
import io.sentry.InterfaceC5804T;
import io.sentry.InterfaceC5807U;
import io.sentry.InterfaceC5819Y;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC5886f;
import io.sentry.android.core.performance.C5902b;
import io.sentry.android.core.performance.C5905e;
import io.sentry.android.core.performance.C5906f;
import io.sentry.android.core.performance.EnumC5904d;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.EnumC6080C;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p000.C1686an;

/* loaded from: classes2.dex */
public final class ActivityLifecycleIntegration implements InterfaceC5819Y, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Application f33483a;

    /* renamed from: b */
    public final C5832D f33484b;

    /* renamed from: c */
    public C5760E f33485c;

    /* renamed from: d */
    public SentryAndroidOptions f33486d;

    /* renamed from: g */
    public final boolean f33489g;

    /* renamed from: j */
    public InterfaceC5804T f33492j;

    /* renamed from: r */
    public final C5863e f33500r;

    /* renamed from: e */
    public boolean f33487e = false;

    /* renamed from: f */
    public boolean f33488f = false;

    /* renamed from: h */
    public boolean f33490h = false;

    /* renamed from: i */
    public C6190x f33491i = null;

    /* renamed from: k */
    public final WeakHashMap f33493k = new WeakHashMap();

    /* renamed from: l */
    public final WeakHashMap f33494l = new WeakHashMap();

    /* renamed from: m */
    public final WeakHashMap f33495m = new WeakHashMap();

    /* renamed from: n */
    public AbstractC5827a1 f33496n = new C6113q1(new Date(0), 0);

    /* renamed from: o */
    public long f33497o = 0;

    /* renamed from: p */
    public Future f33498p = null;

    /* renamed from: q */
    public final WeakHashMap f33499q = new WeakHashMap();

    public ActivityLifecycleIntegration(Application application, C5832D c5832d, C5863e c5863e) {
        AbstractC6003a.m21735D(application, "Application is required");
        this.f33483a = application;
        this.f33484b = c5832d;
        this.f33500r = c5863e;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33489g = true;
        }
    }

    /* renamed from: n */
    public static void m21500n(InterfaceC5804T interfaceC5804T, InterfaceC5804T interfaceC5804T2) {
        if (interfaceC5804T == null || interfaceC5804T.mo21420b()) {
            return;
        }
        String description = interfaceC5804T.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = interfaceC5804T.getDescription() + " - Deadline Exceeded";
        }
        interfaceC5804T.mo21428j(description);
        AbstractC5827a1 abstractC5827a1Mo21433o = interfaceC5804T2 != null ? interfaceC5804T2.mo21433o() : null;
        if (abstractC5827a1Mo21433o == null) {
            abstractC5827a1Mo21433o = interfaceC5804T.mo21435q();
        }
        m21501o(interfaceC5804T, abstractC5827a1Mo21433o, EnumC5809U1.DEADLINE_EXCEEDED);
    }

    /* renamed from: o */
    public static void m21501o(InterfaceC5804T interfaceC5804T, AbstractC5827a1 abstractC5827a1, EnumC5809U1 enumC5809U1) {
        if (interfaceC5804T == null || interfaceC5804T.mo21420b()) {
            return;
        }
        if (enumC5809U1 == null) {
            enumC5809U1 = interfaceC5804T.getStatus() != null ? interfaceC5804T.getStatus() : EnumC5809U1.OK;
        }
        interfaceC5804T.mo21434p(enumC5809U1, abstractC5827a1);
    }

    /* renamed from: A */
    public final void m21502A(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        C6075p1 c6075p1M21610b;
        Boolean boolValueOf;
        AbstractC5827a1 abstractC5827a1;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f33485c != null) {
            WeakHashMap weakHashMap3 = this.f33499q;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.f33487e) {
                weakHashMap3.put(activity, C6194y0.f34745a);
                C5760E c5760e = this.f33485c;
                C5754C c5754c = new C5754C(8);
                c5760e.getClass();
                AbstractC5802S0.m21464b(c5754c);
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.f33494l;
                weakHashMap2 = this.f33493k;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                m21504p((InterfaceC5807U) entry.getValue(), (InterfaceC5804T) weakHashMap2.get(entry.getKey()), (InterfaceC5804T) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            C5906f c5906fM21606b = C5905e.m21604c().m21606b(this.f33486d);
            C5820Y0 c5820y0 = null;
            if (AbstractC5911t.m21631l() && c5906fM21606b.m21611c()) {
                c6075p1M21610b = c5906fM21606b.m21610b();
                boolValueOf = Boolean.valueOf(C5905e.m21604c().f33819a == EnumC5904d.COLD);
            } else {
                c6075p1M21610b = null;
                boolValueOf = null;
            }
            C5828a2 c5828a2 = new C5828a2();
            c5828a2.f33476f = 30000L;
            if (this.f33486d.isEnableActivityLifecycleTracingAutoFinish()) {
                c5828a2.f33475e = this.f33486d.getIdleTimeout();
                c5828a2.f33409a = true;
            }
            c5828a2.f33474d = true;
            c5828a2.f33477g = new C5869h(this, weakReference, simpleName);
            if (this.f33490h || c6075p1M21610b == null || boolValueOf == null) {
                abstractC5827a1 = this.f33496n;
            } else {
                C5820Y0 c5820y02 = C5905e.m21604c().f33827i;
                C5905e.m21604c().f33827i = null;
                c5820y0 = c5820y02;
                abstractC5827a1 = c6075p1M21610b;
            }
            c5828a2.f33472b = abstractC5827a1;
            c5828a2.f33473c = c5820y0 != null;
            InterfaceC5807U interfaceC5807UMo21375u = this.f33485c.mo21375u(new C5824Z1(simpleName, EnumC6080C.COMPONENT, "ui.load", c5820y0), c5828a2);
            if (interfaceC5807UMo21375u != null) {
                interfaceC5807UMo21375u.mo21432n().f33387i = "auto.ui.activity";
            }
            if (!this.f33490h && c6075p1M21610b != null && boolValueOf != null) {
                InterfaceC5804T interfaceC5804TMo21425g = interfaceC5807UMo21375u.mo21425g(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", c6075p1M21610b, EnumC5816X.SENTRY);
                this.f33492j = interfaceC5804TMo21425g;
                interfaceC5804TMo21425g.mo21432n().f33387i = "auto.ui.activity";
                m21503m();
            }
            String strConcat = simpleName.concat(" initial display");
            EnumC5816X enumC5816X = EnumC5816X.SENTRY;
            InterfaceC5804T interfaceC5804TMo21425g2 = interfaceC5807UMo21375u.mo21425g("ui.load.initial_display", strConcat, abstractC5827a1, enumC5816X);
            weakHashMap2.put(activity, interfaceC5804TMo21425g2);
            interfaceC5804TMo21425g2.mo21432n().f33387i = "auto.ui.activity";
            if (this.f33488f && this.f33491i != null && this.f33486d != null) {
                InterfaceC5804T interfaceC5804TMo21425g3 = interfaceC5807UMo21375u.mo21425g("ui.load.full_display", simpleName.concat(" full display"), abstractC5827a1, enumC5816X);
                interfaceC5804TMo21425g3.mo21432n().f33387i = "auto.ui.activity";
                try {
                    weakHashMap.put(activity, interfaceC5804TMo21425g3);
                    this.f33498p = this.f33486d.getExecutorService().mo13827t(new RunnableC5865f(this, interfaceC5804TMo21425g3, interfaceC5804TMo21425g2, 2), 25000L);
                } catch (RejectedExecutionException e) {
                    this.f33486d.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
                }
            }
            C5760E c5760e2 = this.f33485c;
            C5867g c5867g = new C5867g(this, interfaceC5807UMo21375u, 1);
            c5760e2.getClass();
            AbstractC5802S0.m21464b(c5867g);
            weakHashMap3.put(activity, interfaceC5807UMo21375u);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33483a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f33486d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        C5863e c5863e = this.f33500r;
        synchronized (c5863e) {
            try {
                if (c5863e.m21559c()) {
                    c5863e.m21560d(new RunnableC5854a(1, c5863e), "FrameMetricsAggregator.stop");
                    c5863e.f33670a.f16089a.mo2454m();
                }
                c5863e.f33672c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        C5760E c5760e = C5760E.f33234a;
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33486d = sentryAndroidOptions;
        this.f33485c = c5760e;
        this.f33487e = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.f33491i = this.f33486d.getFullyDisplayedReporter();
        this.f33488f = this.f33486d.isEnableTimeToFullDisplayTracing();
        this.f33483a.registerActivityLifecycleCallbacks(this);
        this.f33486d.getLogger().mo21407k(EnumC6069n1.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        AbstractC6003a.m21742a("ActivityLifecycle");
    }

    /* renamed from: m */
    public final void m21503m() {
        C5906f c5906fM21606b = C5905e.m21604c().m21606b(this.f33486d);
        C6075p1 c6075p1 = c5906fM21606b.m21612d() ? new C6075p1(c5906fM21606b.m21609a() * 1000000) : null;
        if (!this.f33487e || c6075p1 == null) {
            return;
        }
        m21501o(this.f33492j, c6075p1, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        C6190x c6190x;
        SentryAndroidOptions sentryAndroidOptions;
        try {
            if (!this.f33489g) {
                onActivityPreCreated(activity, bundle);
            }
            m21506x(bundle);
            if (this.f33485c != null && (sentryAndroidOptions = this.f33486d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                String strM21751j = AbstractC6003a.m21751j(activity);
                C5760E c5760e = this.f33485c;
                C5841M c5841m = new C5841M(1, strM21751j);
                c5760e.getClass();
                AbstractC5802S0.m21464b(c5841m);
            }
            m21502A(activity);
            InterfaceC5804T interfaceC5804T = (InterfaceC5804T) this.f33494l.get(activity);
            this.f33490h = true;
            if (this.f33487e && interfaceC5804T != null && (c6190x = this.f33491i) != null) {
                c6190x.f34736a.add(new C1686an());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        try {
            this.f33495m.remove(activity);
            if (this.f33487e) {
                InterfaceC5804T interfaceC5804T = this.f33492j;
                EnumC5809U1 enumC5809U1 = EnumC5809U1.CANCELLED;
                if (interfaceC5804T != null && !interfaceC5804T.mo21420b()) {
                    interfaceC5804T.mo21424f(enumC5809U1);
                }
                InterfaceC5804T interfaceC5804T2 = (InterfaceC5804T) this.f33493k.get(activity);
                InterfaceC5804T interfaceC5804T3 = (InterfaceC5804T) this.f33494l.get(activity);
                EnumC5809U1 enumC5809U12 = EnumC5809U1.DEADLINE_EXCEEDED;
                if (interfaceC5804T2 != null && !interfaceC5804T2.mo21420b()) {
                    interfaceC5804T2.mo21424f(enumC5809U12);
                }
                m21500n(interfaceC5804T3, interfaceC5804T2);
                Future future = this.f33498p;
                if (future != null) {
                    future.cancel(false);
                    this.f33498p = null;
                }
                if (this.f33487e) {
                    m21504p((InterfaceC5807U) this.f33499q.get(activity), null, null);
                }
                this.f33492j = null;
                this.f33493k.remove(activity);
                this.f33494l.remove(activity);
            }
            this.f33499q.remove(activity);
            if (this.f33499q.isEmpty()) {
                this.f33490h = false;
                this.f33496n = new C6113q1(new Date(0L), 0L);
                this.f33497o = 0L;
                this.f33495m.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        if (!this.f33489g) {
            onActivityPrePaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        InterfaceC5804T interfaceC5804T = this.f33492j;
        WeakHashMap weakHashMap = this.f33495m;
        if (interfaceC5804T == null) {
            weakHashMap.remove(activity);
            return;
        }
        C5902b c5902b = (C5902b) weakHashMap.get(activity);
        if (c5902b != null) {
            C5906f c5906f = c5902b.f33812a;
            c5906f.m21614f();
            c5906f.f33832a = activity.getClass().getName().concat(".onCreate");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        C5902b c5902b = (C5902b) this.f33495m.remove(activity);
        if (this.f33492j == null || c5902b == null) {
            return;
        }
        C5906f c5906f = c5902b.f33813b;
        c5906f.m21614f();
        c5906f.f33832a = activity.getClass().getName().concat(".onStart");
        C5905e.m21604c().f33825g.add(c5902b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC5827a1 c6113q1;
        if (this.f33490h) {
            return;
        }
        C5760E c5760e = this.f33485c;
        if (c5760e != null) {
            c6113q1 = c5760e.mo21364A().getDateProvider().now();
        } else {
            AbstractC5894j.f33792a.getClass();
            c6113q1 = new C6113q1();
        }
        this.f33496n = c6113q1;
        this.f33497o = SystemClock.uptimeMillis();
        C5902b c5902b = new C5902b();
        c5902b.f33812a.m21613e(this.f33497o);
        this.f33495m.put(activity, c5902b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        AbstractC5827a1 c6113q1;
        this.f33490h = true;
        C5760E c5760e = this.f33485c;
        if (c5760e != null) {
            c6113q1 = c5760e.mo21364A().getDateProvider().now();
        } else {
            AbstractC5894j.f33792a.getClass();
            c6113q1 = new C6113q1();
        }
        this.f33496n = c6113q1;
        this.f33497o = SystemClock.uptimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        C5902b c5902b;
        if (this.f33492j == null || (c5902b = (C5902b) this.f33495m.get(activity)) == null) {
            return;
        }
        c5902b.f33813b.m21613e(SystemClock.uptimeMillis());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.f33489g) {
                onActivityPostStarted(activity);
            }
            if (this.f33487e) {
                InterfaceC5804T interfaceC5804T = (InterfaceC5804T) this.f33493k.get(activity);
                InterfaceC5804T interfaceC5804T2 = (InterfaceC5804T) this.f33494l.get(activity);
                if (activity.getWindow() != null) {
                    ViewTreeObserverOnDrawListenerC5886f.m21584a(activity, new RunnableC5865f(this, interfaceC5804T2, interfaceC5804T, 0), this.f33484b);
                } else {
                    new Handler(Looper.getMainLooper()).post(new RunnableC5865f(this, interfaceC5804T2, interfaceC5804T, 1));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (!this.f33489g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f33487e) {
                this.f33500r.m21557a(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: p */
    public final void m21504p(InterfaceC5807U interfaceC5807U, InterfaceC5804T interfaceC5804T, InterfaceC5804T interfaceC5804T2) {
        if (interfaceC5807U == null || interfaceC5807U.mo21420b()) {
            return;
        }
        EnumC5809U1 enumC5809U1 = EnumC5809U1.DEADLINE_EXCEEDED;
        if (interfaceC5804T != null && !interfaceC5804T.mo21420b()) {
            interfaceC5804T.mo21424f(enumC5809U1);
        }
        m21500n(interfaceC5804T2, interfaceC5804T);
        Future future = this.f33498p;
        if (future != null) {
            future.cancel(false);
            this.f33498p = null;
        }
        EnumC5809U1 status = interfaceC5807U.getStatus();
        if (status == null) {
            status = EnumC5809U1.OK;
        }
        interfaceC5807U.mo21424f(status);
        if (this.f33485c != null) {
            AbstractC5802S0.m21464b(new C5867g(this, interfaceC5807U, 0));
        }
    }

    /* renamed from: w */
    public final void m21505w(InterfaceC5804T interfaceC5804T, InterfaceC5804T interfaceC5804T2) {
        C5905e c5905eM21604c = C5905e.m21604c();
        C5906f c5906f = c5905eM21604c.f33821c;
        if (c5906f.m21611c() && c5906f.f33835d == 0) {
            c5906f.m21614f();
        }
        C5906f c5906f2 = c5905eM21604c.f33822d;
        if (c5906f2.m21611c() && c5906f2.f33835d == 0) {
            c5906f2.m21614f();
        }
        m21503m();
        SentryAndroidOptions sentryAndroidOptions = this.f33486d;
        if (sentryAndroidOptions == null || interfaceC5804T2 == null) {
            if (interfaceC5804T2 == null || interfaceC5804T2.mo21420b()) {
                return;
            }
            interfaceC5804T2.finish();
            return;
        }
        AbstractC5827a1 abstractC5827a1Now = sentryAndroidOptions.getDateProvider().now();
        long millis = TimeUnit.NANOSECONDS.toMillis(abstractC5827a1Now.mo21495b(interfaceC5804T2.mo21435q()));
        Long lValueOf = Long.valueOf(millis);
        EnumC6071o0 enumC6071o0 = EnumC6071o0.MILLISECOND;
        interfaceC5804T2.mo21431m("time_to_initial_display", lValueOf, enumC6071o0);
        if (interfaceC5804T != null && interfaceC5804T.mo21420b()) {
            interfaceC5804T.mo21422d(abstractC5827a1Now);
            interfaceC5804T2.mo21431m("time_to_full_display", Long.valueOf(millis), enumC6071o0);
        }
        m21501o(interfaceC5804T2, abstractC5827a1Now, null);
    }

    /* renamed from: x */
    public final void m21506x(Bundle bundle) {
        if (this.f33490h) {
            return;
        }
        C5906f c5906f = C5905e.m21604c().f33821c;
        if (!c5906f.m21611c() || !c5906f.m21612d()) {
            C5905e c5905eM21604c = C5905e.m21604c();
            if (c5905eM21604c.f33820b && !c5905eM21604c.f33829k) {
                C5905e.m21604c().f33819a = bundle == null ? EnumC5904d.COLD : EnumC5904d.WARM;
                return;
            }
        }
        C5905e c5905eM21604c2 = C5905e.m21604c();
        long j = this.f33497o;
        c5905eM21604c2.f33831m = true;
        c5905eM21604c2.f33829k = false;
        c5905eM21604c2.f33820b = true;
        C5906f c5906f2 = c5905eM21604c2.f33821c;
        c5906f2.f33832a = null;
        c5906f2.f33834c = 0L;
        c5906f2.f33835d = 0L;
        c5906f2.f33833b = 0L;
        c5906f2.f33834c = SystemClock.uptimeMillis();
        c5906f2.f33833b = System.currentTimeMillis();
        System.nanoTime();
        c5906f2.m21613e(j);
        C5905e.f33817n = c5906f2.f33834c;
        C5905e.m21604c().f33819a = EnumC5904d.WARM;
    }
}
