package androidx.fragment.app;

import android.view.View;
import defpackage.YX;

/* loaded from: classes.dex */
public final class j extends YX {
    public final /* synthetic */ Fragment a;

    public j(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.YX
    public final View b(int i) {
        Fragment fragment = this.a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a view");
    }

    @Override // defpackage.YX
    public final boolean c() {
        return this.a.mView != null;
    }
}
