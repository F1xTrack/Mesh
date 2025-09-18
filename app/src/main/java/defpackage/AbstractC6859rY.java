package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;

/* renamed from: rY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6859rY {
    public static final C6669qY a = C6669qY.a;

    public static C6669qY a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                O90.e(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(AbstractC0757Jl1 abstractC0757Jl1) {
        if (Log.isLoggable("FragmentManager", 3)) {
            abstractC0757Jl1.a.getClass();
        }
    }

    public static final void c(Fragment fragment, String str) {
        O90.f(fragment, "fragment");
        O90.f(str, "previousFragmentId");
        b(new C6096nY(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str));
        a(fragment).getClass();
    }
}
