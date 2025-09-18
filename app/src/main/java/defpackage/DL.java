package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class DL extends F02 {
    public final int a;
    public C7851wk1 b;
    public final GR0 c = new GR0(15, this);
    public final /* synthetic */ EL d;

    public DL(EL el, int i) {
        this.d = el;
        this.a = i;
    }

    @Override // defpackage.F02
    public final int a(int i, View view) {
        EL el = this.d;
        if (el.a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = el.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // defpackage.F02
    public final int b(int i, View view) {
        return view.getTop();
    }

    @Override // defpackage.F02
    public final int d(View view) {
        this.d.getClass();
        if (EL.m(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.F02
    public final void f(int i, int i2) {
        int i3 = i & 1;
        EL el = this.d;
        View viewD = i3 == 1 ? el.d(3) : el.d(5);
        if (viewD == null || el.g(viewD) != 0) {
            return;
        }
        this.b.b(i2, viewD);
    }

    @Override // defpackage.F02
    public final void g() {
        this.d.postDelayed(this.c, 160L);
    }

    @Override // defpackage.F02
    public final void h(int i, View view) {
        ((BL) view.getLayoutParams()).c = false;
        int i2 = this.a == 3 ? 5 : 3;
        EL el = this.d;
        View viewD = el.d(i2);
        if (viewD != null) {
            el.b(viewD);
        }
    }

    @Override // defpackage.F02
    public final void i(int i) {
        int i2;
        View rootView;
        View view = this.b.t;
        EL el = this.d;
        int i3 = el.g.a;
        int i4 = el.h.a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((BL) view.getLayoutParams()).b;
            if (f == 0.0f) {
                BL bl = (BL) view.getLayoutParams();
                if ((bl.d & 1) == 1) {
                    bl.d = 0;
                    ArrayList arrayList = el.t;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            YJ0 yj0 = (YJ0) ((AL) el.t.get(size));
                            XJ0 xj0 = yj0.a;
                            yj0.b.g(new C7098so(OZ1.e(xj0), xj0.getId(), 6));
                        }
                    }
                    el.r(view, false);
                    el.q(view);
                    if (el.hasWindowFocus() && (rootView = el.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                BL bl2 = (BL) view.getLayoutParams();
                if ((bl2.d & 1) == 0) {
                    bl2.d = 1;
                    ArrayList arrayList2 = el.t;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            YJ0 yj02 = (YJ0) ((AL) el.t.get(size2));
                            XJ0 xj02 = yj02.a;
                            yj02.b.g(new C7098so(OZ1.e(xj02), xj02.getId(), 7));
                        }
                    }
                    el.r(view, true);
                    el.q(view);
                    if (el.hasWindowFocus()) {
                        el.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != el.k) {
            el.k = i2;
            ArrayList arrayList3 = el.t;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    YJ0 yj03 = (YJ0) ((AL) el.t.get(size3));
                    XJ0 xj03 = yj03.a;
                    yj03.b.g(new GL(OZ1.e(xj03), xj03.getId(), i2, 0));
                }
            }
        }
    }

    @Override // defpackage.F02
    public final void j(View view, int i, int i2) {
        int width = view.getWidth();
        EL el = this.d;
        float width2 = (el.a(3, view) ? i + width : el.getWidth() - i) / width;
        el.p(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        el.invalidate();
    }

    @Override // defpackage.F02
    public final void k(View view, float f, float f2) {
        int i;
        EL el = this.d;
        el.getClass();
        float f3 = ((BL) view.getLayoutParams()).b;
        int width = view.getWidth();
        if (el.a(3, view)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = el.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.b.p(i, view.getTop());
        el.invalidate();
    }

    @Override // defpackage.F02
    public final boolean l(int i, View view) {
        EL el = this.d;
        el.getClass();
        return EL.m(view) && el.a(this.a, view) && el.g(view) == 0;
    }
}
