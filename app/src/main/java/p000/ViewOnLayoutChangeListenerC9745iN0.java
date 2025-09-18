package p000;

import android.view.View;
import com.facebook.react.views.view.C1932a;

/* renamed from: iN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC9745iN0 implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final C1932a f29115a;

    public ViewOnLayoutChangeListenerC9745iN0(C1932a c1932a) {
        this.f29115a = c1932a;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1932a c1932a = this.f29115a;
        if (c1932a.getRemoveClippedSubviews()) {
            C1932a.m11058d(c1932a, view);
        }
    }
}
