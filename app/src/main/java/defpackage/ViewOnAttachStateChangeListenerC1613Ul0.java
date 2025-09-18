package defpackage;

import android.view.View;

/* renamed from: Ul0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1613Ul0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C1145Ol0 b;

    public ViewOnAttachStateChangeListenerC1613Ul0(C1145Ol0 c1145Ol0, boolean z) {
        this.a = z;
        this.b = c1145Ol0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O90.f(view, "v");
        C1145Ol0 c1145Ol0 = (C1145Ol0) view;
        boolean z = this.a;
        C1145Ol0 c1145Ol02 = this.b;
        if (z) {
            c1145Ol02.e();
        } else {
            c1145Ol02.n.add(EnumC0989Ml0.f);
            c1145Ol02.h.n();
        }
        c1145Ol0.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        O90.f(view, "v");
        ((C1145Ol0) view).removeOnAttachStateChangeListener(this);
    }
}
