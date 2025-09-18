package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.C1932a;

/* loaded from: classes2.dex */
public final class BU0 extends C1932a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public InterfaceC6625pZ f840a;

    /* renamed from: b */
    public C1407WM f841b;

    /* renamed from: c */
    public C10003kO0 f842c;

    /* renamed from: l */
    public final void m731l() {
        C1407WM c1407wmM19039c;
        InterfaceC6625pZ interfaceC6625pZ = this.f840a;
        if (interfaceC6625pZ == null || (c1407wmM19039c = AbstractC9754iR1.m19039c(this)) == null) {
            return;
        }
        View rootView = getRootView();
        O90.m5966d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        C10003kO0 c10003kO0M19037a = AbstractC9754iR1.m19037a((ViewGroup) rootView, this);
        if (c10003kO0M19037a == null) {
            return;
        }
        if (O90.m5963a(this.f841b, c1407wmM19039c) && O90.m5963a(this.f842c, c10003kO0M19037a)) {
            return;
        }
        interfaceC6625pZ.mo300b(this, c1407wmM19039c, c10003kO0M19037a);
        this.f841b = c1407wmM19039c;
        this.f842c = c10003kO0M19037a;
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        m731l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m731l();
        return true;
    }

    public final void setOnInsetsChangeHandler(InterfaceC6625pZ interfaceC6625pZ) {
        this.f840a = interfaceC6625pZ;
        m731l();
    }
}
