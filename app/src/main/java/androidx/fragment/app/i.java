package androidx.fragment.app;

import android.os.Bundle;
import defpackage.LB1;
import defpackage.TX;

/* loaded from: classes.dex */
public final class i extends TX {
    public final /* synthetic */ Fragment a;

    public i(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.TX
    public final void a() {
        Fragment fragment = this.a;
        fragment.mSavedStateRegistryController.a();
        LB1.b(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
