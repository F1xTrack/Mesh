package p000;

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
public abstract class AbstractC11919zO0 {

    /* renamed from: a */
    public C10189lr0 f46813a;

    /* renamed from: b */
    public RecyclerView f46814b;

    /* renamed from: c */
    public final C8763ak1 f46815c;

    /* renamed from: d */
    public final C8763ak1 f46816d;

    /* renamed from: e */
    public C8760aj0 f46817e;

    /* renamed from: f */
    public boolean f46818f;

    /* renamed from: g */
    public boolean f46819g;

    /* renamed from: h */
    public final boolean f46820h;

    /* renamed from: i */
    public final boolean f46821i;

    /* renamed from: j */
    public int f46822j;

    /* renamed from: k */
    public boolean f46823k;

    /* renamed from: l */
    public int f46824l;

    /* renamed from: m */
    public int f46825m;

    /* renamed from: n */
    public int f46826n;

    /* renamed from: o */
    public int f46827o;

    public AbstractC11919zO0() {
        C10641pN0 c10641pN0 = new C10641pN0(1, this);
        G10 g10 = new G10(27, this);
        this.f46815c = new C8763ak1(c10641pN0);
        this.f46816d = new C8763ak1(g10);
        this.f46818f = false;
        this.f46819g = false;
        this.f46820h = true;
        this.f46821i = true;
    }

    /* renamed from: A */
    public static int m26399A(View view) {
        Rect rect = ((AO0) view.getLayoutParams()).f183b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: H */
    public static int m26400H(View view) {
        return ((AO0) view.getLayoutParams()).f182a.m6045b();
    }

    /* renamed from: I */
    public static C11792yO0 m26401I(Context context, AttributeSet attributeSet, int i, int i2) {
        C11792yO0 c11792yO0 = new C11792yO0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZG0.f14841a, i, i2);
        c11792yO0.f46248a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c11792yO0.f46249b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c11792yO0.f46250c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c11792yO0.f46251d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c11792yO0;
    }

