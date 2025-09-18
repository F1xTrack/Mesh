package p000;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* renamed from: yL */
/* loaded from: classes.dex */
public final class C7195yL extends C0002A1 {

    /* renamed from: d */
    public final Rect f46191d = new Rect();

    /* renamed from: e */
    public final /* synthetic */ AbstractC0274EL f46192e;

    public C7195yL(AbstractC0274EL abstractC0274EL) {
        this.f46192e = abstractC0274EL;
    }

    @Override // p000.C0002A1
    /* renamed from: a */
    public final boolean mo8a(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return this.f11a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        AbstractC0274EL abstractC0274EL = this.f46192e;
        View viewM2153f = abstractC0274EL.m2153f();
        if (viewM2153f == null) {
            return true;
        }
        int iM2155h = abstractC0274EL.m2155h(viewM2153f);
        abstractC0274EL.getClass();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        Gravity.getAbsoluteGravity(iM2155h, abstractC0274EL.getLayoutDirection());
        return true;
    }

    @Override // p000.C0002A1
    /* renamed from: c */
    public final void mo10c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo10c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        boolean z = AbstractC0274EL.f2610F;
        View.AccessibilityDelegate accessibilityDelegate = this.f11a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
        if (z) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            c1009q1.f9402b = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            Rect rect = this.f46191d;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            c1009q1.m6539k(accessibilityNodeInfoObtain.getClassName());
            c1009q1.m6540l(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            c1009q1.m6530a(accessibilityNodeInfoObtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (AbstractC0274EL.m2144j(childAt)) {
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }
        c1009q1.m6539k("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0695L1.f6452e.f6463a);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0695L1.f6453f.f6463a);
    }

    @Override // p000.C0002A1
    /* renamed from: f */
    public final boolean mo13f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (AbstractC0274EL.f2610F || AbstractC0274EL.m2144j(view)) {
            return this.f11a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
