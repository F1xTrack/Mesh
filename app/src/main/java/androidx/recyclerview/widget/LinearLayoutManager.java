package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p000.AO0;
import p000.AbstractC11153tN0;
import p000.AbstractC11919zO0;
import p000.C11792yO0;
import p000.C1664aR;
import p000.C6327ks;
import p000.C8142Py0;
import p000.C8526Xi0;
import p000.C8578Yi0;
import p000.C8630Zi0;
import p000.C8760aj0;
import p000.ER1;
import p000.FO0;
import p000.JO0;
import p000.KO0;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC11919zO0 implements JO0 {

    /* renamed from: A */
    public final C1664aR f16435A;

    /* renamed from: B */
    public final C8526Xi0 f16436B;

    /* renamed from: C */
    public final int f16437C;

    /* renamed from: D */
    public final int[] f16438D;

    /* renamed from: p */
    public int f16439p;

    /* renamed from: q */
    public C8578Yi0 f16440q;

    /* renamed from: r */
    public C8142Py0 f16441r;

    /* renamed from: s */
    public boolean f16442s;

    /* renamed from: t */
    public final boolean f16443t;

    /* renamed from: u */
    public boolean f16444u;

    /* renamed from: v */
    public boolean f16445v;

    /* renamed from: w */
    public final boolean f16446w;

    /* renamed from: x */
    public int f16447x;

    /* renamed from: y */
    public int f16448y;

    /* renamed from: z */
    public C8630Zi0 f16449z;

    public LinearLayoutManager(int i) {
        this.f16439p = 1;
        this.f16443t = false;
        this.f16444u = false;
        this.f16445v = false;
        this.f16446w = true;
        this.f16447x = -1;
        this.f16448y = Integer.MIN_VALUE;
        this.f16449z = null;
        this.f16435A = new C1664aR();
        this.f16436B = new C8526Xi0();
        this.f16437C = 2;
        this.f16438D = new int[2];
        m10211d1(i);
        mo10208c(null);
        if (this.f16443t) {
            this.f16443t = false;
            m26421o0();
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: A0 */
    public void mo9354A0(RecyclerView recyclerView, int i) {
        C8760aj0 c8760aj0 = new C8760aj0(recyclerView.getContext());
        c8760aj0.f15637a = i;
        m26408B0(c8760aj0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: C0 */
    public boolean mo10147C0() {
        return this.f16449z == null && this.f16442s == this.f16445v;
    }

    /* renamed from: D0 */
    public void mo9355D0(KO0 ko0, int[] iArr) {
        int i;
        int iM6502k = ko0.f6045a != -1 ? this.f16441r.m6502k() : 0;
        if (this.f16440q.f14464f == -1) {
            i = 0;
        } else {
            i = iM6502k;
            iM6502k = 0;
        }
        iArr[0] = iM6502k;
        iArr[1] = i;
    }

    /* renamed from: E0 */
    public void mo10148E0(KO0 ko0, C8578Yi0 c8578Yi0, C6327ks c6327ks) {
        int i = c8578Yi0.f14462d;
        if (i < 0 || i >= ko0.m4625b()) {
            return;
        }
        c6327ks.m22276b(i, Math.max(0, c8578Yi0.f14465g));
    }

    /* renamed from: F0 */
    public final int m10185F0(KO0 ko0) {
        if (m26426v() == 0) {
            return 0;
        }
        m10189J0();
        C8142Py0 c8142Py0 = this.f16441r;
        boolean z = !this.f16446w;
        return ER1.m2270a(ko0, c8142Py0, m10193M0(z), m10192L0(z), this, this.f16446w);
    }

    /* renamed from: G0 */
    public final int m10186G0(KO0 ko0) {
        if (m26426v() == 0) {
            return 0;
        }
        m10189J0();
        C8142Py0 c8142Py0 = this.f16441r;
        boolean z = !this.f16446w;
        return ER1.m2271b(ko0, c8142Py0, m10193M0(z), m10192L0(z), this, this.f16446w, this.f16444u);
    }

    /* renamed from: H0 */
    public final int m10187H0(KO0 ko0) {
        if (m26426v() == 0) {
            return 0;
        }
        m10189J0();
        C8142Py0 c8142Py0 = this.f16441r;
        boolean z = !this.f16446w;
        return ER1.m2272c(ko0, c8142Py0, m10193M0(z), m10192L0(z), this, this.f16446w);
    }

    /* renamed from: I0 */
    public final int m10188I0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f16439p == 1) ? 1 : Integer.MIN_VALUE : this.f16439p == 0 ? 1 : Integer.MIN_VALUE : this.f16439p == 1 ? -1 : Integer.MIN_VALUE : this.f16439p == 0 ? -1 : Integer.MIN_VALUE : (this.f16439p != 1 && m10204W0()) ? -1 : 1 : (this.f16439p != 1 && m10204W0()) ? 1 : -1;
    }

    /* renamed from: J0 */
    public final void m10189J0() {
        if (this.f16440q == null) {
            C8578Yi0 c8578Yi0 = new C8578Yi0();
            c8578Yi0.f14459a = true;
            c8578Yi0.f14466h = 0;
            c8578Yi0.f14467i = 0;
            c8578Yi0.f14469k = null;
            this.f16440q = c8578Yi0;
        }
    }

    /* renamed from: K0 */
    public final int m10190K0(FO0 fo0, C8578Yi0 c8578Yi0, KO0 ko0, boolean z) {
        int i;
        int i2 = c8578Yi0.f14461c;
        int i3 = c8578Yi0.f14465g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c8578Yi0.f14465g = i3 + i2;
            }
            m10205Z0(fo0, c8578Yi0);
        }
        int i4 = c8578Yi0.f14461c + c8578Yi0.f14466h;
        while (true) {
            if ((!c8578Yi0.f14470l && i4 <= 0) || (i = c8578Yi0.f14462d) < 0 || i >= ko0.m4625b()) {
                break;
            }
            C8526Xi0 c8526Xi0 = this.f16436B;
            c8526Xi0.f13927a = 0;
            c8526Xi0.f13928b = false;
            c8526Xi0.f13929c = false;
            c8526Xi0.f13930d = false;
            mo10154X0(fo0, ko0, c8578Yi0, c8526Xi0);
            if (!c8526Xi0.f13928b) {
                int i5 = c8578Yi0.f14460b;
                int i6 = c8526Xi0.f13927a;
                c8578Yi0.f14460b = (c8578Yi0.f14464f * i6) + i5;
                if (!c8526Xi0.f13929c || c8578Yi0.f14469k != null || !ko0.f6051g) {
                    c8578Yi0.f14461c -= i6;
                    i4 -= i6;
                }
                int i7 = c8578Yi0.f14465g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c8578Yi0.f14465g = i8;
                    int i9 = c8578Yi0.f14461c;
                    if (i9 < 0) {
                        c8578Yi0.f14465g = i8 + i9;
                    }
                    m10205Z0(fo0, c8578Yi0);
                }
                if (z && c8526Xi0.f13930d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c8578Yi0.f14461c;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: L */
    public final boolean mo10191L() {
        return true;
    }

    /* renamed from: L0 */
    public final View m10192L0(boolean z) {
        return this.f16444u ? m10197Q0(0, m26426v(), z) : m10197Q0(m26426v() - 1, -1, z);
    }

    /* renamed from: M0 */
    public final View m10193M0(boolean z) {
        return this.f16444u ? m10197Q0(m26426v() - 1, -1, z) : m10197Q0(0, m26426v(), z);
    }

    /* renamed from: N0 */
    public final int m10194N0() {
        View viewM10197Q0 = m10197Q0(0, m26426v(), false);
        if (viewM10197Q0 == null) {
            return -1;
        }
        return AbstractC11919zO0.m26400H(viewM10197Q0);
    }

    /* renamed from: O0 */
    public final int m10195O0() {
        View viewM10197Q0 = m10197Q0(m26426v() - 1, -1, false);
        if (viewM10197Q0 == null) {
            return -1;
        }
        return AbstractC11919zO0.m26400H(viewM10197Q0);
    }

    /* renamed from: P0 */
    public final View m10196P0(int i, int i2) {
        int i3;
        int i4;
        m10189J0();
        if (i2 <= i && i2 >= i) {
            return m26425u(i);
        }
        if (this.f16441r.m6496e(m26425u(i)) < this.f16441r.m6501j()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f16439p == 0 ? this.f46815c.m9802a(i, i2, i3, i4) : this.f46816d.m9802a(i, i2, i3, i4);
    }

    /* renamed from: Q0 */
    public final View m10197Q0(int i, int i2, boolean z) {
        m10189J0();
        int i3 = z ? 24579 : 320;
        return this.f16439p == 0 ? this.f46815c.m9802a(i, i2, i3, 320) : this.f46816d.m9802a(i, i2, i3, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0079  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo10150R0(p000.FO0 r17, p000.KO0 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.m10189J0()
            int r1 = r16.m26426v()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.m26426v()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.m4625b()
            Py0 r7 = r0.f16441r
            int r7 = r7.m6501j()
            Py0 r8 = r0.f16441r
            int r8 = r8.m6498g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.m26425u(r1)
            int r13 = p000.AbstractC11919zO0.m26400H(r12)
            Py0 r14 = r0.f16441r
            int r14 = r14.m6496e(r12)
            Py0 r15 = r0.f16441r
            int r15 = r15.m6493b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            AO0 r13 = (p000.AO0) r13
            OO0 r13 = r13.f182a
            boolean r13 = r13.m6052i()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            goto L84
        L7f:
            if (r10 == 0) goto L83
            r9 = r10
            goto L84
        L83:
            r9 = r11
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo10150R0(FO0, KO0, boolean, boolean):android.view.View");
    }

    /* renamed from: S0 */
    public final int m10199S0(int i, FO0 fo0, KO0 ko0, boolean z) {
        int iM6498g;
        int iM6498g2 = this.f16441r.m6498g() - i;
        if (iM6498g2 <= 0) {
            return 0;
        }
        int i2 = -m10209c1(-iM6498g2, fo0, ko0);
        int i3 = i + i2;
        if (!z || (iM6498g = this.f16441r.m6498g() - i3) <= 0) {
            return i2;
        }
        this.f16441r.m6506o(iM6498g);
        return iM6498g + i2;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: T */
    public View mo10151T(View view, int i, FO0 fo0, KO0 ko0) {
        int iM10188I0;
        m10207b1();
        if (m26426v() == 0 || (iM10188I0 = m10188I0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m10189J0();
        m10214f1(iM10188I0, (int) (this.f16441r.m6502k() * 0.33333334f), false, ko0);
        C8578Yi0 c8578Yi0 = this.f16440q;
        c8578Yi0.f14465g = Integer.MIN_VALUE;
        c8578Yi0.f14459a = false;
        m10190K0(fo0, c8578Yi0, ko0, true);
        View viewM10196P0 = iM10188I0 == -1 ? this.f16444u ? m10196P0(m26426v() - 1, -1) : m10196P0(0, m26426v()) : this.f16444u ? m10196P0(0, m26426v()) : m10196P0(m26426v() - 1, -1);
        View viewM10203V0 = iM10188I0 == -1 ? m10203V0() : m10202U0();
        if (!viewM10203V0.hasFocusable()) {
            return viewM10196P0;
        }
        if (viewM10196P0 == null) {
            return null;
        }
        return viewM10203V0;
    }

    /* renamed from: T0 */
    public final int m10200T0(int i, FO0 fo0, KO0 ko0, boolean z) {
        int iM6501j;
        int iM6501j2 = i - this.f16441r.m6501j();
        if (iM6501j2 <= 0) {
            return 0;
        }
        int i2 = -m10209c1(iM6501j2, fo0, ko0);
        int i3 = i + i2;
        if (!z || (iM6501j = i3 - this.f16441r.m6501j()) <= 0) {
            return i2;
        }
        this.f16441r.m6506o(-iM6501j);
        return i2 - iM6501j;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: U */
    public final void mo10201U(AccessibilityEvent accessibilityEvent) {
        super.mo10201U(accessibilityEvent);
        if (m26426v() > 0) {
            accessibilityEvent.setFromIndex(m10194N0());
            accessibilityEvent.setToIndex(m10195O0());
        }
    }

    /* renamed from: U0 */
    public final View m10202U0() {
        return m26425u(this.f16444u ? 0 : m26426v() - 1);
    }

    /* renamed from: V0 */
    public final View m10203V0() {
        return m26425u(this.f16444u ? m26426v() - 1 : 0);
    }

    /* renamed from: W0 */
    public final boolean m10204W0() {
        return m26409C() == 1;
    }

    /* renamed from: X0 */
    public void mo10154X0(FO0 fo0, KO0 ko0, C8578Yi0 c8578Yi0, C8526Xi0 c8526Xi0) {
        int iM26411E;
        int i;
        int i2;
        int iM6495d;
        View viewM9342b = c8578Yi0.m9342b(fo0);
        if (viewM9342b == null) {
            c8526Xi0.f13928b = true;
            return;
        }
        AO0 ao0 = (AO0) viewM9342b.getLayoutParams();
        if (c8578Yi0.f14469k == null) {
            if (this.f16444u == (c8578Yi0.f14464f == -1)) {
                m26416b(-1, viewM9342b, false);
            } else {
                m26416b(0, viewM9342b, false);
            }
        } else {
            if (this.f16444u == (c8578Yi0.f14464f == -1)) {
                m26416b(-1, viewM9342b, true);
            } else {
                m26416b(0, viewM9342b, true);
            }
        }
        AO0 ao02 = (AO0) viewM9342b.getLayoutParams();
        Rect rectM10246N = this.f46814b.m10246N(viewM9342b);
        int i3 = rectM10246N.left + rectM10246N.right;
        int i4 = rectM10246N.top + rectM10246N.bottom;
        int iM26405w = AbstractC11919zO0.m26405w(mo10210d(), this.f46826n, this.f46824l, m26412F() + m26411E() + ((ViewGroup.MarginLayoutParams) ao02).leftMargin + ((ViewGroup.MarginLayoutParams) ao02).rightMargin + i3, ((ViewGroup.MarginLayoutParams) ao02).width);
        int iM26405w2 = AbstractC11919zO0.m26405w(mo10212e(), this.f46827o, this.f46825m, m26410D() + m26413G() + ((ViewGroup.MarginLayoutParams) ao02).topMargin + ((ViewGroup.MarginLayoutParams) ao02).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) ao02).height);
        if (m26429x0(viewM9342b, iM26405w, iM26405w2, ao02)) {
            viewM9342b.measure(iM26405w, iM26405w2);
        }
        c8526Xi0.f13927a = this.f16441r.m6494c(viewM9342b);
        if (this.f16439p == 1) {
            if (m10204W0()) {
                iM6495d = this.f46826n - m26412F();
                iM26411E = iM6495d - this.f16441r.m6495d(viewM9342b);
            } else {
                iM26411E = m26411E();
                iM6495d = this.f16441r.m6495d(viewM9342b) + iM26411E;
            }
            if (c8578Yi0.f14464f == -1) {
                i = c8578Yi0.f14460b;
                i2 = i - c8526Xi0.f13927a;
            } else {
                i2 = c8578Yi0.f14460b;
                i = c8526Xi0.f13927a + i2;
            }
        } else {
            int iM26413G = m26413G();
            int iM6495d2 = this.f16441r.m6495d(viewM9342b) + iM26413G;
            if (c8578Yi0.f14464f == -1) {
                int i5 = c8578Yi0.f14460b;
                int i6 = i5 - c8526Xi0.f13927a;
                iM6495d = i5;
                i = iM6495d2;
                iM26411E = i6;
                i2 = iM26413G;
            } else {
                int i7 = c8578Yi0.f14460b;
                int i8 = c8526Xi0.f13927a + i7;
                iM26411E = i7;
                i = iM6495d2;
                i2 = iM26413G;
                iM6495d = i8;
            }
        }
        AbstractC11919zO0.m26403N(viewM9342b, iM26411E, i2, iM6495d, i);
        if (ao0.f182a.m6052i() || ao0.f182a.m6055l()) {
            c8526Xi0.f13929c = true;
        }
        c8526Xi0.f13930d = viewM9342b.hasFocusable();
    }

    /* renamed from: Z0 */
    public final void m10205Z0(FO0 fo0, C8578Yi0 c8578Yi0) {
        if (!c8578Yi0.f14459a || c8578Yi0.f14470l) {
            return;
        }
        int i = c8578Yi0.f14465g;
        int i2 = c8578Yi0.f14467i;
        if (c8578Yi0.f14464f == -1) {
            int iM26426v = m26426v();
            if (i < 0) {
                return;
            }
            int iM6497f = (this.f16441r.m6497f() - i) + i2;
            if (this.f16444u) {
                for (int i3 = 0; i3 < iM26426v; i3++) {
                    View viewM26425u = m26425u(i3);
                    if (this.f16441r.m6496e(viewM26425u) < iM6497f || this.f16441r.m6505n(viewM26425u) < iM6497f) {
                        m10206a1(fo0, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM26426v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM26425u2 = m26425u(i5);
                if (this.f16441r.m6496e(viewM26425u2) < iM6497f || this.f16441r.m6505n(viewM26425u2) < iM6497f) {
                    m10206a1(fo0, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM26426v2 = m26426v();
        if (!this.f16444u) {
            for (int i7 = 0; i7 < iM26426v2; i7++) {
                View viewM26425u3 = m26425u(i7);
                if (this.f16441r.m6493b(viewM26425u3) > i6 || this.f16441r.m6504m(viewM26425u3) > i6) {
                    m10206a1(fo0, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM26426v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM26425u4 = m26425u(i9);
            if (this.f16441r.m6493b(viewM26425u4) > i6 || this.f16441r.m6504m(viewM26425u4) > i6) {
                m10206a1(fo0, i8, i9);
                return;
            }
        }
    }

    @Override // p000.JO0
    /* renamed from: a */
    public final PointF mo4305a(int i) {
        if (m26426v() == 0) {
            return null;
        }
        int i2 = (i < AbstractC11919zO0.m26400H(m26425u(0))) != this.f16444u ? -1 : 1;
        return this.f16439p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* renamed from: a1 */
    public final void m10206a1(FO0 fo0, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM26425u = m26425u(i);
                m26420m0(i);
                fo0.m2625h(viewM26425u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM26425u2 = m26425u(i3);
            m26420m0(i3);
            fo0.m2625h(viewM26425u2);
        }
    }

    /* renamed from: b1 */
    public final void m10207b1() {
        if (this.f16439p == 1 || !m10204W0()) {
            this.f16444u = this.f16443t;
        } else {
            this.f16444u = !this.f16443t;
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: c */
    public final void mo10208c(String str) {
        if (this.f16449z == null) {
            super.mo10208c(str);
        }
    }

    /* renamed from: c1 */
    public final int m10209c1(int i, FO0 fo0, KO0 ko0) {
        if (m26426v() == 0 || i == 0) {
            return 0;
        }
        m10189J0();
        this.f16440q.f14459a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m10214f1(i2, iAbs, true, ko0);
        C8578Yi0 c8578Yi0 = this.f16440q;
        int iM10190K0 = m10190K0(fo0, c8578Yi0, ko0, false) + c8578Yi0.f14465g;
        if (iM10190K0 < 0) {
            return 0;
        }
        if (iAbs > iM10190K0) {
            i = i2 * iM10190K0;
        }
        this.f16441r.m6506o(-i);
        this.f16440q.f14468j = i;
        return i;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: d */
    public final boolean mo10210d() {
        return this.f16439p == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:323:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0224  */
    @Override // p000.AbstractC11919zO0
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo10161d0(p000.FO0 r18, p000.KO0 r19) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo10161d0(FO0, KO0):void");
    }

    /* renamed from: d1 */
    public final void m10211d1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "invalid orientation:"));
        }
        mo10208c(null);
        if (i != this.f16439p || this.f16441r == null) {
            C8142Py0 c8142Py0M6492a = C8142Py0.m6492a(this, i);
            this.f16441r = c8142Py0M6492a;
            this.f16435A.f15513f = c8142Py0M6492a;
            this.f16439p = i;
            m26421o0();
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: e */
    public final boolean mo10212e() {
        return this.f16439p == 1;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: e0 */
    public void mo10162e0(KO0 ko0) {
        this.f16449z = null;
        this.f16447x = -1;
        this.f16448y = Integer.MIN_VALUE;
        this.f16435A.m9738g();
    }

    /* renamed from: e1 */
    public void mo10163e1(boolean z) {
        mo10208c(null);
        if (this.f16445v == z) {
            return;
        }
        this.f16445v = z;
        m26421o0();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: f0 */
    public final void mo10213f0(Parcelable parcelable) {
        if (parcelable instanceof C8630Zi0) {
            C8630Zi0 c8630Zi0 = (C8630Zi0) parcelable;
            this.f16449z = c8630Zi0;
            if (this.f16447x != -1) {
                c8630Zi0.f15100a = -1;
            }
            m26421o0();
        }
    }

    /* renamed from: f1 */
    public final void m10214f1(int i, int i2, boolean z, KO0 ko0) {
        int iM6501j;
        this.f16440q.f14470l = this.f16441r.m6500i() == 0 && this.f16441r.m6497f() == 0;
        this.f16440q.f14464f = i;
        int[] iArr = this.f16438D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo9355D0(ko0, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C8578Yi0 c8578Yi0 = this.f16440q;
        int i3 = z2 ? iMax2 : iMax;
        c8578Yi0.f14466h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c8578Yi0.f14467i = iMax;
        if (z2) {
            c8578Yi0.f14466h = this.f16441r.m6499h() + i3;
            View viewM10202U0 = m10202U0();
            C8578Yi0 c8578Yi02 = this.f16440q;
            c8578Yi02.f14463e = this.f16444u ? -1 : 1;
            int iM26400H = AbstractC11919zO0.m26400H(viewM10202U0);
            C8578Yi0 c8578Yi03 = this.f16440q;
            c8578Yi02.f14462d = iM26400H + c8578Yi03.f14463e;
            c8578Yi03.f14460b = this.f16441r.m6493b(viewM10202U0);
            iM6501j = this.f16441r.m6493b(viewM10202U0) - this.f16441r.m6498g();
        } else {
            View viewM10203V0 = m10203V0();
            C8578Yi0 c8578Yi04 = this.f16440q;
            c8578Yi04.f14466h = this.f16441r.m6501j() + c8578Yi04.f14466h;
            C8578Yi0 c8578Yi05 = this.f16440q;
            c8578Yi05.f14463e = this.f16444u ? 1 : -1;
            int iM26400H2 = AbstractC11919zO0.m26400H(viewM10203V0);
            C8578Yi0 c8578Yi06 = this.f16440q;
            c8578Yi05.f14462d = iM26400H2 + c8578Yi06.f14463e;
            c8578Yi06.f14460b = this.f16441r.m6496e(viewM10203V0);
            iM6501j = (-this.f16441r.m6496e(viewM10203V0)) + this.f16441r.m6501j();
        }
        C8578Yi0 c8578Yi07 = this.f16440q;
        c8578Yi07.f14461c = i2;
        if (z) {
            c8578Yi07.f14461c = i2 - iM6501j;
        }
        c8578Yi07.f14465g = iM6501j;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: g0 */
    public final Parcelable mo10215g0() {
        C8630Zi0 c8630Zi0 = this.f16449z;
        if (c8630Zi0 != null) {
            C8630Zi0 c8630Zi02 = new C8630Zi0();
            c8630Zi02.f15100a = c8630Zi0.f15100a;
            c8630Zi02.f15101b = c8630Zi0.f15101b;
            c8630Zi02.f15102c = c8630Zi0.f15102c;
            return c8630Zi02;
        }
        C8630Zi0 c8630Zi03 = new C8630Zi0();
        if (m26426v() > 0) {
            m10189J0();
            boolean z = this.f16442s ^ this.f16444u;
            c8630Zi03.f15102c = z;
            if (z) {
                View viewM10202U0 = m10202U0();
                c8630Zi03.f15101b = this.f16441r.m6498g() - this.f16441r.m6493b(viewM10202U0);
                c8630Zi03.f15100a = AbstractC11919zO0.m26400H(viewM10202U0);
            } else {
                View viewM10203V0 = m10203V0();
                c8630Zi03.f15100a = AbstractC11919zO0.m26400H(viewM10203V0);
                c8630Zi03.f15101b = this.f16441r.m6496e(viewM10203V0) - this.f16441r.m6501j();
            }
        } else {
            c8630Zi03.f15100a = -1;
        }
        return c8630Zi03;
    }

    /* renamed from: g1 */
    public final void m10216g1(int i, int i2) {
        this.f16440q.f14461c = this.f16441r.m6498g() - i2;
        C8578Yi0 c8578Yi0 = this.f16440q;
        c8578Yi0.f14463e = this.f16444u ? -1 : 1;
        c8578Yi0.f14462d = i;
        c8578Yi0.f14464f = 1;
        c8578Yi0.f14460b = i2;
        c8578Yi0.f14465g = Integer.MIN_VALUE;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: h */
    public final void mo10217h(int i, int i2, KO0 ko0, C6327ks c6327ks) {
        if (this.f16439p != 0) {
            i = i2;
        }
        if (m26426v() == 0 || i == 0) {
            return;
        }
        m10189J0();
        m10214f1(i > 0 ? 1 : -1, Math.abs(i), true, ko0);
        mo10148E0(ko0, this.f16440q, c6327ks);
    }

    /* renamed from: h1 */
    public final void m10218h1(int i, int i2) {
        this.f16440q.f14461c = i2 - this.f16441r.m6501j();
        C8578Yi0 c8578Yi0 = this.f16440q;
        c8578Yi0.f14462d = i;
        c8578Yi0.f14463e = this.f16444u ? 1 : -1;
        c8578Yi0.f14464f = -1;
        c8578Yi0.f14460b = i2;
        c8578Yi0.f14465g = Integer.MIN_VALUE;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: i */
    public final void mo10219i(int i, C6327ks c6327ks) {
        boolean z;
        int i2;
        C8630Zi0 c8630Zi0 = this.f16449z;
        if (c8630Zi0 == null || (i2 = c8630Zi0.f15100a) < 0) {
            m10207b1();
            z = this.f16444u;
            i2 = this.f16447x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c8630Zi0.f15102c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f16437C && i2 >= 0 && i2 < i; i4++) {
            c6327ks.m22276b(i2, 0);
            i2 += i3;
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: j */
    public final int mo10220j(KO0 ko0) {
        return m10185F0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: k */
    public int mo10167k(KO0 ko0) {
        return m10186G0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: l */
    public int mo10169l(KO0 ko0) {
        return m10187H0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: m */
    public final int mo10221m(KO0 ko0) {
        return m10185F0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: n */
    public int mo10172n(KO0 ko0) {
        return m10186G0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: o */
    public int mo10174o(KO0 ko0) {
        return m10187H0(ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: p0 */
    public int mo10176p0(int i, FO0 fo0, KO0 ko0) {
        if (this.f16439p == 1) {
            return 0;
        }
        return m10209c1(i, fo0, ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: q */
    public final View mo10222q(int i) {
        int iM26426v = m26426v();
        if (iM26426v == 0) {
            return null;
        }
        int iM26400H = i - AbstractC11919zO0.m26400H(m26425u(0));
        if (iM26400H >= 0 && iM26400H < iM26426v) {
            View viewM26425u = m26425u(iM26400H);
            if (AbstractC11919zO0.m26400H(viewM26425u) == i) {
                return viewM26425u;
            }
        }
        return super.mo10222q(i);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: q0 */
    public final void mo10223q0(int i) {
        this.f16447x = i;
        this.f16448y = Integer.MIN_VALUE;
        C8630Zi0 c8630Zi0 = this.f16449z;
        if (c8630Zi0 != null) {
            c8630Zi0.f15100a = -1;
        }
        m26421o0();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: r */
    public AO0 mo10179r() {
        return new AO0(-2, -2);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: r0 */
    public int mo10180r0(int i, FO0 fo0, KO0 ko0) {
        if (this.f16439p == 0) {
            return 0;
        }
        return m10209c1(i, fo0, ko0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: y0 */
    public final boolean mo10224y0() {
        if (this.f46825m == 1073741824 || this.f46824l == 1073741824) {
            return false;
        }
        int iM26426v = m26426v();
        for (int i = 0; i < iM26426v; i++) {
            ViewGroup.LayoutParams layoutParams = m26425u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f16439p = 1;
        this.f16443t = false;
        this.f16444u = false;
        this.f16445v = false;
        this.f16446w = true;
        this.f16447x = -1;
        this.f16448y = Integer.MIN_VALUE;
        this.f16449z = null;
        this.f16435A = new C1664aR();
        this.f16436B = new C8526Xi0();
        this.f16437C = 2;
        this.f16438D = new int[2];
        C11792yO0 c11792yO0M26401I = AbstractC11919zO0.m26401I(context, attributeSet, i, i2);
        m10211d1(c11792yO0M26401I.f46248a);
        boolean z = c11792yO0M26401I.f46250c;
        mo10208c(null);
        if (z != this.f16443t) {
            this.f16443t = z;
            m26421o0();
        }
        mo10163e1(c11792yO0M26401I.f46251d);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: S */
    public final void mo10198S(RecyclerView recyclerView) {
    }

    /* renamed from: Y0 */
    public void mo10156Y0(FO0 fo0, KO0 ko0, C1664aR c1664aR, int i) {
    }
}
