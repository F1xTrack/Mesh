package defpackage;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class QJ extends ViewGroup implements RJ0, InterfaceC4330iM0 {
    private final boolean getBlockGestures() {
        return !(Math.abs(getAlpha() - 0.0f) <= 1.0E-4f);
    }

    @Override // defpackage.InterfaceC4330iM0
    public XB0 getPointerEvents() {
        return getBlockGestures() ? XB0.e : XB0.b;
    }

    @Override // defpackage.RJ0
    public final boolean interceptsTouchEvent(float f, float f2) {
        return getBlockGestures();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBlockGestures()) {
            callOnClick();
        }
        return getBlockGestures();
    }

    @Override // defpackage.QJ0
    public final int reactTagForTouch(float f, float f2) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
