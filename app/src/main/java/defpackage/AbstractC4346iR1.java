package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: iR1 */
/* loaded from: classes.dex */
public abstract class AbstractC4346iR1 {
    public static final C5494kO0 a(ViewGroup viewGroup, View view) {
        O90.f(viewGroup, "rootView");
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            return new C5494kO0(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int b(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        String strF = AbstractC0759Jm0.f("CameraOrientationUtil");
        if (AbstractC0759Jm0.f <= 2 || Log.isLoggable(strF, 2)) {
            AbstractC0759Jm0.f("CameraOrientationUtil");
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.WM c(android.view.View r9) {
        /*
            java.lang.String r0 = "view"
            defpackage.O90.f(r9, r0)
            int r0 = r9.getHeight()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            android.view.View r0 = r9.getRootView()
            defpackage.O90.c(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L56
            android.view.WindowInsets r2 = r0.getRootWindowInsets()
            if (r2 == 0) goto L54
            int r3 = defpackage.AbstractC1542Tn1.a()
            int r4 = defpackage.AbstractC1542Tn1.s()
            r3 = r3 | r4
            int r4 = defpackage.AbstractC1542Tn1.k()
            r3 = r3 | r4
            int r4 = defpackage.AbstractC1542Tn1.m()
            r3 = r3 | r4
            android.graphics.Insets r2 = defpackage.M21.f(r2, r3)
            if (r2 != 0) goto L3a
            goto L54
        L3a:
            WM r3 = new WM
            int r4 = defpackage.AbstractC5866mL.a(r2)
            float r4 = (float) r4
            int r5 = defpackage.AbstractC5866mL.u(r2)
            float r5 = (float) r5
            int r6 = defpackage.AbstractC5866mL.A(r2)
            float r6 = (float) r6
            int r2 = defpackage.B1.a(r2)
            float r2 = (float) r2
            r3.<init>(r4, r5, r6, r2)
            goto L7e
        L54:
            r3 = r1
            goto L7e
        L56:
            android.view.WindowInsets r2 = r0.getRootWindowInsets()
            if (r2 != 0) goto L5d
            goto L54
        L5d:
            WM r3 = new WM
            int r4 = r2.getSystemWindowInsetTop()
            float r4 = (float) r4
            int r5 = r2.getSystemWindowInsetRight()
            float r5 = (float) r5
            int r6 = r2.getSystemWindowInsetBottom()
            int r7 = r2.getStableInsetBottom()
            int r6 = java.lang.Math.min(r6, r7)
            float r6 = (float) r6
            int r2 = r2.getSystemWindowInsetLeft()
            float r2 = (float) r2
            r3.<init>(r4, r5, r6, r2)
        L7e:
            if (r3 != 0) goto L81
            return r1
        L81:
            int r1 = r0.getWidth()
            float r1 = (float) r1
            int r0 = r0.getHeight()
            float r0 = (float) r0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r9.getGlobalVisibleRect(r2)
            WM r4 = new WM
            int r5 = r2.top
            float r5 = (float) r5
            float r6 = r3.a
            float r6 = r6 - r5
            r5 = 0
            float r6 = java.lang.Math.max(r6, r5)
            int r7 = r2.left
            int r8 = r9.getWidth()
            int r8 = r8 + r7
            float r7 = (float) r8
            float r7 = r7 - r1
            float r1 = java.lang.Math.min(r7, r5)
            float r7 = r3.b
            float r1 = r1 + r7
            float r1 = java.lang.Math.max(r1, r5)
            int r7 = r2.top
            int r9 = r9.getHeight()
            int r9 = r9 + r7
            float r9 = (float) r9
            float r9 = r9 - r0
            float r9 = java.lang.Math.min(r9, r5)
            float r0 = r3.c
            float r9 = r9 + r0
            float r9 = java.lang.Math.max(r9, r5)
            int r0 = r2.left
            float r0 = (float) r0
            float r2 = r3.d
            float r2 = r2 - r0
            float r0 = java.lang.Math.max(r2, r5)
            r4.<init>(r6, r1, r9, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4346iR1.c(android.view.View):WM");
    }

    public static int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Unsupported surface rotation: "));
    }
}
