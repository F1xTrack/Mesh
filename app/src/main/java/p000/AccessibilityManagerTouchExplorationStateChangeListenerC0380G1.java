package p000;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* renamed from: G1 */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0380G1 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final C0267EE f3527a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0380G1(C0267EE c0267ee) {
        this.f3527a = c0267ee;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0380G1) {
            return this.f3527a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0380G1) obj).f3527a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3527a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C4237iM c4237iM = (C4237iM) this.f3527a.f2543b;
        AutoCompleteTextView autoCompleteTextView = c4237iM.f29099h;
        if (autoCompleteTextView == null || AbstractC11105t02.m24824c(autoCompleteTextView)) {
            return;
        }
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        c4237iM.f1353d.setImportantForAccessibility(i);
    }
}
