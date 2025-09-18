package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: aj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2188aj0 {
    public int a = -1;
    public RecyclerView b;
    public AbstractC8354zO0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final C5272jE g;
    public final LinearInterpolator h;
    public final DecelerateInterpolator i;
    public PointF j;
    public final DisplayMetrics k;
    public boolean l;
    public float m;
    public int n;
    public int o;

    public C2188aj0(Context context) {
        C5272jE c5272jE = new C5272jE();
        c5272jE.d = -1;
        c5272jE.e = false;
        c5272jE.a = 0;
        c5272jE.b = 0;
        c5272jE.c = Integer.MIN_VALUE;
        c5272jE.f = null;
        this.g = c5272jE;
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.l = false;
        this.n = 0;
        this.o = 0;
        this.k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        AbstractC8354zO0 abstractC8354zO0 = this.c;
        if (abstractC8354zO0 == null || !abstractC8354zO0.d()) {
            return 0;
        }
        AO0 ao0 = (AO0) view.getLayoutParams();
        return a((view.getLeft() - ((AO0) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ao0).leftMargin, view.getRight() + ((AO0) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ao0).rightMargin, abstractC8354zO0.E(), abstractC8354zO0.n - abstractC8354zO0.F(), i);
    }

    public int c(View view, int i) {
        AbstractC8354zO0 abstractC8354zO0 = this.c;
        if (abstractC8354zO0 == null || !abstractC8354zO0.e()) {
            return 0;
        }
        AO0 ao0 = (AO0) view.getLayoutParams();
        return a((view.getTop() - ((AO0) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ao0).topMargin, view.getBottom() + ((AO0) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ao0).bottomMargin, abstractC8354zO0.G(), abstractC8354zO0.o - abstractC8354zO0.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.l) {
            this.m = d(this.k);
            this.l = true;
        }
        return (int) Math.ceil(fAbs * this.m);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof JO0) {
            return ((JO0) obj).a(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2188aj0.g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.view.View r7, defpackage.C5272jE r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.j
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.j
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.i
            r8.a = r0
            r8.b = r7
            r8.c = r2
            r8.f = r3
            r8.e = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2188aj0.h(android.view.View, jE):void");
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.o = 0;
            this.n = 0;
            this.j = null;
            this.b.s1.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            AbstractC8354zO0 abstractC8354zO0 = this.c;
            if (abstractC8354zO0.e == this) {
                abstractC8354zO0.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
