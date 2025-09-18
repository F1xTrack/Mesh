package p000;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: u91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11254u91 extends C0002A1 {

    /* renamed from: d */
    public final TextInputLayout f43542d;

    public C11254u91(TextInputLayout textInputLayout) {
        this.f43542d = textInputLayout;
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        View.AccessibilityDelegate accessibilityDelegate = this.f11a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f43542d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f18273F1;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C11244u41 c11244u41 = textInputLayout.f18300b;
        C6803s7 c6803s7 = c11244u41.f43486b;
        if (c6803s7.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c6803s7);
            accessibilityNodeInfo.setTraversalAfter(c6803s7);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c11244u41.f43488d);
        }
        if (!zIsEmpty) {
            c1009q1.m6544p(text);
        } else if (!TextUtils.isEmpty(string)) {
            c1009q1.m6544p(string);
            if (!z && placeholderText != null) {
                c1009q1.m6544p(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c1009q1.m6544p(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                c1009q1.m6541m(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c1009q1.m6544p(string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                c1009q1.m6537i(4, zIsEmpty);
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
        C6803s7 c6803s72 = textInputLayout.f18312j.f37522y;
        if (c6803s72 != null) {
            accessibilityNodeInfo.setLabelFor(c6803s72);
        }
        textInputLayout.f18302c.m699b().mo1173n(c1009q1);
    }

    @Override // p000.C0002A1
    /* renamed from: e */
    public final void mo12e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo12e(view, accessibilityEvent);
        this.f43542d.f18302c.m699b().mo1174o(accessibilityEvent);
    }
}
