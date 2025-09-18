package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import ru.mes.dnevnik.R;

/* renamed from: zL */
/* loaded from: classes.dex */
public final class C7258zL extends C0002A1 {

    /* renamed from: d */
    public final /* synthetic */ int f46793d;

    public /* synthetic */ C7258zL(int i) {
        this.f46793d = i;
    }

    @Override // p000.C0002A1
    /* renamed from: c */
    public void mo10c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f46793d) {
            case 4:
                super.mo10c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            case 5:
                super.mo10c(view, accessibilityEvent);
                EnumC11528wJ0 enumC11528wJ0 = (EnumC11528wJ0) view.getTag(R.id.accessibility_role);
                if (enumC11528wJ0 != null) {
                    accessibilityEvent.setClassName(EnumC11528wJ0.m25595c(enumC11528wJ0));
                    break;
                }
                break;
            default:
                super.mo10c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        int scrollRange;
        switch (this.f46793d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f11a;
                AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!AbstractC0274EL.m2144j(view)) {
                    accessibilityNodeInfo.setParent(null);
                    break;
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f11a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1009q1.f9401a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 2:
                this.f11a.onInitializeAccessibilityNodeInfo(view, c1009q1.f9401a);
                c1009q1.m6543o(false);
                break;
            case 3:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f11a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = c1009q1.f9401a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                break;
            case 4:
                this.f11a.onInitializeAccessibilityNodeInfo(view, c1009q1.f9401a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c1009q1.m6539k(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    c1009q1.m6543o(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c1009q1.m6531b(C0695L1.f6457j);
                        c1009q1.m6531b(C0695L1.f6461n);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c1009q1.m6531b(C0695L1.f6456i);
                        c1009q1.m6531b(C0695L1.f6462o);
                        break;
                    }
                }
                break;
            default:
                this.f11a.onInitializeAccessibilityNodeInfo(view, c1009q1.f9401a);
                EnumC11528wJ0 enumC11528wJ0M25594b = EnumC11528wJ0.m25594b(view);
                if (enumC11528wJ0M25594b != null) {
                    c1009q1.m6539k(EnumC11528wJ0.m25595c(enumC11528wJ0M25594b));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // p000.C0002A1
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo14g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f46793d
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.mo14g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.mo14g(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La0
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1f
        L1c:
            r0 = r1
            goto La0
        L1f:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3c
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3c
            int r7 = r2.height()
        L3c:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L76
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4f
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4f
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L76
            goto L1c
        L4f:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m9997v(r1, r6, r0)
            goto La0
        L76:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m9997v(r1, r6, r0)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7258zL.mo14g(android.view.View, int, android.os.Bundle):boolean");
    }
}