    /* renamed from: M */
    public static boolean m26402M(int i, int i2, int i3) {
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

    /* renamed from: N */
    public static void m26403N(View view, int i, int i2, int i3, int i4) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        Rect rect = ao0.f183b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) ao0).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) ao0).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) ao0).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) ao0).bottomMargin);
    }

    /* renamed from: g */
    public static int m26404g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0022  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m26405w(boolean r4, int r5, int r6, int r7, int r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11919zO0.m26405w(boolean, int, int, int, int):int");
    }

    /* renamed from: z */
    public static int m26406z(View view) {
        Rect rect = ((AO0) view.getLayoutParams()).f183b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: A0 */
    public abstract void mo9354A0(RecyclerView recyclerView, int i);

    /* renamed from: B */
    public final int m26407B() {
        RecyclerView recyclerView = this.f46814b;
        AbstractC10899rO0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo3173a();
        }
        return 0;
    }

    /* renamed from: B0 */
    public final void m26408B0(C8760aj0 c8760aj0) {
        C8760aj0 c8760aj02 = this.f46817e;
        if (c8760aj02 != null && c8760aj0 != c8760aj02 && c8760aj02.f15641e) {
            c8760aj02.m9797i();
        }
        this.f46817e = c8760aj0;
        RecyclerView recyclerView = this.f46814b;
        NO0 no0 = recyclerView.f16503e0;
        no0.f7753g.removeCallbacks(no0);
        no0.f7749c.abortAnimation();
        c8760aj0.f15638b = recyclerView;
        c8760aj0.f15639c = this;
        int i = c8760aj0.f15637a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f16520s1.f6045a = i;
        c8760aj0.f15641e = true;
        c8760aj0.f15640d = true;
        c8760aj0.f15642f = recyclerView.f16512n.mo10222q(i);
        c8760aj0.f15638b.f16503e0.m5669b();
    }

    /* renamed from: C */
    public final int m26409C() {
        RecyclerView recyclerView = this.f46814b;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        return recyclerView.getLayoutDirection();
    }

    /* renamed from: C0 */
    public boolean mo10147C0() {
        return false;
    }

    /* renamed from: D */
    public final int m26410D() {
        RecyclerView recyclerView = this.f46814b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: E */
    public final int m26411E() {
        RecyclerView recyclerView = this.f46814b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: F */
    public final int m26412F() {
        RecyclerView recyclerView = this.f46814b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: G */
    public final int m26413G() {
        RecyclerView recyclerView = this.f46814b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: J */
    public int mo10149J(FO0 fo0, KO0 ko0) {
        return -1;
    }

    /* renamed from: K */
    public final void m26414K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((AO0) view.getLayoutParams()).f183b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f46814b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f46814b.f16510l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: L */
    public abstract boolean mo10191L();

    /* renamed from: O */
    public void mo10300O(int i) {
        RecyclerView recyclerView = this.f46814b;
        if (recyclerView != null) {
            int iM22557O = recyclerView.f16504f.m22557O();
            for (int i2 = 0; i2 < iM22557O; i2++) {
                recyclerView.f16504f.m22556N(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* renamed from: P */
    public void mo10302P(int i) {
        RecyclerView recyclerView = this.f46814b;
        if (recyclerView != null) {
            int iM22557O = recyclerView.f16504f.m22557O();
            for (int i2 = 0; i2 < iM22557O; i2++) {
                recyclerView.f16504f.m22556N(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* renamed from: S */
    public abstract void mo10198S(RecyclerView recyclerView);

    /* renamed from: T */
    public abstract View mo10151T(View view, int i, FO0 fo0, KO0 ko0);

    /* renamed from: U */
    public void mo10201U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f46814b;
        FO0 fo0 = recyclerView.f16498c;
        KO0 ko0 = recyclerView.f16520s1;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f46814b.canScrollVertically(-1) && !this.f46814b.canScrollHorizontally(-1) && !this.f46814b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC10899rO0 abstractC10899rO0 = this.f46814b.f16511m;
        if (abstractC10899rO0 != null) {
            accessibilityEvent.setItemCount(abstractC10899rO0.mo3173a());
        }
    }

    /* renamed from: V */
    public void mo10152V(FO0 fo0, KO0 ko0, C1009Q1 c1009q1) {
        if (this.f46814b.canScrollVertically(-1) || this.f46814b.canScrollHorizontally(-1)) {
            c1009q1.m6530a(8192);
            c1009q1.m6543o(true);
        }
        if (this.f46814b.canScrollVertically(1) || this.f46814b.canScrollHorizontally(1)) {
            c1009q1.m6530a(4096);
            c1009q1.m6543o(true);
        }
        c1009q1.f9401a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo10149J(fo0, ko0), mo10184x(fo0, ko0), false, 0));
    }

    /* renamed from: W */
    public final void m26415W(C1009Q1 c1009q1, View view) {
        OO0 oo0M10226M = RecyclerView.m10226M(view);
        if (oo0M10226M == null || oo0M10226M.m6052i() || ((ArrayList) this.f46813a.f37325d).contains(oo0M10226M.f8408a)) {
            return;
        }
        RecyclerView recyclerView = this.f46814b;
        mo10153X(recyclerView.f16498c, recyclerView.f16520s1, view, c1009q1);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x007d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m26416b(int r9, android.view.View r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11919zO0.m26416b(int, android.view.View, boolean):void");
    }

    /* renamed from: c */
    public void mo10208c(String str) {
        RecyclerView recyclerView = this.f46814b;
        if (recyclerView != null) {
            recyclerView.m10272k(str);
        }
    }

    /* renamed from: d */
    public abstract boolean mo10210d();

    /* renamed from: d0 */
    public abstract void mo10161d0(FO0 fo0, KO0 ko0);

    /* renamed from: e */
    public abstract boolean mo10212e();

    /* renamed from: e0 */
    public abstract void mo10162e0(KO0 ko0);

    /* renamed from: f */
    public boolean mo10164f(AO0 ao0) {
        return ao0 != null;
    }

    /* renamed from: g0 */
    public Parcelable mo10215g0() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[PHI: r3
  0x0061: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:63:0x007d, B:55:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo18031i0(p000.FO0 r3, p000.KO0 r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r2.f46814b
            r4 = 0
            if (r3 != 0) goto L6
            return r4
        L6:
            int r3 = r2.f46827o
            int r6 = r2.f46826n
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r2.f46814b
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L2b
            androidx.recyclerview.widget.RecyclerView r1 = r2.f46814b
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
            androidx.recyclerview.widget.RecyclerView r5 = r2.f46814b
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L4c
            int r5 = r2.m26413G()
            int r3 = r3 - r5
            int r5 = r2.m26410D()
            int r3 = r3 - r5
            int r3 = -r3
            goto L4d
        L4c:
            r3 = r4
        L4d:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f46814b
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L61
            int r5 = r2.m26411E()
            int r6 = r6 - r5
            int r5 = r2.m26412F()
            int r6 = r6 - r5
            int r5 = -r6
            goto L8a
        L61:
            r5 = r4
            goto L8a
        L63:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f46814b
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L76
            int r5 = r2.m26413G()
            int r3 = r3 - r5
            int r5 = r2.m26410D()
            int r3 = r3 - r5
            goto L77
        L76:
            r3 = r4
        L77:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f46814b
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L61
            int r5 = r2.m26411E()
            int r6 = r6 - r5
            int r5 = r2.m26412F()
            int r5 = r6 - r5
        L8a:
            if (r3 != 0) goto L8f
            if (r5 != 0) goto L8f
            return r4
        L8f:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f46814b
            r4.m10269i0(r5, r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11919zO0.mo18031i0(FO0, KO0, int, android.os.Bundle):boolean");
    }

    /* renamed from: j */
    public abstract int mo10220j(KO0 ko0);

    /* renamed from: j0 */
    public final void m26417j0(FO0 fo0) {
        for (int iM26426v = m26426v() - 1; iM26426v >= 0; iM26426v--) {
            if (!RecyclerView.m10226M(m26425u(iM26426v)).m6059p()) {
                View viewM26425u = m26425u(iM26426v);
                m26420m0(iM26426v);
                fo0.m2625h(viewM26425u);
            }
        }
    }

    /* renamed from: k */
    public abstract int mo10167k(KO0 ko0);

    /* renamed from: k0 */
    public final void m26418k0(FO0 fo0) {
        ArrayList arrayList;
        int size = fo0.f3192a.size();
        int i = size - 1;
        while (true) {
            arrayList = fo0.f3192a;
            if (i < 0) {
                break;
            }
            View view = ((OO0) arrayList.get(i)).f8408a;
            OO0 oo0M10226M = RecyclerView.m10226M(view);
            if (!oo0M10226M.m6059p()) {
                oo0M10226M.m6058o(false);
                if (oo0M10226M.m6054k()) {
                    this.f46814b.removeDetachedView(view, false);
                }
                AbstractC11538wO0 abstractC11538wO0 = this.f46814b.f16483M;
                if (abstractC11538wO0 != null) {
                    abstractC11538wO0.mo8954d(oo0M10226M);
                }
                oo0M10226M.m6058o(true);
                OO0 oo0M10226M2 = RecyclerView.m10226M(view);
                oo0M10226M2.f8421n = null;
                oo0M10226M2.f8422o = false;
                oo0M10226M2.f8417j &= -33;
                fo0.m2626i(oo0M10226M2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = fo0.f3193b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f46814b.invalidate();
        }
    }

    /* renamed from: l */
    public abstract int mo10169l(KO0 ko0);

    /* renamed from: l0 */
    public final void m26419l0(View view, FO0 fo0) {
        C10189lr0 c10189lr0 = this.f46813a;
        C9196e41 c9196e41 = (C9196e41) c10189lr0.f37323b;
        int iIndexOfChild = ((RecyclerView) c9196e41.f26532b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0495Hr) c10189lr0.f37324c).m3634z(iIndexOfChild)) {
                c10189lr0.m22569b0(view);
            }
            c9196e41.m17856S0(iIndexOfChild);
        }
        fo0.m2625h(view);
    }

    /* renamed from: m */
    public abstract int mo10221m(KO0 ko0);

    /* renamed from: m0 */
    public final void m26420m0(int i) {
        if (m26425u(i) != null) {
            C10189lr0 c10189lr0 = this.f46813a;
            int iM22558Q = c10189lr0.m22558Q(i);
            C9196e41 c9196e41 = (C9196e41) c10189lr0.f37323b;
            View childAt = ((RecyclerView) c9196e41.f26532b).getChildAt(iM22558Q);
            if (childAt == null) {
                return;
            }
            if (((C0495Hr) c10189lr0.f37324c).m3634z(iM22558Q)) {
                c10189lr0.m22569b0(childAt);
            }
            c9196e41.m17856S0(iM22558Q);
        }
    }

    /* renamed from: n */
    public abstract int mo10172n(KO0 ko0);

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo11228n0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.m26411E()
            int r1 = r8.m26413G()
            int r2 = r8.f46826n
            int r3 = r8.m26412F()
            int r2 = r2 - r3
            int r3 = r8.f46827o
            int r4 = r8.m26410D()
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
            int r3 = r8.m26409C()
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
            int r1 = r8.m26411E()
            int r2 = r8.m26413G()
            int r3 = r8.f46826n
            int r4 = r8.m26412F()
            int r3 = r3 - r4
            int r4 = r8.f46827o
            int r5 = r8.m26410D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f46814b
            android.graphics.Rect r5 = r5.f16508j
            r8.mo11229y(r13, r5)
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
            r9.m10269i0(r11, r10, r0)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11919zO0.mo11228n0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* renamed from: o */
    public abstract int mo10174o(KO0 ko0);

    /* renamed from: o0 */
    public final void m26421o0() {
        RecyclerView recyclerView = this.f46814b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: p */
    public final void m26422p(FO0 fo0) {
        for (int iM26426v = m26426v() - 1; iM26426v >= 0; iM26426v--) {
            View viewM26425u = m26425u(iM26426v);
            OO0 oo0M10226M = RecyclerView.m10226M(viewM26425u);
            if (oo0M10226M.m6059p()) {
                if (RecyclerView.f16451M1) {
                    oo0M10226M.toString();
                }
            } else if (!oo0M10226M.m6050g() || oo0M10226M.m6052i() || this.f46814b.f16511m.f41642b) {
                m26425u(iM26426v);
                this.f46813a.m22550H(iM26426v);
                fo0.m2627j(viewM26425u);
                this.f46814b.f16505g.m5456y(oo0M10226M);
            } else {
                m26420m0(iM26426v);
                fo0.m2626i(oo0M10226M);
            }
        }
    }

    /* renamed from: p0 */
    public abstract int mo10176p0(int i, FO0 fo0, KO0 ko0);

    /* renamed from: q */
    public View mo10222q(int i) {
        int iM26426v = m26426v();
        for (int i2 = 0; i2 < iM26426v; i2++) {
            View viewM26425u = m26425u(i2);
            OO0 oo0M10226M = RecyclerView.m10226M(viewM26425u);
            if (oo0M10226M != null && oo0M10226M.m6045b() == i && !oo0M10226M.m6059p() && (this.f46814b.f16520s1.f6051g || !oo0M10226M.m6052i())) {
                return viewM26425u;
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public abstract void mo10223q0(int i);

    /* renamed from: r */
    public abstract AO0 mo10179r();

    /* renamed from: r0 */
    public abstract int mo10180r0(int i, FO0 fo0, KO0 ko0);

    /* renamed from: s */
    public AO0 mo10181s(Context context, AttributeSet attributeSet) {
        return new AO0(context, attributeSet);
    }

    /* renamed from: s0 */
    public final void m26423s0(RecyclerView recyclerView) {
        m26424t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: t */
    public AO0 mo10182t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AO0 ? new AO0((AO0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new AO0((ViewGroup.MarginLayoutParams) layoutParams) : new AO0(layoutParams);
    }

    /* renamed from: t0 */
    public final void m26424t0(int i, int i2) {
        this.f46826n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f46824l = mode;
        if (mode == 0 && !RecyclerView.f16454P1) {
            this.f46826n = 0;
        }
        this.f46827o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f46825m = mode2;
        if (mode2 != 0 || RecyclerView.f16454P1) {
            return;
        }
        this.f46827o = 0;
    }

    /* renamed from: u */
    public final View m26425u(int i) {
        C10189lr0 c10189lr0 = this.f46813a;
        if (c10189lr0 != null) {
            return c10189lr0.m22556N(i);
        }
        return null;
    }

    /* renamed from: u0 */
    public void mo10183u0(Rect rect, int i, int i2) {
        int iM26412F = m26412F() + m26411E() + rect.width();
        int iM26410D = m26410D() + m26413G() + rect.height();
        RecyclerView recyclerView = this.f46814b;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        this.f46814b.setMeasuredDimension(m26404g(i, iM26412F, recyclerView.getMinimumWidth()), m26404g(i2, iM26410D, this.f46814b.getMinimumHeight()));
    }

    /* renamed from: v */
    public final int m26426v() {
        C10189lr0 c10189lr0 = this.f46813a;
        if (c10189lr0 != null) {
            return c10189lr0.m22557O();
        }
        return 0;
    }

    /* renamed from: v0 */
    public final void m26427v0(int i, int i2) {
        int iM26426v = m26426v();
        if (iM26426v == 0) {
            this.f46814b.m10278q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM26426v; i7++) {
            View viewM26425u = m26425u(i7);
            Rect rect = this.f46814b.f16508j;
            mo11229y(viewM26425u, rect);
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
        this.f46814b.f16508j.set(i6, i4, i3, i5);
        mo10183u0(this.f46814b.f16508j, i, i2);
    }

    /* renamed from: w0 */
    public final void m26428w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f46814b = null;
            this.f46813a = null;
            this.f46826n = 0;
            this.f46827o = 0;
        } else {
            this.f46814b = recyclerView;
            this.f46813a = recyclerView.f16504f;
            this.f46826n = recyclerView.getWidth();
            this.f46827o = recyclerView.getHeight();
        }
        this.f46824l = 1073741824;
        this.f46825m = 1073741824;
    }

    /* renamed from: x */
    public int mo10184x(FO0 fo0, KO0 ko0) {
        return -1;
    }

    /* renamed from: x0 */
    public final boolean m26429x0(View view, int i, int i2, AO0 ao0) {
        return (!view.isLayoutRequested() && this.f46820h && m26402M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) ao0).width) && m26402M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) ao0).height)) ? false : true;
    }

    /* renamed from: y */
    public void mo11229y(View view, Rect rect) {
        boolean z = RecyclerView.f16450L1;
        AO0 ao0 = (AO0) view.getLayoutParams();
        Rect rect2 = ao0.f183b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) ao0).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) ao0).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) ao0).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) ao0).bottomMargin);
    }

    /* renamed from: y0 */
    public boolean mo10224y0() {
        return false;
    }

    /* renamed from: z0 */
    public final boolean m26430z0(View view, int i, int i2, AO0 ao0) {
        return (this.f46820h && m26402M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) ao0).width) && m26402M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) ao0).height)) ? false : true;
    }

    /* renamed from: Q */
    public void mo10304Q() {
    }

    /* renamed from: Z */
    public void mo10157Z() {
    }

    /* renamed from: R */
    public void mo11227R(RecyclerView recyclerView) {
    }

    /* renamed from: f0 */
    public void mo10213f0(Parcelable parcelable) {
    }

    /* renamed from: h0 */
    public void mo10321h0(int i) {
    }

    /* renamed from: Y */
    public void mo10155Y(int i, int i2) {
    }

    /* renamed from: a0 */
    public void mo10158a0(int i, int i2) {
    }

    /* renamed from: b0 */
    public void mo10159b0(int i, int i2) {
    }

    /* renamed from: c0 */
    public void mo10160c0(int i, int i2) {
    }

    /* renamed from: i */
    public void mo10219i(int i, C6327ks c6327ks) {
    }

    /* renamed from: X */
    public void mo10153X(FO0 fo0, KO0 ko0, View view, C1009Q1 c1009q1) {
    }

    /* renamed from: h */
    public void mo10217h(int i, int i2, KO0 ko0, C6327ks c6327ks) {
    }
}
