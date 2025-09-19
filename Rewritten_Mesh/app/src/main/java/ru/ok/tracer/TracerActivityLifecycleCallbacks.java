package ru.ok.tracer;

import android.app.Activity;
import android.os.Bundle;
import defpackage.O90;
import kotlin.Metadata;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/tracer/TracerActivityLifecycleCallbacks;", "Lru/ok/tracer/utils/DefaultActivityLifecycleCallbacks;", "Lru/ok/tracer/session/SessionStateStorage;", "stateStorage", "<init>", "(Lru/ok/tracer/session/SessionStateStorage;)V", "Landroid/app/Activity;", "activity", "LTf1;", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Lru/ok/tracer/session/SessionStateStorage;", "", "resumedActivityCount", "I", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerActivityLifecycleCallbacks implements DefaultActivityLifecycleCallbacks {
    private int resumedActivityCount;
    private final SessionStateStorage stateStorage;

    public TracerActivityLifecycleCallbacks(SessionStateStorage sessionStateStorage) {
        O90.f(sessionStateStorage, "stateStorage");
        this.stateStorage = sessionStateStorage;
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) throws Throwable {
        O90.f(activity, "activity");
        int i = this.resumedActivityCount - 1;
        this.resumedActivityCount = i;
        if (i == 0) {
            this.stateStorage.setCurrentlyInBackground$tracer_commons_release(true);
        }
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) throws Throwable {
        O90.f(activity, "activity");
        if (this.resumedActivityCount == 0) {
            this.stateStorage.setCurrentlyInBackground$tracer_commons_release(false);
        }
        this.resumedActivityCount++;
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // ru.ok.tracer.utils.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        DefaultActivityLifecycleCallbacks.DefaultImpls.onActivityStopped(this, activity);
    }
}
