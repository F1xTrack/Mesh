package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final class NW {
    public final ViewGroup a;
    public final C3378dN b;
    public final S91 c;
    public final int d;
    public EditText e;
    public C3950gN g;
    public C3881g1 h;
    public final LW l;
    public KW f = AbstractC0565Gz1.a;
    public final ViewOnLayoutChangeListenerC7486uq i = new ViewOnLayoutChangeListenerC7486uq(1, this);
    public final C8277z j = new C8277z(15, this);
    public final MW k = new MW(this);

    public NW(ViewGroup viewGroup, C3378dN c3378dN, S91 s91) {
        this.a = viewGroup;
        this.b = c3378dN;
        this.c = s91;
        this.d = OZ1.e(viewGroup);
        LW lw = new LW(0, this);
        this.l = lw;
        viewGroup.getViewTreeObserver().addOnGlobalFocusChangeListener(lw);
    }

    public final void a(KW kw) {
        if (kw.equals(this.f)) {
            return;
        }
        this.f = kw;
        C3378dN c3378dN = this.b;
        T91.a(this.c, c3378dN.getId(), new JW(kw, this.d, c3378dN.getId(), 0));
    }

    public final void b() {
        int id;
        View view = this.e;
        if (view == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        double dA = AbstractC4266i12.a(view.getX());
        double dA2 = AbstractC4266i12.a(view.getY());
        double dA3 = AbstractC4266i12.a(view.getWidth());
        double dA4 = AbstractC4266i12.a(view.getHeight());
        double dA5 = AbstractC4266i12.a(i);
        double dA6 = AbstractC4266i12.a(i2);
        int id2 = view.getId();
        while (true) {
            if (view == null) {
                id = -1;
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view instanceof ViewGroupOnHierarchyChangeListenerC6634qM0) {
                ViewGroupOnHierarchyChangeListenerC6634qM0 viewGroupOnHierarchyChangeListenerC6634qM0 = (ViewGroupOnHierarchyChangeListenerC6634qM0) view;
                if (viewGroupOnHierarchyChangeListenerC6634qM0.getScrollEnabled()) {
                    id = viewGroupOnHierarchyChangeListenerC6634qM0.getId();
                    break;
                }
            }
        }
        a(new KW(dA, dA2, dA3, dA4, dA5, dA6, id2, id));
    }
}
