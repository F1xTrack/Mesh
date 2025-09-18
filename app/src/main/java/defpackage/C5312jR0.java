package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: jR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5312jR0 implements Application.ActivityLifecycleCallbacks {
    public static final C4345iR0 Companion = new C4345iR0();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        O90.f(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new C5312jR0());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        O90.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        O90.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        O90.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        O90.f(activity, "activity");
        int i = FragmentC5503kR0.b;
        AbstractC7028sQ1.a(activity, EnumC0123Bi0.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        O90.f(activity, "activity");
        int i = FragmentC5503kR0.b;
        AbstractC7028sQ1.a(activity, EnumC0123Bi0.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        O90.f(activity, "activity");
        int i = FragmentC5503kR0.b;
        AbstractC7028sQ1.a(activity, EnumC0123Bi0.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        O90.f(activity, "activity");
        int i = FragmentC5503kR0.b;
        AbstractC7028sQ1.a(activity, EnumC0123Bi0.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        O90.f(activity, "activity");
        int i = FragmentC5503kR0.b;
        AbstractC7028sQ1.a(activity, EnumC0123Bi0.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        O90.f(activity, "activity");
        int i = FragmentC5503kR0.b;
        AbstractC7028sQ1.a(activity, EnumC0123Bi0.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        O90.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        O90.f(activity, "activity");
        O90.f(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        O90.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        O90.f(activity, "activity");
    }
}
