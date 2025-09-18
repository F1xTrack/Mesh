package androidx.fragment.app;

import defpackage.InterfaceC2060a3;
import defpackage.InterfaceC7244tZ;

/* loaded from: classes.dex */
public final class k implements InterfaceC7244tZ {
    public final /* synthetic */ Fragment a;

    public k(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.InterfaceC7244tZ
    public final Object apply(Object obj) {
        Fragment fragment = this.a;
        Object obj2 = fragment.mHost;
        return obj2 instanceof InterfaceC2060a3 ? ((InterfaceC2060a3) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
    }
}
