package androidx.fragment.app;

import p000.InterfaceC1640a3;
import p000.InterfaceC6894tZ;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public final class C1729k implements InterfaceC6894tZ {

    /* renamed from: a */
    public final /* synthetic */ Fragment f16191a;

    public C1729k(Fragment fragment) {
        this.f16191a = fragment;
    }

    @Override // p000.InterfaceC6894tZ
    public final Object apply(Object obj) {
        Fragment fragment = this.f16191a;
        Object obj2 = fragment.mHost;
        return obj2 instanceof InterfaceC1640a3 ? ((InterfaceC1640a3) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
    }
}
