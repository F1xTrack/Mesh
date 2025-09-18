package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class ED0 {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        O90.f(activity, "activity");
        O90.f(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
