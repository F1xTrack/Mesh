package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: l80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10099l80 extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ C10227m80 f36919a;

    public C10099l80(C10227m80 c10227m80) {
        this.f36919a = c10227m80;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f36919a.f37505h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
