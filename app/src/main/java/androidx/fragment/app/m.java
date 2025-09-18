package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class m implements View.OnAttachStateChangeListener {
    public final /* synthetic */ r a;
    public final /* synthetic */ n b;

    public m(n nVar, r rVar) {
        this.b = nVar;
        this.a = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        r rVar = this.a;
        rVar.i();
        f.h((ViewGroup) rVar.c.mView.getParent(), this.b.a).g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
