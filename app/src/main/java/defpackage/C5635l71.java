package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: l71 */
/* loaded from: classes.dex */
public final class C5635l71 extends F02 {
    public int a;
    public int b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public C5635l71(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // defpackage.F02
    public final int a(int i, View view) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.c.d;
        if (i2 == 0) {
            if (z) {
                width = this.a - view.getWidth();
                width2 = this.a;
            } else {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.a - view.getWidth();
            width2 = view.getWidth() + this.a;
        } else if (z) {
            width = this.a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.a - view.getWidth();
            width2 = this.a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.F02
    public final int b(int i, View view) {
        return view.getTop();
    }

    @Override // defpackage.F02
    public final int d(View view) {
        return view.getWidth();
    }

    @Override // defpackage.F02
    public final void h(int i, View view) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // defpackage.F02
    public final void i(int i) {
        this.c.getClass();
    }

    @Override // defpackage.F02
    public final void j(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float fAbs = Math.abs(i - this.a);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0069  */
    @Override // defpackage.F02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.c
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = defpackage.AbstractC6897rk1.a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.d
            r7 = 2
            if (r6 != r7) goto L21
            goto L55
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L69
            goto L55
        L2a:
            if (r1 <= 0) goto L69
            goto L55
        L2d:
            if (r6 != r2) goto L69
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L69
            goto L55
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L69
            goto L55
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r3.getClass()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L69
        L55:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L64
            int r10 = r9.getLeft()
            int r0 = r8.a
            if (r10 >= r0) goto L62
            goto L64
        L62:
            int r0 = r0 + r11
            goto L6c
        L64:
            int r10 = r8.a
            int r0 = r10 - r11
            goto L6c
        L69:
            int r0 = r8.a
            r2 = r4
        L6c:
            wk1 r10 = r3.a
            int r11 = r9.getTop()
            boolean r10 = r10.p(r0, r11)
            if (r10 == 0) goto L82
            XZ r10 = new XZ
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = defpackage.AbstractC6897rk1.a
            r9.postOnAnimation(r10)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5635l71.k(android.view.View, float, float):void");
    }

    @Override // defpackage.F02
    public final boolean l(int i, View view) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.s(view);
    }
}
