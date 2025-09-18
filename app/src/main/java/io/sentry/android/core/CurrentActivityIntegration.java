package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C5759D1;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class CurrentActivityIntegration implements InterfaceC5819Y, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Application f33520a;

    public CurrentActivityIntegration(Application application) {
        AbstractC6003a.m21735D(application, "Application is required");
        this.f33520a = application;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33520a.unregisterActivityLifecycleCallbacks(this);
        C5832D.f33521b.f33522a = null;
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        this.f33520a.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C5832D c5832d = C5832D.f33521b;
        WeakReference weakReference = (WeakReference) c5832d.f33522a;
        if (weakReference == null || weakReference.get() != activity) {
            c5832d.f33522a = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C5832D c5832d = C5832D.f33521b;
        WeakReference weakReference = (WeakReference) c5832d.f33522a;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            c5832d.f33522a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C5832D c5832d = C5832D.f33521b;
        WeakReference weakReference = (WeakReference) c5832d.f33522a;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            c5832d.f33522a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C5832D c5832d = C5832D.f33521b;
        WeakReference weakReference = (WeakReference) c5832d.f33522a;
        if (weakReference == null || weakReference.get() != activity) {
            c5832d.f33522a = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C5832D c5832d = C5832D.f33521b;
        WeakReference weakReference = (WeakReference) c5832d.f33522a;
        if (weakReference == null || weakReference.get() != activity) {
            c5832d.f33522a = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C5832D c5832d = C5832D.f33521b;
        WeakReference weakReference = (WeakReference) c5832d.f33522a;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            c5832d.f33522a = null;
        }
    }
}
