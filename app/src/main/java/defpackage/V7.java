package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.l;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class V7 implements Application.ActivityLifecycleCallbacks {
    public static final C7533v4 r = C7533v4.d();
    public static volatile V7 s;
    public final WeakHashMap a;
    public final WeakHashMap b;
    public final WeakHashMap c;
    public final WeakHashMap d;
    public final HashMap e;
    public final HashSet f;
    public final HashSet g;
    public final AtomicInteger h;
    public final C1977Zc1 i;
    public final C0943Lw j;
    public final C0396Ev0 k;
    public final boolean l;
    public C0646Ia1 m;
    public C0646Ia1 n;
    public EnumC3333d8 o;
    public boolean p;
    public boolean q;

    public V7(C1977Zc1 c1977Zc1, C0396Ev0 c0396Ev0) {
        C0943Lw c0943LwE = C0943Lw.e();
        C7533v4 c7533v4 = PY.e;
        this.a = new WeakHashMap();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
        this.d = new WeakHashMap();
        this.e = new HashMap();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new AtomicInteger(0);
        this.o = EnumC3333d8.BACKGROUND;
        this.p = false;
        this.q = true;
        this.i = c1977Zc1;
        this.k = c0396Ev0;
        this.j = c0943LwE;
        this.l = true;
    }

    public static V7 a() {
        if (s == null) {
            synchronized (V7.class) {
                try {
                    if (s == null) {
                        s = new V7(C1977Zc1.s, new C0396Ev0(9));
                    }
                } finally {
                }
            }
        }
        return s;
    }

    public final void b(String str) {
        synchronized (this.e) {
            try {
                Long l = (Long) this.e.get(str);
                if (l == null) {
                    this.e.put(str, 1L);
                } else {
                    this.e.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(C5896mV c5896mV) {
        synchronized (this.g) {
            this.g.add(c5896mV);
        }
    }

    public final void d(WeakReference weakReference) {
        synchronized (this.f) {
            this.f.add(weakReference);
        }
    }

    public final void e() {
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if (((T7) it.next()) != null) {
                        try {
                            C5705lV.a();
                        } catch (IllegalStateException e) {
                            C5896mV.a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Activity activity) {
        C8462zy0 c8462zy0;
        WeakHashMap weakHashMap = this.d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        PY py = (PY) this.b.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = py.b;
        boolean z = py.d;
        C7533v4 c7533v4 = PY.e;
        if (z) {
            HashMap map = py.c;
            if (!map.isEmpty()) {
                c7533v4.a();
                map.clear();
            }
            C8462zy0 c8462zy0A = py.a();
            try {
                frameMetricsAggregator.a.l(py.a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                c7533v4.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                c8462zy0A = new C8462zy0();
            }
            frameMetricsAggregator.a.m();
            py.d = false;
            c8462zy0 = c8462zy0A;
        } else {
            c7533v4.a();
            c8462zy0 = new C8462zy0();
        }
        if (!c8462zy0.b()) {
            r.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            AbstractC8378zW0.a(trace, (OY) c8462zy0.a());
            trace.stop();
        }
    }

    public final void g(String str, C0646Ia1 c0646Ia1, C0646Ia1 c0646Ia12) {
        if (this.j.u()) {
            C0259Db1 c0259Db1N = C0493Gb1.N();
            c0259Db1N.s(str);
            c0259Db1N.q(c0646Ia1.a);
            c0259Db1N.r(c0646Ia1.b(c0646Ia12));
            IA0 ia0A = SessionManager.getInstance().perfSession().a();
            c0259Db1N.n();
            C0493Gb1.z((C0493Gb1) c0259Db1N.b, ia0A);
            int andSet = this.h.getAndSet(0);
            synchronized (this.e) {
                try {
                    HashMap map = this.e;
                    c0259Db1N.n();
                    C0493Gb1.v((C0493Gb1) c0259Db1N.b).putAll(map);
                    if (andSet != 0) {
                        c0259Db1N.p(andSet, "_tsns");
                    }
                    this.e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.i.c((C0493Gb1) c0259Db1N.l(), EnumC3333d8.FOREGROUND_BACKGROUND);
        }
    }

    public final void h(Activity activity) {
        if (this.l && this.j.u()) {
            PY py = new PY(activity);
            this.b.put(activity, py);
            if (activity instanceof l) {
                C6287oY c6287oY = new C6287oY(this.k, this.i, this, py);
                this.c.put(activity, c6287oY);
                ((l) activity).e().R(c6287oY);
            }
        }
    }

    public final void i(EnumC3333d8 enumC3333d8) {
        this.o = enumC3333d8;
        synchronized (this.f) {
            try {
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    U7 u7 = (U7) ((WeakReference) it.next()).get();
                    if (u7 != null) {
                        u7.onUpdateAppState(this.o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.b.remove(activity);
        WeakHashMap weakHashMap = this.c;
        if (weakHashMap.containsKey(activity)) {
            ((l) activity).e().c0((AbstractC3792fY) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.a.isEmpty()) {
                this.k.getClass();
                this.m = new C0646Ia1();
                this.a.put(activity, Boolean.TRUE);
                if (this.q) {
                    i(EnumC3333d8.FOREGROUND);
                    e();
                    this.q = false;
                } else {
                    g("_bs", this.n, this.m);
                    i(EnumC3333d8.FOREGROUND);
                }
            } else {
                this.a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.l && this.j.u()) {
                if (!this.b.containsKey(activity)) {
                    h(activity);
                }
                PY py = (PY) this.b.get(activity);
                boolean z = py.d;
                Activity activity2 = py.a;
                if (z) {
                    PY.e.b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    py.b.a.a(activity2);
                    py.d = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.i, this.k, this);
                trace.start();
                this.d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.l) {
                f(activity);
            }
            if (this.a.containsKey(activity)) {
                this.a.remove(activity);
                if (this.a.isEmpty()) {
                    this.k.getClass();
                    C0646Ia1 c0646Ia1 = new C0646Ia1();
                    this.n = c0646Ia1;
                    g("_fs", this.m, c0646Ia1);
                    i(EnumC3333d8.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
