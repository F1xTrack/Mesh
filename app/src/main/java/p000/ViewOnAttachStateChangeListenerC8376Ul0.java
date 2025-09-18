package p000;

import android.view.View;

/* renamed from: Ul0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC8376Ul0 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f12023a;

    /* renamed from: b */
    public final /* synthetic */ C8064Ol0 f12024b;

    public ViewOnAttachStateChangeListenerC8376Ul0(C8064Ol0 c8064Ol0, boolean z) {
        this.f12023a = z;
        this.f12024b = c8064Ol0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O90.m5968f(view, "v");
        C8064Ol0 c8064Ol0 = (C8064Ol0) view;
        boolean z = this.f12023a;
        C8064Ol0 c8064Ol02 = this.f12024b;
        if (z) {
            c8064Ol02.m6132e();
        } else {
            c8064Ol02.f8607n.add(EnumC7960Ml0.f7325f);
            c8064Ol02.f8601h.m22959n();
        }
        c8064Ol0.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        O90.m5968f(view, "v");
        ((C8064Ol0) view).removeOnAttachStateChangeListener(this);
    }
}
