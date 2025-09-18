package androidx.fragment.app;

import android.os.Bundle;
import p000.AbstractC1229TX;
import p000.LB1;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public final class C1727i extends AbstractC1229TX {

    /* renamed from: a */
    public final /* synthetic */ Fragment f16189a;

    public C1727i(Fragment fragment) {
        this.f16189a = fragment;
    }

    @Override // p000.AbstractC1229TX
    /* renamed from: a */
    public final void mo7030a() {
        Fragment fragment = this.f16189a;
        fragment.mSavedStateRegistryController.m22830a();
        LB1.m4918b(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.m22831b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
