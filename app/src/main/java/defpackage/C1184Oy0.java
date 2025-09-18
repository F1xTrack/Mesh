package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;
import org.wonday.orientation.OrientationModule;

/* renamed from: Oy0 */
/* loaded from: classes2.dex */
public final class C1184Oy0 implements Application.ActivityLifecycleCallbacks {
    public static final AtomicInteger b = new AtomicInteger(0);
    public static C1184Oy0 c;
    public OrientationModule a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        OrientationModule orientationModule;
        if (b.get() != 0 || (orientationModule = this.a) == null) {
            return;
        }
        orientationModule.release();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        OrientationModule orientationModule;
        if (b.incrementAndGet() != 1 || (orientationModule = this.a) == null) {
            return;
        }
        orientationModule.start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        OrientationModule orientationModule;
        if (b.decrementAndGet() != 0 || (orientationModule = this.a) == null) {
            return;
        }
        orientationModule.stop();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
