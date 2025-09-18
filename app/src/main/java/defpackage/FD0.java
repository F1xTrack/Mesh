package defpackage;

import android.app.Activity;
import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes.dex */
public final class FD0 extends FN {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public FD0(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        O90.f(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        O90.f(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.a + 1;
        processLifecycleOwner.a = i;
        if (i == 1 && processLifecycleOwner.d) {
            processLifecycleOwner.f.e(EnumC0123Bi0.ON_START);
            processLifecycleOwner.d = false;
        }
    }
}
