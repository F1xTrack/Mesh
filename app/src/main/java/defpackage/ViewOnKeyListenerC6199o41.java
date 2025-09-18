package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import ru.mes.dnevnik.R;

/* renamed from: o41 */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC6199o41 extends AbstractC1238Pq0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;
    public final MenuC0225Cq0 c;
    public final C8438zq0 d;
    public final boolean e;
    public final int f;
    public final int g;
    public final C1706Vq0 h;
    public C1316Qq0 k;
    public View l;
    public View m;
    public InterfaceC1784Wq0 n;
    public ViewTreeObserver o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean t;
    public final X6 i = new X6(3, this);
    public final ViewOnAttachStateChangeListenerC8247yq j = new ViewOnAttachStateChangeListenerC8247yq(4, this);
    public int s = 0;

    public ViewOnKeyListenerC6199o41(int i, MenuC0225Cq0 menuC0225Cq0, Context context, View view, boolean z) {
        this.b = context;
        this.c = menuC0225Cq0;
        this.e = z;
        this.d = new C8438zq0(menuC0225Cq0, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = view;
        this.h = new C1706Vq0(context, null, i);
        menuC0225Cq0.b(this, context);
    }

    @Override // defpackage.InterfaceC8090y01
    public final boolean a() {
        return !this.p && this.h.z.isShowing();
    }

    @Override // defpackage.InterfaceC8090y01
    public final void b() {
        View view;
        if (a()) {
            return;
        }
        if (this.p || (view = this.l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.m = view;
        C1706Vq0 c1706Vq0 = this.h;
        c1706Vq0.z.setOnDismissListener(this);
        c1706Vq0.p = this;
        c1706Vq0.y = true;
        c1706Vq0.z.setFocusable(true);
        View view2 = this.m;
        boolean z = this.o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.j);
        c1706Vq0.o = view2;
        c1706Vq0.l = this.s;
        boolean z2 = this.q;
        Context context = this.b;
        C8438zq0 c8438zq0 = this.d;
        if (!z2) {
            this.r = AbstractC1238Pq0.m(c8438zq0, context, this.f);
            this.q = true;
        }
        c1706Vq0.q(this.r);
        c1706Vq0.z.setInputMethodMode(2);
        Rect rect = this.a;
        c1706Vq0.x = rect != null ? new Rect(rect) : null;
        c1706Vq0.b();
        C2118aM c2118aM = c1706Vq0.c;
        c2118aM.setOnKeyListener(this);
        if (this.t) {
            MenuC0225Cq0 menuC0225Cq0 = this.c;
            if (menuC0225Cq0.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c2118aM, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0225Cq0.m);
                }
                frameLayout.setEnabled(false);
                c2118aM.addHeaderView(frameLayout, null, false);
            }
        }
        c1706Vq0.o(c8438zq0);
        c1706Vq0.b();
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean c(I51 i51) {
        if (i51.hasVisibleItems()) {
            View view = this.m;
            C1394Rq0 c1394Rq0 = new C1394Rq0(this.g, i51, this.b, view, this.e);
            InterfaceC1784Wq0 interfaceC1784Wq0 = this.n;
            c1394Rq0.h = interfaceC1784Wq0;
            AbstractC1238Pq0 abstractC1238Pq0 = c1394Rq0.i;
            if (abstractC1238Pq0 != null) {
                abstractC1238Pq0.g(interfaceC1784Wq0);
            }
            boolean zU = AbstractC1238Pq0.u(i51);
            c1394Rq0.g = zU;
            AbstractC1238Pq0 abstractC1238Pq02 = c1394Rq0.i;
            if (abstractC1238Pq02 != null) {
                abstractC1238Pq02.o(zU);
            }
            c1394Rq0.j = this.k;
            this.k = null;
            this.c.c(false);
            C1706Vq0 c1706Vq0 = this.h;
            int width = c1706Vq0.f;
            int iM = c1706Vq0.m();
            if ((Gravity.getAbsoluteGravity(this.s, this.l.getLayoutDirection()) & 7) == 5) {
                width += this.l.getWidth();
            }
            if (!c1394Rq0.b()) {
                if (c1394Rq0.e != null) {
                    c1394Rq0.d(width, iM, true, true);
                }
            }
            InterfaceC1784Wq0 interfaceC1784Wq02 = this.n;
            if (interfaceC1784Wq02 != null) {
                interfaceC1784Wq02.q0(i51);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean d() {
        return false;
    }

    @Override // defpackage.InterfaceC8090y01
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
        if (menuC0225Cq0 != this.c) {
            return;
        }
        dismiss();
        InterfaceC1784Wq0 interfaceC1784Wq0 = this.n;
        if (interfaceC1784Wq0 != null) {
            interfaceC1784Wq0.f(menuC0225Cq0, z);
        }
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void g(InterfaceC1784Wq0 interfaceC1784Wq0) {
        this.n = interfaceC1784Wq0;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void i() {
        this.q = false;
        C8438zq0 c8438zq0 = this.d;
        if (c8438zq0 != null) {
            c8438zq0.notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC8090y01
    public final C2118aM j() {
        return this.h.c;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void n(View view) {
        this.l = view;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.o = this.m.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.i);
            this.o = null;
        }
        this.m.removeOnAttachStateChangeListener(this.j);
        C1316Qq0 c1316Qq0 = this.k;
        if (c1316Qq0 != null) {
            c1316Qq0.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void p(int i) {
        this.s = i;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void q(int i) {
        this.h.f = i;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.k = (C1316Qq0) onDismissListener;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void s(boolean z) {
        this.t = z;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void t(int i) {
        this.h.i(i);
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void l(MenuC0225Cq0 menuC0225Cq0) {
    }
}
