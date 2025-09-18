package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: kR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FragmentC5503kR0 extends Fragment {
    public static final /* synthetic */ int b = 0;
    public C1562Tu0 a;

    public final void a(EnumC0123Bi0 enumC0123Bi0) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            O90.e(activity, "activity");
            AbstractC7028sQ1.a(activity, enumC0123Bi0);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0123Bi0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0123Bi0.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0123Bi0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1562Tu0 c1562Tu0 = this.a;
        if (c1562Tu0 != null) {
            ((ProcessLifecycleOwner) c1562Tu0.b).a();
        }
        a(EnumC0123Bi0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1562Tu0 c1562Tu0 = this.a;
        if (c1562Tu0 != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) c1562Tu0.b;
            int i = processLifecycleOwner.a + 1;
            processLifecycleOwner.a = i;
            if (i == 1 && processLifecycleOwner.d) {
                processLifecycleOwner.f.e(EnumC0123Bi0.ON_START);
                processLifecycleOwner.d = false;
            }
        }
        a(EnumC0123Bi0.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0123Bi0.ON_STOP);
    }
}
