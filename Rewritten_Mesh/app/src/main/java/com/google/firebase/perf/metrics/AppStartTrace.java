package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC7222ym;
import p000.C0751Lw;
import p000.C0786MU;
import p000.C6989v4;
import p000.C7277ze;
import p000.C7473Db1;
import p000.C7564Ev0;
import p000.C7629Gb1;
import p000.C7731Ia1;
import p000.C8619Zc1;
import p000.EnumC7382Bi0;
import p000.InterfaceC7850Ki0;
import p000.InterfaceC8504Wx0;
import p000.JA0;
import p000.RunnableC6720r4;
import p000.ViewOnAttachStateChangeListenerC7226yq;
import p000.ViewTreeObserverOnDrawListenerC0410GV;
import p000.ViewTreeObserverOnDrawListenerC1077R7;
import p000.ViewTreeObserverOnPreDrawListenerC11003sC0;

/* loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, InterfaceC7850Ki0 {

    /* renamed from: v */
    public static final C7731Ia1 f18480v = new C7731Ia1();

    /* renamed from: w */
    public static final long f18481w = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: x */
    public static volatile AppStartTrace f18482x;

    /* renamed from: y */
    public static ThreadPoolExecutor f18483y;

    /* renamed from: b */
    public final C8619Zc1 f18485b;

    /* renamed from: c */
    public final C0751Lw f18486c;

    /* renamed from: d */
    public final C7473Db1 f18487d;

    /* renamed from: e */
    public Application f18488e;

    /* renamed from: g */
    public final C7731Ia1 f18490g;

    /* renamed from: h */
    public final C7731Ia1 f18491h;

    /* renamed from: q */
    public JA0 f18500q;

    /* renamed from: a */
    public boolean f18484a = false;

    /* renamed from: f */
    public boolean f18489f = false;

    /* renamed from: i */
    public C7731Ia1 f18492i = null;

    /* renamed from: j */
    public C7731Ia1 f18493j = null;

    /* renamed from: k */
    public C7731Ia1 f18494k = null;

    /* renamed from: l */
    public C7731Ia1 f18495l = null;

    /* renamed from: m */
    public C7731Ia1 f18496m = null;

    /* renamed from: n */
    public C7731Ia1 f18497n = null;

    /* renamed from: o */
    public C7731Ia1 f18498o = null;

    /* renamed from: p */
    public C7731Ia1 f18499p = null;

    /* renamed from: r */
    public boolean f18501r = false;

    /* renamed from: s */
    public int f18502s = 0;

    /* renamed from: t */
    public final ViewTreeObserverOnDrawListenerC1077R7 f18503t = new ViewTreeObserverOnDrawListenerC1077R7(this);

    /* renamed from: u */
    public boolean f18504u = false;

    public AppStartTrace(C8619Zc1 c8619Zc1, C7564Ev0 c7564Ev0, C0751Lw c0751Lw, ThreadPoolExecutor threadPoolExecutor) {
        C7731Ia1 c7731Ia1;
        C7731Ia1 c7731Ia12 = null;
        this.f18485b = c8619Zc1;
        this.f18486c = c0751Lw;
        f18483y = threadPoolExecutor;
        C7473Db1 c7473Db1M3100N = C7629Gb1.m3100N();
        c7473Db1M3100N.m1735s("_experiment_app_start_ttid");
        this.f18487d = c7473Db1M3100N;
        if (Build.VERSION.SDK_INT >= 24) {
            long startElapsedRealtime = Process.getStartElapsedRealtime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(startElapsedRealtime);
            c7731Ia1 = new C7731Ia1((micros - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        } else {
            c7731Ia1 = null;
        }
        this.f18490g = c7731Ia1;
        C7277ze c7277ze = (C7277ze) C0786MU.m5375d().m5380b(C7277ze.class);
        if (c7277ze != null) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long micros2 = timeUnit2.toMicros(c7277ze.f46919b);
            c7731Ia12 = new C7731Ia1((micros2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit2.toMicros(System.currentTimeMillis()), micros2);
        }
        this.f18491h = c7731Ia12;
    }

    /* renamed from: b */
    public static AppStartTrace m11328b() {
        if (f18482x != null) {
            return f18482x;
        }
        C8619Zc1 c8619Zc1 = C8619Zc1.f15028s;
        C7564Ev0 c7564Ev0 = new C7564Ev0(9);
        if (f18482x == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f18482x == null) {
                        f18482x = new AppStartTrace(c8619Zc1, c7564Ev0, C0751Lw.m5135e(), new ThreadPoolExecutor(0, 1, f18481w + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f18482x;
    }

    /* renamed from: d */
    public static boolean m11329d(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strM26232i = AbstractC7222ym.m26232i(packageName, StringUtils.PROCESS_POSTFIX_DELIMITER);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strM26232i))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* renamed from: a */
    public final C7731Ia1 m11330a() {
        C7731Ia1 c7731Ia1 = this.f18491h;
        return c7731Ia1 != null ? c7731Ia1 : f18480v;
    }

    /* renamed from: c */
    public final C7731Ia1 m11331c() {
        C7731Ia1 c7731Ia1 = this.f18490g;
        return c7731Ia1 != null ? c7731Ia1 : m11330a();
    }

    /* renamed from: e */
    public final void m11332e(C7473Db1 c7473Db1) {
        if (this.f18497n == null || this.f18498o == null || this.f18499p == null) {
            return;
        }
        f18483y.execute(new RunnableC6720r4(this, 4, c7473Db1));
        m11334h();
    }

    /* renamed from: g */
    public final synchronized void m11333g(Context context) {
        if (this.f18484a) {
            return;
        }
        ProcessLifecycleOwner.f16292i.f16298f.mo2368a(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f18504u = this.f18504u || m11329d((Application) applicationContext);
            this.f18484a = true;
            this.f18488e = (Application) applicationContext;
        }
    }

    /* renamed from: h */
    public final synchronized void m11334h() {
        if (this.f18484a) {
            ProcessLifecycleOwner.f16292i.f16298f.mo2369b(this);
            this.f18488e.unregisterActivityLifecycleCallbacks(this);
            this.f18484a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.f18501r && this.f18492i == null) {
                this.f18504u = this.f18504u || m11329d(this.f18488e);
                new WeakReference(activity);
                this.f18492i = new C7731Ia1();
                if (m11331c().m3947b(this.f18492i) > f18481w) {
                    this.f18489f = true;
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f18501r || this.f18489f || !this.f18486c.m5144f() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f18503t);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Q7] */
    /* JADX WARN: Type inference failed for: r2v6, types: [Q7] */
    /* JADX WARN: Type inference failed for: r3v4, types: [Q7] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.f18501r && !this.f18489f) {
                boolean zM5144f = this.f18486c.m5144f();
                if (zM5144f && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f18503t);
                    final int i = 0;
                    ViewTreeObserverOnDrawListenerC0410GV viewTreeObserverOnDrawListenerC0410GV = new ViewTreeObserverOnDrawListenerC0410GV(viewFindViewById, new Runnable(this) { // from class: Q7

                        /* renamed from: b */
                        public final /* synthetic */ AppStartTrace f9485b;

                        {
                            this.f9485b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace appStartTrace = this.f9485b;
                            switch (i) {
                                case 0:
                                    if (appStartTrace.f18499p == null) {
                                        appStartTrace.f18499p = new C7731Ia1();
                                        C7473Db1 c7473Db1M3100N = C7629Gb1.m3100N();
                                        c7473Db1M3100N.m1735s("_experiment_onDrawFoQ");
                                        c7473Db1M3100N.m1733q(appStartTrace.m11331c().f5021a);
                                        c7473Db1M3100N.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18499p));
                                        C7629Gb1 c7629Gb1 = (C7629Gb1) c7473Db1M3100N.m23920l();
                                        C7473Db1 c7473Db1 = appStartTrace.f18487d;
                                        c7473Db1.m1731o(c7629Gb1);
                                        if (appStartTrace.f18490g != null) {
                                            C7473Db1 c7473Db1M3100N2 = C7629Gb1.m3100N();
                                            c7473Db1M3100N2.m1735s("_experiment_procStart_to_classLoad");
                                            c7473Db1M3100N2.m1733q(appStartTrace.m11331c().f5021a);
                                            c7473Db1M3100N2.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.m11330a()));
                                            c7473Db1.m1731o((C7629Gb1) c7473Db1M3100N2.m23920l());
                                        }
                                        String str = appStartTrace.f18504u ? "true" : "false";
                                        c7473Db1.m23922n();
                                        C7629Gb1.m3105y((C7629Gb1) c7473Db1.f40483b).put("systemDeterminedForeground", str);
                                        c7473Db1.m1732p(appStartTrace.f18502s, "onDrawCount");
                                        IA0 ia0M4243a = appStartTrace.f18500q.m4243a();
                                        c7473Db1.m23922n();
                                        C7629Gb1.m3106z((C7629Gb1) c7473Db1.f40483b, ia0M4243a);
                                        appStartTrace.m11332e(c7473Db1);
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (appStartTrace.f18497n == null) {
                                        appStartTrace.f18497n = new C7731Ia1();
                                        long j = appStartTrace.m11331c().f5021a;
                                        C7473Db1 c7473Db12 = appStartTrace.f18487d;
                                        c7473Db12.m1733q(j);
                                        c7473Db12.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18497n));
                                        appStartTrace.m11332e(c7473Db12);
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (appStartTrace.f18498o == null) {
                                        appStartTrace.f18498o = new C7731Ia1();
                                        C7473Db1 c7473Db1M3100N3 = C7629Gb1.m3100N();
                                        c7473Db1M3100N3.m1735s("_experiment_preDrawFoQ");
                                        c7473Db1M3100N3.m1733q(appStartTrace.m11331c().f5021a);
                                        c7473Db1M3100N3.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18498o));
                                        C7629Gb1 c7629Gb12 = (C7629Gb1) c7473Db1M3100N3.m23920l();
                                        C7473Db1 c7473Db13 = appStartTrace.f18487d;
                                        c7473Db13.m1731o(c7629Gb12);
                                        appStartTrace.m11332e(c7473Db13);
                                        break;
                                    }
                                    break;
                                default:
                                    C7731Ia1 c7731Ia1 = AppStartTrace.f18480v;
                                    appStartTrace.getClass();
                                    C7473Db1 c7473Db1M3100N4 = C7629Gb1.m3100N();
                                    c7473Db1M3100N4.m1735s("_as");
                                    c7473Db1M3100N4.m1733q(appStartTrace.m11330a().f5021a);
                                    c7473Db1M3100N4.m1734r(appStartTrace.m11330a().m3947b(appStartTrace.f18494k));
                                    ArrayList arrayList = new ArrayList(3);
                                    C7473Db1 c7473Db1M3100N5 = C7629Gb1.m3100N();
                                    c7473Db1M3100N5.m1735s("_astui");
                                    c7473Db1M3100N5.m1733q(appStartTrace.m11330a().f5021a);
                                    c7473Db1M3100N5.m1734r(appStartTrace.m11330a().m3947b(appStartTrace.f18492i));
                                    arrayList.add((C7629Gb1) c7473Db1M3100N5.m23920l());
                                    if (appStartTrace.f18493j != null) {
                                        C7473Db1 c7473Db1M3100N6 = C7629Gb1.m3100N();
                                        c7473Db1M3100N6.m1735s("_astfd");
                                        c7473Db1M3100N6.m1733q(appStartTrace.f18492i.f5021a);
                                        c7473Db1M3100N6.m1734r(appStartTrace.f18492i.m3947b(appStartTrace.f18493j));
                                        arrayList.add((C7629Gb1) c7473Db1M3100N6.m23920l());
                                        C7473Db1 c7473Db1M3100N7 = C7629Gb1.m3100N();
                                        c7473Db1M3100N7.m1735s("_asti");
                                        c7473Db1M3100N7.m1733q(appStartTrace.f18493j.f5021a);
                                        c7473Db1M3100N7.m1734r(appStartTrace.f18493j.m3947b(appStartTrace.f18494k));
                                        arrayList.add((C7629Gb1) c7473Db1M3100N7.m23920l());
                                    }
                                    c7473Db1M3100N4.m23922n();
                                    C7629Gb1.m3104x((C7629Gb1) c7473Db1M3100N4.f40483b, arrayList);
                                    IA0 ia0M4243a2 = appStartTrace.f18500q.m4243a();
                                    c7473Db1M3100N4.m23922n();
                                    C7629Gb1.m3106z((C7629Gb1) c7473Db1M3100N4.f40483b, ia0M4243a2);
                                    appStartTrace.f18485b.m9557c((C7629Gb1) c7473Db1M3100N4.m23920l(), EnumC3909d8.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    });
                    if (Build.VERSION.SDK_INT >= 26 || (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow())) {
                        viewFindViewById.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0410GV);
                    } else {
                        viewFindViewById.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7226yq(2, viewTreeObserverOnDrawListenerC0410GV));
                    }
                    final int i2 = 1;
                    final int i3 = 2;
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC11003sC0(viewFindViewById, new Runnable(this) { // from class: Q7

                        /* renamed from: b */
                        public final /* synthetic */ AppStartTrace f9485b;

                        {
                            this.f9485b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace appStartTrace = this.f9485b;
                            switch (i2) {
                                case 0:
                                    if (appStartTrace.f18499p == null) {
                                        appStartTrace.f18499p = new C7731Ia1();
                                        C7473Db1 c7473Db1M3100N = C7629Gb1.m3100N();
                                        c7473Db1M3100N.m1735s("_experiment_onDrawFoQ");
                                        c7473Db1M3100N.m1733q(appStartTrace.m11331c().f5021a);
                                        c7473Db1M3100N.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18499p));
                                        C7629Gb1 c7629Gb1 = (C7629Gb1) c7473Db1M3100N.m23920l();
                                        C7473Db1 c7473Db1 = appStartTrace.f18487d;
                                        c7473Db1.m1731o(c7629Gb1);
                                        if (appStartTrace.f18490g != null) {
                                            C7473Db1 c7473Db1M3100N2 = C7629Gb1.m3100N();
                                            c7473Db1M3100N2.m1735s("_experiment_procStart_to_classLoad");
                                            c7473Db1M3100N2.m1733q(appStartTrace.m11331c().f5021a);
                                            c7473Db1M3100N2.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.m11330a()));
                                            c7473Db1.m1731o((C7629Gb1) c7473Db1M3100N2.m23920l());
                                        }
                                        String str = appStartTrace.f18504u ? "true" : "false";
                                        c7473Db1.m23922n();
                                        C7629Gb1.m3105y((C7629Gb1) c7473Db1.f40483b).put("systemDeterminedForeground", str);
                                        c7473Db1.m1732p(appStartTrace.f18502s, "onDrawCount");
                                        IA0 ia0M4243a = appStartTrace.f18500q.m4243a();
                                        c7473Db1.m23922n();
                                        C7629Gb1.m3106z((C7629Gb1) c7473Db1.f40483b, ia0M4243a);
                                        appStartTrace.m11332e(c7473Db1);
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (appStartTrace.f18497n == null) {
                                        appStartTrace.f18497n = new C7731Ia1();
                                        long j = appStartTrace.m11331c().f5021a;
                                        C7473Db1 c7473Db12 = appStartTrace.f18487d;
                                        c7473Db12.m1733q(j);
                                        c7473Db12.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18497n));
                                        appStartTrace.m11332e(c7473Db12);
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (appStartTrace.f18498o == null) {
                                        appStartTrace.f18498o = new C7731Ia1();
                                        C7473Db1 c7473Db1M3100N3 = C7629Gb1.m3100N();
                                        c7473Db1M3100N3.m1735s("_experiment_preDrawFoQ");
                                        c7473Db1M3100N3.m1733q(appStartTrace.m11331c().f5021a);
                                        c7473Db1M3100N3.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18498o));
                                        C7629Gb1 c7629Gb12 = (C7629Gb1) c7473Db1M3100N3.m23920l();
                                        C7473Db1 c7473Db13 = appStartTrace.f18487d;
                                        c7473Db13.m1731o(c7629Gb12);
                                        appStartTrace.m11332e(c7473Db13);
                                        break;
                                    }
                                    break;
                                default:
                                    C7731Ia1 c7731Ia1 = AppStartTrace.f18480v;
                                    appStartTrace.getClass();
                                    C7473Db1 c7473Db1M3100N4 = C7629Gb1.m3100N();
                                    c7473Db1M3100N4.m1735s("_as");
                                    c7473Db1M3100N4.m1733q(appStartTrace.m11330a().f5021a);
                                    c7473Db1M3100N4.m1734r(appStartTrace.m11330a().m3947b(appStartTrace.f18494k));
                                    ArrayList arrayList = new ArrayList(3);
                                    C7473Db1 c7473Db1M3100N5 = C7629Gb1.m3100N();
                                    c7473Db1M3100N5.m1735s("_astui");
                                    c7473Db1M3100N5.m1733q(appStartTrace.m11330a().f5021a);
                                    c7473Db1M3100N5.m1734r(appStartTrace.m11330a().m3947b(appStartTrace.f18492i));
                                    arrayList.add((C7629Gb1) c7473Db1M3100N5.m23920l());
                                    if (appStartTrace.f18493j != null) {
                                        C7473Db1 c7473Db1M3100N6 = C7629Gb1.m3100N();
                                        c7473Db1M3100N6.m1735s("_astfd");
                                        c7473Db1M3100N6.m1733q(appStartTrace.f18492i.f5021a);
                                        c7473Db1M3100N6.m1734r(appStartTrace.f18492i.m3947b(appStartTrace.f18493j));
                                        arrayList.add((C7629Gb1) c7473Db1M3100N6.m23920l());
                                        C7473Db1 c7473Db1M3100N7 = C7629Gb1.m3100N();
                                        c7473Db1M3100N7.m1735s("_asti");
                                        c7473Db1M3100N7.m1733q(appStartTrace.f18493j.f5021a);
                                        c7473Db1M3100N7.m1734r(appStartTrace.f18493j.m3947b(appStartTrace.f18494k));
                                        arrayList.add((C7629Gb1) c7473Db1M3100N7.m23920l());
                                    }
                                    c7473Db1M3100N4.m23922n();
                                    C7629Gb1.m3104x((C7629Gb1) c7473Db1M3100N4.f40483b, arrayList);
                                    IA0 ia0M4243a2 = appStartTrace.f18500q.m4243a();
                                    c7473Db1M3100N4.m23922n();
                                    C7629Gb1.m3106z((C7629Gb1) c7473Db1M3100N4.f40483b, ia0M4243a2);
                                    appStartTrace.f18485b.m9557c((C7629Gb1) c7473Db1M3100N4.m23920l(), EnumC3909d8.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: Q7

                        /* renamed from: b */
                        public final /* synthetic */ AppStartTrace f9485b;

                        {
                            this.f9485b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace appStartTrace = this.f9485b;
                            switch (i3) {
                                case 0:
                                    if (appStartTrace.f18499p == null) {
                                        appStartTrace.f18499p = new C7731Ia1();
                                        C7473Db1 c7473Db1M3100N = C7629Gb1.m3100N();
                                        c7473Db1M3100N.m1735s("_experiment_onDrawFoQ");
                                        c7473Db1M3100N.m1733q(appStartTrace.m11331c().f5021a);
                                        c7473Db1M3100N.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18499p));
                                        C7629Gb1 c7629Gb1 = (C7629Gb1) c7473Db1M3100N.m23920l();
                                        C7473Db1 c7473Db1 = appStartTrace.f18487d;
                                        c7473Db1.m1731o(c7629Gb1);
                                        if (appStartTrace.f18490g != null) {
                                            C7473Db1 c7473Db1M3100N2 = C7629Gb1.m3100N();
                                            c7473Db1M3100N2.m1735s("_experiment_procStart_to_classLoad");
                                            c7473Db1M3100N2.m1733q(appStartTrace.m11331c().f5021a);
                                            c7473Db1M3100N2.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.m11330a()));
                                            c7473Db1.m1731o((C7629Gb1) c7473Db1M3100N2.m23920l());
                                        }
                                        String str = appStartTrace.f18504u ? "true" : "false";
                                        c7473Db1.m23922n();
                                        C7629Gb1.m3105y((C7629Gb1) c7473Db1.f40483b).put("systemDeterminedForeground", str);
                                        c7473Db1.m1732p(appStartTrace.f18502s, "onDrawCount");
                                        IA0 ia0M4243a = appStartTrace.f18500q.m4243a();
                                        c7473Db1.m23922n();
                                        C7629Gb1.m3106z((C7629Gb1) c7473Db1.f40483b, ia0M4243a);
                                        appStartTrace.m11332e(c7473Db1);
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (appStartTrace.f18497n == null) {
                                        appStartTrace.f18497n = new C7731Ia1();
                                        long j = appStartTrace.m11331c().f5021a;
                                        C7473Db1 c7473Db12 = appStartTrace.f18487d;
                                        c7473Db12.m1733q(j);
                                        c7473Db12.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18497n));
                                        appStartTrace.m11332e(c7473Db12);
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (appStartTrace.f18498o == null) {
                                        appStartTrace.f18498o = new C7731Ia1();
                                        C7473Db1 c7473Db1M3100N3 = C7629Gb1.m3100N();
                                        c7473Db1M3100N3.m1735s("_experiment_preDrawFoQ");
                                        c7473Db1M3100N3.m1733q(appStartTrace.m11331c().f5021a);
                                        c7473Db1M3100N3.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18498o));
                                        C7629Gb1 c7629Gb12 = (C7629Gb1) c7473Db1M3100N3.m23920l();
                                        C7473Db1 c7473Db13 = appStartTrace.f18487d;
                                        c7473Db13.m1731o(c7629Gb12);
                                        appStartTrace.m11332e(c7473Db13);
                                        break;
                                    }
                                    break;
                                default:
                                    C7731Ia1 c7731Ia1 = AppStartTrace.f18480v;
                                    appStartTrace.getClass();
                                    C7473Db1 c7473Db1M3100N4 = C7629Gb1.m3100N();
                                    c7473Db1M3100N4.m1735s("_as");
                                    c7473Db1M3100N4.m1733q(appStartTrace.m11330a().f5021a);
                                    c7473Db1M3100N4.m1734r(appStartTrace.m11330a().m3947b(appStartTrace.f18494k));
                                    ArrayList arrayList = new ArrayList(3);
                                    C7473Db1 c7473Db1M3100N5 = C7629Gb1.m3100N();
                                    c7473Db1M3100N5.m1735s("_astui");
                                    c7473Db1M3100N5.m1733q(appStartTrace.m11330a().f5021a);
                                    c7473Db1M3100N5.m1734r(appStartTrace.m11330a().m3947b(appStartTrace.f18492i));
                                    arrayList.add((C7629Gb1) c7473Db1M3100N5.m23920l());
                                    if (appStartTrace.f18493j != null) {
                                        C7473Db1 c7473Db1M3100N6 = C7629Gb1.m3100N();
                                        c7473Db1M3100N6.m1735s("_astfd");
                                        c7473Db1M3100N6.m1733q(appStartTrace.f18492i.f5021a);
                                        c7473Db1M3100N6.m1734r(appStartTrace.f18492i.m3947b(appStartTrace.f18493j));
                                        arrayList.add((C7629Gb1) c7473Db1M3100N6.m23920l());
                                        C7473Db1 c7473Db1M3100N7 = C7629Gb1.m3100N();
                                        c7473Db1M3100N7.m1735s("_asti");
                                        c7473Db1M3100N7.m1733q(appStartTrace.f18493j.f5021a);
                                        c7473Db1M3100N7.m1734r(appStartTrace.f18493j.m3947b(appStartTrace.f18494k));
                                        arrayList.add((C7629Gb1) c7473Db1M3100N7.m23920l());
                                    }
                                    c7473Db1M3100N4.m23922n();
                                    C7629Gb1.m3104x((C7629Gb1) c7473Db1M3100N4.f40483b, arrayList);
                                    IA0 ia0M4243a2 = appStartTrace.f18500q.m4243a();
                                    c7473Db1M3100N4.m23922n();
                                    C7629Gb1.m3106z((C7629Gb1) c7473Db1M3100N4.f40483b, ia0M4243a2);
                                    appStartTrace.f18485b.m9557c((C7629Gb1) c7473Db1M3100N4.m23920l(), EnumC3909d8.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                }
                if (this.f18494k != null) {
                    return;
                }
                new WeakReference(activity);
                this.f18494k = new C7731Ia1();
                this.f18500q = SessionManager.getInstance().perfSession();
                C6989v4 c6989v4M25319d = C6989v4.m25319d();
                activity.getClass();
                m11330a().m3947b(this.f18494k);
                c6989v4M25319d.m25320a();
                final int i4 = 3;
                f18483y.execute(new Runnable(this) { // from class: Q7

                    /* renamed from: b */
                    public final /* synthetic */ AppStartTrace f9485b;

                    {
                        this.f9485b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace appStartTrace = this.f9485b;
                        switch (i4) {
                            case 0:
                                if (appStartTrace.f18499p == null) {
                                    appStartTrace.f18499p = new C7731Ia1();
                                    C7473Db1 c7473Db1M3100N = C7629Gb1.m3100N();
                                    c7473Db1M3100N.m1735s("_experiment_onDrawFoQ");
                                    c7473Db1M3100N.m1733q(appStartTrace.m11331c().f5021a);
                                    c7473Db1M3100N.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18499p));
                                    C7629Gb1 c7629Gb1 = (C7629Gb1) c7473Db1M3100N.m23920l();
                                    C7473Db1 c7473Db1 = appStartTrace.f18487d;
                                    c7473Db1.m1731o(c7629Gb1);
                                    if (appStartTrace.f18490g != null) {
                                        C7473Db1 c7473Db1M3100N2 = C7629Gb1.m3100N();
                                        c7473Db1M3100N2.m1735s("_experiment_procStart_to_classLoad");
                                        c7473Db1M3100N2.m1733q(appStartTrace.m11331c().f5021a);
                                        c7473Db1M3100N2.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.m11330a()));
                                        c7473Db1.m1731o((C7629Gb1) c7473Db1M3100N2.m23920l());
                                    }
                                    String str = appStartTrace.f18504u ? "true" : "false";
                                    c7473Db1.m23922n();
                                    C7629Gb1.m3105y((C7629Gb1) c7473Db1.f40483b).put("systemDeterminedForeground", str);
                                    c7473Db1.m1732p(appStartTrace.f18502s, "onDrawCount");
                                    IA0 ia0M4243a = appStartTrace.f18500q.m4243a();
                                    c7473Db1.m23922n();
                                    C7629Gb1.m3106z((C7629Gb1) c7473Db1.f40483b, ia0M4243a);
                                    appStartTrace.m11332e(c7473Db1);
                                    break;
                                }
                                break;
                            case 1:
                                if (appStartTrace.f18497n == null) {
                                    appStartTrace.f18497n = new C7731Ia1();
                                    long j = appStartTrace.m11331c().f5021a;
                                    C7473Db1 c7473Db12 = appStartTrace.f18487d;
                                    c7473Db12.m1733q(j);
                                    c7473Db12.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18497n));
                                    appStartTrace.m11332e(c7473Db12);
                                    break;
                                }
                                break;
                            case 2:
                                if (appStartTrace.f18498o == null) {
                                    appStartTrace.f18498o = new C7731Ia1();
                                    C7473Db1 c7473Db1M3100N3 = C7629Gb1.m3100N();
                                    c7473Db1M3100N3.m1735s("_experiment_preDrawFoQ");
                                    c7473Db1M3100N3.m1733q(appStartTrace.m11331c().f5021a);
                                    c7473Db1M3100N3.m1734r(appStartTrace.m11331c().m3947b(appStartTrace.f18498o));
                                    C7629Gb1 c7629Gb12 = (C7629Gb1) c7473Db1M3100N3.m23920l();
                                    C7473Db1 c7473Db13 = appStartTrace.f18487d;
                                    c7473Db13.m1731o(c7629Gb12);
                                    appStartTrace.m11332e(c7473Db13);
                                    break;
                                }
                                break;
                            default:
                                C7731Ia1 c7731Ia1 = AppStartTrace.f18480v;
                                appStartTrace.getClass();
                                C7473Db1 c7473Db1M3100N4 = C7629Gb1.m3100N();
                                c7473Db1M3100N4.m1735s("_as");
                                c7473Db1M3100N4.m1733q(appStartTrace.m11330a().f5021a);
                                c7473Db1M3100N4.m1734r(appStartTrace.m11330a().m3947b(appStartTrace.f18494k));
                                ArrayList arrayList = new ArrayList(3);
                                C7473Db1 c7473Db1M3100N5 = C7629Gb1.m3100N();
                                c7473Db1M3100N5.m1735s("_astui");
                                c7473Db1M3100N5.m1733q(appStartTrace.m11330a().f5021a);
                                c7473Db1M3100N5.m1734r(appStartTrace.m11330a().m3947b(appStartTrace.f18492i));
                                arrayList.add((C7629Gb1) c7473Db1M3100N5.m23920l());
                                if (appStartTrace.f18493j != null) {
                                    C7473Db1 c7473Db1M3100N6 = C7629Gb1.m3100N();
                                    c7473Db1M3100N6.m1735s("_astfd");
                                    c7473Db1M3100N6.m1733q(appStartTrace.f18492i.f5021a);
                                    c7473Db1M3100N6.m1734r(appStartTrace.f18492i.m3947b(appStartTrace.f18493j));
                                    arrayList.add((C7629Gb1) c7473Db1M3100N6.m23920l());
                                    C7473Db1 c7473Db1M3100N7 = C7629Gb1.m3100N();
                                    c7473Db1M3100N7.m1735s("_asti");
                                    c7473Db1M3100N7.m1733q(appStartTrace.f18493j.f5021a);
                                    c7473Db1M3100N7.m1734r(appStartTrace.f18493j.m3947b(appStartTrace.f18494k));
                                    arrayList.add((C7629Gb1) c7473Db1M3100N7.m23920l());
                                }
                                c7473Db1M3100N4.m23922n();
                                C7629Gb1.m3104x((C7629Gb1) c7473Db1M3100N4.f40483b, arrayList);
                                IA0 ia0M4243a2 = appStartTrace.f18500q.m4243a();
                                c7473Db1M3100N4.m23922n();
                                C7629Gb1.m3106z((C7629Gb1) c7473Db1M3100N4.f40483b, ia0M4243a2);
                                appStartTrace.f18485b.m9557c((C7629Gb1) c7473Db1M3100N4.m23920l(), EnumC3909d8.FOREGROUND_BACKGROUND);
                                break;
                        }
                    }
                });
                if (!zM5144f) {
                    m11334h();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.f18501r && this.f18493j == null && !this.f18489f) {
            this.f18493j = new C7731Ia1();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.f18501r || this.f18489f || this.f18496m != null) {
            return;
        }
        this.f18496m = new C7731Ia1();
        C7473Db1 c7473Db1M3100N = C7629Gb1.m3100N();
        c7473Db1M3100N.m1735s("_experiment_firstBackgrounding");
        c7473Db1M3100N.m1733q(m11331c().f5021a);
        c7473Db1M3100N.m1734r(m11331c().m3947b(this.f18496m));
        this.f18487d.m1731o((C7629Gb1) c7473Db1M3100N.m23920l());
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.f18501r || this.f18489f || this.f18495l != null) {
            return;
        }
        this.f18495l = new C7731Ia1();
        C7473Db1 c7473Db1M3100N = C7629Gb1.m3100N();
        c7473Db1M3100N.m1735s("_experiment_firstForegrounding");
        c7473Db1M3100N.m1733q(m11331c().f5021a);
        c7473Db1M3100N.m1734r(m11331c().m3947b(this.f18495l));
        this.f18487d.m1731o((C7629Gb1) c7473Db1M3100N.m23920l());
    }
}
