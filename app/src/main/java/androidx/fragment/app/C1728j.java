package androidx.fragment.app;

import android.view.View;
import p000.AbstractC1544YX;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public final class C1728j extends AbstractC1544YX {

    /* renamed from: a */
    public final /* synthetic */ Fragment f16190a;

    public C1728j(Fragment fragment) {
        this.f16190a = fragment;
    }

    @Override // p000.AbstractC1544YX
    /* renamed from: b */
    public final View mo2122b(int i) {
        Fragment fragment = this.f16190a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a view");
    }

    @Override // p000.AbstractC1544YX
    /* renamed from: c */
    public final boolean mo2123c() {
        return this.f16190a.mView != null;
    }
}
