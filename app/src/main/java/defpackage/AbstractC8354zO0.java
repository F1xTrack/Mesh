package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: zO0 */
/* loaded from: classes.dex */
public abstract class AbstractC8354zO0 {
    public C5772lr0 a;
    public RecyclerView b;
    public final C2192ak1 c;
    public final C2192ak1 d;
    public C2188aj0 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public AbstractC8354zO0() {
        C6446pN0 c6446pN0 = new C6446pN0(1, this);
        G10 g10 = new G10(27, this);
        this.c = new C2192ak1(c6446pN0);
        this.d = new C2192ak1(g10);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((AO0) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((AO0) view.getLayoutParams()).a.b();
    }

    public static C8164yO0 I(Context context, AttributeSet attributeSet, int i, int i2) {
        C8164yO0 c8164yO0 = new C8164yO0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZG0.a, i, i2);
        c8164yO0.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c8164yO0.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c8164yO0.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c8164yO0.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c8164yO0;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        Rect rect = ao0.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) ao0).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) ao0).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) ao0).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) ao0).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8354zO0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((AO0) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i);

    public final int B() {
        RecyclerView recyclerView = this.b;
        AbstractC6830rO0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final void B0(C2188aj0 c2188aj0) {
        C2188aj0 c2188aj02 = this.e;
        if (c2188aj02 != null && c2188aj0 != c2188aj02 && c2188aj02.e) {
            c2188aj02.i();
        }
        this.e = c2188aj0;
        RecyclerView recyclerView = this.b;
        NO0 no0 = recyclerView.e0;
        no0.g.removeCallbacks(no0);
        no0.c.abortAnimation();
        c2188aj0.b = recyclerView;
        c2188aj0.c = this;
        int i = c2188aj0.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.s1.a = i;
        c2188aj0.e = true;
        c2188aj0.d = true;
        c2188aj0.f = recyclerView.n.q(i);
        c2188aj0.b.e0.b();
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        return recyclerView.getLayoutDirection();
    }

    public boolean C0() {
        return false;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(FO0 fo0, KO0 ko0) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((AO0) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iO = recyclerView.f.O();
            for (int i2 = 0; i2 < iO; i2++) {
                recyclerView.f.N(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iO = recyclerView.f.O();
            for (int i2 = 0; i2 < iO; i2++) {
                recyclerView.f.N(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, FO0 fo0, KO0 ko0);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        FO0 fo0 = recyclerView.c;
        KO0 ko0 = recyclerView.s1;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC6830rO0 abstractC6830rO0 = this.b.m;
        if (abstractC6830rO0 != null) {
            accessibilityEvent.setItemCount(abstractC6830rO0.a());
        }
    }

    public void V(FO0 fo0, KO0 ko0, Q1 q1) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            q1.a(8192);
            q1.o(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            q1.a(4096);
            q1.o(true);
        }
        q1.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(fo0, ko0), x(fo0, ko0), false, 0));
    }

    public final void W(Q1 q1, View view) {
        OO0 oo0M = RecyclerView.M(view);
        if (oo0M == null || oo0M.i() || ((ArrayList) this.a.d).contains(oo0M.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        X(recyclerView.c, recyclerView.s1, view, q1);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r9, android.view.View r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8354zO0.b(int, android.view.View, boolean):void");
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract void d0(FO0 fo0, KO0 ko0);

    public abstract boolean e();

    public abstract void e0(KO0 ko0);

    public boolean f(AO0 ao0) {
        return ao0 != null;
    }

    public Parcelable g0() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[PHI: r3
  0x0061: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:63:0x007d, B:55:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i0(defpackage.FO0 r3, defpackage.KO0 r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r2.b
            r4 = 0
            if (r3 != 0) goto L6
            return r4
        L6:
            int r3 = r2.o
            int r6 = r2.n
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r2.b
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L2b
            androidx.recyclerview.widget.RecyclerView r1 = r2.b
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L2b
            int r3 = r0.height()
            int r6 = r0.width()
        L2b:
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 1
            if (r5 == r0) goto L63
            r0 = 8192(0x2000, float:1.148E-41)
            if (r5 == r0) goto L37
            r3 = r4
            r5 = r3
            goto L8a
        L37:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L4c
            int r5 = r2.G()
            int r3 = r3 - r5
            int r5 = r2.D()
            int r3 = r3 - r5
            int r3 = -r3
            goto L4d
        L4c:
            r3 = r4
        L4d:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L61
            int r5 = r2.E()
            int r6 = r6 - r5
            int r5 = r2.F()
            int r6 = r6 - r5
            int r5 = -r6
            goto L8a
        L61:
            r5 = r4
            goto L8a
        L63:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L76
            int r5 = r2.G()
            int r3 = r3 - r5
            int r5 = r2.D()
            int r3 = r3 - r5
            goto L77
        L76:
            r3 = r4
        L77:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L61
            int r5 = r2.E()
            int r6 = r6 - r5
            int r5 = r2.F()
            int r5 = r6 - r5
        L8a:
            if (r3 != 0) goto L8f
            if (r5 != 0) goto L8f
            return r4
        L8f:
            androidx.recyclerview.widget.RecyclerView r4 = r2.b
            r4.i0(r5, r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8354zO0.i0(FO0, KO0, int, android.os.Bundle):boolean");
    }

    public abstract int j(KO0 ko0);

    public final void j0(FO0 fo0) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.M(u(iV)).p()) {
                View viewU = u(iV);
                m0(iV);
                fo0.h(viewU);
            }
        }
    }

    public abstract int k(KO0 ko0);

    public final void k0(FO0 fo0) {
        ArrayList arrayList;
        int size = fo0.a.size();
        int i = size - 1;
        while (true) {
            arrayList = fo0.a;
            if (i < 0) {
                break;
            }
            View view = ((OO0) arrayList.get(i)).a;
            OO0 oo0M = RecyclerView.M(view);
            if (!oo0M.p()) {
                oo0M.o(false);
                if (oo0M.k()) {
                    this.b.removeDetachedView(view, false);
                }
                AbstractC7784wO0 abstractC7784wO0 = this.b.M;
                if (abstractC7784wO0 != null) {
                    abstractC7784wO0.d(oo0M);
                }
                oo0M.o(true);
                OO0 oo0M2 = RecyclerView.M(view);
                oo0M2.n = null;
                oo0M2.o = false;
                oo0M2.j &= -33;
                fo0.i(oo0M2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = fo0.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int l(KO0 ko0);

    public final void l0(View view, FO0 fo0) {
        C5772lr0 c5772lr0 = this.a;
        C3513e41 c3513e41 = (C3513e41) c5772lr0.b;
        int iIndexOfChild = ((RecyclerView) c3513e41.b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0617Hr) c5772lr0.c).z(iIndexOfChild)) {
                c5772lr0.b0(view);
            }
            c3513e41.S0(iIndexOfChild);
        }
        fo0.h(view);
    }

    public abstract int m(KO0 ko0);

    public final void m0(int i) {
        if (u(i) != null) {
            C5772lr0 c5772lr0 = this.a;
            int iQ = c5772lr0.Q(i);
            C3513e41 c3513e41 = (C3513e41) c5772lr0.b;
            View childAt = ((RecyclerView) c3513e41.b).getChildAt(iQ);
            if (childAt == null) {
                return;
            }
            if (((C0617Hr) c5772lr0.c).z(iQ)) {
                c5772lr0.b0(childAt);
            }
            c3513e41.S0(iQ);
        }
    }

    public abstract int n(KO0 ko0);

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean n0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.j
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.i0(r11, r10, r0)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8354zO0.n0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int o(KO0 ko0);

    public final void o0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(FO0 fo0) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            OO0 oo0M = RecyclerView.M(viewU);
            if (oo0M.p()) {
                if (RecyclerView.M1) {
                    oo0M.toString();
                }
            } else if (!oo0M.g() || oo0M.i() || this.b.m.b) {
                u(iV);
                this.a.H(iV);
                fo0.j(viewU);
                this.b.g.y(oo0M);
            } else {
                m0(iV);
                fo0.i(oo0M);
            }
        }
    }

    public abstract int p0(int i, FO0 fo0, KO0 ko0);

    public View q(int i) {
        int iV = v();
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = u(i2);
            OO0 oo0M = RecyclerView.M(viewU);
            if (oo0M != null && oo0M.b() == i && !oo0M.p() && (this.b.s1.g || !oo0M.i())) {
                return viewU;
            }
        }
        return null;
    }

    public abstract void q0(int i);

    public abstract AO0 r();

    public abstract int r0(int i, FO0 fo0, KO0 ko0);

    public AO0 s(Context context, AttributeSet attributeSet) {
        return new AO0(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public AO0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AO0 ? new AO0((AO0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new AO0((ViewGroup.MarginLayoutParams) layoutParams) : new AO0(layoutParams);
    }

    public final void t0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.P1) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.P1) {
            return;
        }
        this.o = 0;
    }

    public final View u(int i) {
        C5772lr0 c5772lr0 = this.a;
        if (c5772lr0 != null) {
            return c5772lr0.N(i);
        }
        return null;
    }

    public void u0(Rect rect, int i, int i2) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        this.b.setMeasuredDimension(g(i, iF, recyclerView.getMinimumWidth()), g(i2, iD, this.b.getMinimumHeight()));
    }

    public final int v() {
        C5772lr0 c5772lr0 = this.a;
        if (c5772lr0 != null) {
            return c5772lr0.O();
        }
        return 0;
    }

    public final void v0(int i, int i2) {
        int iV = v();
        if (iV == 0) {
            this.b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = u(i7);
            Rect rect = this.b.j;
            y(viewU, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.j.set(i6, i4, i3, i5);
        u0(this.b.j, i, i2);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.f;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public int x(FO0 fo0, KO0 ko0) {
        return -1;
    }

    public final boolean x0(View view, int i, int i2, AO0 ao0) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) ao0).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) ao0).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        boolean z = RecyclerView.L1;
        AO0 ao0 = (AO0) view.getLayoutParams();
        Rect rect2 = ao0.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) ao0).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) ao0).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) ao0).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) ao0).bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i, int i2, AO0 ao0) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) ao0).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) ao0).height)) ? false : true;
    }

    public void Q() {
    }

    public void Z() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void f0(Parcelable parcelable) {
    }

    public void h0(int i) {
    }

    public void Y(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void c0(int i, int i2) {
    }

    public void i(int i, C5583ks c5583ks) {
    }

    public void X(FO0 fo0, KO0 ko0, View view, Q1 q1) {
    }

    public void h(int i, int i2, KO0 ko0, C5583ks c5583ks) {
    }
}
