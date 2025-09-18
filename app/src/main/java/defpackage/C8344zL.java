package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import ru.mes.dnevnik.R;

/* renamed from: zL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8344zL extends A1 {
    public final /* synthetic */ int d;

    public /* synthetic */ C8344zL(int i) {
        this.d = i;
    }

    @Override // defpackage.A1
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 4:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            case 5:
                super.c(view, accessibilityEvent);
                EnumC7769wJ0 enumC7769wJ0 = (EnumC7769wJ0) view.getTag(R.id.accessibility_role);
                if (enumC7769wJ0 != null) {
                    accessibilityEvent.setClassName(EnumC7769wJ0.c(enumC7769wJ0));
                    break;
                }
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.A1
    public final void d(Q1 q1, View view) {
        int scrollRange;
        switch (this.d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.a;
                AccessibilityNodeInfo accessibilityNodeInfo = q1.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!EL.j(view)) {
                    accessibilityNodeInfo.setParent(null);
                    break;
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = q1.a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 2:
                this.a.onInitializeAccessibilityNodeInfo(view, q1.a);
                q1.o(false);
                break;
            case 3:
                View.AccessibilityDelegate accessibilityDelegate3 = this.a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = q1.a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                break;
            case 4:
                this.a.onInitializeAccessibilityNodeInfo(view, q1.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                q1.k(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    q1.o(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        q1.b(L1.j);
                        q1.b(L1.n);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        q1.b(L1.i);
                        q1.b(L1.o);
                        break;
                    }
                }
                break;
            default:
                this.a.onInitializeAccessibilityNodeInfo(view, q1.a);
                EnumC7769wJ0 enumC7769wJ0B = EnumC7769wJ0.b(view);
                if (enumC7769wJ0B != null) {
                    q1.k(EnumC7769wJ0.c(enumC7769wJ0B));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // defpackage.A1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.d
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.g(r5, r6, r7)
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
            r5.v(r1, r6, r0)
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
            r5.v(r1, r6, r0)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8344zL.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
