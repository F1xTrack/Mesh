package p000;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class ED0 {
    /* renamed from: a */
    public static final void m2068a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        O90.m5968f(activity, "activity");
        O90.m5968f(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
