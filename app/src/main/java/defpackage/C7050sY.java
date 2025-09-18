package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: sY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7050sY extends AbstractC0757Jl1 {
    public final ViewGroup b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7050sY(Fragment fragment, ViewGroup viewGroup, int i) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        switch (i) {
            case 1:
                O90.f(fragment, "fragment");
                super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.b = viewGroup;
                break;
            default:
                this.b = viewGroup;
                break;
        }
    }
}
