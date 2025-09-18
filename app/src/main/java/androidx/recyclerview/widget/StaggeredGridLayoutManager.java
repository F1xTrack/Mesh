package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p000.AO0;
import p000.AbstractC10944rk1;
import p000.AbstractC11919zO0;
import p000.C10297mh0;
import p000.C11792yO0;
import p000.C6327ks;
import p000.C8142Py0;
import p000.C8679a41;
import p000.C8760aj0;
import p000.C8935c41;
import p000.C9068d41;
import p000.ER1;
import p000.ES1;
import p000.FO0;
import p000.JO0;
import p000.KO0;
import p000.RunnableC10431nk0;
import p000.Z31;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC11919zO0 implements JO0 {

    /* renamed from: B */
    public final ES1 f16536B;

    /* renamed from: C */
    public final int f16537C;

    /* renamed from: D */
    public boolean f16538D;

    /* renamed from: E */
    public boolean f16539E;

    /* renamed from: F */
    public C8935c41 f16540F;

    /* renamed from: G */
    public final Rect f16541G;

    /* renamed from: H */
    public final Z31 f16542H;

    /* renamed from: I */
    public final boolean f16543I;

    /* renamed from: J */
    public int[] f16544J;

    /* renamed from: K */
    public final RunnableC10431nk0 f16545K;

    /* renamed from: p */
    public final int f16546p;

    /* renamed from: q */
    public final C9068d41[] f16547q;

    /* renamed from: r */
    public final C8142Py0 f16548r;

    /* renamed from: s */
    public final C8142Py0 f16549s;

    /* renamed from: t */
    public final int f16550t;

    /* renamed from: u */
    public int f16551u;

    /* renamed from: v */
    public final C10297mh0 f16552v;

    /* renamed from: w */
    public boolean f16553w;

    /* renamed from: y */
    public final BitSet f16555y;

    /* renamed from: x */
    public boolean f16554x = false;

    /* renamed from: z */
    public int f16556z = -1;

    /* renamed from: A */
    public int f16535A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f16546p = -1;
        this.f16553w = false;
        ES1 es1 = new ES1(21, false);
        this.f16536B = es1;
        this.f16537C = 2;
        this.f16541G = new Rect();
        this.f16542H = new Z31(this);
        this.f16543I = true;
        this.f16545K = new RunnableC10431nk0(7, this);
        C11792yO0 c11792yO0M26401I = AbstractC11919zO0.m26401I(context, attributeSet, i, i2);
        int i3 = c11792yO0M26401I.f46248a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo10208c(null);
        if (i3 != this.f16550t) {
            this.f16550t = i3;
            C8142Py0 c8142Py0 = this.f16548r;
            this.f16548r = this.f16549s;
            this.f16549s = c8142Py0;
            m26421o0();
        }
        int i4 = c11792yO0M26401I.f46249b;
        mo10208c(null);
        if (i4 != this.f16546p) {
            es1.m2295p();
            m26421o0();
            this.f16546p = i4;
            this.f16555y = new BitSet(this.f16546p);
            this.f16547q = new C9068d41[this.f16546p];
            for (int i5 = 0; i5 < this.f16546p; i5++) {
                this.f16547q[i5] = new C9068d41(this, i5);
            }
            m26421o0();
        }
        boolean z = c11792yO0M26401I.f46250c;
        mo10208c(null);
        C8935c41 c8935c41 = this.f16540F;
        if (c8935c41 != null && c8935c41.f17289h != z) {
            c8935c41.f17289h = z;
        }
        this.f16553w = z;
        m26421o0();
        C10297mh0 c10297mh0 = new C10297mh0();
        c10297mh0.f37834a = true;
        c10297mh0.f37839f = 0;
        c10297mh0.f37840g = 0;
        this.f16552v = c10297mh0;
        this.f16548r = C8142Py0.m6492a(this, this.f16550t);
        this.f16549s = C8142Py0.m6492a(this, 1 - this.f16550t);
    }

    /* renamed from: g1 */
    public static int m10288g1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: A0 */
    public final void mo9354A0(RecyclerView recyclerView, int i) {
        C8760aj0 c8760aj0 = new C8760aj0(recyclerView.getContext());
        c8760aj0.f15637a = i;
        m26408B0(c8760aj0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: C0 */
    public final boolean mo10147C0() {
        return this.f16540F == null;
    }

    /* renamed from: D0 */
    public final int m10289D0(int i) {
        if (m26426v() == 0) {
            return this.f16554x ? 1 : -1;
        }
        return (i < m10299N0()) != this.f16554x ? -1 : 1;
    }

    /* renamed from: E0 */
    public final boolean m10290E0() {
        int iM10299N0;
        if (m26426v() != 0 && this.f16537C != 0 && this.f46819g) {
            if (this.f16554x) {
                iM10299N0 = m10301O0();
                m10299N0();
            } else {
                iM10299N0 = m10299N0();
                m10301O0();
            }
            ES1 es1 = this.f16536B;
            if (iM10299N0 == 0 && m10307S0() != null) {
                es1.m2295p();
                this.f46818f = true;
                m26421o0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: F0 */
    public final int m10291F0(KO0 ko0) {
        if (m26426v() == 0) {
            return 0;
        }
        C8142Py0 c8142Py0 = this.f16548r;
        boolean z = !this.f16543I;
        return ER1.m2270a(ko0, c8142Py0, m10296K0(z), m10295J0(z), this, this.f16543I);
    }

    /* renamed from: G0 */
    public final int m10292G0(KO0 ko0) {
        if (m26426v() == 0) {
            return 0;
        }
        C8142Py0 c8142Py0 = this.f16548r;
        boolean z = !this.f16543I;
        return ER1.m2271b(ko0, c8142Py0, m10296K0(z), m10295J0(z), this, this.f16543I, this.f16554x);
    }

    /* renamed from: H0 */
    public final int m10293H0(KO0 ko0) {
        if (m26426v() == 0) {
            return 0;
        }
        C8142Py0 c8142Py0 = this.f16548r;
        boolean z = !this.f16543I;
        return ER1.m2272c(ko0, c8142Py0, m10296K0(z), m10295J0(z), this, this.f16543I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* renamed from: I0 */
    public final int m10294I0(FO0 fo0, C10297mh0 c10297mh0, KO0 ko0) {
        C9068d41 c9068d41;
        ?? r6;
        int i;
        int iM17490h;
        int iM6494c;
        int iM6501j;
        int iM6494c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.f16555y.set(0, this.f16546p, true);
        C10297mh0 c10297mh02 = this.f16552v;
        int i8 = c10297mh02.f37842i ? c10297mh0.f37838e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c10297mh0.f37838e == 1 ? c10297mh0.f37840g + c10297mh0.f37835b : c10297mh0.f37839f - c10297mh0.f37835b;
        int i9 = c10297mh0.f37838e;
        for (int i10 = 0; i10 < this.f16546p; i10++) {
            if (!this.f16547q[i10].f25796a.isEmpty()) {
                m10320f1(this.f16547q[i10], i9, i8);
            }
        }
        int iM6498g = this.f16554x ? this.f16548r.m6498g() : this.f16548r.m6501j();
        boolean z = false;
        while (true) {
            int i11 = c10297mh0.f37836c;
            if (((i11 < 0 || i11 >= ko0.m4625b()) ? i6 : i7) == 0 || (!c10297mh02.f37842i && this.f16555y.isEmpty())) {
                break;
            }
            View view = fo0.m2628k(c10297mh0.f37836c, Long.MAX_VALUE).f8408a;
            c10297mh0.f37836c += c10297mh0.f37837d;
            C8679a41 c8679a41 = (C8679a41) view.getLayoutParams();
            int iM6045b = c8679a41.f182a.m6045b();
            ES1 es1 = this.f16536B;
            int[] iArr = (int[]) es1.f2708b;
            int i12 = (iArr == null || iM6045b >= iArr.length) ? -1 : iArr[iM6045b];
            if (i12 == -1) {
                if (m10311W0(c10297mh0.f37838e)) {
                    i5 = this.f16546p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f16546p;
                    i5 = i6;
                }
                C9068d41 c9068d412 = null;
                if (c10297mh0.f37838e == i7) {
                    int iM6501j2 = this.f16548r.m6501j();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        C9068d41 c9068d413 = this.f16547q[i5];
                        int iM17488f = c9068d413.m17488f(iM6501j2);
                        if (iM17488f < i13) {
                            i13 = iM17488f;
                            c9068d412 = c9068d413;
                        }
                        i5 += i3;
                    }
                } else {
                    int iM6498g2 = this.f16548r.m6498g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        C9068d41 c9068d414 = this.f16547q[i5];
                        int iM17490h2 = c9068d414.m17490h(iM6498g2);
                        if (iM17490h2 > i14) {
                            c9068d412 = c9068d414;
                            i14 = iM17490h2;
                        }
                        i5 += i3;
                    }
                }
                c9068d41 = c9068d412;
                es1.m2297r(iM6045b);
                ((int[]) es1.f2708b)[iM6045b] = c9068d41.f25800e;
            } else {
                c9068d41 = this.f16547q[i12];
            }
            c8679a41.f15302e = c9068d41;
            if (c10297mh0.f37838e == 1) {
                r6 = 0;
                m26416b(-1, view, false);
            } else {
                r6 = 0;
                m26416b(0, view, false);
            }
            if (this.f16550t == 1) {
                i = 1;
                m10309U0(view, AbstractC11919zO0.m26405w(r6, this.f16551u, this.f46824l, r6, ((ViewGroup.MarginLayoutParams) c8679a41).width), AbstractC11919zO0.m26405w(true, this.f46827o, this.f46825m, m26410D() + m26413G(), ((ViewGroup.MarginLayoutParams) c8679a41).height));
            } else {
                i = 1;
                m10309U0(view, AbstractC11919zO0.m26405w(true, this.f46826n, this.f46824l, m26412F() + m26411E(), ((ViewGroup.MarginLayoutParams) c8679a41).width), AbstractC11919zO0.m26405w(false, this.f16551u, this.f46825m, 0, ((ViewGroup.MarginLayoutParams) c8679a41).height));
            }
            if (c10297mh0.f37838e == i) {
                iM6494c = c9068d41.m17488f(iM6498g);
                iM17490h = this.f16548r.m6494c(view) + iM6494c;
            } else {
                iM17490h = c9068d41.m17490h(iM6498g);
                iM6494c = iM17490h - this.f16548r.m6494c(view);
            }
            if (c10297mh0.f37838e == 1) {
                C9068d41 c9068d415 = c8679a41.f15302e;
                c9068d415.getClass();
                C8679a41 c8679a412 = (C8679a41) view.getLayoutParams();
                c8679a412.f15302e = c9068d415;
                ArrayList arrayList = c9068d415.f25796a;
                arrayList.add(view);
                c9068d415.f25798c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c9068d415.f25797b = Integer.MIN_VALUE;
                }
                if (c8679a412.f182a.m6052i() || c8679a412.f182a.m6055l()) {
                    c9068d415.f25799d = c9068d415.f25801f.f16548r.m6494c(view) + c9068d415.f25799d;
                }
            } else {
                C9068d41 c9068d416 = c8679a41.f15302e;
                c9068d416.getClass();
                C8679a41 c8679a413 = (C8679a41) view.getLayoutParams();
                c8679a413.f15302e = c9068d416;
                ArrayList arrayList2 = c9068d416.f25796a;
                arrayList2.add(0, view);
                c9068d416.f25797b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c9068d416.f25798c = Integer.MIN_VALUE;
                }
                if (c8679a413.f182a.m6052i() || c8679a413.f182a.m6055l()) {
                    c9068d416.f25799d = c9068d416.f25801f.f16548r.m6494c(view) + c9068d416.f25799d;
                }
            }
            if (m10308T0() && this.f16550t == 1) {
                iM6494c2 = this.f16549s.m6498g() - (((this.f16546p - 1) - c9068d41.f25800e) * this.f16551u);
                iM6501j = iM6494c2 - this.f16549s.m6494c(view);
            } else {
                iM6501j = this.f16549s.m6501j() + (c9068d41.f25800e * this.f16551u);
                iM6494c2 = this.f16549s.m6494c(view) + iM6501j;
            }
            if (this.f16550t == 1) {
                AbstractC11919zO0.m26403N(view, iM6501j, iM6494c, iM6494c2, iM17490h);
            } else {
                AbstractC11919zO0.m26403N(view, iM6494c, iM6501j, iM17490h, iM6494c2);
            }
            m10320f1(c9068d41, c10297mh02.f37838e, i8);
            m10313Y0(fo0, c10297mh02);
            if (c10297mh02.f37841h && view.hasFocusable()) {
                i2 = 0;
                this.f16555y.set(c9068d41.f25800e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z = true;
        }
        int i15 = i6;
        if (!z) {
            m10313Y0(fo0, c10297mh02);
        }
        int iM6501j3 = c10297mh02.f37838e == -1 ? this.f16548r.m6501j() - m10305Q0(this.f16548r.m6501j()) : m10303P0(this.f16548r.m6498g()) - this.f16548r.m6498g();
        return iM6501j3 > 0 ? Math.min(c10297mh0.f37835b, iM6501j3) : i15;
    }

    /* renamed from: J0 */
    public final View m10295J0(boolean z) {
        int iM6501j = this.f16548r.m6501j();
        int iM6498g = this.f16548r.m6498g();
        View view = null;
        for (int iM26426v = m26426v() - 1; iM26426v >= 0; iM26426v--) {
            View viewM26425u = m26425u(iM26426v);
            int iM6496e = this.f16548r.m6496e(viewM26425u);
            int iM6493b = this.f16548r.m6493b(viewM26425u);
            if (iM6493b > iM6501j && iM6496e < iM6498g) {
                if (iM6493b <= iM6498g || !z) {
                    return viewM26425u;
                }
                if (view == null) {
                    view = viewM26425u;
                }
            }
        }
        return view;
    }

    /* renamed from: K0 */
    public final View m10296K0(boolean z) {
        int iM6501j = this.f16548r.m6501j();
        int iM6498g = this.f16548r.m6498g();
        int iM26426v = m26426v();
        View view = null;
        for (int i = 0; i < iM26426v; i++) {
            View viewM26425u = m26425u(i);
            int iM6496e = this.f16548r.m6496e(viewM26425u);
            if (this.f16548r.m6493b(viewM26425u) > iM6501j && iM6496e < iM6498g) {
                if (iM6496e >= iM6501j || !z) {
                    return viewM26425u;
                }
                if (view == null) {
                    view = viewM26425u;
                }
            }
        }
        return view;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: L */
    public final boolean mo10191L() {
        return this.f16537C != 0;
    }

    /* renamed from: L0 */
    public final void m10297L0(FO0 fo0, KO0 ko0, boolean z) {
        int iM6498g;
        int iM10303P0 = m10303P0(Integer.MIN_VALUE);
        if (iM10303P0 != Integer.MIN_VALUE && (iM6498g = this.f16548r.m6498g() - iM10303P0) > 0) {
            int i = iM6498g - (-m10317c1(-iM6498g, fo0, ko0));
            if (!z || i <= 0) {
                return;
            }
            this.f16548r.m6506o(i);
        }
    }

    /* renamed from: M0 */
    public final void m10298M0(FO0 fo0, KO0 ko0, boolean z) {
        int iM6501j;
        int iM10305Q0 = m10305Q0(Integer.MAX_VALUE);
        if (iM10305Q0 != Integer.MAX_VALUE && (iM6501j = iM10305Q0 - this.f16548r.m6501j()) > 0) {
            int iM10317c1 = iM6501j - m10317c1(iM6501j, fo0, ko0);
            if (!z || iM10317c1 <= 0) {
                return;
            }
            this.f16548r.m6506o(-iM10317c1);
        }
    }

    /* renamed from: N0 */
    public final int m10299N0() {
        if (m26426v() == 0) {
            return 0;
        }
        return AbstractC11919zO0.m26400H(m26425u(0));
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: O */
    public final void mo10300O(int i) {
        super.mo10300O(i);
        for (int i2 = 0; i2 < this.f16546p; i2++) {
            C9068d41 c9068d41 = this.f16547q[i2];
            int i3 = c9068d41.f25797b;
            if (i3 != Integer.MIN_VALUE) {
                c9068d41.f25797b = i3 + i;
            }
            int i4 = c9068d41.f25798c;
            if (i4 != Integer.MIN_VALUE) {
                c9068d41.f25798c = i4 + i;
            }
        }
    }

    /* renamed from: O0 */
    public final int m10301O0() {
        int iM26426v = m26426v();
        if (iM26426v == 0) {
            return 0;
        }
        return AbstractC11919zO0.m26400H(m26425u(iM26426v - 1));
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: P */
    public final void mo10302P(int i) {
        super.mo10302P(i);
        for (int i2 = 0; i2 < this.f16546p; i2++) {
            C9068d41 c9068d41 = this.f16547q[i2];
            int i3 = c9068d41.f25797b;
            if (i3 != Integer.MIN_VALUE) {
                c9068d41.f25797b = i3 + i;
            }
            int i4 = c9068d41.f25798c;
            if (i4 != Integer.MIN_VALUE) {
                c9068d41.f25798c = i4 + i;
            }
        }
    }

    /* renamed from: P0 */
    public final int m10303P0(int i) {
        int iM17488f = this.f16547q[0].m17488f(i);
        for (int i2 = 1; i2 < this.f16546p; i2++) {
            int iM17488f2 = this.f16547q[i2].m17488f(i);
            if (iM17488f2 > iM17488f) {
                iM17488f = iM17488f2;
            }
        }
        return iM17488f;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: Q */
    public final void mo10304Q() {
        this.f16536B.m2295p();
        for (int i = 0; i < this.f16546p; i++) {
            this.f16547q[i].m17484b();
        }
    }

    /* renamed from: Q0 */
    public final int m10305Q0(int i) {
        int iM17490h = this.f16547q[0].m17490h(i);
        for (int i2 = 1; i2 < this.f16546p; i2++) {
            int iM17490h2 = this.f16547q[i2].m17490h(i);
            if (iM17490h2 < iM17490h) {
                iM17490h = iM17490h2;
            }
        }
        return iM17490h;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0036  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10306R0(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m10306R0(int, int, int):void");
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: S */
    public final void mo10198S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f46814b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f16545K);
        }
        for (int i = 0; i < this.f16546p; i++) {
            this.f16547q[i].m17484b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x002c A[SYNTHETIC] */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m10307S0() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m10307S0():android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0063  */
    @Override // p000.AbstractC11919zO0
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo10151T(android.view.View r9, int r10, p000.FO0 r11, p000.KO0 r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo10151T(android.view.View, int, FO0, KO0):android.view.View");
    }

    /* renamed from: T0 */
    public final boolean m10308T0() {
        return m26409C() == 1;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: U */
    public final void mo10201U(AccessibilityEvent accessibilityEvent) {
        super.mo10201U(accessibilityEvent);
        if (m26426v() > 0) {
            View viewM10296K0 = m10296K0(false);
            View viewM10295J0 = m10295J0(false);
            if (viewM10296K0 == null || viewM10295J0 == null) {
                return;
            }
            int iM26400H = AbstractC11919zO0.m26400H(viewM10296K0);
            int iM26400H2 = AbstractC11919zO0.m26400H(viewM10295J0);
            if (iM26400H < iM26400H2) {
                accessibilityEvent.setFromIndex(iM26400H);
                accessibilityEvent.setToIndex(iM26400H2);
            } else {
                accessibilityEvent.setFromIndex(iM26400H2);
                accessibilityEvent.setToIndex(iM26400H);
            }
        }
    }

    /* renamed from: U0 */
    public final void m10309U0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f46814b;
        Rect rect = this.f16541G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m10246N(view));
        }
        C8679a41 c8679a41 = (C8679a41) view.getLayoutParams();
        int iM10288g1 = m10288g1(i, ((ViewGroup.MarginLayoutParams) c8679a41).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c8679a41).rightMargin + rect.right);
        int iM10288g12 = m10288g1(i2, ((ViewGroup.MarginLayoutParams) c8679a41).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c8679a41).bottomMargin + rect.bottom);
        if (m26429x0(view, iM10288g1, iM10288g12, c8679a41)) {
            view.measure(iM10288g1, iM10288g12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:397:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0405  */
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10310V0(p000.FO0 r17, p000.KO0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m10310V0(FO0, KO0, boolean):void");
    }

    /* renamed from: W0 */
    public final boolean m10311W0(int i) {
        if (this.f16550t == 0) {
            return (i == -1) != this.f16554x;
        }
        return ((i == -1) == this.f16554x) == m10308T0();
    }

    /* renamed from: X0 */
    public final void m10312X0(int i, KO0 ko0) {
        int iM10299N0;
        int i2;
        if (i > 0) {
            iM10299N0 = m10301O0();
            i2 = 1;
        } else {
            iM10299N0 = m10299N0();
            i2 = -1;
        }
        C10297mh0 c10297mh0 = this.f16552v;
        c10297mh0.f37834a = true;
        m10319e1(iM10299N0, ko0);
        m10318d1(i2);
        c10297mh0.f37836c = iM10299N0 + c10297mh0.f37837d;
        c10297mh0.f37835b = Math.abs(i);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: Y */
    public final void mo10155Y(int i, int i2) {
        m10306R0(i, i2, 1);
    }

    /* renamed from: Y0 */
    public final void m10313Y0(FO0 fo0, C10297mh0 c10297mh0) {
        if (!c10297mh0.f37834a || c10297mh0.f37842i) {
            return;
        }
        if (c10297mh0.f37835b == 0) {
            if (c10297mh0.f37838e == -1) {
                m10314Z0(fo0, c10297mh0.f37840g);
                return;
            } else {
                m10315a1(fo0, c10297mh0.f37839f);
                return;
            }
        }
        int i = 1;
        if (c10297mh0.f37838e == -1) {
            int i2 = c10297mh0.f37839f;
            int iM17490h = this.f16547q[0].m17490h(i2);
            while (i < this.f16546p) {
                int iM17490h2 = this.f16547q[i].m17490h(i2);
                if (iM17490h2 > iM17490h) {
                    iM17490h = iM17490h2;
                }
                i++;
            }
            int i3 = i2 - iM17490h;
            m10314Z0(fo0, i3 < 0 ? c10297mh0.f37840g : c10297mh0.f37840g - Math.min(i3, c10297mh0.f37835b));
            return;
        }
        int i4 = c10297mh0.f37840g;
        int iM17488f = this.f16547q[0].m17488f(i4);
        while (i < this.f16546p) {
            int iM17488f2 = this.f16547q[i].m17488f(i4);
            if (iM17488f2 < iM17488f) {
                iM17488f = iM17488f2;
            }
            i++;
        }
        int i5 = iM17488f - c10297mh0.f37840g;
        m10315a1(fo0, i5 < 0 ? c10297mh0.f37839f : Math.min(i5, c10297mh0.f37835b) + c10297mh0.f37839f);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: Z */
    public final void mo10157Z() {
        this.f16536B.m2295p();
        m26421o0();
    }

    /* renamed from: Z0 */
    public final void m10314Z0(FO0 fo0, int i) {
        for (int iM26426v = m26426v() - 1; iM26426v >= 0; iM26426v--) {
            View viewM26425u = m26425u(iM26426v);
            if (this.f16548r.m6496e(viewM26425u) < i || this.f16548r.m6505n(viewM26425u) < i) {
                return;
            }
            C8679a41 c8679a41 = (C8679a41) viewM26425u.getLayoutParams();
            c8679a41.getClass();
            if (c8679a41.f15302e.f25796a.size() == 1) {
                return;
            }
            C9068d41 c9068d41 = c8679a41.f15302e;
            ArrayList arrayList = c9068d41.f25796a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C8679a41 c8679a412 = (C8679a41) view.getLayoutParams();
            c8679a412.f15302e = null;
            if (c8679a412.f182a.m6052i() || c8679a412.f182a.m6055l()) {
                c9068d41.f25799d -= c9068d41.f25801f.f16548r.m6494c(view);
            }
            if (size == 1) {
                c9068d41.f25797b = Integer.MIN_VALUE;
            }
            c9068d41.f25798c = Integer.MIN_VALUE;
            m26419l0(viewM26425u, fo0);
        }
    }

    @Override // p000.JO0
    /* renamed from: a */
    public final PointF mo4305a(int i) {
        int iM10289D0 = m10289D0(i);
        PointF pointF = new PointF();
        if (iM10289D0 == 0) {
            return null;
        }
        if (this.f16550t == 0) {
            pointF.x = iM10289D0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM10289D0;
        }
        return pointF;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: a0 */
    public final void mo10158a0(int i, int i2) {
        m10306R0(i, i2, 8);
    }

    /* renamed from: a1 */
    public final void m10315a1(FO0 fo0, int i) {
        while (m26426v() > 0) {
            View viewM26425u = m26425u(0);
            if (this.f16548r.m6493b(viewM26425u) > i || this.f16548r.m6504m(viewM26425u) > i) {
                return;
            }
            C8679a41 c8679a41 = (C8679a41) viewM26425u.getLayoutParams();
            c8679a41.getClass();
            if (c8679a41.f15302e.f25796a.size() == 1) {
                return;
            }
            C9068d41 c9068d41 = c8679a41.f15302e;
            ArrayList arrayList = c9068d41.f25796a;
            View view = (View) arrayList.remove(0);
            C8679a41 c8679a412 = (C8679a41) view.getLayoutParams();
            c8679a412.f15302e = null;
            if (arrayList.size() == 0) {
                c9068d41.f25798c = Integer.MIN_VALUE;
            }
            if (c8679a412.f182a.m6052i() || c8679a412.f182a.m6055l()) {
                c9068d41.f25799d -= c9068d41.f25801f.f16548r.m6494c(view);
            }
            c9068d41.f25797b = Integer.MIN_VALUE;
            m26419l0(viewM26425u, fo0);
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: b0 */
    public final void mo10159b0(int i, int i2) {
        m10306R0(i, i2, 2);
    }

    /* renamed from: b1 */
    public final void m10316b1() {
        if (this.f16550t == 1 || !m10308T0()) {
            this.f16554x = this.f16553w;
        } else {
            this.f16554x = !this.f16553w;
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: c */
    public final void mo10208c(String str) {
        if (this.f16540F == null) {
            super.mo10208c(str);
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: c0 */
    public final void mo10160c0(int i, int i2) {
        m10306R0(i, i2, 4);
    }

    /* renamed from: c1 */
    public final int m10317c1(int i, FO0 fo0, KO0 ko0) {
        if (m26426v() == 0 || i == 0) {
            return 0;
        }
        m10312X0(i, ko0);
        C10297mh0 c10297mh0 = this.f16552v;
        int iM10294I0 = m10294I0(fo0, c10297mh0, ko0);
        if (c10297mh0.f37835b >= iM10294I0) {
            i = i < 0 ? -iM10294I0 : iM10294I0;
        }
        this.f16548r.m6506o(-i);
        this.f16538D = this.f16554x;
        c10297mh0.f37835b = 0;
        m10313Y0(fo0, c10297mh0);
        return i;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: d */
    public final boolean mo10210d() {
        return this.f16550t == 0;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: d0 */
    public final void mo10161d0(FO0 fo0, KO0 ko0) {
        m10310V0(fo0, ko0, true);
    }

    /* renamed from: d1 */
    public final void m10318d1(int i) {
        C10297mh0 c10297mh0 = this.f16552v;
        c10297mh0.f37838e = i;
        c10297mh0.f37837d = this.f16554x != (i == -1) ? -1 : 1;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: e */
    public final boolean mo10212e() {
        return this.f16550t == 1;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: e0 */
    public final void mo10162e0(KO0 ko0) {
        this.f16556z = -1;
        this.f16535A = Integer.MIN_VALUE;
        this.f16540F = null;
        this.f16542H.m9462a();
    }

    /* renamed from: e1 */
    public final void m10319e1(int i, KO0 ko0) {
        int iM6502k;
        int iM6502k2;
        int i2;
        C10297mh0 c10297mh0 = this.f16552v;
        boolean z = false;
        c10297mh0.f37835b = 0;
        c10297mh0.f37836c = i;
        C8760aj0 c8760aj0 = this.f46817e;
        if (!(c8760aj0 != null && c8760aj0.f15641e) || (i2 = ko0.f6045a) == -1) {
            iM6502k = 0;
            iM6502k2 = 0;
        } else {
            if (this.f16554x == (i2 < i)) {
                iM6502k = this.f16548r.m6502k();
                iM6502k2 = 0;
            } else {
                iM6502k2 = this.f16548r.m6502k();
                iM6502k = 0;
            }
        }
        RecyclerView recyclerView = this.f46814b;
        if (recyclerView == null || !recyclerView.f16506h) {
            c10297mh0.f37840g = this.f16548r.m6497f() + iM6502k;
            c10297mh0.f37839f = -iM6502k2;
        } else {
            c10297mh0.f37839f = this.f16548r.m6501j() - iM6502k2;
            c10297mh0.f37840g = this.f16548r.m6498g() + iM6502k;
        }
        c10297mh0.f37841h = false;
        c10297mh0.f37834a = true;
        if (this.f16548r.m6500i() == 0 && this.f16548r.m6497f() == 0) {
            z = true;
        }
        c10297mh0.f37842i = z;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: f */
    public final boolean mo10164f(AO0 ao0) {
        return ao0 instanceof C8679a41;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: f0 */
    public final void mo10213f0(Parcelable parcelable) {
        if (parcelable instanceof C8935c41) {
            C8935c41 c8935c41 = (C8935c41) parcelable;
            this.f16540F = c8935c41;
            if (this.f16556z != -1) {
                c8935c41.f17285d = null;
                c8935c41.f17284c = 0;
                c8935c41.f17282a = -1;
                c8935c41.f17283b = -1;
                c8935c41.f17285d = null;
                c8935c41.f17284c = 0;
                c8935c41.f17286e = 0;
                c8935c41.f17287f = null;
                c8935c41.f17288g = null;
            }
            m26421o0();
        }
    }

    /* renamed from: f1 */
    public final void m10320f1(C9068d41 c9068d41, int i, int i2) {
        int i3 = c9068d41.f25799d;
        int i4 = c9068d41.f25800e;
        if (i != -1) {
            int i5 = c9068d41.f25798c;
            if (i5 == Integer.MIN_VALUE) {
                c9068d41.m17483a();
                i5 = c9068d41.f25798c;
            }
            if (i5 - i3 >= i2) {
                this.f16555y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c9068d41.f25797b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) c9068d41.f25796a.get(0);
            C8679a41 c8679a41 = (C8679a41) view.getLayoutParams();
            c9068d41.f25797b = c9068d41.f25801f.f16548r.m6496e(view);
            c8679a41.getClass();
            i6 = c9068d41.f25797b;
        }
        if (i6 + i3 <= i2) {
            this.f16555y.set(i4, false);
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: g0 */
    public final Parcelable mo10215g0() {
        int iM17490h;
        int iM6501j;
        int[] iArr;
        C8935c41 c8935c41 = this.f16540F;
        if (c8935c41 != null) {
            C8935c41 c8935c412 = new C8935c41();
            c8935c412.f17284c = c8935c41.f17284c;
            c8935c412.f17282a = c8935c41.f17282a;
            c8935c412.f17283b = c8935c41.f17283b;
            c8935c412.f17285d = c8935c41.f17285d;
            c8935c412.f17286e = c8935c41.f17286e;
            c8935c412.f17287f = c8935c41.f17287f;
            c8935c412.f17289h = c8935c41.f17289h;
            c8935c412.f17290i = c8935c41.f17290i;
            c8935c412.f17291j = c8935c41.f17291j;
            c8935c412.f17288g = c8935c41.f17288g;
            return c8935c412;
        }
        C8935c41 c8935c413 = new C8935c41();
        c8935c413.f17289h = this.f16553w;
        c8935c413.f17290i = this.f16538D;
        c8935c413.f17291j = this.f16539E;
        ES1 es1 = this.f16536B;
        if (es1 == null || (iArr = (int[]) es1.f2708b) == null) {
            c8935c413.f17286e = 0;
        } else {
            c8935c413.f17287f = iArr;
            c8935c413.f17286e = iArr.length;
            c8935c413.f17288g = (ArrayList) es1.f2709c;
        }
        if (m26426v() > 0) {
            c8935c413.f17282a = this.f16538D ? m10301O0() : m10299N0();
            View viewM10295J0 = this.f16554x ? m10295J0(true) : m10296K0(true);
            c8935c413.f17283b = viewM10295J0 != null ? AbstractC11919zO0.m26400H(viewM10295J0) : -1;
            int i = this.f16546p;
            c8935c413.f17284c = i;
            c8935c413.f17285d = new int[i];
            for (int i2 = 0; i2 < this.f16546p; i2++) {
                if (this.f16538D) {
                    iM17490h = this.f16547q[i2].m17488f(Integer.MIN_VALUE);
                    if (iM17490h != Integer.MIN_VALUE) {
                        iM6501j = this.f16548r.m6498g();
                        iM17490h -= iM6501j;
                    }
                } else {
                    iM17490h = this.f16547q[i2].m17490h(Integer.MIN_VALUE);
                    if (iM17490h != Integer.MIN_VALUE) {
                        iM6501j = this.f16548r.m6501j();
                        iM17490h -= iM6501j;
                    }
                }
                c8935c413.f17285d[i2] = iM17490h;
            }
        } else {
            c8935c413.f17282a = -1;
            c8935c413.f17283b = -1;
            c8935c413.f17284c = 0;
        }
        return c8935c413;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: h */
    public final void mo10217h(int i, int i2, KO0 ko0, C6327ks c6327ks) {
        C10297mh0 c10297mh0;
        int iM17488f;
        int iM17490h;
        if (this.f16550t != 0) {
            i = i2;
        }
        if (m26426v() == 0 || i == 0) {
            return;
        }
        m10312X0(i, ko0);
        int[] iArr = this.f16544J;
        if (iArr == null || iArr.length < this.f16546p) {
            this.f16544J = new int[this.f16546p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f16546p;
            c10297mh0 = this.f16552v;
            if (i3 >= i5) {
                break;
            }
            if (c10297mh0.f37837d == -1) {
                iM17488f = c10297mh0.f37839f;
                iM17490h = this.f16547q[i3].m17490h(iM17488f);
            } else {
                iM17488f = this.f16547q[i3].m17488f(c10297mh0.f37840g);
                iM17490h = c10297mh0.f37840g;
            }
            int i6 = iM17488f - iM17490h;
            if (i6 >= 0) {
                this.f16544J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f16544J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c10297mh0.f37836c;
            if (i8 < 0 || i8 >= ko0.m4625b()) {
                return;
            }
            c6327ks.m22276b(c10297mh0.f37836c, this.f16544J[i7]);
            c10297mh0.f37836c += c10297mh0.f37837d;
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: h0 */
    public final void mo10321h0(int i) {
        if (i == 0) {
            m10290E0();
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: j */
    public final int mo10220j(KO0 ko0) {
        return m10291F0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: k */
    public final int mo10167k(KO0 ko0) {
        return m10292G0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: l */
    public final int mo10169l(KO0 ko0) {
        return m10293H0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: m */
    public final int mo10221m(KO0 ko0) {
        return m10291F0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: n */
    public final int mo10172n(KO0 ko0) {
        return m10292G0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: o */
    public final int mo10174o(KO0 ko0) {
        return m10293H0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: p0 */
    public final int mo10176p0(int i, FO0 fo0, KO0 ko0) {
        return m10317c1(i, fo0, ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: q0 */
    public final void mo10223q0(int i) {
        C8935c41 c8935c41 = this.f16540F;
        if (c8935c41 != null && c8935c41.f17282a != i) {
            c8935c41.f17285d = null;
            c8935c41.f17284c = 0;
            c8935c41.f17282a = -1;
            c8935c41.f17283b = -1;
        }
        this.f16556z = i;
        this.f16535A = Integer.MIN_VALUE;
        m26421o0();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: r */
    public final AO0 mo10179r() {
        return this.f16550t == 0 ? new C8679a41(-2, -1) : new C8679a41(-1, -2);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: r0 */
    public final int mo10180r0(int i, FO0 fo0, KO0 ko0) {
        return m10317c1(i, fo0, ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: s */
    public final AO0 mo10181s(Context context, AttributeSet attributeSet) {
        return new C8679a41(context, attributeSet);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: t */
    public final AO0 mo10182t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C8679a41((ViewGroup.MarginLayoutParams) layoutParams) : new C8679a41(layoutParams);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: u0 */
    public final void mo10183u0(Rect rect, int i, int i2) {
        int iM26404g;
        int iM26404g2;
        int i3 = this.f16546p;
        int iM26412F = m26412F() + m26411E();
        int iM26410D = m26410D() + m26413G();
        if (this.f16550t == 1) {
            int iHeight = rect.height() + iM26410D;
            RecyclerView recyclerView = this.f46814b;
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            iM26404g2 = AbstractC11919zO0.m26404g(i2, iHeight, recyclerView.getMinimumHeight());
            iM26404g = AbstractC11919zO0.m26404g(i, (this.f16551u * i3) + iM26412F, this.f46814b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM26412F;
            RecyclerView recyclerView2 = this.f46814b;
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            iM26404g = AbstractC11919zO0.m26404g(i, iWidth, recyclerView2.getMinimumWidth());
            iM26404g2 = AbstractC11919zO0.m26404g(i2, (this.f16551u * i3) + iM26410D, this.f46814b.getMinimumHeight());
        }
        this.f46814b.setMeasuredDimension(iM26404g, iM26404g2);
    }
}
