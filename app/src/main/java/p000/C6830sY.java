package p000;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: sY */
/* loaded from: classes.dex */
public final class C6830sY extends AbstractC7805Jl1 {

    /* renamed from: b */
    public final ViewGroup f42481b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6830sY(Fragment fragment, ViewGroup viewGroup, int i) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        switch (i) {
            case 1:
                O90.m5968f(fragment, "fragment");
                super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f42481b = viewGroup;
                break;
            default:
                this.f42481b = viewGroup;
                break;
        }
    }
}
