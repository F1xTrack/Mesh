package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: lZ0 */
/* loaded from: classes.dex */
public final class C5718lZ0 implements Application.ActivityLifecycleCallbacks {
    public static final C5718lZ0 a = new C5718lZ0();
    public static boolean b;
    public static C1155Oo1 c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        O90.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        O90.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        O90.f(activity, "activity");
        C1155Oo1 c1155Oo1 = c;
        if (c1155Oo1 != null) {
            c1155Oo1.y(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1518Tf1 c1518Tf1;
        O90.f(activity, "activity");
        C1155Oo1 c1155Oo1 = c;
        if (c1155Oo1 != null) {
            c1155Oo1.y(1);
            c1518Tf1 = C1518Tf1.a;
        } else {
            c1518Tf1 = null;
        }
        if (c1518Tf1 == null) {
            b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        O90.f(activity, "activity");
        O90.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        O90.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        O90.f(activity, "activity");
    }
}
