package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import java.util.WeakHashMap;
import p000.AO0;
import p000.AbstractC10944rk1;
import p000.AbstractC11153tN0;
import p000.AbstractC11919zO0;
import p000.C1009Q1;
import p000.C1664aR;
import p000.C6327ks;
import p000.C8578Yi0;
import p000.C8672a20;
import p000.ES1;
import p000.FO0;
import p000.KO0;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f16427E;

    /* renamed from: F */
    public int f16428F;

    /* renamed from: G */
    public int[] f16429G;

    /* renamed from: H */
    public View[] f16430H;

    /* renamed from: I */
    public final SparseIntArray f16431I;

    /* renamed from: J */
    public final SparseIntArray f16432J;

    /* renamed from: K */
    public final ES1 f16433K;

    /* renamed from: L */
    public final Rect f16434L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f16427E = false;
        this.f16428F = -1;
        this.f16431I = new SparseIntArray();
        this.f16432J = new SparseIntArray();
        this.f16433K = new ES1(12);
        this.f16434L = new Rect();
        m10177p1(AbstractC11919zO0.m26401I(context, attributeSet, i, i2).f46249b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: C0 */
    public final boolean mo10147C0() {
        return this.f16449z == null && !this.f16427E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: E0 */
    public final void mo10148E0(KO0 ko0, C8578Yi0 c8578Yi0, C6327ks c6327ks) {
        int i;
        int i2 = this.f16428F;
        for (int i3 = 0; i3 < this.f16428F && (i = c8578Yi0.f14462d) >= 0 && i < ko0.m4625b() && i2 > 0; i3++) {
            c6327ks.m22276b(c8578Yi0.f14462d, Math.max(0, c8578Yi0.f14465g));
            this.f16433K.getClass();
            i2--;
            c8578Yi0.f14462d += c8578Yi0.f14463e;
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: J */
    public final int mo10149J(FO0 fo0, KO0 ko0) {
        if (this.f16439p == 0) {
            return this.f16428F;
        }
        if (ko0.m4625b() < 1) {
            return 0;
        }
        return m10170l1(ko0.m4625b() - 1, fo0, ko0) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: R0 */
    public final View mo10150R0(FO0 fo0, KO0 ko0, boolean z, boolean z2) {
        int i;
        int iM26426v;
        int iM26426v2 = m26426v();
        int i2 = 1;
        if (z2) {
            iM26426v = m26426v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM26426v2;
            iM26426v = 0;
        }
        int iM4625b = ko0.m4625b();
        m10189J0();
        int iM6501j = this.f16441r.m6501j();
        int iM6498g = this.f16441r.m6498g();
        View view = null;
        View view2 = null;
        while (iM26426v != i) {
            View viewM26425u = m26425u(iM26426v);
            int iM26400H = AbstractC11919zO0.m26400H(viewM26425u);
            if (iM26400H >= 0 && iM26400H < iM4625b && m10171m1(iM26400H, fo0, ko0) == 0) {
                if (((AO0) viewM26425u.getLayoutParams()).f182a.m6052i()) {
                    if (view2 == null) {
                        view2 = viewM26425u;
                    }
                } else {
                    if (this.f16441r.m6496e(viewM26425u) < iM6498g && this.f16441r.m6493b(viewM26425u) >= iM6501j) {
                        return viewM26425u;
                    }
                    if (view == null) {
                        view = viewM26425u;
                    }
                }
            }
            iM26426v += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo10151T(android.view.View r23, int r24, p000.FO0 r25, p000.KO0 r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo10151T(android.view.View, int, FO0, KO0):android.view.View");
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: V */
    public final void mo10152V(FO0 fo0, KO0 ko0, C1009Q1 c1009q1) {
        super.mo10152V(fo0, ko0, c1009q1);
        c1009q1.m6539k(GridView.class.getName());
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: X */
    public final void mo10153X(FO0 fo0, KO0 ko0, View view, C1009Q1 c1009q1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C8672a20)) {
            m26415W(c1009q1, view);
            return;
        }
        C8672a20 c8672a20 = (C8672a20) layoutParams;
        int iM10170l1 = m10170l1(c8672a20.f182a.m6045b(), fo0, ko0);
        int i = this.f16439p;
        AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c8672a20.f15289e, c8672a20.f15290f, iM10170l1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iM10170l1, 1, c8672a20.f15289e, c8672a20.f15290f, false, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: X0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo10154X0(p000.FO0 r19, p000.KO0 r20, p000.C8578Yi0 r21, p000.C8526Xi0 r22) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo10154X0(FO0, KO0, Yi0, Xi0):void");
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: Y */
    public final void mo10155Y(int i, int i2) {
        ES1 es1 = this.f16433K;
        es1.m2281B();
        ((SparseIntArray) es1.f2709c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: Y0 */
    public final void mo10156Y0(FO0 fo0, KO0 ko0, C1664aR c1664aR, int i) {
        m10178q1();
        if (ko0.m4625b() > 0 && !ko0.f6051g) {
            boolean z = i == 1;
            int iM10171m1 = m10171m1(c1664aR.f15509b, fo0, ko0);
            if (z) {
                while (iM10171m1 > 0) {
                    int i2 = c1664aR.f15509b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1664aR.f15509b = i3;
                    iM10171m1 = m10171m1(i3, fo0, ko0);
                }
            } else {
                int iM4625b = ko0.m4625b() - 1;
                int i4 = c1664aR.f15509b;
                while (i4 < iM4625b) {
                    int i5 = i4 + 1;
                    int iM10171m12 = m10171m1(i5, fo0, ko0);
                    if (iM10171m12 <= iM10171m1) {
                        break;
                    }
                    i4 = i5;
                    iM10171m1 = iM10171m12;
                }
                c1664aR.f15509b = i4;
            }
        }
        m10166j1();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: Z */
    public final void mo10157Z() {
        ES1 es1 = this.f16433K;
        es1.m2281B();
        ((SparseIntArray) es1.f2709c).clear();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: a0 */
    public final void mo10158a0(int i, int i2) {
        ES1 es1 = this.f16433K;
        es1.m2281B();
        ((SparseIntArray) es1.f2709c).clear();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: b0 */
    public final void mo10159b0(int i, int i2) {
        ES1 es1 = this.f16433K;
        es1.m2281B();
        ((SparseIntArray) es1.f2709c).clear();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: c0 */
    public final void mo10160c0(int i, int i2) {
        ES1 es1 = this.f16433K;
        es1.m2281B();
        ((SparseIntArray) es1.f2709c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: d0 */
    public final void mo10161d0(FO0 fo0, KO0 ko0) {
        boolean z = ko0.f6051g;
        SparseIntArray sparseIntArray = this.f16432J;
        SparseIntArray sparseIntArray2 = this.f16431I;
        if (z) {
            int iM26426v = m26426v();
            for (int i = 0; i < iM26426v; i++) {
                C8672a20 c8672a20 = (C8672a20) m26425u(i).getLayoutParams();
                int iM6045b = c8672a20.f182a.m6045b();
                sparseIntArray2.put(iM6045b, c8672a20.f15290f);
                sparseIntArray.put(iM6045b, c8672a20.f15289e);
            }
        }
        super.mo10161d0(fo0, ko0);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: e0 */
    public final void mo10162e0(KO0 ko0) {
        super.mo10162e0(ko0);
        this.f16427E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: e1 */
    public final void mo10163e1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo10163e1(false);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: f */
    public final boolean mo10164f(AO0 ao0) {
        return ao0 instanceof C8672a20;
    }

    /* renamed from: i1 */
    public final void m10165i1(int i) {
        int i2;
        int[] iArr = this.f16429G;
        int i3 = this.f16428F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f16429G = iArr;
    }

    /* renamed from: j1 */
    public final void m10166j1() {
        View[] viewArr = this.f16430H;
        if (viewArr == null || viewArr.length != this.f16428F) {
            this.f16430H = new View[this.f16428F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: k */
    public final int mo10167k(KO0 ko0) {
        return m10186G0(ko0);
    }

    /* renamed from: k1 */
    public final int m10168k1(int i, int i2) {
        if (this.f16439p != 1 || !m10204W0()) {
            int[] iArr = this.f16429G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f16429G;
        int i3 = this.f16428F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: l */
    public final int mo10169l(KO0 ko0) {
        return m10187H0(ko0);
    }

    /* renamed from: l1 */
    public final int m10170l1(int i, FO0 fo0, KO0 ko0) {
        boolean z = ko0.f6051g;
        ES1 es1 = this.f16433K;
        if (!z) {
            int i2 = this.f16428F;
            es1.getClass();
            return ES1.m2279x(i, i2);
        }
        int iM2619b = fo0.m2619b(i);
        if (iM2619b == -1) {
            return 0;
        }
        int i3 = this.f16428F;
        es1.getClass();
        return ES1.m2279x(iM2619b, i3);
    }

    /* renamed from: m1 */
    public final int m10171m1(int i, FO0 fo0, KO0 ko0) {
        boolean z = ko0.f6051g;
        ES1 es1 = this.f16433K;
        if (!z) {
            int i2 = this.f16428F;
            es1.getClass();
            return i % i2;
        }
        int i3 = this.f16432J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM2619b = fo0.m2619b(i);
        if (iM2619b == -1) {
            return 0;
        }
        int i4 = this.f16428F;
        es1.getClass();
        return iM2619b % i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: n */
    public final int mo10172n(KO0 ko0) {
        return m10186G0(ko0);
    }

    /* renamed from: n1 */
    public final int m10173n1(int i, FO0 fo0, KO0 ko0) {
        boolean z = ko0.f6051g;
        ES1 es1 = this.f16433K;
        if (!z) {
            es1.getClass();
            return 1;
        }
        int i2 = this.f16431I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (fo0.m2619b(i) == -1) {
            return 1;
        }
        es1.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: o */
    public final int mo10174o(KO0 ko0) {
        return m10187H0(ko0);
    }

    /* renamed from: o1 */
    public final void m10175o1(int i, View view, boolean z) {
        int iM26405w;
        int iM26405w2;
        C8672a20 c8672a20 = (C8672a20) view.getLayoutParams();
        Rect rect = c8672a20.f183b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c8672a20).topMargin + ((ViewGroup.MarginLayoutParams) c8672a20).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c8672a20).leftMargin + ((ViewGroup.MarginLayoutParams) c8672a20).rightMargin;
        int iM10168k1 = m10168k1(c8672a20.f15289e, c8672a20.f15290f);
        if (this.f16439p == 1) {
            iM26405w2 = AbstractC11919zO0.m26405w(false, iM10168k1, i, i3, ((ViewGroup.MarginLayoutParams) c8672a20).width);
            iM26405w = AbstractC11919zO0.m26405w(true, this.f16441r.m6502k(), this.f46825m, i2, ((ViewGroup.MarginLayoutParams) c8672a20).height);
        } else {
            int iM26405w3 = AbstractC11919zO0.m26405w(false, iM10168k1, i, i2, ((ViewGroup.MarginLayoutParams) c8672a20).height);
            int iM26405w4 = AbstractC11919zO0.m26405w(true, this.f16441r.m6502k(), this.f46824l, i3, ((ViewGroup.MarginLayoutParams) c8672a20).width);
            iM26405w = iM26405w3;
            iM26405w2 = iM26405w4;
        }
        AO0 ao0 = (AO0) view.getLayoutParams();
        if (z ? m26430z0(view, iM26405w2, iM26405w, ao0) : m26429x0(view, iM26405w2, iM26405w, ao0)) {
            view.measure(iM26405w2, iM26405w);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: p0 */
    public final int mo10176p0(int i, FO0 fo0, KO0 ko0) {
        m10178q1();
        m10166j1();
        return super.mo10176p0(i, fo0, ko0);
    }

    /* renamed from: p1 */
    public final void m10177p1(int i) {
        if (i == this.f16428F) {
            return;
        }
        this.f16427E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Span count should be at least 1. Provided "));
        }
        this.f16428F = i;
        this.f16433K.m2281B();
        m26421o0();
    }

    /* renamed from: q1 */
    public final void m10178q1() {
        int iM26410D;
        int iM26413G;
        if (this.f16439p == 1) {
            iM26410D = this.f46826n - m26412F();
            iM26413G = m26411E();
        } else {
            iM26410D = this.f46827o - m26410D();
            iM26413G = m26413G();
        }
        m10165i1(iM26410D - iM26413G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: r */
    public final AO0 mo10179r() {
        return this.f16439p == 0 ? new C8672a20(-2, -1) : new C8672a20(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC11919zO0
    /* renamed from: r0 */
    public final int mo10180r0(int i, FO0 fo0, KO0 ko0) {
        m10178q1();
        m10166j1();
        return super.mo10180r0(i, fo0, ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: s */
    public final AO0 mo10181s(Context context, AttributeSet attributeSet) {
        C8672a20 c8672a20 = new C8672a20(context, attributeSet);
        c8672a20.f15289e = -1;
        c8672a20.f15290f = 0;
        return c8672a20;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: t */
    public final AO0 mo10182t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C8672a20 c8672a20 = new C8672a20((ViewGroup.MarginLayoutParams) layoutParams);
            c8672a20.f15289e = -1;
            c8672a20.f15290f = 0;
            return c8672a20;
        }
        C8672a20 c8672a202 = new C8672a20(layoutParams);
        c8672a202.f15289e = -1;
        c8672a202.f15290f = 0;
        return c8672a202;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: u0 */
    public final void mo10183u0(Rect rect, int i, int i2) {
        int iM26404g;
        int iM26404g2;
        if (this.f16429G == null) {
            super.mo10183u0(rect, i, i2);
        }
        int iM26412F = m26412F() + m26411E();
        int iM26410D = m26410D() + m26413G();
        if (this.f16439p == 1) {
            int iHeight = rect.height() + iM26410D;
            RecyclerView recyclerView = this.f46814b;
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            iM26404g2 = AbstractC11919zO0.m26404g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f16429G;
            iM26404g = AbstractC11919zO0.m26404g(i, iArr[iArr.length - 1] + iM26412F, this.f46814b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM26412F;
            RecyclerView recyclerView2 = this.f46814b;
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            iM26404g = AbstractC11919zO0.m26404g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f16429G;
            iM26404g2 = AbstractC11919zO0.m26404g(i2, iArr2[iArr2.length - 1] + iM26410D, this.f46814b.getMinimumHeight());
        }
        this.f46814b.setMeasuredDimension(iM26404g, iM26404g2);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: x */
    public final int mo10184x(FO0 fo0, KO0 ko0) {
        if (this.f16439p == 1) {
            return this.f16428F;
        }
        if (ko0.m4625b() < 1) {
            return 0;
        }
        return m10170l1(ko0.m4625b() - 1, fo0, ko0) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f16427E = false;
        this.f16428F = -1;
        this.f16431I = new SparseIntArray();
        this.f16432J = new SparseIntArray();
        this.f16433K = new ES1(12);
        this.f16434L = new Rect();
        m10177p1(i);
    }
}
