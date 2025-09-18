package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes.dex */
public final class GD0 extends AbstractC0339FN {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public GD0(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // p000.AbstractC0339FN, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        O90.m5968f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC10009kR0.f36503b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            O90.m5966d(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC10009kR0) fragmentFindFragmentByTag).f36504a = this.this$0.f16300h;
        }
    }

    @Override // p000.AbstractC0339FN, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        O90.m5968f(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.f16294b - 1;
        processLifecycleOwner.f16294b = i;
        if (i == 0) {
            Handler handler = processLifecycleOwner.f16297e;
            O90.m5965c(handler);
            handler.postDelayed(processLifecycleOwner.f16299g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        O90.m5968f(activity, "activity");
        ED0.m2068a(activity, new FD0(this.this$0));
    }

    @Override // p000.AbstractC0339FN, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        O90.m5968f(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.f16293a - 1;
        processLifecycleOwner.f16293a = i;
        if (i == 0 && processLifecycleOwner.f16295c) {
            processLifecycleOwner.f16298f.m10126e(EnumC7382Bi0.ON_STOP);
            processLifecycleOwner.f16296d = true;
        }
    }
}
