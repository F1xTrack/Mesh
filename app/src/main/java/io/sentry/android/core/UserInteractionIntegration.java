package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.EnumC5809U1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5819Y;
import io.sentry.android.core.internal.gestures.C5876f;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC5875e;
import io.sentry.android.core.internal.gestures.WindowCallbackC5872b;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class UserInteractionIntegration implements InterfaceC5819Y, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Application f33624a;

    /* renamed from: b */
    public C5760E f33625b;

    /* renamed from: c */
    public SentryAndroidOptions f33626c;

    /* renamed from: d */
    public final boolean f33627d;

    public UserInteractionIntegration(Application application) {
        AbstractC6003a.m21735D(application, "Application is required");
        this.f33624a = application;
        this.f33627d = C5847T.m21544a(this.f33626c, "androidx.core.view.GestureDetectorCompat");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33624a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f33626c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        C5760E c5760e = C5760E.f33234a;
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33626c = sentryAndroidOptions;
        this.f33625b = c5760e;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f33626c.isEnableUserInteractionTracing();
        ILogger logger = this.f33626c.getLogger();
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        logger.mo21407k(enumC6069n1, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            if (!this.f33627d) {
                c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f33624a.registerActivityLifecycleCallbacks(this);
            this.f33626c.getLogger().mo21407k(enumC6069n1, "UserInteractionIntegration installed.", new Object[0]);
            AbstractC6003a.m21742a("UserInteraction");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f33626c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C5876f) {
            C5876f c5876f = (C5876f) callback;
            c5876f.f33723c.m21574e(EnumC5809U1.CANCELLED);
            Window.Callback callback2 = c5876f.f33722b;
            if (callback2 instanceof WindowCallbackC5872b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f33626c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f33625b == null || this.f33626c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new WindowCallbackC5872b();
        }
        window.setCallback(new C5876f(callback, activity, new GestureDetectorOnGestureListenerC5875e(activity, this.f33625b, this.f33626c), this.f33626c));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
