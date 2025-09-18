package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: lZ0 */
/* loaded from: classes.dex */
public final class C10153lZ0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static final C10153lZ0 f37152a = new C10153lZ0();

    /* renamed from: b */
    public static boolean f37153b;

    /* renamed from: c */
    public static C8071Oo1 f37154c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        O90.m5968f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        O90.m5968f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        O90.m5968f(activity, "activity");
        C8071Oo1 c8071Oo1 = f37154c;
        if (c8071Oo1 != null) {
            c8071Oo1.m6158y(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C8313Tf1 c8313Tf1;
        O90.m5968f(activity, "activity");
        C8071Oo1 c8071Oo1 = f37154c;
        if (c8071Oo1 != null) {
            c8071Oo1.m6158y(1);
            c8313Tf1 = C8313Tf1.f11463a;
        } else {
            c8313Tf1 = null;
        }
        if (c8313Tf1 == null) {
            f37153b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        O90.m5968f(activity, "activity");
        O90.m5968f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        O90.m5968f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        O90.m5968f(activity, "activity");
    }
}
