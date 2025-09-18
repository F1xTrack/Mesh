package p000;

import android.util.Log;
import androidx.fragment.app.Fragment;

/* renamed from: rY */
/* loaded from: classes.dex */
public abstract class AbstractC6750rY {

    /* renamed from: a */
    public static final C6687qY f41724a = C6687qY.f41020a;

    /* renamed from: a */
    public static C6687qY m24398a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                O90.m5967e(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f41724a;
    }

    /* renamed from: b */
    public static void m24399b(AbstractC7805Jl1 abstractC7805Jl1) {
        if (Log.isLoggable("FragmentManager", 3)) {
            abstractC7805Jl1.f5682a.getClass();
        }
    }

    /* renamed from: c */
    public static final void m24400c(Fragment fragment, String str) {
        O90.m5968f(fragment, "fragment");
        O90.m5968f(str, "previousFragmentId");
        m24399b(new C6496nY(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str));
        m24398a(fragment).getClass();
    }
}
