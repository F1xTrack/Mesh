package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* renamed from: yL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8154yL extends A1 {
    public final Rect d = new Rect();
    public final /* synthetic */ EL e;

    public C8154yL(EL el) {
        this.e = el;
    }

    @Override // defpackage.A1
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        EL el = this.e;
        View viewF = el.f();
        if (viewF == null) {
            return true;
        }
        int iH = el.h(viewF);
        el.getClass();
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        Gravity.getAbsoluteGravity(iH, el.getLayoutDirection());
        return true;
    }

    @Override // defpackage.A1
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // defpackage.A1
    public final void d(Q1 q1, View view) {
        boolean z = EL.F;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = q1.a;
        if (z) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            q1.b = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            Rect rect = this.d;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            q1.k(accessibilityNodeInfoObtain.getClassName());
            q1.l(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            q1.a(accessibilityNodeInfoObtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (EL.j(childAt)) {
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }
        q1.k("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) L1.e.a);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) L1.f.a);
    }

    @Override // defpackage.A1
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (EL.F || EL.j(view)) {
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
