package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/* renamed from: NW */
/* loaded from: classes2.dex */
public final class C0851NW {

    /* renamed from: a */
    public final ViewGroup f7843a;

    /* renamed from: b */
    public final C3924dN f7844b;

    /* renamed from: c */
    public final S91 f7845c;

    /* renamed from: d */
    public final int f7846d;

    /* renamed from: e */
    public EditText f7847e;

    /* renamed from: g */
    public C4112gN f7849g;

    /* renamed from: h */
    public C4090g1 f7850h;

    /* renamed from: l */
    public final ViewTreeObserverOnGlobalFocusChangeListenerC0725LW f7854l;

    /* renamed from: f */
    public C0663KW f7848f = AbstractC7677Gz1.f3976a;

    /* renamed from: i */
    public final ViewOnLayoutChangeListenerC6974uq f7851i = new ViewOnLayoutChangeListenerC6974uq(1, this);

    /* renamed from: j */
    public final C7236z f7852j = new C7236z(15, this);

    /* renamed from: k */
    public final C0788MW f7853k = new C0788MW(this);

    public C0851NW(ViewGroup viewGroup, C3924dN c3924dN, S91 s91) {
        this.f7843a = viewGroup;
        this.f7844b = c3924dN;
        this.f7845c = s91;
        this.f7846d = OZ1.m6094e(viewGroup);
        ViewTreeObserverOnGlobalFocusChangeListenerC0725LW viewTreeObserverOnGlobalFocusChangeListenerC0725LW = new ViewTreeObserverOnGlobalFocusChangeListenerC0725LW(0, this);
        this.f7854l = viewTreeObserverOnGlobalFocusChangeListenerC0725LW;
        viewGroup.getViewTreeObserver().addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0725LW);
    }

    /* renamed from: a */
    public final void m5750a(C0663KW c0663kw) {
        if (c0663kw.equals(this.f7848f)) {
            return;
        }
        this.f7848f = c0663kw;
        C3924dN c3924dN = this.f7844b;
        T91.m7608a(this.f7845c, c3924dN.getId(), new C0600JW(c0663kw, this.f7846d, c3924dN.getId(), 0));
    }

    /* renamed from: b */
    public final void m5751b() {
        int id;
        View view = this.f7847e;
        if (view == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        double dM18931a = AbstractC9700i12.m18931a(view.getX());
        double dM18931a2 = AbstractC9700i12.m18931a(view.getY());
        double dM18931a3 = AbstractC9700i12.m18931a(view.getWidth());
        double dM18931a4 = AbstractC9700i12.m18931a(view.getHeight());
        double dM18931a5 = AbstractC9700i12.m18931a(i);
        double dM18931a6 = AbstractC9700i12.m18931a(i2);
        int id2 = view.getId();
        while (true) {
            if (view == null) {
                id = -1;
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view instanceof ViewGroupOnHierarchyChangeListenerC10767qM0) {
                ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0 = (ViewGroupOnHierarchyChangeListenerC10767qM0) view;
                if (viewGroupOnHierarchyChangeListenerC10767qM0.getScrollEnabled()) {
                    id = viewGroupOnHierarchyChangeListenerC10767qM0.getId();
                    break;
                }
            }
        }
        m5750a(new C0663KW(dM18931a, dM18931a2, dM18931a3, dM18931a4, dM18931a5, dM18931a6, id2, id));
    }
}
