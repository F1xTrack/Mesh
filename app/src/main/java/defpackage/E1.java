package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;

/* loaded from: classes.dex */
public final class E1 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ AccessibilityInfoModule a;

    public E1(AccessibilityInfoModule accessibilityInfoModule) {
        this.a = accessibilityInfoModule;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.updateAndSendTouchExplorationChangeEvent(z);
    }
}
