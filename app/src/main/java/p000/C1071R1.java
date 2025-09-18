package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: R1 */
/* loaded from: classes.dex */
public class C1071R1 extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final QQ0 f9926a;

    public C1071R1(QQ0 qq0) {
        this.f9926a = qq0;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1009Q1 c1009q1Mo6687F = this.f9926a.mo6687F(i);
        if (c1009q1Mo6687F == null) {
            return null;
        }
        return c1009q1Mo6687F.f9401a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f9926a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C1009Q1 c1009q1Mo6688G = this.f9926a.mo6688G(i);
        if (c1009q1Mo6688G == null) {
            return null;
        }
        return c1009q1Mo6688G.f9401a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f9926a.mo6690J(i, i2, bundle);
    }
}
