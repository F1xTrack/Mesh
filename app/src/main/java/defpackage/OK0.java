package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class OK0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ QK0 b;

    public OK0(QK0 qk0, View view) {
        this.b = qk0;
        this.a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.i.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
