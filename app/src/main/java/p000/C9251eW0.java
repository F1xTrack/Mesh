package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.C1932a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: eW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9251eW0 extends C1932a {

    /* renamed from: a */
    public final S91 f26729a;

    /* renamed from: b */
    public int f26730b;

    /* renamed from: c */
    public boolean f26731c;

    /* renamed from: d */
    public float f26732d;

    /* renamed from: e */
    public int f26733e;

    /* renamed from: f */
    public boolean f26734f;

    /* renamed from: g */
    public final C8990cW0 f26735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9251eW0(S91 s91) {
        super(s91);
        O90.m5968f(s91, "reactContext");
        this.f26729a = s91;
        C9123dW0 c9123dW0 = new C9123dW0(this);
        Activity currentActivity = s91.f10602a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        O90.m5967e(decorView, "getDecorView(...)");
        AbstractC10944rk1.m24484p(decorView, c9123dW0);
        this.f26735g = new C8990cW0(0, this);
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.f26730b > 0;
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

    /* renamed from: m */
    public static final int m18000m(C9251eW0 c9251eW0, float f) {
        RV0 screenParent = c9251eW0.getScreenParent();
        if (screenParent != null) {
            return screenParent.getTop();
        }
        return (int) ((f * c9251eW0.m18004q(3)) + ((1.0f - f) * c9251eW0.m18004q(4)));
    }

    public final ReactContext getReactContext() {
        return this.f26729a;
    }

    /* renamed from: n */
    public final void m18001n(int i, int i2, int i3, int i4) {
        int iMax = ((i - i2) - i3) - Math.max(i4, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    /* renamed from: o */
    public final void m18002o(int i) {
        this.f26730b = i;
        int reactHeight = getReactHeight();
        BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        m18001n(i, reactHeight, m18004q(sheetBehavior.f18101L), 0);
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            m18003p(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null || !this.f26734f) {
            return;
        }
        sheetBehavior.f18112W.remove(this.f26735g);
        this.f26734f = false;
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getHasReceivedInitialLayoutFromParent()) {
            int i5 = this.f26730b;
            int i6 = i4 - i2;
            BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
            if (sheetBehavior == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            m18001n(i5, i6, m18004q(sheetBehavior.f18101L), this.f26733e);
        }
    }

    /* renamed from: p */
    public final void m18003p(BottomSheetBehavior bottomSheetBehavior) {
        if (this.f26734f) {
            return;
        }
        bottomSheetBehavior.m11208s(this.f26735g);
        this.f26734f = true;
    }

    /* renamed from: q */
    public final int m18004q(int i) {
        BottomSheetBehavior<RV0> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 3) {
            return sheetBehavior.m11213z();
        }
        if (i == 4) {
            return this.f26730b - (sheetBehavior.f18125f ? -1 : sheetBehavior.f18124e);
        }
        if (i == 5) {
            return this.f26730b;
        }
        if (i == 6) {
            return (int) ((1 - sheetBehavior.f18095F) * this.f26730b);
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }
}
