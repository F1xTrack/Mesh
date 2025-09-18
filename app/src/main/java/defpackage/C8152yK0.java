package defpackage;

import com.facebook.react.views.view.a;

/* renamed from: yK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8152yK0 extends a {
    public int a;

    @Override // android.view.View, android.view.ViewParent
    public int getLayoutDirection() {
        return AbstractC6792rB1.b() ? super.getLayoutDirection() : this.a;
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            setLeft(0);
            setTop(i2);
            setRight(i3 - i);
            setBottom(i4);
        }
    }

    @Override // com.facebook.react.views.view.a
    public void setRemoveClippedSubviews(boolean z) {
        if (getLayoutDirection() == 1) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z);
        }
    }
}
