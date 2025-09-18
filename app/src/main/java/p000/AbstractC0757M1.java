package p000;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: M1 */
/* loaded from: classes.dex */
public abstract class AbstractC0757M1 {
    /* renamed from: a */
    public static Object m5179a(int i, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
    }

    /* renamed from: b */
    public static CharSequence m5180b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: c */
    public static void m5181c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
