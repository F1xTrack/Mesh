package p000;

import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.C1932a;
import java.util.ArrayList;

/* renamed from: mz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10333mz0 extends C1932a {

    /* renamed from: a */
    public final WindowManager f38022a;

    /* renamed from: b */
    public final C10461nz0 f38023b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10333mz0(S91 s91) {
        super(s91);
        O90.m5968f(s91, "reactContext");
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(s91, getId());
        Object systemService = s91.getSystemService("window");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f38022a = (WindowManager) systemService;
        C10461nz0 c10461nz0 = new C10461nz0(s91);
        this.f38023b = c10461nz0;
        c10461nz0.setEventDispatcher$react_native_keyboard_controller_release(interfaceC6947uPM6091b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList arrayList) {
        O90.m5968f(arrayList, "outChildren");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.f38023b.addView(view, i);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        O90.m5968f(accessibilityEvent, "event");
        return false;
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        return this.f38023b.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f38023b.getChildCount();
    }

    public final G41 getStateWrapper() {
        return this.f38023b.getStateWrapper$react_native_keyboard_controller_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10461nz0 c10461nz0 = this.f38023b;
        if (c10461nz0.f38660f) {
            this.f38022a.removeView(c10461nz0);
        }
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f38023b.removeView(view);
        }
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup
    public final void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        C10461nz0 c10461nz0 = this.f38023b;
        c10461nz0.removeView(c10461nz0.getChildAt(i));
    }

    public final void setStateWrapper(G41 g41) {
        this.f38023b.setStateWrapper$react_native_keyboard_controller_release(g41);
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
