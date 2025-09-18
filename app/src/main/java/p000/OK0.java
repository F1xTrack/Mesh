package p000;

import android.view.View;

/* loaded from: classes.dex */
public final class OK0 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ View f8362a;

    /* renamed from: b */
    public final /* synthetic */ QK0 f8363b;

    public OK0(QK0 qk0, View view) {
        this.f8363b = qk0;
        this.f8362a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f8362a.removeOnAttachStateChangeListener(this);
        this.f8363b.f9573i.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
