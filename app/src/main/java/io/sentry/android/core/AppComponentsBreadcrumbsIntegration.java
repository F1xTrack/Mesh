package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.C6017f;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;
import p000.RunnableC7147xa;
import p000.RunnableC8061Oj1;
import p000.RunnableC9844j81;

/* loaded from: classes2.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC5819Y, Closeable, ComponentCallbacks2 {

    /* renamed from: a */
    public final Context f33511a;

    /* renamed from: b */
    public C5760E f33512b;

    /* renamed from: c */
    public SentryAndroidOptions f33513c;

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f33511a = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public final void m21508a(long j, Integer num) {
        if (this.f33512b != null) {
            C6017f c6017f = new C6017f(j);
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                } else {
                    c6017f.m21778b(num, "level");
                }
            }
            c6017f.f34146d = "system";
            c6017f.f34148f = "device.event";
            c6017f.f34145c = "Low memory";
            c6017f.m21778b("LOW_MEMORY", NotificationConstants.ACTION);
            c6017f.f34150h = EnumC6069n1.WARNING;
            this.f33512b.m21384a(c6017f);
        }
    }

    /* renamed from: c */
    public final void m21509c(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f33513c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.f33513c.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f33511a.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.f33513c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo21405c(EnumC6069n1.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f33513c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().mo21407k(EnumC6069n1.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        this.f33512b = C5760E.f33234a;
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33513c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        logger.mo21407k(enumC6069n1, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f33513c.isEnableAppComponentBreadcrumbs()));
        if (this.f33513c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f33511a.registerComponentCallbacks(this);
                c5759d1.getLogger().mo21407k(enumC6069n1, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                AbstractC6003a.m21742a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.f33513c.setEnableAppComponentBreadcrumbs(false);
                c5759d1.getLogger().mo21405c(EnumC6069n1.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        m21509c(new RunnableC9844j81(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m21509c(new RunnableC7147xa(this, System.currentTimeMillis(), 3));
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        m21509c(new RunnableC8061Oj1(this, System.currentTimeMillis(), i, 2));
    }
}
