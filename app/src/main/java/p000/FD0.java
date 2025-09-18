package p000;

import android.app.Activity;
import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes.dex */
public final class FD0 extends AbstractC0339FN {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public FD0(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        O90.m5968f(activity, "activity");
        this.this$0.m10122a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        O90.m5968f(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.f16293a + 1;
        processLifecycleOwner.f16293a = i;
        if (i == 1 && processLifecycleOwner.f16296d) {
            processLifecycleOwner.f16298f.m10126e(EnumC7382Bi0.ON_START);
            processLifecycleOwner.f16296d = false;
        }
    }
}
