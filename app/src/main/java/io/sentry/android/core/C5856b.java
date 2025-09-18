package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import io.sentry.C5760E;
import io.sentry.C6039i1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.config.AbstractC6003a;
import io.sentry.exception.C6015a;
import io.sentry.protocol.C6094j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0852NX;
import p000.AbstractC7222ym;
import p000.C1686an;
import p000.H30;

/* renamed from: io.sentry.android.core.b */
/* loaded from: classes2.dex */
public final class C5856b extends Thread {

    /* renamed from: a */
    public final boolean f33641a;

    /* renamed from: b */
    public final H30 f33642b;

    /* renamed from: c */
    public final C5832D f33643c;

    /* renamed from: d */
    public final C1686an f33644d;

    /* renamed from: e */
    public final long f33645e;

    /* renamed from: f */
    public final long f33646f;

    /* renamed from: g */
    public final ILogger f33647g;

    /* renamed from: h */
    public volatile long f33648h;

    /* renamed from: i */
    public final AtomicBoolean f33649i;

    /* renamed from: j */
    public final Context f33650j;

    /* renamed from: k */
    public final RunnableC5854a f33651k;

    public C5856b(long j, boolean z, H30 h30, ILogger iLogger, Context context) {
        C1686an c1686an = new C1686an();
        C5832D c5832d = new C5832D();
        super("|ANR-WatchDog|");
        this.f33648h = 0L;
        this.f33649i = new AtomicBoolean(false);
        this.f33644d = c1686an;
        this.f33646f = j;
        this.f33645e = 500L;
        this.f33641a = z;
        this.f33642b = h30;
        this.f33647g = iLogger;
        this.f33643c = c5832d;
        this.f33650j = context;
        this.f33651k = new RunnableC5854a(this, c1686an);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.f33651k.run();
        while (!isInterrupted()) {
            ((Handler) this.f33643c.f33522a).post(this.f33651k);
            try {
                Thread.sleep(this.f33645e);
                getClass();
                if (SystemClock.uptimeMillis() - this.f33648h > this.f33646f) {
                    if (this.f33641a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.f33650j.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.f33647g.mo21406d(EnumC6069n1.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
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
                        if (this.f33649i.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(AbstractC0852NX.m5760i(new StringBuilder("Application Not Responding for at least "), this.f33646f, " ms."), ((Handler) this.f33643c.f33522a).getLooper().getThread());
                            H30 h30 = this.f33642b;
                            ((AnrIntegration) h30.f4030b).getClass();
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) h30.f4031c;
                            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(C5829A.f33478b.f33479a);
                            String strM26245v = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strM26245v = AbstractC7222ym.m26245v("Background ", strM26245v);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(strM26245v, applicationNotResponding.f33517a);
                            C6094j c6094j = new C6094j();
                            c6094j.f34383a = "ANR";
                            C6039i1 c6039i1 = new C6039i1(new C6015a(c6094j, applicationNotResponding2, applicationNotResponding2.f33517a, true));
                            c6039i1.f34191u = EnumC6069n1.ERROR;
                            C5760E.f33234a.mo21369F(c6039i1, AbstractC6003a.m21743b(new C5910s(zEquals)));
                        }
                    } else {
                        this.f33647g.mo21407k(EnumC6069n1.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f33649i.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.f33647g.mo21407k(EnumC6069n1.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f33647g.mo21407k(EnumC6069n1.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
