package p000;

import android.view.View;
import java.util.ArrayList;

/* renamed from: DL */
/* loaded from: classes.dex */
public final class C0211DL extends F02 {

    /* renamed from: a */
    public final int f1972a;

    /* renamed from: b */
    public C11583wk1 f1973b;

    /* renamed from: c */
    public final GR0 f1974c = new GR0(15, this);

    /* renamed from: d */
    public final /* synthetic */ AbstractC0274EL f1975d;

    public C0211DL(AbstractC0274EL abstractC0274EL, int i) {
        this.f1975d = abstractC0274EL;
        this.f1972a = i;
    }

    @Override // p000.F02
    /* renamed from: a */
    public final int mo1635a(int i, View view) {
        AbstractC0274EL abstractC0274EL = this.f1975d;
        if (abstractC0274EL.m2148a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = abstractC0274EL.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // p000.F02
    /* renamed from: b */
    public final int mo1636b(int i, View view) {
        return view.getTop();
    }

    @Override // p000.F02
    /* renamed from: d */
    public final int mo1637d(View view) {
        this.f1975d.getClass();
        if (AbstractC0274EL.m2147m(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // p000.F02
    /* renamed from: f */
    public final void mo1638f(int i, int i2) {
        int i3 = i & 1;
        AbstractC0274EL abstractC0274EL = this.f1975d;
        View viewM2151d = i3 == 1 ? abstractC0274EL.m2151d(3) : abstractC0274EL.m2151d(5);
        if (viewM2151d == null || abstractC0274EL.m2154g(viewM2151d) != 0) {
            return;
        }
        this.f1973b.m25676b(i2, viewM2151d);
    }

    @Override // p000.F02
    /* renamed from: g */
    public final void mo1639g() {
        this.f1975d.postDelayed(this.f1974c, 160L);
    }

    @Override // p000.F02
    /* renamed from: h */
    public final void mo1640h(int i, View view) {
        ((C0085BL) view.getLayoutParams()).f758c = false;
        int i2 = this.f1972a == 3 ? 5 : 3;
        AbstractC0274EL abstractC0274EL = this.f1975d;
        View viewM2151d = abstractC0274EL.m2151d(i2);
        if (viewM2151d != null) {
            abstractC0274EL.m2149b(viewM2151d);
        }
    }

    @Override // p000.F02
    /* renamed from: i */
    public final void mo1641i(int i) {
        int i2;
        View rootView;
        View view = this.f1973b.f45073t;
        AbstractC0274EL abstractC0274EL = this.f1975d;
        int i3 = abstractC0274EL.f2622g.f45054a;
        int i4 = abstractC0274EL.f2623h.f45054a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C0085BL) view.getLayoutParams()).f757b;
            if (f == 0.0f) {
                C0085BL c0085bl = (C0085BL) view.getLayoutParams();
                if ((c0085bl.f759d & 1) == 1) {
                    c0085bl.f759d = 0;
                    ArrayList arrayList = abstractC0274EL.f2635t;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            YJ0 yj0 = (YJ0) ((InterfaceC0022AL) abstractC0274EL.f2635t.get(size));
                            XJ0 xj0 = yj0.f14241a;
                            yj0.f14242b.mo11046g(new C6846so(OZ1.m6094e(xj0), xj0.getId(), 6));
                        }
                    }
                    abstractC0274EL.m2160r(view, false);
                    abstractC0274EL.m2159q(view);
                    if (abstractC0274EL.hasWindowFocus() && (rootView = abstractC0274EL.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C0085BL c0085bl2 = (C0085BL) view.getLayoutParams();
                if ((c0085bl2.f759d & 1) == 0) {
                    c0085bl2.f759d = 1;
                    ArrayList arrayList2 = abstractC0274EL.f2635t;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            YJ0 yj02 = (YJ0) ((InterfaceC0022AL) abstractC0274EL.f2635t.get(size2));
                            XJ0 xj02 = yj02.f14241a;
                            yj02.f14242b.mo11046g(new C6846so(OZ1.m6094e(xj02), xj02.getId(), 7));
                        }
                    }
                    abstractC0274EL.m2160r(view, true);
                    abstractC0274EL.m2159q(view);
                    if (abstractC0274EL.hasWindowFocus()) {
                        abstractC0274EL.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != abstractC0274EL.f2626k) {
            abstractC0274EL.f2626k = i2;
            ArrayList arrayList3 = abstractC0274EL.f2635t;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    YJ0 yj03 = (YJ0) ((InterfaceC0022AL) abstractC0274EL.f2635t.get(size3));
                    XJ0 xj03 = yj03.f14241a;
                    yj03.f14242b.mo11046g(new C0400GL(OZ1.m6094e(xj03), xj03.getId(), i2, 0));
                }
            }
        }
    }

    @Override // p000.F02
    /* renamed from: j */
    public final void mo1642j(View view, int i, int i2) {
        int width = view.getWidth();
        AbstractC0274EL abstractC0274EL = this.f1975d;
        float width2 = (abstractC0274EL.m2148a(3, view) ? i + width : abstractC0274EL.getWidth() - i) / width;
        abstractC0274EL.m2158p(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        abstractC0274EL.invalidate();
    }

    @Override // p000.F02
    /* renamed from: k */
    public final void mo1643k(View view, float f, float f2) {
        int i;
        AbstractC0274EL abstractC0274EL = this.f1975d;
        abstractC0274EL.getClass();
        float f3 = ((C0085BL) view.getLayoutParams()).f757b;
        int width = view.getWidth();
        if (abstractC0274EL.m2148a(3, view)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = abstractC0274EL.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f1973b.m25690p(i, view.getTop());
        abstractC0274EL.invalidate();
    }

    @Override // p000.F02
    /* renamed from: l */
    public final boolean mo1644l(int i, View view) {
        AbstractC0274EL abstractC0274EL = this.f1975d;
        abstractC0274EL.getClass();
        return AbstractC0274EL.m2147m(view) && abstractC0274EL.m2148a(this.f1972a, view) && abstractC0274EL.m2154g(view) == 0;
    }
}
