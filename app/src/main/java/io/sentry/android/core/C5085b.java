package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import defpackage.AbstractC8235ym;
import defpackage.C2199an;
import defpackage.H30;
import defpackage.NX;
import io.sentry.C5133i1;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.android.core.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5085b extends Thread {
    public final boolean a;
    public final H30 b;
    public final D c;
    public final C2199an d;
    public final long e;
    public final long f;
    public final ILogger g;
    public volatile long h;
    public final AtomicBoolean i;
    public final Context j;
    public final RunnableC5084a k;

    public C5085b(long j, boolean z, H30 h30, ILogger iLogger, Context context) {
        C2199an c2199an = new C2199an();
        D d = new D();
        super("|ANR-WatchDog|");
        this.h = 0L;
        this.i = new AtomicBoolean(false);
        this.d = c2199an;
        this.f = j;
        this.e = 500L;
        this.a = z;
        this.b = h30;
        this.g = iLogger;
        this.c = d;
        this.j = context;
        this.k = new RunnableC5084a(this, c2199an);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.k.run();
        while (!isInterrupted()) {
            ((Handler) this.c.a).post(this.k);
            try {
                Thread.sleep(this.e);
                getClass();
                if (SystemClock.uptimeMillis() - this.h > this.f) {
                    if (this.a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.j.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.g.d(EnumC5148n1.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (it.hasNext()) {
                                    if (it.next().condition == 2) {
                                    }
                                }
                            }
                        }
                        if (this.i.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(NX.i(new StringBuilder("Application Not Responding for at least "), this.f, " ms."), ((Handler) this.c.a).getLooper().getThread());
                            H30 h30 = this.b;
                            ((AnrIntegration) h30.b).getClass();
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) h30.c;
                            sentryAndroidOptions.getLogger().k(EnumC5148n1.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(A.b.a);
                            String strV = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strV = AbstractC8235ym.v("Background ", strV);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(strV, applicationNotResponding.a);
                            io.sentry.protocol.j jVar = new io.sentry.protocol.j();
                            jVar.a = "ANR";
                            C5133i1 c5133i1 = new C5133i1(new io.sentry.exception.a(jVar, applicationNotResponding2, applicationNotResponding2.a, true));
                            c5133i1.u = EnumC5148n1.ERROR;
                            io.sentry.E.a.F(c5133i1, io.sentry.config.a.b(new C5101s(zEquals)));
                        }
                    } else {
                        this.g.k(EnumC5148n1.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.i.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.g.k(EnumC5148n1.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.g.k(EnumC5148n1.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
