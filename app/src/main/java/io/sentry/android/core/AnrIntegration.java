package io.sentry.android.core;

import android.content.Context;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;
import p000.H30;
import p000.O91;

/* loaded from: classes2.dex */
public final class AnrIntegration implements InterfaceC5819Y, Closeable {

    /* renamed from: e */
    public static C5856b f33501e;

    /* renamed from: f */
    public static final Object f33502f = new Object();

    /* renamed from: a */
    public final Context f33503a;

    /* renamed from: b */
    public boolean f33504b = false;

    /* renamed from: c */
    public final Object f33505c = new Object();

    /* renamed from: d */
    public C5759D1 f33506d;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f33503a = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public final void m21507a(SentryAndroidOptions sentryAndroidOptions) {
        synchronized (f33502f) {
            try {
                if (f33501e == null) {
                    ILogger logger = sentryAndroidOptions.getLogger();
                    EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
                    logger.mo21407k(enumC6069n1, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    C5856b c5856b = new C5856b(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new H30(this, 24, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f33503a);
                    f33501e = c5856b;
                    c5856b.start();
                    sentryAndroidOptions.getLogger().mo21407k(enumC6069n1, "AnrIntegration installed.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33505c) {
            this.f33504b = true;
        }
        synchronized (f33502f) {
            try {
                C5856b c5856b = f33501e;
                if (c5856b != null) {
                    c5856b.interrupt();
                    f33501e = null;
                    C5759D1 c5759d1 = this.f33506d;
                    if (c5759d1 != null) {
                        c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        this.f33506d = c5759d1;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c5759d1;
        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            AbstractC6003a.m21742a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new O91(this, 22, sentryAndroidOptions));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }
}
