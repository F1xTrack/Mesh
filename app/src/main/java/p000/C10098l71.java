package p000;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: l71 */
/* loaded from: classes.dex */
public final class C10098l71 extends F02 {

    /* renamed from: a */
    public int f36916a;

    /* renamed from: b */
    public int f36917b = -1;

    /* renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f36918c;

    public C10098l71(SwipeDismissBehavior swipeDismissBehavior) {
        this.f36918c = swipeDismissBehavior;
    }

    @Override // p000.F02
    /* renamed from: a */
    public final int mo1635a(int i, View view) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f36918c.f18086d;
        if (i2 == 0) {
            if (z) {
                width = this.f36916a - view.getWidth();
                width2 = this.f36916a;
            } else {
                width = this.f36916a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f36916a - view.getWidth();
            width2 = view.getWidth() + this.f36916a;
        } else if (z) {
            width = this.f36916a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f36916a - view.getWidth();
            width2 = this.f36916a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p000.F02
    /* renamed from: b */
    public final int mo1636b(int i, View view) {
        return view.getTop();
    }

    @Override // p000.F02
    /* renamed from: d */
    public final int mo1637d(View view) {
        return view.getWidth();
    }

    @Override // p000.F02
    /* renamed from: h */
    public final void mo1640h(int i, View view) {
        this.f36917b = i;
        this.f36916a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f36918c;
            swipeDismissBehavior.f18085c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f18085c = false;
        }
    }

    @Override // p000.F02
    /* renamed from: i */
    public final void mo1641i(int i) {
        this.f36918c.getClass();
    }

    @Override // p000.F02
    /* renamed from: j */
    public final void mo1642j(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f36918c;
        float f = width * swipeDismissBehavior.f18087e;
        float width2 = view.getWidth() * swipeDismissBehavior.f18088f;
        float fAbs = Math.abs(i - this.f36916a);
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
    @Override // p000.F02
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1643k(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f36917b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f36918c
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = p000.AbstractC10944rk1.f41842a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f18086d
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
            int r5 = r8.f36916a
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
            int r0 = r8.f36916a
            if (r10 >= r0) goto L62
            goto L64
        L62:
            int r0 = r0 + r11
            goto L6c
        L64:
            int r10 = r8.f36916a
            int r0 = r10 - r11
            goto L6c
        L69:
            int r0 = r8.f36916a
            r2 = r4
        L6c:
            wk1 r10 = r3.f18083a
            int r11 = r9.getTop()
            boolean r10 = r10.m25690p(r0, r11)
            if (r10 == 0) goto L82
            XZ r10 = new XZ
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = p000.AbstractC10944rk1.f41842a
            r9.postOnAnimation(r10)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10098l71.mo1643k(android.view.View, float, float):void");
    }

    @Override // p000.F02
    /* renamed from: l */
    public final boolean mo1644l(int i, View view) {
        int i2 = this.f36917b;
        return (i2 == -1 || i2 == i) && this.f36918c.mo11188s(view);
    }
}
