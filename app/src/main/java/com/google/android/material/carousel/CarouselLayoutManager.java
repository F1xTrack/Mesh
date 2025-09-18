package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import p000.AO0;
import p000.AbstractC0325F9;
import p000.AbstractC11153tN0;
import p000.AbstractC11919zO0;
import p000.C0023AM;
import p000.C7037vq;
import p000.C7100wq;
import p000.C7163xq;
import p000.FO0;
import p000.JO0;
import p000.KO0;
import p000.NG0;
import p000.ViewOnLayoutChangeListenerC6974uq;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC11919zO0 implements JO0 {

    /* renamed from: p */
    public final C0023AM f18173p;

    /* renamed from: q */
    public AbstractC0325F9 f18174q;

    /* renamed from: r */
    public final View.OnLayoutChangeListener f18175r;

    public CarouselLayoutManager() {
        C0023AM c0023am = new C0023AM();
        new C7100wq();
        this.f18175r = new ViewOnLayoutChangeListenerC6974uq(0, this);
        this.f18173p = c0023am;
        m26421o0();
        m11226F0(0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: A0 */
    public final void mo9354A0(RecyclerView recyclerView, int i) {
        C7037vq c7037vq = new C7037vq(this, recyclerView.getContext(), 0);
        c7037vq.f15637a = i;
        m26408B0(c7037vq);
    }

    /* renamed from: D0 */
    public final boolean m11224D0() {
        return this.f18174q.f3082b == 0;
    }

    /* renamed from: E0 */
    public final boolean m11225E0() {
        return m11224D0() && m26409C() == 1;
    }

    /* renamed from: F0 */
    public final void m11226F0(int i) {
        C7163xq c7163xq;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "invalid orientation:"));
        }
        mo10208c(null);
        AbstractC0325F9 abstractC0325F9 = this.f18174q;
        if (abstractC0325F9 == null || i != abstractC0325F9.f3082b) {
            if (i == 0) {
                c7163xq = new C7163xq(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c7163xq = new C7163xq(this, 0);
            }
            this.f18174q = c7163xq;
            m26421o0();
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: L */
    public final boolean mo10191L() {
        return true;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: R */
    public final void mo11227R(RecyclerView recyclerView) throws Resources.NotFoundException {
        C0023AM c0023am = this.f18173p;
        Context context = recyclerView.getContext();
        float dimension = c0023am.f173a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0023am.f173a = dimension;
        float dimension2 = c0023am.f174b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0023am.f174b = dimension2;
        m26421o0();
        recyclerView.addOnLayoutChangeListener(this.f18175r);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: S */
    public final void mo10198S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f18175r);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    @Override // p000.AbstractC11919zO0
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo10151T(android.view.View r5, int r6, p000.FO0 r7, p000.KO0 r8) {
        /*
            r4 = this;
            int r7 = r4.m26426v()
            r8 = 0
            if (r7 != 0) goto L8
            return r8
        L8:
            F9 r7 = r4.f18174q
            int r7 = r7.f3082b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L40
            r3 = 2
            if (r6 == r3) goto L3e
            r3 = 17
            if (r6 == r3) goto L36
            r3 = 33
            if (r6 == r3) goto L33
            r3 = 66
            if (r6 == r3) goto L2a
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L27
        L25:
            r6 = r0
            goto L41
        L27:
            if (r7 != r2) goto L25
            goto L3e
        L2a:
            if (r7 != 0) goto L25
            boolean r6 = r4.m11225E0()
            if (r6 == 0) goto L3e
            goto L40
        L33:
            if (r7 != r2) goto L25
            goto L40
        L36:
            if (r7 != 0) goto L25
            boolean r6 = r4.m11225E0()
            if (r6 == 0) goto L40
        L3e:
            r6 = r2
            goto L41
        L40:
            r6 = r1
        L41:
            if (r6 != r0) goto L44
            return r8
        L44:
            r7 = 0
            if (r6 != r1) goto L78
            int r5 = p000.AbstractC11919zO0.m26400H(r5)
            if (r5 != 0) goto L4e
            return r8
        L4e:
            android.view.View r5 = r4.m26425u(r7)
            int r5 = p000.AbstractC11919zO0.m26400H(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L67
            int r6 = r4.m26407B()
            if (r5 < r6) goto L60
            goto L67
        L60:
            F9 r5 = r4.f18174q
            r5.mo2505m()
            r5 = 0
            throw r5
        L67:
            boolean r5 = r4.m11225E0()
            if (r5 == 0) goto L73
            int r5 = r4.m26426v()
            int r7 = r5 + (-1)
        L73:
            android.view.View r5 = r4.m26425u(r7)
            goto Lb3
        L78:
            int r5 = p000.AbstractC11919zO0.m26400H(r5)
            int r6 = r4.m26407B()
            int r6 = r6 - r2
            if (r5 != r6) goto L84
            return r8
        L84:
            int r5 = r4.m26426v()
            int r5 = r5 - r2
            android.view.View r5 = r4.m26425u(r5)
            int r5 = p000.AbstractC11919zO0.m26400H(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto La2
            int r6 = r4.m26407B()
            if (r5 < r6) goto L9b
            goto La2
        L9b:
            F9 r5 = r4.f18174q
            r5.mo2505m()
            r5 = 0
            throw r5
        La2:
            boolean r5 = r4.m11225E0()
            if (r5 == 0) goto La9
            goto Laf
        La9:
            int r5 = r4.m26426v()
            int r7 = r5 + (-1)
        Laf:
            android.view.View r5 = r4.m26425u(r7)
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.mo10151T(android.view.View, int, FO0, KO0):android.view.View");
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: U */
    public final void mo10201U(AccessibilityEvent accessibilityEvent) {
        super.mo10201U(accessibilityEvent);
        if (m26426v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC11919zO0.m26400H(m26425u(0)));
            accessibilityEvent.setToIndex(AbstractC11919zO0.m26400H(m26425u(m26426v() - 1)));
        }
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: Y */
    public final void mo10155Y(int i, int i2) {
        m26407B();
    }

    @Override // p000.JO0
    /* renamed from: a */
    public final PointF mo4305a(int i) {
        return null;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: b0 */
    public final void mo10159b0(int i, int i2) {
        m26407B();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: d */
    public final boolean mo10210d() {
        return m11224D0();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: d0 */
    public final void mo10161d0(FO0 fo0, KO0 ko0) {
        if (ko0.m4625b() > 0) {
            if ((m11224D0() ? this.f46826n : this.f46827o) > 0.0f) {
                m11225E0();
                View view = fo0.m2628k(0, Long.MAX_VALUE).f8408a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m26417j0(fo0);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: e */
    public final boolean mo10212e() {
        return !m11224D0();
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: e0 */
    public final void mo10162e0(KO0 ko0) {
        if (m26426v() == 0) {
            return;
        }
        AbstractC11919zO0.m26400H(m26425u(0));
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: j */
    public final int mo10220j(KO0 ko0) {
        m26426v();
        return 0;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: k */
    public final int mo10167k(KO0 ko0) {
        return 0;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: l */
    public final int mo10169l(KO0 ko0) {
        return 0;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: m */
    public final int mo10221m(KO0 ko0) {
        m26426v();
        return 0;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: n */
    public final int mo10172n(KO0 ko0) {
        return 0;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: n0 */
    public final boolean mo11228n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: o */
    public final int mo10174o(KO0 ko0) {
        return 0;
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: p0 */
    public final int mo10176p0(int i, FO0 fo0, KO0 ko0) {
        if (!m11224D0() || m26426v() == 0 || i == 0) {
            return 0;
        }
        View view = fo0.m2628k(0, Long.MAX_VALUE).f8408a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: q0 */
    public final void mo10223q0(int i) {
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: r */
    public final AO0 mo10179r() {
        return new AO0(-2, -2);
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: r0 */
    public final int mo10180r0(int i, FO0 fo0, KO0 ko0) {
        if (!mo10212e() || m26426v() == 0 || i == 0) {
            return 0;
        }
        View view = fo0.m2628k(0, Long.MAX_VALUE).f8408a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC11919zO0
    /* renamed from: y */
    public final void mo11229y(View view, Rect rect) {
        super.mo11229y(view, rect);
        rect.centerY();
        if (m11224D0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C7100wq();
        this.f18175r = new ViewOnLayoutChangeListenerC6974uq(0, this);
        this.f18173p = new C0023AM();
        m26421o0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7690d);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m26421o0();
            m11226F0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
