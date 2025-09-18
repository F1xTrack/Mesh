package p000;

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
public class C8760aj0 {

    /* renamed from: a */
    public int f15637a = -1;

    /* renamed from: b */
    public RecyclerView f15638b;

    /* renamed from: c */
    public AbstractC11919zO0 f15639c;

    /* renamed from: d */
    public boolean f15640d;

    /* renamed from: e */
    public boolean f15641e;

    /* renamed from: f */
    public View f15642f;

    /* renamed from: g */
    public final C6224jE f15643g;

    /* renamed from: h */
    public final LinearInterpolator f15644h;

    /* renamed from: i */
    public final DecelerateInterpolator f15645i;

    /* renamed from: j */
    public PointF f15646j;

    /* renamed from: k */
    public final DisplayMetrics f15647k;

    /* renamed from: l */
    public boolean f15648l;

    /* renamed from: m */
    public float f15649m;

    /* renamed from: n */
    public int f15650n;

    /* renamed from: o */
    public int f15651o;

    public C8760aj0(Context context) {
        C6224jE c6224jE = new C6224jE();
        c6224jE.f34992d = -1;
        c6224jE.f34993e = false;
        c6224jE.f34989a = 0;
        c6224jE.f34990b = 0;
        c6224jE.f34991c = Integer.MIN_VALUE;
        c6224jE.f34994f = null;
        this.f15643g = c6224jE;
        this.f15644h = new LinearInterpolator();
        this.f15645i = new DecelerateInterpolator();
        this.f15648l = false;
        this.f15650n = 0;
        this.f15651o = 0;
        this.f15647k = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public static int m9789a(int i, int i2, int i3, int i4, int i5) {
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

    /* renamed from: b */
    public int mo9790b(View view, int i) {
        AbstractC11919zO0 abstractC11919zO0 = this.f15639c;
        if (abstractC11919zO0 == null || !abstractC11919zO0.mo10210d()) {
            return 0;
        }
        AO0 ao0 = (AO0) view.getLayoutParams();
        return m9789a((view.getLeft() - ((AO0) view.getLayoutParams()).f183b.left) - ((ViewGroup.MarginLayoutParams) ao0).leftMargin, view.getRight() + ((AO0) view.getLayoutParams()).f183b.right + ((ViewGroup.MarginLayoutParams) ao0).rightMargin, abstractC11919zO0.m26411E(), abstractC11919zO0.f46826n - abstractC11919zO0.m26412F(), i);
    }

    /* renamed from: c */
    public int mo9791c(View view, int i) {
        AbstractC11919zO0 abstractC11919zO0 = this.f15639c;
        if (abstractC11919zO0 == null || !abstractC11919zO0.mo10212e()) {
            return 0;
        }
        AO0 ao0 = (AO0) view.getLayoutParams();
        return m9789a((view.getTop() - ((AO0) view.getLayoutParams()).f183b.top) - ((ViewGroup.MarginLayoutParams) ao0).topMargin, view.getBottom() + ((AO0) view.getLayoutParams()).f183b.bottom + ((ViewGroup.MarginLayoutParams) ao0).bottomMargin, abstractC11919zO0.m26413G(), abstractC11919zO0.f46827o - abstractC11919zO0.m26410D(), i);
    }

    /* renamed from: d */
    public float mo9792d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: e */
    public int mo9793e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f15648l) {
            this.f15649m = mo9792d(this.f15647k);
            this.f15648l = true;
        }
        return (int) Math.ceil(fAbs * this.f15649m);
    }

    /* renamed from: f */
    public PointF mo9794f(int i) {
        Object obj = this.f15639c;
        if (obj instanceof JO0) {
            return ((JO0) obj).mo4305a(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9795g(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8760aj0.m9795g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo9796h(android.view.View r7, p000.C6224jE r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f15646j
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
            int r0 = r6.mo9790b(r7, r0)
            android.graphics.PointF r5 = r6.f15646j
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
            int r7 = r6.mo9791c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.mo9793e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.f15645i
            r8.f34989a = r0
            r8.f34990b = r7
            r8.f34991c = r2
            r8.f34994f = r3
            r8.f34993e = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8760aj0.mo9796h(android.view.View, jE):void");
    }

    /* renamed from: i */
    public final void m9797i() {
        if (this.f15641e) {
            this.f15641e = false;
            this.f15651o = 0;
            this.f15650n = 0;
            this.f15646j = null;
            this.f15638b.f16520s1.f6045a = -1;
            this.f15642f = null;
            this.f15637a = -1;
            this.f15640d = false;
            AbstractC11919zO0 abstractC11919zO0 = this.f15639c;
            if (abstractC11919zO0.f46817e == this) {
                abstractC11919zO0.f46817e = null;
            }
            this.f15639c = null;
            this.f15638b = null;
        }
    }
}
