package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: l80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5637l80 extends View.AccessibilityDelegate {
    public final /* synthetic */ C5828m80 a;

    public C5637l80(C5828m80 c5828m80) {
        this.a = c5828m80;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.a.h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
