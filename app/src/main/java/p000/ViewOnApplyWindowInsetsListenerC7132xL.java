package p000;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: xL */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC7132xL implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        AbstractC0274EL abstractC0274EL = (AbstractC0274EL) view;
        boolean z = false;
        boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
        abstractC0274EL.f2639x = windowInsets;
        abstractC0274EL.f2640y = z2;
        if (!z2 && abstractC0274EL.getBackground() == null) {
            z = true;
        }
        abstractC0274EL.setWillNotDraw(z);
        abstractC0274EL.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
