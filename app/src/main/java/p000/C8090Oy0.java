package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;
import org.wonday.orientation.OrientationModule;

/* renamed from: Oy0 */
/* loaded from: classes2.dex */
public final class C8090Oy0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public static final AtomicInteger f8761b = new AtomicInteger(0);

    /* renamed from: c */
    public static C8090Oy0 f8762c;

    /* renamed from: a */
    public OrientationModule f8763a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        OrientationModule orientationModule;
        if (f8761b.get() != 0 || (orientationModule = this.f8763a) == null) {
            return;
        }
        orientationModule.release();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        OrientationModule orientationModule;
        if (f8761b.incrementAndGet() != 1 || (orientationModule = this.f8763a) == null) {
            return;
        }
        orientationModule.start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        OrientationModule orientationModule;
        if (f8761b.decrementAndGet() != 0 || (orientationModule = this.f8763a) == null) {
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
