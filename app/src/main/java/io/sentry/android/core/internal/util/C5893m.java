package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.C5847T;
import io.sentry.config.AbstractC6003a;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import p000.O91;

/* renamed from: io.sentry.android.core.internal.util.m */
/* loaded from: classes2.dex */
public final class C5893m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n */
    public static final long f33776n = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: o */
    public static final long f33777o = TimeUnit.MILLISECONDS.toNanos(700);

    /* renamed from: p */
    public static final /* synthetic */ int f33778p = 0;

    /* renamed from: a */
    public final C5832D f33779a;

    /* renamed from: b */
    public final CopyOnWriteArraySet f33780b;

    /* renamed from: c */
    public final C5847T f33781c;

    /* renamed from: d */
    public final Handler f33782d;

    /* renamed from: e */
    public WeakReference f33783e;

    /* renamed from: f */
    public final ConcurrentHashMap f33784f;

    /* renamed from: g */
    public final boolean f33785g;

    /* renamed from: h */
    public final C5882b f33786h;

    /* renamed from: i */
    public final WindowOnFrameMetricsAvailableListenerC5891k f33787i;

    /* renamed from: j */
    public Choreographer f33788j;

    /* renamed from: k */
    public final Field f33789k;

    /* renamed from: l */
    public long f33790l;

    /* renamed from: m */
    public long f33791m;

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.k] */
    public C5893m(Context context, final C5847T c5847t, final C5832D c5832d) throws NoSuchFieldException, SecurityException {
        C5882b c5882b = new C5882b();
        this.f33780b = new CopyOnWriteArraySet();
        this.f33784f = new ConcurrentHashMap();
        this.f33785g = false;
        this.f33790l = 0L;
        this.f33791m = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        AbstractC6003a.m21735D(c5847t, "Logger is required");
        this.f33781c = c5847t;
        AbstractC6003a.m21735D(c5832d, "BuildInfoProvider is required");
        this.f33779a = c5832d;
        this.f33786h = c5882b;
        if ((context instanceof Application) && Build.VERSION.SDK_INT >= 24) {
            this.f33785g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.j
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    c5847t.mo21406d(EnumC6069n1.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.f33782d = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new O91(this, 26, c5847t));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f33789k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                c5847t.mo21406d(EnumC6069n1.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
            }
            this.f33787i = new Window$OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.k
                /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onFrameMetricsAvailable(android.view.Window r25, android.view.FrameMetrics r26, int r27) {
                    /*
                        r24 = this;
                        r0 = r24
                        io.sentry.android.core.internal.util.m r1 = r0.f33774a
                        io.sentry.android.core.D r2 = r2
                        r1.getClass()
                        long r3 = java.lang.System.nanoTime()
                        r2.getClass()
                        int r2 = android.os.Build.VERSION.SDK_INT
                        r5 = 30
                        if (r2 < r5) goto L23
                        android.content.Context r5 = r25.getContext()
                        android.view.Display r5 = p000.AbstractC8329Tn1.m7756d(r5)
                        float r5 = r5.getRefreshRate()
                        goto L2f
                    L23:
                        android.view.WindowManager r5 = r25.getWindowManager()
                        android.view.Display r5 = r5.getDefaultDisplay()
                        float r5 = r5.getRefreshRate()
                    L2f:
                        long r6 = io.sentry.android.core.internal.util.C5893m.f33776n
                        float r6 = (float) r6
                        float r7 = r6 / r5
                        long r7 = (long) r7
                        long r9 = io.sentry.android.core.internal.util.AbstractC5889i.m21590e(r26)
                        long r11 = io.sentry.android.core.internal.util.AbstractC5889i.m21591f(r26)
                        long r11 = r11 + r9
                        long r9 = io.sentry.android.core.internal.util.AbstractC5889i.m21592g(r26)
                        long r9 = r9 + r11
                        long r11 = io.sentry.android.core.internal.util.AbstractC5889i.m21593h(r26)
                        long r11 = r11 + r9
                        long r9 = io.sentry.android.core.internal.util.AbstractC5889i.m21594i(r26)
                        long r9 = r9 + r11
                        long r11 = io.sentry.android.core.internal.util.AbstractC5889i.m21595j(r26)
                        long r18 = r11 + r9
                        long r7 = r18 - r7
                        r9 = 0
                        long r20 = java.lang.Math.max(r9, r7)
                        io.sentry.android.core.D r7 = r1.f33779a
                        r7.getClass()
                        r7 = 26
                        if (r2 < r7) goto L69
                        long r7 = io.sentry.android.core.internal.util.AbstractC5889i.m21586a(r26)
                        goto L80
                    L69:
                        android.view.Choreographer r2 = r1.f33788j
                        if (r2 == 0) goto L7e
                        java.lang.reflect.Field r7 = r1.f33789k
                        if (r7 == 0) goto L7e
                        java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.IllegalAccessException -> L7e
                        java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.IllegalAccessException -> L7e
                        if (r2 == 0) goto L7e
                        long r7 = r2.longValue()     // Catch: java.lang.IllegalAccessException -> L7e
                        goto L80
                    L7e:
                        r7 = -1
                    L80:
                        int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                        if (r2 >= 0) goto L86
                        long r7 = r3 - r18
                    L86:
                        long r2 = r1.f33791m
                        long r2 = java.lang.Math.max(r7, r2)
                        long r7 = r1.f33790l
                        int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                        if (r4 != 0) goto L93
                        goto Ldb
                    L93:
                        r1.f33790l = r2
                        long r7 = r2 + r18
                        r1.f33791m = r7
                        r4 = 1065353216(0x3f800000, float:1.0)
                        float r4 = r5 - r4
                        float r6 = r6 / r4
                        long r6 = (long) r6
                        int r4 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
                        r6 = 1
                        r7 = 0
                        if (r4 <= 0) goto La7
                        r4 = r6
                        goto La8
                    La7:
                        r4 = r7
                    La8:
                        if (r4 == 0) goto Lb3
                        long r8 = io.sentry.android.core.internal.util.C5893m.f33777o
                        int r8 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
                        if (r8 <= 0) goto Lb3
                        r22 = r6
                        goto Lb5
                    Lb3:
                        r22 = r7
                    Lb5:
                        java.util.concurrent.ConcurrentHashMap r6 = r1.f33784f
                        java.util.Collection r6 = r6.values()
                        java.util.Iterator r23 = r6.iterator()
                    Lbf:
                        boolean r6 = r23.hasNext()
                        if (r6 == 0) goto Ldb
                        java.lang.Object r6 = r23.next()
                        io.sentry.android.core.internal.util.l r6 = (io.sentry.android.core.internal.util.InterfaceC5892l) r6
                        long r9 = r1.f33791m
                        r7 = r2
                        r11 = r18
                        r13 = r20
                        r15 = r4
                        r16 = r22
                        r17 = r5
                        r6.mo21563b(r7, r9, r11, r13, r15, r16, r17)
                        goto Lbf
                    Ldb:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.WindowOnFrameMetricsAvailableListenerC5891k.onFrameMetricsAvailable(android.view.Window, android.view.FrameMetrics, int):void");
                }
            };
        }
    }

    /* renamed from: a */
    public final void m21596a(String str) {
        if (this.f33785g) {
            ConcurrentHashMap concurrentHashMap = this.f33784f;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.f33783e;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            m21597b(window);
        }
    }

    /* renamed from: b */
    public final void m21597b(Window window) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f33780b;
        if (copyOnWriteArraySet.contains(window)) {
            this.f33779a.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    C5882b c5882b = this.f33786h;
                    WindowOnFrameMetricsAvailableListenerC5891k windowOnFrameMetricsAvailableListenerC5891k = this.f33787i;
                    c5882b.getClass();
                    window.removeOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC5891k);
                } catch (Exception e) {
                    this.f33781c.mo21406d(EnumC6069n1.ERROR, "Failed to remove frameMetricsAvailableListener", e);
                }
            }
            copyOnWriteArraySet.remove(window);
        }
    }

    /* renamed from: c */
    public final void m21598c() {
        Handler handler;
        WeakReference weakReference = this.f33783e;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f33785g) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f33780b;
        if (copyOnWriteArraySet.contains(window) || this.f33784f.isEmpty()) {
            return;
        }
        this.f33779a.getClass();
        if (Build.VERSION.SDK_INT < 24 || (handler = this.f33782d) == null) {
            return;
        }
        copyOnWriteArraySet.add(window);
        WindowOnFrameMetricsAvailableListenerC5891k windowOnFrameMetricsAvailableListenerC5891k = this.f33787i;
        this.f33786h.getClass();
        window.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC5891k, handler);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f33783e;
        if (weakReference == null || weakReference.get() != window) {
            this.f33783e = new WeakReference(window);
            m21598c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m21597b(activity.getWindow());
        WeakReference weakReference = this.f33783e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f33783e = null;
    }
}
