package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: dk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3449dk1 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap a = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.a.entrySet()) {
                View view = (View) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                boolean z = view.isShown() && view.getWindowVisibility() == 0;
                if (zBooleanValue != z) {
                    AbstractC6897rk1.h(z ? 16 : 32, view);
                    entry.setValue(Boolean.valueOf(z));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
