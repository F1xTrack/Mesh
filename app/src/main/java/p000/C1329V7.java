package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.AbstractActivityC1730l;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: V7 */
/* loaded from: classes.dex */
public final class C1329V7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: r */
    public static final C6989v4 f12359r = C6989v4.m25319d();

    /* renamed from: s */
    public static volatile C1329V7 f12360s;

    /* renamed from: a */
    public final WeakHashMap f12361a;

    /* renamed from: b */
    public final WeakHashMap f12362b;

    /* renamed from: c */
    public final WeakHashMap f12363c;

    /* renamed from: d */
    public final WeakHashMap f12364d;

    /* renamed from: e */
    public final HashMap f12365e;

    /* renamed from: f */
    public final HashSet f12366f;

    /* renamed from: g */
    public final HashSet f12367g;

    /* renamed from: h */
    public final AtomicInteger f12368h;

    /* renamed from: i */
    public final C8619Zc1 f12369i;

    /* renamed from: j */
    public final C0751Lw f12370j;

    /* renamed from: k */
    public final C7564Ev0 f12371k;

    /* renamed from: l */
    public final boolean f12372l;

    /* renamed from: m */
    public C7731Ia1 f12373m;

    /* renamed from: n */
    public C7731Ia1 f12374n;

    /* renamed from: o */
    public EnumC3909d8 f12375o;

    /* renamed from: p */
    public boolean f12376p;

    /* renamed from: q */
    public boolean f12377q;

    public C1329V7(C8619Zc1 c8619Zc1, C7564Ev0 c7564Ev0) {
        C0751Lw c0751LwM5135e = C0751Lw.m5135e();
        C6989v4 c6989v4 = C0979PY.f9125e;
        this.f12361a = new WeakHashMap();
        this.f12362b = new WeakHashMap();
        this.f12363c = new WeakHashMap();
        this.f12364d = new WeakHashMap();
        this.f12365e = new HashMap();
        this.f12366f = new HashSet();
        this.f12367g = new HashSet();
        this.f12368h = new AtomicInteger(0);
        this.f12375o = EnumC3909d8.BACKGROUND;
        this.f12376p = false;
        this.f12377q = true;
        this.f12369i = c8619Zc1;
        this.f12371k = c7564Ev0;
        this.f12370j = c0751LwM5135e;
        this.f12372l = true;
    }

    /* renamed from: a */
    public static C1329V7 m8297a() {
        if (f12360s == null) {
            synchronized (C1329V7.class) {
                try {
                    if (f12360s == null) {
                        f12360s = new C1329V7(C8619Zc1.f15028s, new C7564Ev0(9));
                    }
                } finally {
                }
            }
        }
        return f12360s;
    }

    /* renamed from: b */
    public final void m8298b(String str) {
        synchronized (this.f12365e) {
            try {
                Long l = (Long) this.f12365e.get(str);
                if (l == null) {
                    this.f12365e.put(str, 1L);
                } else {
                    this.f12365e.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m8299c(C6430mV c6430mV) {
        synchronized (this.f12367g) {
            this.f12367g.add(c6430mV);
        }
    }

    /* renamed from: d */
    public final void m8300d(WeakReference weakReference) {
        synchronized (this.f12366f) {
            this.f12366f.add(weakReference);
        }
    }

    /* renamed from: e */
    public final void m8301e() {
        synchronized (this.f12367g) {
            try {
                Iterator it = this.f12367g.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1203T7) it.next()) != null) {
                        try {
                            C6367lV.m22440a();
                        } catch (IllegalStateException e) {
                            C6430mV.f37728a.m25325g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m8302f(Activity activity) {
        C11991zy0 c11991zy0;
        WeakHashMap weakHashMap = this.f12364d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        C0979PY c0979py = (C0979PY) this.f12362b.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = c0979py.f9127b;
        boolean z = c0979py.f9129d;
        C6989v4 c6989v4 = C0979PY.f9125e;
        if (z) {
            HashMap map = c0979py.f9128c;
            if (!map.isEmpty()) {
                c6989v4.m25320a();
                map.clear();
            }
            C11991zy0 c11991zy0M6382a = c0979py.m6382a();
            try {
                frameMetricsAggregator.f16089a.mo2453l(c0979py.f9126a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                c6989v4.m25325g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                c11991zy0M6382a = new C11991zy0();
            }
            frameMetricsAggregator.f16089a.mo2454m();
            c0979py.f9129d = false;
            c11991zy0 = c11991zy0M6382a;
        } else {
            c6989v4.m25320a();
            c11991zy0 = new C11991zy0();
        }
        if (!c11991zy0.m26594b()) {
            f12359r.m25325g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            AbstractC11935zW0.m26445a(trace, (C0916OY) c11991zy0.m26593a());
            trace.stop();
        }
    }

    /* renamed from: g */
    public final void m8303g(String str, C7731Ia1 c7731Ia1, C7731Ia1 c7731Ia12) {
        if (this.f12370j.m5156u()) {
            C7473Db1 c7473Db1M3100N = C7629Gb1.m3100N();
            c7473Db1M3100N.m1735s(str);
            c7473Db1M3100N.m1733q(c7731Ia1.f5021a);
            c7473Db1M3100N.m1734r(c7731Ia1.m3947b(c7731Ia12));
            IA0 ia0M4243a = SessionManager.getInstance().perfSession().m4243a();
            c7473Db1M3100N.m23922n();
            C7629Gb1.m3106z((C7629Gb1) c7473Db1M3100N.f40483b, ia0M4243a);
            int andSet = this.f12368h.getAndSet(0);
            synchronized (this.f12365e) {
                try {
                    HashMap map = this.f12365e;
                    c7473Db1M3100N.m23922n();
                    C7629Gb1.m3102v((C7629Gb1) c7473Db1M3100N.f40483b).putAll(map);
                    if (andSet != 0) {
                        c7473Db1M3100N.m1732p(andSet, "_tsns");
                    }
                    this.f12365e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f12369i.m9557c((C7629Gb1) c7473Db1M3100N.m23920l(), EnumC3909d8.FOREGROUND_BACKGROUND);
        }
    }

    /* renamed from: h */
    public final void m8304h(Activity activity) {
        if (this.f12372l && this.f12370j.m5156u()) {
            C0979PY c0979py = new C0979PY(activity);
            this.f12362b.put(activity, c0979py);
            if (activity instanceof AbstractActivityC1730l) {
                C6559oY c6559oY = new C6559oY(this.f12371k, this.f12369i, this, c0979py);
                this.f12363c.put(activity, c6559oY);
                ((AbstractActivityC1730l) activity).m10034e().m10052R(c6559oY);
            }
        }
    }

    /* renamed from: i */
    public final void m8305i(EnumC3909d8 enumC3909d8) {
        this.f12375o = enumC3909d8;
        synchronized (this.f12366f) {
            try {
                Iterator it = this.f12366f.iterator();
                while (it.hasNext()) {
                    InterfaceC1266U7 interfaceC1266U7 = (InterfaceC1266U7) ((WeakReference) it.next()).get();
                    if (interfaceC1266U7 != null) {
                        interfaceC1266U7.onUpdateAppState(this.f12375o);
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
        m8304h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f12362b.remove(activity);
        WeakHashMap weakHashMap = this.f12363c;
        if (weakHashMap.containsKey(activity)) {
            ((AbstractActivityC1730l) activity).m10034e().m10066c0((AbstractC4060fY) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f12361a.isEmpty()) {
                this.f12371k.getClass();
                this.f12373m = new C7731Ia1();
                this.f12361a.put(activity, Boolean.TRUE);
                if (this.f12377q) {
                    m8305i(EnumC3909d8.FOREGROUND);
                    m8301e();
                    this.f12377q = false;
                } else {
                    m8303g("_bs", this.f12374n, this.f12373m);
                    m8305i(EnumC3909d8.FOREGROUND);
                }
            } else {
                this.f12361a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.f12372l && this.f12370j.m5156u()) {
                if (!this.f12362b.containsKey(activity)) {
                    m8304h(activity);
                }
                C0979PY c0979py = (C0979PY) this.f12362b.get(activity);
                boolean z = c0979py.f9129d;
                Activity activity2 = c0979py.f9126a;
                if (z) {
                    C0979PY.f9125e.m25321b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    c0979py.f9127b.f16089a.mo2450a(activity2);
                    c0979py.f9129d = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.f12369i, this.f12371k, this);
                trace.start();
                this.f12364d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.f12372l) {
                m8302f(activity);
            }
            if (this.f12361a.containsKey(activity)) {
                this.f12361a.remove(activity);
                if (this.f12361a.isEmpty()) {
                    this.f12371k.getClass();
                    C7731Ia1 c7731Ia1 = new C7731Ia1();
                    this.f12374n = c7731Ia1;
                    m8303g("_fs", this.f12373m, c7731Ia1);
                    m8305i(EnumC3909d8.BACKGROUND);
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
