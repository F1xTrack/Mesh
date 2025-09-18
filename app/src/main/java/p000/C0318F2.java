package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: F2 */
/* loaded from: classes.dex */
public final class C0318F2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Object f3020a;

    /* renamed from: b */
    public Activity f3021b;

    /* renamed from: c */
    public final int f3022c;

    /* renamed from: d */
    public boolean f3023d = false;

    /* renamed from: e */
    public boolean f3024e = false;

    /* renamed from: f */
    public boolean f3025f = false;

    public C0318F2(Activity activity) {
        this.f3021b = activity;
        this.f3022c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f3021b == activity) {
            this.f3021b = null;
            this.f3024e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f3024e || this.f3025f || this.f3023d) {
            return;
        }
        Object obj = this.f3020a;
        try {
            Object obj2 = AbstractC0381G2.f3537c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f3022c) {
                AbstractC0381G2.f3541g.postAtFrontOfQueue(new RunnableC1420WZ(AbstractC0381G2.f3536b.get(activity), 3, obj2));
                this.f3025f = true;
                this.f3020a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f3021b == activity) {
            this.f3023d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
