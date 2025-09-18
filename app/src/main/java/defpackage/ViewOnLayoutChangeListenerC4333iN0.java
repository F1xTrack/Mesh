package defpackage;

import android.view.View;
import com.facebook.react.views.view.a;

/* renamed from: iN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC4333iN0 implements View.OnLayoutChangeListener {
    public final a a;

    public ViewOnLayoutChangeListenerC4333iN0(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a aVar = this.a;
        if (aVar.getRemoveClippedSubviews()) {
            a.d(aVar, view);
        }
    }
}
