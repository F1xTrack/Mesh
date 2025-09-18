package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: kR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FragmentC10009kR0 extends Fragment {

    /* renamed from: b */
    public static final /* synthetic */ int f36503b = 0;

    /* renamed from: a */
    public C8342Tu0 f36504a;

    /* renamed from: a */
    public final void m22210a(EnumC7382Bi0 enumC7382Bi0) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            O90.m5967e(activity, "activity");
            AbstractC11032sQ1.m24739a(activity, enumC7382Bi0);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m22210a(EnumC7382Bi0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m22210a(EnumC7382Bi0.ON_DESTROY);
        this.f36504a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m22210a(EnumC7382Bi0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C8342Tu0 c8342Tu0 = this.f36504a;
        if (c8342Tu0 != null) {
            ((ProcessLifecycleOwner) c8342Tu0.f11590b).m10122a();
        }
        m22210a(EnumC7382Bi0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C8342Tu0 c8342Tu0 = this.f36504a;
        if (c8342Tu0 != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) c8342Tu0.f11590b;
            int i = processLifecycleOwner.f16293a + 1;
            processLifecycleOwner.f16293a = i;
            if (i == 1 && processLifecycleOwner.f16296d) {
                processLifecycleOwner.f16298f.m10126e(EnumC7382Bi0.ON_START);
                processLifecycleOwner.f16296d = false;
            }
        }
        m22210a(EnumC7382Bi0.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m22210a(EnumC7382Bi0.ON_STOP);
    }
}
