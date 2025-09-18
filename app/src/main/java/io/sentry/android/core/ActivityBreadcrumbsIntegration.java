package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.C6017f;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class ActivityBreadcrumbsIntegration implements InterfaceC5819Y, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Application f33480a;

    /* renamed from: b */
    public C5760E f33481b;

    /* renamed from: c */
    public boolean f33482c;

    public ActivityBreadcrumbsIntegration(Application application) {
        AbstractC6003a.m21735D(application, "Application is required");
        this.f33480a = application;
    }

    /* renamed from: a */
    public final void m21499a(Activity activity, String str) {
        if (this.f33481b == null) {
            return;
        }
        C6017f c6017f = new C6017f();
        c6017f.f34146d = "navigation";
        c6017f.m21778b(str, "state");
        c6017f.m21778b(activity.getClass().getSimpleName(), "screen");
        c6017f.f34148f = "ui.lifecycle";
        c6017f.f34150h = EnumC6069n1.INFO;
        C6193y c6193y = new C6193y();
        c6193y.m21928c(activity, "android:activity");
        this.f33481b.mo21376v(c6017f, c6193y);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f33482c) {
            this.f33480a.unregisterActivityLifecycleCallbacks(this);
            C5760E c5760e = this.f33481b;
            if (c5760e != null) {
                c5760e.mo21364A().getLogger().mo21407k(EnumC6069n1.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        C5760E c5760e = C5760E.f33234a;
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33481b = c5760e;
        this.f33482c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = c5759d1.getLogger();
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        logger.mo21407k(enumC6069n1, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f33482c));
        if (this.f33482c) {
            this.f33480a.registerActivityLifecycleCallbacks(this);
            c5759d1.getLogger().mo21407k(enumC6069n1, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            AbstractC6003a.m21742a("ActivityBreadcrumbs");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        m21499a(activity, "created");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        m21499a(activity, "destroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        m21499a(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        m21499a(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m21499a(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        m21499a(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        m21499a(activity, "stopped");
    }
}
