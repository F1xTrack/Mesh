package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class AppLifecycleIntegration implements InterfaceC5819Y, Closeable {

    /* renamed from: a */
    public volatile LifecycleWatcher f33514a;

    /* renamed from: b */
    public SentryAndroidOptions f33515b;

    /* renamed from: c */
    public final C5832D f33516c = new C5832D();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f33514a == null) {
            return;
        }
        if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            m21511n();
            return;
        }
        C5832D c5832d = this.f33516c;
        ((Handler) c5832d.f33522a).post(new RunnableC5917z(this, 0));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:22:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:22:0x009c). Please report as a decompilation issue!!! */
    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33515b = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        logger.mo21407k(enumC6069n1, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f33515b.isEnableAutoSessionTracking()));
        this.f33515b.getLogger().mo21407k(enumC6069n1, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f33515b.isEnableAppLifecycleBreadcrumbs()));
        if (this.f33515b.isEnableAutoSessionTracking() || this.f33515b.isEnableAppLifecycleBreadcrumbs()) {
            try {
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f16292i;
                if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                    m21510m();
                    c5759d1 = c5759d1;
                } else {
                    ((Handler) this.f33516c.f33522a).post(new RunnableC5917z(this, 1));
                    c5759d1 = c5759d1;
                }
            } catch (ClassNotFoundException e) {
                ILogger logger2 = c5759d1.getLogger();
                logger2.mo21406d(EnumC6069n1.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e);
                c5759d1 = logger2;
            } catch (IllegalStateException e2) {
                ILogger logger3 = c5759d1.getLogger();
                logger3.mo21406d(EnumC6069n1.ERROR, "AppLifecycleIntegration could not be installed", e2);
                c5759d1 = logger3;
            }
        }
    }

    /* renamed from: m */
    public final void m21510m() {
        SentryAndroidOptions sentryAndroidOptions = this.f33515b;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f33514a = new LifecycleWatcher(sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f33515b.isEnableAutoSessionTracking(), this.f33515b.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.f16292i.f16298f.mo2368a(this.f33514a);
            this.f33515b.getLogger().mo21407k(EnumC6069n1.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            AbstractC6003a.m21742a("AppLifecycle");
        } catch (Throwable th) {
            this.f33514a = null;
            this.f33515b.getLogger().mo21406d(EnumC6069n1.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }

    /* renamed from: n */
    public final void m21511n() {
        LifecycleWatcher lifecycleWatcher = this.f33514a;
        if (lifecycleWatcher != null) {
            ProcessLifecycleOwner.f16292i.f16298f.mo2369b(lifecycleWatcher);
            SentryAndroidOptions sentryAndroidOptions = this.f33515b;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.f33514a = null;
    }
}
