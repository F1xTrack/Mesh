package p000;

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
public final class ViewOnKeyListenerC10476o41 extends AbstractC8126Pq0 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b */
    public final Context f38770b;

    /* renamed from: c */
    public final MenuC7450Cq0 f38771c;

    /* renamed from: d */
    public final C11975zq0 f38772d;

    /* renamed from: e */
    public final boolean f38773e;

    /* renamed from: f */
    public final int f38774f;

    /* renamed from: g */
    public final int f38775g;

    /* renamed from: h */
    public final C8438Vq0 f38776h;

    /* renamed from: k */
    public C8178Qq0 f38779k;

    /* renamed from: l */
    public View f38780l;

    /* renamed from: m */
    public View f38781m;

    /* renamed from: n */
    public InterfaceC8490Wq0 f38782n;

    /* renamed from: o */
    public ViewTreeObserver f38783o;

    /* renamed from: p */
    public boolean f38784p;

    /* renamed from: q */
    public boolean f38785q;

    /* renamed from: r */
    public int f38786r;

    /* renamed from: t */
    public boolean f38788t;

    /* renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC1454X6 f38777i = new ViewTreeObserverOnGlobalLayoutListenerC1454X6(3, this);

    /* renamed from: j */
    public final ViewOnAttachStateChangeListenerC7226yq f38778j = new ViewOnAttachStateChangeListenerC7226yq(4, this);

    /* renamed from: s */
    public int f38787s = 0;

    public ViewOnKeyListenerC10476o41(int i, MenuC7450Cq0 menuC7450Cq0, Context context, View view, boolean z) {
        this.f38770b = context;
        this.f38771c = menuC7450Cq0;
        this.f38773e = z;
        this.f38772d = new C11975zq0(menuC7450Cq0, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f38775g = i;
        Resources resources = context.getResources();
        this.f38774f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f38780l = view;
        this.f38776h = new C8438Vq0(context, null, i);
        menuC7450Cq0.m1403b(this, context);
    }

    @Override // p000.InterfaceC11742y01
    /* renamed from: a */
    public final boolean mo334a() {
        return !this.f38784p && this.f38776h.f4480z.isShowing();
    }

    @Override // p000.InterfaceC11742y01
    /* renamed from: b */
    public final void mo335b() {
        View view;
        if (mo334a()) {
            return;
        }
        if (this.f38784p || (view = this.f38780l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f38781m = view;
        C8438Vq0 c8438Vq0 = this.f38776h;
        c8438Vq0.f4480z.setOnDismissListener(this);
        c8438Vq0.f4470p = this;
        c8438Vq0.f4479y = true;
        c8438Vq0.f4480z.setFocusable(true);
        View view2 = this.f38781m;
        boolean z = this.f38783o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f38783o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f38777i);
        }
        view2.addOnAttachStateChangeListener(this.f38778j);
        c8438Vq0.f4469o = view2;
        c8438Vq0.f4466l = this.f38787s;
        boolean z2 = this.f38785q;
        Context context = this.f38770b;
        C11975zq0 c11975zq0 = this.f38772d;
        if (!z2) {
            this.f38786r = AbstractC8126Pq0.m6435m(c11975zq0, context, this.f38774f);
            this.f38785q = true;
        }
        c8438Vq0.m3569q(this.f38786r);
        c8438Vq0.f4480z.setInputMethodMode(2);
        Rect rect = this.f9296a;
        c8438Vq0.f4478x = rect != null ? new Rect(rect) : null;
        c8438Vq0.mo335b();
        C1659aM c1659aM = c8438Vq0.f4457c;
        c1659aM.setOnKeyListener(this);
        if (this.f38788t) {
            MenuC7450Cq0 menuC7450Cq0 = this.f38771c;
            if (menuC7450Cq0.f1714m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1659aM, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC7450Cq0.f1714m);
                }
                frameLayout.setEnabled(false);
                c1659aM.addHeaderView(frameLayout, null, false);
            }
        }
        c8438Vq0.mo3567o(c11975zq0);
        c8438Vq0.mo335b();
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: c */
    public final boolean mo301c(I51 i51) {
        if (i51.hasVisibleItems()) {
            View view = this.f38781m;
            C8230Rq0 c8230Rq0 = new C8230Rq0(this.f38775g, i51, this.f38770b, view, this.f38773e);
            InterfaceC8490Wq0 interfaceC8490Wq0 = this.f38782n;
            c8230Rq0.f10452h = interfaceC8490Wq0;
            AbstractC8126Pq0 abstractC8126Pq0 = c8230Rq0.f10453i;
            if (abstractC8126Pq0 != null) {
                abstractC8126Pq0.mo305g(interfaceC8490Wq0);
            }
            boolean zM6436u = AbstractC8126Pq0.m6436u(i51);
            c8230Rq0.f10451g = zM6436u;
            AbstractC8126Pq0 abstractC8126Pq02 = c8230Rq0.f10453i;
            if (abstractC8126Pq02 != null) {
                abstractC8126Pq02.mo339o(zM6436u);
            }
            c8230Rq0.f10454j = this.f38779k;
            this.f38779k = null;
            this.f38771c.m1404c(false);
            C8438Vq0 c8438Vq0 = this.f38776h;
            int width = c8438Vq0.f4460f;
            int iM3566m = c8438Vq0.m3566m();
            if ((Gravity.getAbsoluteGravity(this.f38787s, this.f38780l.getLayoutDirection()) & 7) == 5) {
                width += this.f38780l.getWidth();
            }
            if (!c8230Rq0.m7121b()) {
                if (c8230Rq0.f10449e != null) {
                    c8230Rq0.m7123d(width, iM3566m, true, true);
                }
            }
            InterfaceC8490Wq0 interfaceC8490Wq02 = this.f38782n;
            if (interfaceC8490Wq02 != null) {
                interfaceC8490Wq02.mo1907q0(i51);
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: d */
    public final boolean mo302d() {
        return false;
    }

    @Override // p000.InterfaceC11742y01
    public final void dismiss() {
        if (mo334a()) {
            this.f38776h.dismiss();
        }
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: f */
    public final void mo304f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
        if (menuC7450Cq0 != this.f38771c) {
            return;
        }
        dismiss();
        InterfaceC8490Wq0 interfaceC8490Wq0 = this.f38782n;
        if (interfaceC8490Wq0 != null) {
            interfaceC8490Wq0.mo1906f(menuC7450Cq0, z);
        }
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: g */
    public final void mo305g(InterfaceC8490Wq0 interfaceC8490Wq0) {
        this.f38782n = interfaceC8490Wq0;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: i */
    public final void mo307i() {
        this.f38785q = false;
        C11975zq0 c11975zq0 = this.f38772d;
        if (c11975zq0 != null) {
            c11975zq0.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC11742y01
    /* renamed from: j */
    public final C1659aM mo336j() {
        return this.f38776h.f4457c;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: n */
    public final void mo338n(View view) {
        this.f38780l = view;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: o */
    public final void mo339o(boolean z) {
        this.f38772d.f47029c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f38784p = true;
        this.f38771c.m1404c(true);
        ViewTreeObserver viewTreeObserver = this.f38783o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f38783o = this.f38781m.getViewTreeObserver();
            }
            this.f38783o.removeGlobalOnLayoutListener(this.f38777i);
            this.f38783o = null;
        }
        this.f38781m.removeOnAttachStateChangeListener(this.f38778j);
        C8178Qq0 c8178Qq0 = this.f38779k;
        if (c8178Qq0 != null) {
            c8178Qq0.onDismiss();
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

    @Override // p000.AbstractC8126Pq0
    /* renamed from: p */
    public final void mo340p(int i) {
        this.f38787s = i;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: q */
    public final void mo341q(int i) {
        this.f38776h.f4460f = i;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: r */
    public final void mo342r(PopupWindow.OnDismissListener onDismissListener) {
        this.f38779k = (C8178Qq0) onDismissListener;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: s */
    public final void mo343s(boolean z) {
        this.f38788t = z;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: t */
    public final void mo344t(int i) {
        this.f38776h.m3565i(i);
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: l */
    public final void mo337l(MenuC7450Cq0 menuC7450Cq0) {
    }
}
