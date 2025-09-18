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
import defpackage.O91;
import io.sentry.EnumC5148n1;
import io.sentry.android.core.D;
import io.sentry.android.core.T;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class m implements Application.ActivityLifecycleCallbacks {
    public static final long n = TimeUnit.SECONDS.toNanos(1);
    public static final long o = TimeUnit.MILLISECONDS.toNanos(700);
    public static final /* synthetic */ int p = 0;
    public final D a;
    public final CopyOnWriteArraySet b;
    public final T c;
    public final Handler d;
    public WeakReference e;
    public final ConcurrentHashMap f;
    public final boolean g;
    public final b h;
    public final k i;
    public Choreographer j;
    public final Field k;
    public long l;
    public long m;

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.k] */
    public m(Context context, final T t, final D d) throws NoSuchFieldException, SecurityException {
        b bVar = new b();
        this.b = new CopyOnWriteArraySet();
        this.f = new ConcurrentHashMap();
        this.g = false;
        this.l = 0L;
        this.m = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        io.sentry.config.a.D(t, "Logger is required");
        this.c = t;
        io.sentry.config.a.D(d, "BuildInfoProvider is required");
        this.a = d;
        this.h = bVar;
        if ((context instanceof Application) && Build.VERSION.SDK_INT >= 24) {
            this.g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.j
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    t.d(EnumC5148n1.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.d = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new O91(this, 26, t));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                t.d(EnumC5148n1.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
            }
            this.i = new Window$OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.k
                /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onFrameMetricsAvailable(android.view.Window r25, android.view.FrameMetrics r26, int r27) {
                    /*
                        r24 = this;
                        r0 = r24
                        io.sentry.android.core.internal.util.m r1 = r0.a
                        io.sentry.android.core.D r2 = r2
                        r1.getClass()
                        long r3 = java.lang.System.nanoTime()
                        r2.getClass()
                        int r2 = android.os.Build.VERSION.SDK_INT
                        r5 = 30
                        if (r2 < r5) goto L23
                        android.content.Context r5 = r25.getContext()
                        android.view.Display r5 = defpackage.AbstractC1542Tn1.d(r5)
                        float r5 = r5.getRefreshRate()
                        goto L2f
                    L23:
                        android.view.WindowManager r5 = r25.getWindowManager()
                        android.view.Display r5 = r5.getDefaultDisplay()
                        float r5 = r5.getRefreshRate()
                    L2f:
                        long r6 = io.sentry.android.core.internal.util.m.n
                        float r6 = (float) r6
                        float r7 = r6 / r5
                        long r7 = (long) r7
                        long r9 = io.sentry.android.core.internal.util.i.e(r26)
                        long r11 = io.sentry.android.core.internal.util.i.f(r26)
                        long r11 = r11 + r9
                        long r9 = io.sentry.android.core.internal.util.i.g(r26)
                        long r9 = r9 + r11
                        long r11 = io.sentry.android.core.internal.util.i.h(r26)
                        long r11 = r11 + r9
                        long r9 = io.sentry.android.core.internal.util.i.i(r26)
                        long r9 = r9 + r11
                        long r11 = io.sentry.android.core.internal.util.i.j(r26)
                        long r18 = r11 + r9
                        long r7 = r18 - r7
                        r9 = 0
                        long r20 = java.lang.Math.max(r9, r7)
                        io.sentry.android.core.D r7 = r1.a
                        r7.getClass()
                        r7 = 26
                        if (r2 < r7) goto L69
                        long r7 = io.sentry.android.core.internal.util.i.a(r26)
                        goto L80
                    L69:
                        android.view.Choreographer r2 = r1.j
                        if (r2 == 0) goto L7e
                        java.lang.reflect.Field r7 = r1.k
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
                        long r2 = r1.m
                        long r2 = java.lang.Math.max(r7, r2)
                        long r7 = r1.l
                        int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                        if (r4 != 0) goto L93
                        goto Ldb
                    L93:
                        r1.l = r2
                        long r7 = r2 + r18
                        r1.m = r7
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
                        long r8 = io.sentry.android.core.internal.util.m.o
                        int r8 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
                        if (r8 <= 0) goto Lb3
                        r22 = r6
                        goto Lb5
                    Lb3:
                        r22 = r7
                    Lb5:
                        java.util.concurrent.ConcurrentHashMap r6 = r1.f
                        java.util.Collection r6 = r6.values()
                        java.util.Iterator r23 = r6.iterator()
                    Lbf:
                        boolean r6 = r23.hasNext()
                        if (r6 == 0) goto Ldb
                        java.lang.Object r6 = r23.next()
                        io.sentry.android.core.internal.util.l r6 = (io.sentry.android.core.internal.util.l) r6
                        long r9 = r1.m
                        r7 = r2
                        r11 = r18
                        r13 = r20
                        r15 = r4
                        r16 = r22
                        r17 = r5
                        r6.b(r7, r9, r11, r13, r15, r16, r17)
                        goto Lbf
                    Ldb:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.k.onFrameMetricsAvailable(android.view.Window, android.view.FrameMetrics, int):void");
                }
            };
        }
    }

    public final void a(String str) {
        if (this.g) {
            ConcurrentHashMap concurrentHashMap = this.f;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.e;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            b(window);
        }
    }

    public final void b(Window window) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.b;
        if (copyOnWriteArraySet.contains(window)) {
            this.a.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    b bVar = this.h;
                    k kVar = this.i;
                    bVar.getClass();
                    window.removeOnFrameMetricsAvailableListener(kVar);
                } catch (Exception e) {
                    this.c.d(EnumC5148n1.ERROR, "Failed to remove frameMetricsAvailableListener", e);
                }
            }
            copyOnWriteArraySet.remove(window);
        }
    }

    public final void c() {
        Handler handler;
        WeakReference weakReference = this.e;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.g) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.b;
        if (copyOnWriteArraySet.contains(window) || this.f.isEmpty()) {
            return;
        }
        this.a.getClass();
        if (Build.VERSION.SDK_INT < 24 || (handler = this.d) == null) {
            return;
        }
        copyOnWriteArraySet.add(window);
        k kVar = this.i;
        this.h.getClass();
        window.addOnFrameMetricsAvailableListener(kVar, handler);
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
        WeakReference weakReference = this.e;
        if (weakReference == null || weakReference.get() != window) {
            this.e = new WeakReference(window);
            c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        b(activity.getWindow());
        WeakReference weakReference = this.e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.e = null;
    }
}
