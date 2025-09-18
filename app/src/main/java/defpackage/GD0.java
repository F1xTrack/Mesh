package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes.dex */
public final class GD0 extends FN {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public GD0(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // defpackage.FN, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        O90.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC5503kR0.b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            O90.d(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC5503kR0) fragmentFindFragmentByTag).a = this.this$0.h;
        }
    }

    @Override // defpackage.FN, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        O90.f(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.b - 1;
        processLifecycleOwner.b = i;
        if (i == 0) {
            Handler handler = processLifecycleOwner.e;
            O90.c(handler);
            handler.postDelayed(processLifecycleOwner.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        O90.f(activity, "activity");
        ED0.a(activity, new FD0(this.this$0));
    }

    @Override // defpackage.FN, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        O90.f(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.a - 1;
        processLifecycleOwner.a = i;
        if (i == 0 && processLifecycleOwner.c) {
            processLifecycleOwner.f.e(EnumC0123Bi0.ON_STOP);
            processLifecycleOwner.d = true;
        }
    }
}
