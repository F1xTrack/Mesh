package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;

/* loaded from: classes.dex */
public final class D1 implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ AccessibilityInfoModule a;

    public D1(AccessibilityInfoModule accessibilityInfoModule) {
        this.a = accessibilityInfoModule;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.a.updateAndSendAccessibilityServiceChangeEvent(z);
    }
}
