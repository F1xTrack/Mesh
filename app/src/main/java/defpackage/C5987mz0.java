package defpackage;

import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.a;
import java.util.ArrayList;

/* renamed from: mz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5987mz0 extends a {
    public final WindowManager a;
    public final C6178nz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5987mz0(S91 s91) {
        super(s91);
        O90.f(s91, "reactContext");
        InterfaceC7405uP interfaceC7405uPB = OZ1.b(s91, getId());
        Object systemService = s91.getSystemService("window");
        O90.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.a = (WindowManager) systemService;
        C6178nz0 c6178nz0 = new C6178nz0(s91);
        this.b = c6178nz0;
        c6178nz0.setEventDispatcher$react_native_keyboard_controller_release(interfaceC7405uPB);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList arrayList) {
        O90.f(arrayList, "outChildren");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.b.addView(view, i);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        O90.f(accessibilityEvent, "event");
        return false;
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        return this.b.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.b.getChildCount();
    }

    public final G41 getStateWrapper() {
        return this.b.getStateWrapper$react_native_keyboard_controller_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6178nz0 c6178nz0 = this.b;
        if (c6178nz0.f) {
            this.a.removeView(c6178nz0);
        }
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.b.removeView(view);
        }
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup
    public final void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        C6178nz0 c6178nz0 = this.b;
        c6178nz0.removeView(c6178nz0.getChildAt(i));
    }

    public final void setStateWrapper(G41 g41) {
        this.b.setStateWrapper$react_native_keyboard_controller_release(g41);
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
