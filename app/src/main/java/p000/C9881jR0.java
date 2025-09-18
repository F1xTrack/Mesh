package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: jR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9881jR0 implements Application.ActivityLifecycleCallbacks {
    public static final C9753iR0 Companion = new C9753iR0();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        O90.m5968f(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new C9881jR0());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        O90.m5968f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        O90.m5968f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        O90.m5968f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        O90.m5968f(activity, "activity");
        int i = FragmentC10009kR0.f36503b;
        AbstractC11032sQ1.m24739a(activity, EnumC7382Bi0.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        O90.m5968f(activity, "activity");
        int i = FragmentC10009kR0.f36503b;
        AbstractC11032sQ1.m24739a(activity, EnumC7382Bi0.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        O90.m5968f(activity, "activity");
        int i = FragmentC10009kR0.f36503b;
        AbstractC11032sQ1.m24739a(activity, EnumC7382Bi0.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        O90.m5968f(activity, "activity");
        int i = FragmentC10009kR0.f36503b;
        AbstractC11032sQ1.m24739a(activity, EnumC7382Bi0.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        O90.m5968f(activity, "activity");
        int i = FragmentC10009kR0.f36503b;
        AbstractC11032sQ1.m24739a(activity, EnumC7382Bi0.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        O90.m5968f(activity, "activity");
        int i = FragmentC10009kR0.f36503b;
        AbstractC11032sQ1.m24739a(activity, EnumC7382Bi0.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        O90.m5968f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        O90.m5968f(activity, "activity");
        O90.m5968f(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        O90.m5968f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        O90.m5968f(activity, "activity");
    }
}
