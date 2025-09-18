package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1731m implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C1736r f16197a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C1732n f16198b;

    public ViewOnAttachStateChangeListenerC1731m(LayoutInflaterFactory2C1732n layoutInflaterFactory2C1732n, C1736r c1736r) {
        this.f16198b = layoutInflaterFactory2C1732n;
        this.f16197a = c1736r;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C1736r c1736r = this.f16197a;
        c1736r.m10102i();
        C1724f.m10024h((ViewGroup) c1736r.f16262c.mView.getParent(), this.f16198b.f16199a).m10029g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
