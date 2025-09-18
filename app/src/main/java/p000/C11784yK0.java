package p000;

import com.facebook.react.views.view.C1932a;

/* renamed from: yK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11784yK0 extends C1932a {

    /* renamed from: a */
    public int f46190a;

    @Override // android.view.View, android.view.ViewParent
    public int getLayoutDirection() {
        return AbstractC10874rB1.m24211b() ? super.getLayoutDirection() : this.f46190a;
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            setLeft(0);
            setTop(i2);
            setRight(i3 - i);
            setBottom(i4);
        }
    }

    @Override // com.facebook.react.views.view.C1932a
    public void setRemoveClippedSubviews(boolean z) {
        if (getLayoutDirection() == 1) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z);
        }
    }
}
