package ru.ok.tracer.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lru/ok/tracer/utils/DefaultActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "LTf1;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface DefaultActivityLifecycleCallbacks extends Application.ActivityLifecycleCallbacks {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onActivityCreated(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity, Bundle bundle) {
            O90.f(activity, "activity");
        }

        public static void onActivityDestroyed(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
            O90.f(activity, "activity");
        }

        public static void onActivityPaused(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
            O90.f(activity, "activity");
        }

        public static void onActivityResumed(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
            O90.f(activity, "activity");
        }

        public static void onActivitySaveInstanceState(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity, Bundle bundle) {
            O90.f(activity, "activity");
            O90.f(bundle, "outState");
        }

        public static void onActivityStarted(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
            O90.f(activity, "activity");
        }

        public static void onActivityStopped(DefaultActivityLifecycleCallbacks defaultActivityLifecycleCallbacks, Activity activity) {
            O90.f(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityCreated(Activity activity, Bundle savedInstanceState);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityDestroyed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityPaused(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityResumed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivitySaveInstanceState(Activity activity, Bundle outState);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStopped(Activity activity);
}
