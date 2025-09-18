package p000;

import android.view.accessibility.AccessibilityManager;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;

/* renamed from: D1 */
/* loaded from: classes.dex */
public final class AccessibilityManagerAccessibilityStateChangeListenerC0191D1 implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ AccessibilityInfoModule f1799a;

    public AccessibilityManagerAccessibilityStateChangeListenerC0191D1(AccessibilityInfoModule accessibilityInfoModule) {
        this.f1799a = accessibilityInfoModule;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f1799a.updateAndSendAccessibilityServiceChangeEvent(z);
    }
}
