package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: xL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC7964xL implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        EL el = (EL) view;
        boolean z = false;
        boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
        el.x = windowInsets;
        el.y = z2;
        if (!z2 && el.getBackground() == null) {
            z = true;
        }
        el.setWillNotDraw(z);
        el.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
