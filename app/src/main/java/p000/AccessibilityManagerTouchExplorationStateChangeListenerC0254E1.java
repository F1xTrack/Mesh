package p000;

import android.view.accessibility.AccessibilityManager;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;

/* renamed from: E1 */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0254E1 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ AccessibilityInfoModule f2341a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0254E1(AccessibilityInfoModule accessibilityInfoModule) {
        this.f2341a = accessibilityInfoModule;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f2341a.updateAndSendTouchExplorationChangeEvent(z);
    }
}
