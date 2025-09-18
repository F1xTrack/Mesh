package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: eW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3596eW0 extends a {
    public final S91 a;
    public int b;
    public boolean c;
    public float d;
    public int e;
    public boolean f;
    public final C2530cW0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3596eW0(S91 s91) {
        super(s91);
        O90.f(s91, "reactContext");
        this.a = s91;
        C3406dW0 c3406dW0 = new C3406dW0(this);
        Activity currentActivity = s91.a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        O90.e(decorView, "getDecorView(...)");
        AbstractC6897rk1.p(decorView, c3406dW0);
        this.g = new C2530cW0(0, this);
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.b > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final RV0 getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof RV0) {
            return (RV0) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<RV0> getSheetBehavior() {
        RV0 screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent.getSheetBehavior();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final int m(C3596eW0 c3596eW0, float f) {
        RV0 screenParent = c3596eW0.getScreenParent();
        if (screenParent != null) {
            return screenParent.getTop();
        }
        return (int) ((f * c3596eW0.q(3)) + ((1.0f - f) * c3596eW0.q(4)));
    }

    public final ReactContext getReactContext() {
        return this.a;
    }

    public final void n(int i, int i2, int i3, int i4) {
        int iMax = ((i - i2) - i3) - Math.max(i4, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    public final void o(int i) {
        this.b = i;
        int reactHeight = getReactHeight();
        BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        n(i, reactHeight, q(sheetBehavior.L), 0);
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            p(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null || !this.f) {
            return;
        }
        sheetBehavior.W.remove(this.g);
        this.f = false;
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getHasReceivedInitialLayoutFromParent()) {
            int i5 = this.b;
            int i6 = i4 - i2;
            BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
            if (sheetBehavior == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            n(i5, i6, q(sheetBehavior.L), this.e);
        }
    }

    public final void p(BottomSheetBehavior bottomSheetBehavior) {
        if (this.f) {
            return;
        }
        bottomSheetBehavior.s(this.g);
        this.f = true;
    }

    public final int q(int i) {
        BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 3) {
            return sheetBehavior.z();
        }
        if (i == 4) {
            return this.b - (sheetBehavior.f ? -1 : sheetBehavior.e);
        }
        if (i == 5) {
            return this.b;
        }
        if (i == 6) {
            return (int) ((1 - sheetBehavior.F) * this.b);
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }
}
