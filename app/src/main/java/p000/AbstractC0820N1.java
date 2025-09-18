package p000;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: N1 */
/* loaded from: classes.dex */
public abstract class AbstractC0820N1 {
    /* renamed from: a */
    public static C0946P1 m5510a(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build();
        return new C0946P1();
    }

    /* renamed from: b */
    public static C1009Q1 m5511b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
        if (child != null) {
            return new C1009Q1(child, 0);
        }
        return null;
    }

    /* renamed from: c */
    public static String m5512c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* renamed from: d */
    public static String m5513d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m5514e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* renamed from: f */
    public static C1009Q1 m5515f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new C1009Q1(parent, 0);
        }
        return null;
    }

    /* renamed from: g */
    public static String m5516g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* renamed from: h */
    public static boolean m5517h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* renamed from: i */
    public static void m5518i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setTextSelectable(z);
    }

    /* renamed from: j */
    public static void m5519j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
