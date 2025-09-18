package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G1 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final EE a;

    public G1(EE ee) {
        this.a = ee;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G1) {
            return this.a.equals(((G1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C4329iM c4329iM = (C4329iM) this.a.b;
        AutoCompleteTextView autoCompleteTextView = c4329iM.h;
        if (autoCompleteTextView == null || AbstractC7138t02.c(autoCompleteTextView)) {
            return;
        }
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        c4329iM.d.setImportantForAccessibility(i);
    }
}
