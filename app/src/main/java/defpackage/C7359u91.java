package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: u91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7359u91 extends A1 {
    public final TextInputLayout d;

    public C7359u91(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.A1
    public final void d(Q1 q1, View view) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = q1.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.F1;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C7344u41 c7344u41 = textInputLayout.b;
        C6969s7 c6969s7 = c7344u41.b;
        if (c6969s7.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c6969s7);
            accessibilityNodeInfo.setTraversalAfter(c6969s7);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c7344u41.d);
        }
        if (!zIsEmpty) {
            q1.p(text);
        } else if (!TextUtils.isEmpty(string)) {
            q1.p(string);
            if (!z && placeholderText != null) {
                q1.p(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            q1.p(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                q1.m(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                q1.p(string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                q1.i(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C6969s7 c6969s72 = textInputLayout.j.y;
        if (c6969s72 != null) {
            accessibilityNodeInfo.setLabelFor(c6969s72);
        }
        textInputLayout.c.b().n(q1);
    }

    @Override // defpackage.A1
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.c.b().o(accessibilityEvent);
    }
}
